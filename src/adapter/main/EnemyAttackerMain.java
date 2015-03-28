/*
 * Author: Saif Uddin Mahmud
 * Date: March 27, 2015
 */

package adapter.main;

public class EnemyAttackerMain {

	public static void main(String[] args) {
		
		EnemyRobot r1TheAdapteeRobot = new EnemyRobot();

		System.out.println("Adpatee Robot");

		r1TheAdapteeRobot.reactToHuman("Mamun Ahmed");
		r1TheAdapteeRobot.walkForward();
		r1TheAdapteeRobot.smashWithHands();

		
		
		EnemyTank n16E5Tank = new EnemyTank();

		System.out.println("Samrat Shamim");

		n16E5Tank.assignDriver("Samrat Shamim");
		n16E5Tank.driveForward();
		n16E5Tank.fireWeapon();

		
		IEnemyAttacker robotAdapter = new EnemyRobotAdapter(r1TheAdapteeRobot);

		System.out.println("The robot with adatper");

		robotAdapter.assignDriver("Ishmam");
		robotAdapter.driveForward();
		robotAdapter.fireWeapon();
	}

}
