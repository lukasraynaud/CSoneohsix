import java.io.FileNotFoundException;

/**
 * A class to establish variables
 * @author lraynaud
  	 * @param id			the id number of the pokemon
	 * @param name			the name of the pokemon
	 * @param hp			the health points of the pokemon
	 * @param attack		the attack of the pokemon
	 * @param defense		the defense of the pokemon
	 * @param sattack		the special attack of the pokemon
	 * @param sdefense		the special defense of the pokemon
	 * @param total			the total stats of the pokemon
	 * @param average		the average stats of the pokemon
 */
public class Pokemon {

	//establish variable types//
	
	public int id;
	public String name;
	public double hp;
	public double attack;
	public double defense;
	public double sattack;
	public double sdefense;
	public double speed;
	public double total;
	public double average;

	public Pokemon (int id, String name, double hp, double attack, double defense, double sattack, double sdefense, double speed, double total, double average) {

		// construct variables // 
		
		this.id = id;
		this.name = name;
		this.hp = hp;
		this.attack = attack;
		this.defense = defense;
		this.sattack = sattack;
		this.sdefense = sdefense;
		this.speed = speed;
		this.total = total;
		this.average = average;




	}
	public String toString1(){
		return this.id + "\t" + this.name;
	}

	public String toString(){
		return this.id + "\t" + this.name + "\t" + this.hp + "\t" + this.attack + "\t" + this.defense + "\t" + this.sattack + "\t" + this.sdefense + "\t" + this.speed + "\t" + this.total + "\t" + this.average; 



// create getters and setters for 5 variables to find maximums of and send to Filereader class for analysis //
	}

	public double getAttack() {
		return attack;
	}
	public void setAttack(double attack) {

	}
	public double getDefense() {
		return defense;
	}
	public void setDefense(double defense) {

	}
	public double getSattack() {
		return sattack;
	}
	public void setSattack(double sattack) {

	}
	public double getSdefense() {
		return sdefense;
	}
	public void setSdefense(double sdefense) {

	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {

	}
}

