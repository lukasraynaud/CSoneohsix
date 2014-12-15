
/** Program to play selected movie quotes from a main board
 * 
 */

/**
 *  @author Lukas Raynaud lraynaud@skidmore.edu
 */

// import appropriate utilities // 

import java.awt.Component; 
import java.io.*;

import javax.swing.JFileChooser;

import sun.audio.*;

import java.util.*;




public class playwav 
{

	
	/** 
	 *  optional class to select specific audio files and display pathways. not used in current version
	 */
	
	
	public playwav()
	{

		try { 

			JFileChooser openf=new JFileChooser();
			Component j = null;
			openf.showOpenDialog(j);
			File fl= openf.getSelectedFile();	
			String st= fl.getAbsolutePath();
			InputStream in=new FileInputStream(fl);
			AudioStream au=new AudioStream(in);
			AudioPlayer.player.start(au);

			System.out.println(st);

		}


		catch(Exception e){}}
	
	/**
	 * Main class
	 * displays movie options 
	 * @param args
	 * @throws IOException
	 */
	
	
	public static void main (String args[]) throws IOException
	{
		
		// displays instructions and options //
		System.out.println("Welcome to the Samuel L. Jackson Soundboard!");
		System.out.println("");
		System.out.println("Please select a following movie.");
		System.out.println("");
		System.out.println("Pulp Fiction               press \"p\"");
		System.out.println("Rules of Engagement        press \"r\"");
		System.out.println("Captain America            press \"c\"");
		System.out.println(""); 
		System.out.println("↓ Enter Here");

		
		
		// calls movie prompt class to open scanenr //
		movieprompt();

	}		

/**
 * Class to handle user input choice 
 * @throws IOException
 */
	public static void movieprompt() throws IOException{

		
		// create new scanner to handle user input //
		Scanner userinput = new Scanner(System.in);

		String answer = userinput.next();

		// checks for 3 good cases (p,r,c) and handles all other entries //
		// calls next appropriate class based on input //
		if (answer.equalsIgnoreCase("p")){

			pulpquotes(); }

		else if (answer.equalsIgnoreCase("r")){

			rulesquotes();}

		else if (answer.equalsIgnoreCase("c")){

			captainquotes();}

		else { System.out.println("Try again."); 
		System.out.println("↓ Enter Here");
		movieprompt();}






	}

/**
 * Class for pulp fiction quotes
 * @throws IOException
 */

public static void pulpquotes () throws IOException{

	// displays instructions //
		System.out.println("");
		System.out.println("Please select a quote you would like to hear.");
		System.out.println("");
		System.out.println("a. \"Retort\"");
		System.out.println("b. \"Tasty burger\"");
		System.out.println("c. \"Big brain on Brian\"");
		System.out.println("d. \"All you had to say\"");
		System.out.println("e. \"Askin' you\"");
		System.out.println("f. \"Break\"");
		System.out.println("g. \"English\"");
		System.out.println("h. \"Repugnant\"");
		System.out.println("q.  Select another movie");
		System.out.println("");
		System.out.println("↓ Enter Here");


		// creates scanner to handle user input // 
		Scanner userinput = new Scanner(System.in);
		String quoteanswer = userinput.next();

		
		// if and else statements to handle user input //
		// creates new audio stream based on given file path //
		// creates a new audio player based on created audio stream //
		
		if (quoteanswer.equalsIgnoreCase("a")){

			InputStream in=new FileInputStream("/Users/lukasraynaud/Desktop/Samuel L Jackson Quotes/Pulp Fiction/retort.wav");
			AudioStream au=new AudioStream(in);
			AudioPlayer.player.start(au);


		}
		else if (quoteanswer.equalsIgnoreCase("b")){

			InputStream in=new FileInputStream("/Users/lukasraynaud/Desktop/Samuel L Jackson Quotes/Pulp Fiction/big_brain.wav");
			AudioStream au=new AudioStream(in);
			AudioPlayer.player.start(au);
		}
		else if (quoteanswer.equalsIgnoreCase("c")){

			InputStream in=new FileInputStream("/Users/lukasraynaud/Desktop/Samuel L Jackson Quotes/Pulp Fiction/tasty_burger.wav");
			AudioStream au=new AudioStream(in);
			AudioPlayer.player.start(au);
		}

		else if (quoteanswer.equalsIgnoreCase("d")){

			InputStream in=new FileInputStream("/Users/lukasraynaud/Desktop/Samuel L Jackson Quotes/Pulp Fiction/all_u_had_2_say.wav");
			AudioStream au=new AudioStream(in);
			AudioPlayer.player.start(au);
		}
		else if (quoteanswer.equalsIgnoreCase("e")){

			InputStream in=new FileInputStream("/Users/lukasraynaud/Desktop/Samuel L Jackson Quotes/Pulp Fiction/askin_you.wav");
			AudioStream au=new AudioStream(in);
			AudioPlayer.player.start(au);
		}
		else if (quoteanswer.equalsIgnoreCase("f")){

			InputStream in=new FileInputStream("/Users/lukasraynaud/Desktop/Samuel L Jackson Quotes/Pulp Fiction/break_x.wav");
			AudioStream au=new AudioStream(in);
			AudioPlayer.player.start(au);
		}
		else if (quoteanswer.equalsIgnoreCase("g")){

			InputStream in=new FileInputStream("/Users/lukasraynaud/Desktop/Samuel L Jackson Quotes/Pulp Fiction/english.wav");
			AudioStream au=new AudioStream(in);
			AudioPlayer.player.start(au);
		}

		else if (quoteanswer.equalsIgnoreCase("h")){

			InputStream in=new FileInputStream("/Users/lukasraynaud/Desktop/Samuel L Jackson Quotes/Pulp Fiction/repugnant_x.wav");
			AudioStream au=new AudioStream(in);
			AudioPlayer.player.start(au);
		}
		else if (quoteanswer.equalsIgnoreCase("q")){
			main(null);
		}

		pulpquotes();
	}


/**
 * Rules of Engagement Class
 * @throws IOException
 */

public static void rulesquotes () throws IOException{

		
		System.out.println("Please select a quote you would like to hear.");
		System.out.println("");
		System.out.println("a. \"Ball Game\"");
		System.out.println("b. \"Caught\"");
		System.out.println("c. \"Crucify\"");
		System.out.println("d. \"Dead\"");
		System.out.println("e. \"Fly Fishing\"");
		System.out.println("f. \"Self Esteem\"");
		System.out.println("q.  Select another movie");
		System.out.println("");
		System.out.println("↓ Enter Here");



		Scanner userinput = new Scanner(System.in);
		String quoteanswer = userinput.next();

		if (quoteanswer.equalsIgnoreCase("a")){

			InputStream in=new FileInputStream("/Users/lukasraynaud/Desktop/Samuel L Jackson Quotes/Rules of Engagement/ballgame.wav");
			AudioStream au=new AudioStream(in);
			AudioPlayer.player.start(au);


		}
		else if (quoteanswer.equalsIgnoreCase("b")){

			InputStream in=new FileInputStream("/Users/lukasraynaud/Desktop/Samuel L Jackson Quotes/Rules of Engagement/caught.wav");
			AudioStream au=new AudioStream(in);
			AudioPlayer.player.start(au);
		}
		else if (quoteanswer.equalsIgnoreCase("c")){

			InputStream in=new FileInputStream("/Users/lukasraynaud/Desktop/Samuel L Jackson Quotes/Rules of Engagement/crucify.wav");
			AudioStream au=new AudioStream(in);
			AudioPlayer.player.start(au);
		}

		else if (quoteanswer.equalsIgnoreCase("d")){

			InputStream in=new FileInputStream("/Users/lukasraynaud/Desktop/Samuel L Jackson Quotes/Rules of Engagement/dead.wav");
			AudioStream au=new AudioStream(in);
			AudioPlayer.player.start(au);
		}
		else if (quoteanswer.equalsIgnoreCase("e")){

			InputStream in=new FileInputStream("/Users/lukasraynaud/Desktop/Samuel L Jackson Quotes/Rules of Engagement/flyfishing.wav");
			AudioStream au=new AudioStream(in);
			AudioPlayer.player.start(au);
		}
		else if (quoteanswer.equalsIgnoreCase("f")){

			InputStream in=new FileInputStream("/Users/lukasraynaud/Desktop/Samuel L Jackson Quotes/Rules of Engagement/selfesteem.wav");
			AudioStream au=new AudioStream(in);
			AudioPlayer.player.start(au);
		}
		
		else if (quoteanswer.equalsIgnoreCase("q")){
			main(null);
		}

		rulesquotes();
	}

/**
 * Captain America class
 * @throws IOException
 */
	

	public static void captainquotes () throws IOException{

	
		System.out.println("Please select a quote you would like to hear.");
		System.out.println("");
		System.out.println("a. \"Exit\"");
		System.out.println("b. \"Slowly\"");
		System.out.println("c. \"Spear\"");
		System.out.println("d. \"Stranger\"");
		System.out.println("e. \"Trusted\"");
		System.out.println("f. \"War\"");
		System.out.println("q.  Select another movie");
		System.out.println("");
		System.out.println("↓ Enter Here");



		Scanner userinput = new Scanner(System.in);
		String quoteanswer = userinput.next();

		if (quoteanswer.equalsIgnoreCase("a")){

			InputStream in=new FileInputStream("/Users/lukasraynaud/Desktop/Samuel L Jackson Quotes/Captain America/exit.wav");
			AudioStream au=new AudioStream(in);
			AudioPlayer.player.start(au);


		}
		else if (quoteanswer.equalsIgnoreCase("b")){

			InputStream in=new FileInputStream("/Users/lukasraynaud/Desktop/Samuel L Jackson Quotes/Captain America/slowly.wav");
			AudioStream au=new AudioStream(in);
			AudioPlayer.player.start(au);
		}
		else if (quoteanswer.equalsIgnoreCase("c")){

			InputStream in=new FileInputStream("/Users/lukasraynaud/Desktop/Samuel L Jackson Quotes/Captain America/spear.wav");
			AudioStream au=new AudioStream(in);
			AudioPlayer.player.start(au);
		}

		else if (quoteanswer.equalsIgnoreCase("d")){

			InputStream in=new FileInputStream("/Users/lukasraynaud/Desktop/Samuel L Jackson Quotes/Captain America/stranger.wav");
			AudioStream au=new AudioStream(in);
			AudioPlayer.player.start(au);
		}
		else if (quoteanswer.equalsIgnoreCase("e")){

			InputStream in=new FileInputStream("/Users/lukasraynaud/Desktop/Samuel L Jackson Quotes/Captain America/trusted.wav");
			AudioStream au=new AudioStream(in);
			AudioPlayer.player.start(au);
		}
		else if (quoteanswer.equalsIgnoreCase("f")){

			InputStream in=new FileInputStream("/Users/lukasraynaud/Desktop/Samuel L Jackson Quotes/Captain America/war.wav");
			AudioStream au=new AudioStream(in);
			AudioPlayer.player.start(au);
		}

		else if (quoteanswer.equalsIgnoreCase("q")){
			main(null);
		}

		captainquotes();
	}

	}

