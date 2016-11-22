package org.usfirst.frc.team1076.robot.subsystems;

import org.strongback.command.Requirable;
import org.strongback.components.Motor;
import org.strongback.components.ui.ContinuousRange;
/**
 *
 */
public class Drivetrain implements Requirable {
    Motor leftMotor;
    Motor rightMotor;
    Motor topMotor;
    Motor bottomMotor;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public Drivetrain(Motor left, Motor right, Motor top, Motor bottom) {
		leftMotor = left;
		rightMotor = right;
		topMotor = top;
		bottomMotor = bottom;
	}
    /**
     * Strafe the robot at a particular speed
     * @param xSpeed    double between -1 and 1
     * @param ySpeed    double between -1 and 1
     */
    public void strafe(double xSpeed, double ySpeed) {
        leftMotor.setSpeed(xSpeed);
        rightMotor.setSpeed(xSpeed);
        topMotor.setSpeed(ySpeed);
        bottomMotor.setSpeed(ySpeed);
    }
    
    /**
     * Rotates the robot at a particular speed.
     * Positive values will rotate left while negative values rotate right
     * @param speed   double between -1 and 1, speed of rotation
     * 
     */
    public void rotate(double speed) {
        leftMotor.setSpeed(speed);
        rightMotor.setSpeed(-speed);
    }
}