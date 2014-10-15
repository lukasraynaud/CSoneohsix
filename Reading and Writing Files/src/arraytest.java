/** Program to test arrays 
 */

/**
 * @author lraynaud

 *
 */
// import appropriate utilities // 
import java.io.*;
import java.util.*;

public class arraytest {

	/**
	 * @param args
	 * Main Class
	 */
	
	// Main Method Establishes Balance Variables, Scans File, and Outputs Results to New File//
	public static void main(String[] args) throws FileNotFoundException {

		// create new scanner for reading file from src folder //
		Scanner fileReader = new Scanner(new File("src/input.txt"));
		
		// create new printstream for writing output file to src folder //
		PrintStream output = new PrintStream(new File("src/output.txt"));
		
		double linenumber = 0;
		while (fileReader.hasNextLine()){ linenumber ++; fileReader.nextLine();
			
		}
System.out.println(linenumber);



	}
}

		
	
