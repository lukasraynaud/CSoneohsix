import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/** 
 * A class to read in and analyze the file 
 * @author lraynaud
 *
 */

public class Filereader {

	// create array pokedex of type Pokemon //
	Pokemon [] pokedex;


	/**
	 * @param id			the id number of the pokemon
	 * @param name			the name of the pokemon
	 * @param hp			the health points of the pokemon
	 * @param attack		the attack of the pokemon
	 * @param defense		the defense of the pokemon
	 * @param sattack		the special attack of the pokemon
	 * @param sdefense		the special defense of the pokemon
	 * @param total			the total stats of the pokemon
	 * @param average		the average stats of the pokemon
	 * @throws FileNotFoundException
	 */

	public Filereader () throws FileNotFoundException{

		// Create File Scanner //
		Scanner fileReader = new Scanner(new File("src/first150pokemon"));
		// Set counter to 0 //

		int i = 0;

		// loop through file to print out all lines and count lines//
		while (fileReader.hasNextLine()){ 

			i ++;
			fileReader.nextLine();
		} 

		fileReader.close();

		// create array pokedex of type Pokemon //
		pokedex = new Pokemon [i];


		i = 0;
		fileReader = new Scanner(new File("src/first150pokemon"));

		// assign values to variables // 
		while (fileReader.hasNext()){ 


			int	id = fileReader.nextInt();
			String	name = fileReader.next();
			double	hp = fileReader.nextDouble();
			double	attack = fileReader.nextDouble();
			double	defense = fileReader.nextDouble();
			double	sattack = fileReader.nextDouble();
			double	sdefense = fileReader.nextDouble();
			double	speed = fileReader.nextDouble();
			double	total = fileReader.nextDouble();
			double	average = fileReader.nextDouble();

			// fill pokedex array with Pokemon objects // 
			pokedex[i]=new Pokemon(id, name, hp, attack, defense, sattack, sdefense, speed, total, average);
			i++;


		}

		// print out array of all pokemon // 
		fileReader.close();

		for(Pokemon p : pokedex){
			System.out.println(p);
		}

		System.out.println(" ");

		// loop through attacks to find maximum//

		double maxattack = 0;

		for(Pokemon p : pokedex){
			if (maxattack < p.getAttack())
				maxattack = p.getAttack();
		}

		// print out maximum // 

		System.out.println("Highest Attack" + " ");
		System.out.println(maxattack);
		System.out.println(" ");

		// loop through defense  to find maximum//

		double maxdefense = 0;

		for(Pokemon p : pokedex){
			if (maxdefense < p.getDefense())
				maxdefense = p.getDefense();
		}

		// print out maxium//

		System.out.println("Highest Defense" + " ");
		System.out.println(maxdefense);
		System.out.println(" ");


		// repeat for Special Attack, Special Defense, and Speed //

		double maxSattack = 0;
		for(Pokemon p : pokedex){
			if (maxSattack < p.getSattack())
				maxSattack = p.getSattack();


		}
		System.out.println("Highest Special Attack" + " ");
		System.out.println(maxSattack);
		System.out.println(" ");

		double maxSdefense = 0;
		for(Pokemon p : pokedex){
			if (maxSdefense < p.getSdefense())
				maxSdefense = p.getSdefense();

		}
		System.out.println("Highest Special Defense" + " ");
		System.out.println(maxSdefense);
		System.out.println(" ");

		double maxSpeed = 0;
		for(Pokemon p : pokedex){
			if (maxSpeed < p.getSpeed())
				maxSpeed = p.getSpeed();


		}	
		System.out.println("Highest Speed" + " ");
		System.out.println(maxSpeed);

	}

}












