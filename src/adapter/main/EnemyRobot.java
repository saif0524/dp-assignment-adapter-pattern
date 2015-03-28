/*
 * Author: Saif Uddin Mahmud
 * Date: March 27, 2015
 */

package adapter.main;

import java.util.Random;


//This is the ADAPTEE class........

public class EnemyRobot {

	Random randomGenerator = new Random();
	
	public void smashWithHands(){
		int attackDamage = randomGenerator.nextInt(10)+1;
		System.out.println("Enemy Robot Causes "+ attackDamage +" Damage with Its Hands.");
	}
	
	
	public void walkForward() {
		
		int movement = randomGenerator.nextInt(5) +1;
		System.out.println("Enemy Robot Walks " + movement + " Spaces.");
	} 
	
	public void reactToHuman(String driverName){
		System.out.println("Enemy Robot Tramps on " + driverName );
	}
}
