package org.usfirst.frc.team1076.robot.subsystems;

import org.usfirst.frc.team1076.robot.RobotMap;
import org.usfirst.frc.team1076.robot.commands.DriveWithJoysticks;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drivetrain extends Subsystem {
    CANTalon leftMotor;
    CANTalon rightMotor;
    CANTalon topMotor;
    CANTalon bottomMotor;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public Drivetrain() {
		leftMotor = new CANTalon(RobotMap.leftMotor);
		rightMotor = new CANTalon(RobotMap.rightMotor);
		topMotor = new CANTalon(RobotMap.topMotor);
		bottomMotor = new CANTalon(RobotMap.bottomMotor);
	}
	
    public void initDefaultCommand() {
    	// This subsystem will run DriveWithJoysticks unless another command interrupts it
        setDefaultCommand(new DriveWithJoysticks());
    }
    /**
     * Strafe the robot at a particular speed
     * @param xSpeed    double between -1 and 1
     * @param ySpeed    double between -1 and 1
     */
    public void strafe(double xSpeed, double ySpeed) {
        leftMotor.set(xSpeed);
        rightMotor.set(xSpeed);
        topMotor.set(ySpeed);
        bottomMotor.set(ySpeed);
    }
    
    /**
     * Rotates the robot at a particular speed.
     * Positive values will rotate left while negative values rotate right
     * @param speed   double between -1 and 1, speed of rotation
     * 
     */
    public void rotate(double speed) {
        leftMotor.set(speed);
        rightMotor.set(-speed);
    }
}