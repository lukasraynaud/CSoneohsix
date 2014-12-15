import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.filechooser.FileFilter;

public class SoundToClassGUI extends JFrame implements ActionListener {

	// Reference to main class
	private final SoundToClass STC;
	// Source and destination files
	private String src = "";
	private String dst = "";
	// GUI elements
	private final JButton srcbutton;
	private final JTextField srctxt;
	private final JButton dstbutton;
	private final JTextField dsttxt;
	private final JButton cvtbutton;
	private final JProgressBar progress;
	// Why not?
	private static final long serialVersionUID = 1L;
	
	// Constructor (builds GUI, should be run on event dispatching thread)
	public SoundToClassGUI(SoundToClass stc){
		// Window setup
		super("SoundToClass by Stephen Ware");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Look and feel
		try{ UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); }
		catch(Exception ex){}
		// Configuration
		STC = stc;
		// Constraints
		Container pane = getContentPane();
		GridBagConstraints c = new GridBagConstraints();
		// Source file
		JLabel srclabel = new JLabel("Source sound file:");
		srctxt = new JTextField();
		srcbutton = new JButton("Browse");
		srcbutton.addActionListener(this);
		JPanel srcpanel = new JPanel(new GridBagLayout());
		srcpanel.setBackground(pane.getBackground());
		c.gridwidth = 2;
		srcpanel.add(srclabel, c);
		c.gridy = 1;
		c.gridwidth = 1;
		srcpanel.add(srctxt, c);
		c.gridx = 1;
		srcpanel.add(srcbutton, c);
		// Destination file
		JLabel dstlabel = new JLabel("Destination java file:");
		dsttxt = new JTextField();
		dstbutton = new JButton("Browse");
		dstbutton.addActionListener(this);
		JPanel dstpanel = new JPanel(new GridBagLayout());
		dstpanel.setBackground(pane.getBackground());
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 2;
		dstpanel.add(dstlabel, c);
		c.gridy = 1;
		c.gridwidth = 1;
		dstpanel.add(dsttxt, c);
		c.gridx = 1;
		dstpanel.add(dstbutton, c);
		// Convert
		JLabel cvtlabel = new JLabel("Progress");
		cvtbutton = new JButton("Convert");
		cvtbutton.addActionListener(this);
		JPanel cvtbuttonpanel = new JPanel(new FlowLayout());
		cvtbuttonpanel.setBackground(pane.getBackground());
		cvtbuttonpanel.add(cvtbutton);
		cvtbuttonpanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 10));
		progress = new JProgressBar(0, 100);
		JPanel cvtpanel = new JPanel(new GridBagLayout());
		cvtpanel.setBackground(pane.getBackground());
		c.gridx = 1;
		c.gridy = 0;
		c.gridwidth = 3;
		cvtpanel.add(cvtlabel, c);
		c.gridx = 0;
		c.gridy = 1;
		c.gridwidth = 1;
		cvtpanel.add(cvtbuttonpanel, c);
		c.gridx = 1;
		c.gridwidth = 2;
		cvtpanel.add(progress, c);
		// GUI controls
		JPanel guipanel = new JPanel(new GridLayout(3, 1));
		guipanel.add(srcpanel);
		guipanel.add(dstpanel);
		guipanel.add(cvtpanel);
		// Logo
		JLabel logo = new JLabel(new SoundToClassLogo());
		// Main window
		pane.setLayout(new FlowLayout());
		pane.add(logo);
		pane.add(guipanel);
		// Realize
		pack();
		// Update conponent sizes
		Dimension srctxtdim = new Dimension(300, srcbutton.getHeight());
		srctxt.setPreferredSize(srctxtdim);
		Dimension dsttxtdim = new Dimension(300, dstbutton.getHeight());
		dsttxt.setPreferredSize(dsttxtdim);
		Dimension cvtdim = new Dimension((300 + srcbutton.getWidth()) - cvtbuttonpanel.getWidth(), cvtbutton.getHeight());
		progress.setPreferredSize(cvtdim);
		pack();
		Dimension windim = new Dimension(getWidth() + 30, getHeight() + 20);
		setPreferredSize(windim);
		// Display in center of screen
		pack();
		Dimension window = getSize();
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((screen.width-window.width)/2, (screen.height-window.height)/2);
		setVisible(true);
		// Start with blank fileds and enabled GUI
		clear();
		enable();
		new Fanfare().play();
	}

	// Handle button presses
	public void actionPerformed(ActionEvent e) {
		// Browse for source file
		if(e.getSource() == srcbutton){
			String oldsrc = src;
			String newsrc = getFile(src, src, new SoundFilter());
			setSrc(newsrc);
			if(!oldsrc.equals(newsrc) && dst.equals("")) setDst(SoundToClass.getDefaultDst(newsrc));
		}
		// Browse for destination file
		else if(e.getSource() == dstbutton){
			String dir = src;
			if(dst != "") dir = dst;
			setDst(getFile(dir, dst, new JavaFilter()));
		}
		// Convert
		else if(e.getSource() == cvtbutton){
			src = srctxt.getText();
			dst = dsttxt.getText();
			if(src.equals("")) STC.alert("You must choose a source file.");
			else if(dst.equals("")) STC.alert("You must choose a destination file.");
			else new Converter(STC, this, src, dst).execute();
		}
	}
	
	// Thread to handle conversion runs outside the event dispatching thread
	private class Converter extends SwingWorker<Object, Object> {
		private final SoundToClass stc;
		private final SoundToClassGUI gui;
		private final String src;
		private final String dst;
		public Converter(SoundToClass stc, SoundToClassGUI gui, String src, String dst){ this.stc = stc; this.gui = gui; this.src = src; this.dst = dst; }
		protected Object doInBackground() throws Exception {
			try{
				gui.disable();
				stc.soundToClass(src, dst);
				gui.clear();
			}
			finally{
				gui.enable();
			}
			return null;
		}
	}
	
	// Set the source file
	private void setSrc(String src){
		this.src = src;
		srctxt.setText(src);
	}
	
	// Set the destination file
	private void setDst(String dst){
		this.dst = dst;
		dsttxt.setText(dst);
	}
	
	// Use JFileChooser to get a file, starting in dir, filtering using filter,
	// and returning cancel if canceled
	public String getFile(String dir, String cancel, FileFilter filter){
		JFileChooser chooser = new JFileChooser();
		chooser.addChoosableFileFilter(filter);
		chooser.setAcceptAllFileFilterUsed(false);
		chooser.setCurrentDirectory(new File(dir));
		int choice = chooser.showOpenDialog(this);
		if(choice == JFileChooser.APPROVE_OPTION){
			return chooser.getSelectedFile().getAbsolutePath();
		}
		return cancel;
	}
	
	// JFileChooser filter for images of supported types
	private class SoundFilter extends FileFilter {
		public boolean accept(File file){
			if(file.isDirectory()) return true;
			String extension = SoundToClass.getFileExtension(file.getName());
			if(extension == null) return false;
			extension = extension.toUpperCase();
			for(int i=0; i<SoundToClass.SUPPORTED.length; i++){
				if(extension.equals(SoundToClass.SUPPORTED[i])) return true;
			}
			return false;
	    }
	    public String getDescription() {
	        return "Support sound files";
	    }
	}
	
	// JFileChooser filter for .java file
	private class JavaFilter extends FileFilter {
		public boolean accept(File file){
			if(file.isDirectory()) return true;
			String extension = SoundToClass.getFileExtension(file.getName());
			if(extension == null) return false;
			extension = extension.toUpperCase();
			if(extension.equals("JAVA")) return true;
			return false;
	    }
	    public String getDescription() {
	        return "Java source files";
	    }
	}
	
	// Clear all entries in the GUI
	public void clear(){
		setSrc("");
		setDst("");
		setProgress(0);
	}
	
	// Disable the GUI
	public void disable(){
		srctxt.setEditable(false);
		srcbutton.setEnabled(false);
		dsttxt.setEditable(false);
		dstbutton.setEnabled(false);
		cvtbutton.setEnabled(false);
	}
	
	// Enable the GUI
	public void enable(){
		srctxt.setEditable(true);
		srcbutton.setEnabled(true);
		dsttxt.setEditable(true);
		dstbutton.setEnabled(true);
		cvtbutton.setEnabled(true);
		this.requestFocusInWindow();
	}
	
	// Update the progress bar with a double between 0.0 and 1.0
	public void setProgress(double percent){
		progress.setValue((int)(percent * 100.0));
		repaint();
	}

}
