package org.usfirst.frc.team1076.robot.commands;

import org.usfirst.frc.team1076.robot.OI;
import org.usfirst.frc.team1076.robot.subsystems.Drivetrain;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveWithJoysticks extends Command {
    OI oi = new OI();
    Drivetrain drivetrain;
    
    public DriveWithJoysticks() {
        requires(drivetrain);
    }

    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        drivetrain.strafe(oi.getLeftX(), oi.getLeftY());
        drivetrain.rotate(oi.getRightX());
    }

    protected boolean isFinished() {
        return false; // This does not finish
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
