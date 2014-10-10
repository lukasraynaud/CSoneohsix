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

		double checkingAccount = 0;
		double savingsAccount = 0;
		double creditCardAccount = 0;

		
		Scanner fileReader = new Scanner(new File("src/input.txt"));
		PrintStream output = new PrintStream(new File("src/output.txt"));
		
		while (fileReader.hasNext()) {
			fileReader.next();
			String type = fileReader.next();
			if (type.equals("Credit")) {
				type += fileReader.next();
			}
			String action = fileReader.next();
			if (action.equals("Opening")) {
				action += fileReader.next();
			}
			double dollar = fileReader.nextDouble();
			if (action.equals("Withdrawal")) {
				dollar *= -1;
			}
			if(type.equals("Checking")){
				checkingAccount += dollar;
			}
			else if(type.equals("Savings")){
				savingsAccount += dollar;
			}
			else{
				creditCardAccount += dollar;
			}
			
		}
	output.println("Checking Balance =  $" + checkingAccount);
	output.println("Savings Balance =  $" + savingsAccount);
	output.println("Credit Card Balance =  $" + creditCardAccount);
	output.println("You're not poor!");
	
	output.close();
	
	
	}
}
