package org.usfirst.frc.team1076.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drivetrain extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    /**
     * Strafe the robot at a particular speed
     * @param xSpeed    double between -1 and 1
     * @param ySpeed    double between -1 and 1
     */
    public void strafe(double xSpeed, double ySpeed) {
        System.out.println("TODO! xSpeed: " + xSpeed + " ySpeed: " + ySpeed);
    }
    
    /**
     * Rotates the robot at a particular speed.
     * Positive values will rotate left while negative values rotate right
     * @param speed   double between -1 and 1, speed of rotation
     * 
     */
    public void rotate(double speed) {
        System.out.println("TODO! rotation: " + speed);
    }
}

