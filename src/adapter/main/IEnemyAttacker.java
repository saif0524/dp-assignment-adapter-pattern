/*
 * Author: Saif Uddin Mahmud
 * Date: March 27, 2015
 */


package adapter.main;


// this is the TARGET interface

public interface IEnemyAttacker {
	public void fireWeapon();
	public void driveForward();
	public void assignDriver(String driverName);
}
