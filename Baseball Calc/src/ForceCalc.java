/**
 * 
 */

/**
 * @author lraynaud
 *
 */

import java.util.Scanner;
public class ForceCalc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//create scanner called "console"//
		Scanner console = new Scanner(System.in);
		
		//promte user to input length of baseball they wish to clear//
		System.out.println("Length of baseball field in feet?");
		
		// user inputs desired length//
		double d = console.nextDouble(); 
		
		// main method prints out velocity required to hit ball out of the specified field//
		 System.out.println("You have to hit the ball  "+ calculatevelocity(d)); 
		 System.out.println("miles per hour to hit the ball"); 
		 System.out.println(d + "  feet"); 
		
	
	}
		
	public static double calculatevelocity(double d)	{
		
		
		double angle = 0.506145483; // this is the average exit angle (in radians) of a baseball from http://www.laserpablo.com/baseball/Kagan/HomerAngle.pdf//
		double gravity = 9.8; //this is the gravitation constant in meters per second^2//
		double con = d*0.3048; // this converts the users input in feet to meters//
		double v = (Math.sqrt((con)*(gravity))/(Math.sin(angle)*2)); // this calculates the velocity required for achieving the max trajectory (d)//
		return (v*0.000621371)*(3600); // converts velocity to miles per hour from meters per second and then returns this info to the main method//	
		
		

	}
}
