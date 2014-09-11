/**
 * 
 */

/**
 * @author lraynaud
 *
 */


public class ForceCalc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		// Method for 500 foot field//
		double angle = 0.506145483; // this is the average exit angle (in radians) of a baseball from http://www.laserpablo.com/baseball/Kagan/HomerAngle.pdf//
		double gravity = 9.8; //this is the gravitation constant in meters per second^2//
		double d = 500; // this input will be in feet// 
		double con = d*0.3048; // this converts the users input in feet to meters//
		double v = (Math.sqrt((con)*(gravity))/(Math.sin(angle)*2)); // this calculates the velocity required for achieving the max trajectory (d)//
		double fincon = (v*0.000621371)*(3600); // converts velocity to miles per hour from meters per second//	
			System.out.println("You have to hit the ball  " + fincon  );
			System.out.println("miles per hour to hit the ball");
			System.out.println(d + "feet");
			
			threehundred(args);
	}
	public static void threehundred(String[] args) {
		// Method for 500 foot field//
		double angle = 0.506145483; // this is the average exit angle (in radians) of a baseball from http://www.laserpablo.com/baseball/Kagan/HomerAngle.pdf//
		double gravity = 9.8; //this is the gravitation constant in meters per second^2//
		double d = 300; // this input will be in feet// 
		double con = d*0.3048; // this converts the users input in feet to meters//
		double v = (Math.sqrt((con)*(gravity))/(Math.sin(angle)*2)); // this calculates the velocity required for achieving the max trajectory (d)//
		double fincon = (v*0.000621371)*(3600); // converts velocity to miles per hour from meters per second//	
					System.out.println("You have to hit the ball  " + fincon  );
					System.out.println("miles per hour to hit the ball");
					System.out.println(d + "feet");
	}
}
