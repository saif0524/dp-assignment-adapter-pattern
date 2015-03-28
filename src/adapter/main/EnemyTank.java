/*
 * Author: Saif Uddin Mahmud
 * Date: March 27, 2015
 */


package adapter.main;

import java.util.Random;

// this class simply shows all of the properties of IEnemyAttacker interface 

public class EnemyTank implements IEnemyAttacker{

	Random randomGenerator = new Random();
	
	@Override
	public void fireWeapon() {

		int attackDamage = randomGenerator.nextInt(10) + 1;
		
		System.out.println("Enemy Tank Does " + attackDamage + " Damage.");
	}

	@Override
	public void driveForward() {
		
		int movement = randomGenerator.nextInt(5) +1;
		System.out.println("Enemy Tank Moves " + movement + " Spaces.");
	}

 	@Override
	public void assignDriver(String driverName) {
		
		System.out.println(driverName + " is driving the tank.");
	} 
	
}
