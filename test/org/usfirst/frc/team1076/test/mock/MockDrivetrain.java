package org.usfirst.frc.team1076.test.mock;

import org.usfirst.frc.team1076.robot.subsystems.IDrivetrain;

import edu.wpi.first.wpilibj.CANTalon;

public class MockDrivetrain implements IDrivetrain {
    MockMotor leftMotor;
    MockMotor rightMotor;
    MockMotor topMotor;
    MockMotor bottomMotor;
    @Override
    public void strafe(double xSpeed, double ySpeed) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void rotate(double speed) {
        // TODO Auto-generated method stub
        
    }

}
