/**
 * 
 */

/**
 * @author lraynaud
 *
 */

import java.io.*;
import java.util.*;

public class TextFiles {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws FileNotFoundException {

		Scanner fileReader = new Scanner(new File("src/input.txt"));

	   String dates = new String (fileReader.next());
       System.out.println(dates);

			}
			
}


