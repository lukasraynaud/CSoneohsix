/**
 * @author lraynaud
 * Goal: to create a quiz to see which jazz artist you are
 * Will utilize conditionals, user input, method calling, and int adding 
 * @param Sax Score
 * @param Trumpet Score
 * @param Bass Score
 * @param Drum Score
 */

// import Scanner for user input//
import java.util.*;

// Main Class for Jazz Quiz//
public class Quiz {

	/**
	 * @param args
	 */

	// Method to declare the four counted parameters, import scanner, and call
	// first question//

	public static void main(String[] args) {
		// Declare Criteron Variables, starting at value 0 //

		int sax = 0;

		int trumpet = 0;

		int bass = 0;

		int drums = 0;

		// create scanner //

		Scanner console = new Scanner(System.in);

		// call question 1//

		question1(console, sax, trumpet, bass, drums);

		// close console//

		console.close();
	}

	// method to ask first question, tally parameters, and call second question
	// //
	public static void question1(Scanner console, int sax, int trumpet,
			int bass, int drums) {

		// prompt first question //

		// interpret user input, and adjust parameters to tally score//

		int answer = 0;
		boolean first = true;

		while (answer <= 0 || answer > 4) {
			if (!first) {
				System.out.println("Try again Dinugs");
				System.out.println("   ");
			}

			System.out
					.println("What kind of music would you rather listen to?");

			System.out.println("1. Smooth Jazz  " + "2. Orchestral  "
					+ "3. Techno  " + "4. Tribal Dance Music  ");
			System.out.println();

			System.out.println(" please enter 1, 2, 3, or 4");
			if (console.hasNextInt()) {
				answer = console.nextInt();
			}
				console.nextLine();
			
			first = false;
		}

		if (answer == 1) {
			sax++;
		}

		if (answer == 2) {
			trumpet++;
		}

		if (answer == 3) {
			bass++;
		}

		if (answer == 4) {
			drums++;
		}

		// call question 2 //

		question2(console, sax, trumpet, bass, drums);

		
	}

	// process repeats itself for next questions //

	public static void question2(Scanner console, int sax, int trumpet,
			int bass, int drums) {

		int answer = 0;
		boolean first = true;
		

		while (answer <= 0 || answer > 4) {
			
			if (!first) {
				System.out.println("Try again Dinugs");
				System.out.println("   ");
			}

			System.out.println("What do you do when you listen to music?");

			System.out.println("1. Whistle to myself  " + "2. Hum to myself  "
					+ "3. Snap my fingers   " + "4. Tap rhymthms on surface  ");

			System.out.println();

			System.out.println(" please enter 1, 2, 3, or 4");

			if  (console.hasNextInt()) {
				answer = console.nextInt();
			} 
				console.nextLine();
			
			first = false;
		} 
		

		

		if (answer == 1) {
			sax++;
		}
		if (answer == 2) {
			trumpet++;
		}
		if (answer == 3) {
			bass++;
		}
		if (answer == 4) {
			drums++;
		}

		question3(console, sax, trumpet, bass, drums);

		

	}

	public static void question3(Scanner console, int sax, int trumpet,
			int bass, int drums) {

		int answer = 0;
		boolean first = true;

		while (answer <= 0 || answer > 4) {
			if (!first) {
				System.out.println("Try again Dinugs");
				System.out.println("   ");
			}

			System.out
					.println("If you could live in one state, which would it be?");

			System.out.println("1. New York  " + "2. Louisianna  "
					+ "3. Tennesse   " + "4. Florida  ");

			System.out.println();

			System.out.println(" please enter 1, 2, 3, or 4");
			if (console.hasNextInt()) {
				answer = console.nextInt();
			} 
				console.nextLine();
			
			first = false;
		}

		if (answer == 1) {
			sax++;
		} else if (answer == 2) {
			trumpet++;
		} else if (answer == 3) {
			bass++;
		} else if (answer == 4) {
			drums++;
		}

		question4(console, sax, trumpet, bass, drums);

		
	}

	// asks final question, tallies parameters, and checks for largest
	// parameter, conditions for a tie between 2 or more variables //
	public static void question4(Scanner console, int sax, int trumpet,
			int bass, int drums) {

		int answer = 0;
		boolean first = true;

		while (answer <= 0 || answer > 4) {
			if (!first) {
				System.out.println("Try again Dinugs");
				System.out.println("   ");
			}

			System.out.println("What do you do to relax?");

			System.out.println("1. Heroine  " + "2. Clean things  "
					+ "3. Take a walk   " + "4. Practice rudiments  ");
			System.out.println();
			System.out.println(" please enter 1, 2, 3, or 4");

			if (console.hasNextInt()) {
				answer = console.nextInt();
			} 
				console.nextLine();
			
			first = false;
		}

		if (answer == 1) {
			sax++;
		}

		else if (answer == 2) {
			trumpet++;
		}

		else if (answer == 3) {
			bass++;
		}

		else if (answer == 4) {
			drums++;
		}

		// conditions for total score //

		// sax score highest //

		if (sax > trumpet && sax > bass && sax > drums) {
			System.out.println("You're Charlie Parker!");
		}

		// trumpet score highest //

		else if (trumpet > sax && trumpet > bass && trumpet > drums) {
			System.out.println("You're Miles Davis!");
		}

		// bass score highest //

		else if (bass > sax && bass > trumpet && bass > drums) {
			System.out.println("You're Ron Carter!");
		}

		// drums score highest //

		else if (drums > sax && drums > trumpet && drums > bass) {
			System.out.println("You're Brian Blade!");
		}

		// tie between scores //

		else if (sax == trumpet || sax == bass || sax == drums
				|| trumpet == bass || trumpet == drums || bass == drums) {
			System.out.println("You're Art Blakley!");

		}
	}
}
