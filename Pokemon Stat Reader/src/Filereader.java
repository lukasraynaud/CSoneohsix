import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;



public class Filereader {
	
	
	 Pokemon [] pokedex;
	 
	
	
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
		
	
	pokedex[i]=new Pokemon(id, name, hp, attack, defense, sattack, sdefense, speed, total, average);
		i++;

		
	}


	
	
	
	for(Pokemon p : pokedex){
		System.out.println(p);
		
		
	}
	
	
Scanner console = new Scanner(System.in);
	
	System.out.println("Who would you like to see stats for?");
	System.out.println("Please enter Pokemon ID number");
	
	
	int answer = 0;
	if (console.hasNextInt()){
		answer = console.nextInt();
	
	System.out.println(pokedex[answer-1]);
		
		
		
}
	console.nextLine();


	
	
}

}











	