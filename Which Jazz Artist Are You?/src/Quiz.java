/**
 * 
 */

/**
 * @author lraynaud
 * Goal: to create a quiz to see which jazz artist you are
 * Will utilize conditionals, user input, and text processing methods
 * @param Sax Score
 * @param Trumpet Score
 * @param Bass Score
 * @param Drum Score
 */
 import java.util.*;
 
public class Quiz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declare Criteron Variables//
		int sax = 0;
		int trumpet = 0;
		int bass = 0;
		int drums = 0;
		
		// create scanner //
		Scanner console = new Scanner(System.in);
		
		question1(console, sax, trumpet, bass, drums);
		
		// close console//
		console.close();
	}
		
	public static void question1(Scanner console, int sax, int trumpet, int bass, int drums) {	
		// prompt first question // 
		System.out.println("What kind of music would you rather listen to?");
		System.out.println("1. Smooth Jazz  "
				+ "2. Orchestral  "
				+ "3. Techno  "
				+ "4. Tribal Dance Music  ");
		System.out.println(      );
		System.out.println(" please enter 1, 2, 3, or 4");
		
		int answer = console.nextInt();
		if (answer == 1) {
			sax++; }
		if (answer == 2) {
			trumpet++;}
		if (answer == 3) {
			bass++;}
		if (answer == 4) {
			drums++;}
		
question2( console,sax, trumpet, bass, drums);

console.close();
	}
	
public static void question2(Scanner console, int sax, int trumpet, int bass, int drums) {
			// prompt second question // 
	System.out.println("What do you do when you listen to music?");
	System.out.println("1. Whistle to myself  "
			+ "2. Hum to myself  "
			+ "3. Snap my fingers   "
			+ "4. Tap rhymthms on surface  ");
	System.out.println(      );
	System.out.println(" please enter 1, 2, 3, or 4");
	
	int answer = console.nextInt();
	if (answer == 1) {
		sax++; }
	if (answer == 2) {
		trumpet++;}
	if (answer == 3) {
		bass++;}
	if (answer == 4) {
		drums++;}
	
	question3( console,sax, trumpet, bass, drums);

	console.close();
	
	
	
	
	}
public static void question3(Scanner console, int sax, int trumpet, int bass, int drums) {
	// prompt second question // 
System.out.println("If you could live in one state, which would it be?");
System.out.println("1. New York  "
	+ "2. Louisianna  "
	+ "3. Tennesse   "
	+ "4. Florida  ");
System.out.println(      );
System.out.println(" please enter 1, 2, 3, or 4");

int answer = console.nextInt();
if (answer == 1) {
sax++; }
else if (answer == 2) {
trumpet++;}
else if (answer == 3) {
bass++;}
else if (answer == 4) {
drums++;}
	
	question4(console, sax, trumpet, bass, drums);
	
	console.close();
}

public static void question4(Scanner console, int sax, int trumpet, int bass, int drums) {
	// prompt second question // 
System.out.println("What do you do to relax?");
System.out.println("1. Heroine  "
	+ "2. Clean things  "
	+ "3. Take a walk   "
	+ "4. Practice rudiments  ");
System.out.println(      );
System.out.println(" please enter 1, 2, 3, or 4");

int answer = console.nextInt();
if (answer == 1) {
sax++; }
else if (answer == 2) {
trumpet++;}
else if (answer == 3) {
bass++;}
else if (answer == 4) {
drums++;}
	
	if (sax > trumpet && sax > bass && sax > drums ){ System.out.println("You're Charlie Parker!");}
	else if (trumpet > sax && trumpet > bass && trumpet > drums ){ System.out.println("You're Miles Davis!");}
	else if (bass > sax && bass > trumpet && bass > drums ){ System.out.println("You're Ron Carter!");}
	else if (drums > sax && drums > trumpet && drums > bass ){System.out.println("You're Brian Blade!");}
	else if (sax != trumpet || sax != bass || sax != drums || trumpet != bass || trumpet != drums || bass != drums){System.out.println("You're Art Blakley!");
	
	}
}
}

