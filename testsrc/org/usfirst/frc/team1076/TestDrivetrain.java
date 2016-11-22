package org.usfirst.frc.team1076;

import static org.junit.Assert.*;

import org.junit.Test;
import org.strongback.components.Motor;
import org.strongback.mock.Mock;
import org.strongback.mock.MockMotor;
import org.usfirst.frc.team1076.robot.TeleopController;
import org.usfirst.frc.team1076.robot.subsystems.Drivetrain;

public class TestDrivetrain {
    public double EPSILON = 0.000001; 
    @Test
    public void testStrafe() {
        MockMotor leftMotor = Mock.stoppedTalonSRX();
        MockMotor rightMotor = Mock.stoppedTalonSRX();
        MockMotor topMotor = Mock.stoppedTalonSRX();
        MockMotor bottomMotor = Mock.stoppedTalonSRX();
        Drivetrain drivetrain = new Drivetrain(leftMotor, rightMotor, topMotor, bottomMotor);
        drivetrain.strafe(1, -1);
        assertEquals(leftMotor.getSpeed(), 1, EPSILON);
    }

}
