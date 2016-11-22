package org.usfirst.frc.team1076.robot.commands;


import org.strongback.command.Command;
import org.usfirst.frc.team1076.robot.TeleopController;
import org.usfirst.frc.team1076.robot.subsystems.Drivetrain;

/**
 *
 */
public class DriveWithJoysticks extends Command {
    TeleopController controller;
    Drivetrain drivetrain;
    
    public DriveWithJoysticks(TeleopController controller, Drivetrain drivetrain) {
        this.controller = controller;
        this.drivetrain = drivetrain;
        setNotInterruptible();
    }

    // Called repeatedly when this Command is scheduled to run
    public boolean execute() {
        drivetrain.strafe(controller.getLeftX().read(), controller.getLeftY().read());
        drivetrain.rotate(controller.getRightX().read());
        return true;
    }
}
