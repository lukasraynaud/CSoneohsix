/** Program to Calculate Account Balances from Text File
 * 
 */

/**
 * @author lraynaud

 *
 */
// import appropriate utilities // 
import java.io.*;
import java.util.*;

public class TextFiles {

	/**
	 * @param args
	 * Main Class
	 */
	
	// Main Method Establishes Balance Variables, Scans File, and Outputs Results to New File//
	public static void main(String[] args) throws FileNotFoundException {

		
		// set variables for account balances starting at 0//
		String [] dates = new String[113];
		String [] accounts = new String [113];
		String [] transactions = new String [113];
		double [] amounts = new double [113];
		
		
		// create new scanner for reading file from src folder //
		Scanner fileReader = new Scanner(new File("src/input.txt"));
		
		// create new printstream for writing output file to src folder //
		PrintStream output = new PrintStream(new File("src/output.txt"));

		
		// create while loop to read through entire text file, as long as there are additional tokens //
		
		int i = 0;
		while (fileReader.hasNext()) {
			
		dates[i] = fileReader.next();
		
		accounts[i] = fileReader.next();
		if (accounts [i].equals("Credit")) {
			accounts[i] = accounts[i] + " " + fileReader.next();
		}
		
		transactions[i] = fileReader.next();
		if (transactions[i].equals("Opening")) {
			transactions[i] = transactions[i] + " " + fileReader.next();
			
		
		}
	amounts[i] = fileReader.nextDouble();
	
	i ++;
	
		}
		fileReader.close();
		
		
		double checking = 0;
		double savings = 0;
		double credit = 0;
		
		
		for (i = 0; i < dates.length; i++){
			if (accounts[i].equals("Checking")) {
				if (transactions[i].equals("Withdrawal")) {
					checking -= amounts[i];
				} else { 
					checking += amounts[i];
					
				}
			} else if ( (accounts[i].equals("Savings"))){
				if (transactions[i].equals("Withdrawal")){
					savings -= amounts[i];
				} else { savings +=amounts[i];
				
				}
			} else {
				if ( (transactions[i].equals("Withdrawal"))){
					credit -= amounts[i];
				} else {
					credit += amounts[i];
					
				}
			}
				System.out.println("Checking balance $" + checking);
				System.out.println("Savings balance $" + savings);
				System.out.println("Credit balance $" + credit);
				
	
	
			
		

		}
	}
	
}

