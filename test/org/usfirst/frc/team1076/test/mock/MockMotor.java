package org.usfirst.frc.team1076.test.mock;

public class MockMotor {
    double speed;
    
    public MockMotor() {
        speed = 0;
    }
    
    public void set(double speed) {
        if (speed > 1) {
            this.speed = 1;
        } else if (speed < -1) {
            this.speed = -1;
        } else {
            this.speed = speed;
        }
    }
    
    public double get() {
        return speed;
    }
}
