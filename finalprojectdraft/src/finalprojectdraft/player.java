package finalprojectdraft;

import java.util.Scanner;

public class player {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome to the Samuel L. Jackson Sound Board. ");
		System.out.println("Please select a movie you would like to choose from.");
		System.out.println("");
		System.out.println("Pulp Fiction				press \"p\"");
		System.out.println("Rules of Engagement			press \"r\"");
		System.out.println("The Avengers				press \"a\"");
		System.out.println("");
		System.out.println("↓ Here");

		Scanner console = new Scanner(System.in);

		String moviechoice = console.next();
		
		boolean goodinput = true;
		
		while (goodinput == true){

		if (moviechoice.equalsIgnoreCase("p")){ 
			
			System.out.println("Please select a quote."); 
			goodinput = false;
			pulp();
		}
		

		else if (moviechoice.equalsIgnoreCase("r")){

			System.out.println("Please select a quote.");
			goodinput = false;
			rules();
		}

		else if (moviechoice.equalsIgnoreCase("a")){

			System.out.println("Please select a quote.");
			goodinput = false;
			avengers();
		}

		else { System.out.println("Try Again");
		goodinput = true;
		moviechoice = console.next();
	}
		
		
}
	
}
	
	public static void pulp() { System.out.println(" ");
	System.out.println(" ");
	System.out.println(" pulp ");}
	public static void rules() {System.out.println(" ");
	System.out.println(" ");
	System.out.println(" rules "); }
	public static void avengers() { System.out.println(" ");
	System.out.println(" ");
	System.out.println(" avengers ");}
}
	











// http://www.moviesoundclips.net/people-details.php?id=23 // 