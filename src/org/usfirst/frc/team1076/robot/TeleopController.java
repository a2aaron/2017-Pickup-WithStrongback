package org.usfirst.frc.team1076.robot;

import org.strongback.components.ui.ContinuousRange;
import org.strongback.components.ui.Gamepad;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class TeleopController {
    Gamepad gamepad;
    
    public TeleopController(Gamepad gamepad) {
        this.gamepad = gamepad;
    }
    
    public ContinuousRange getLeftY() {
        return gamepad.getAxis(0);
    }
    
    public ContinuousRange getLeftX() {
        return gamepad.getAxis(1);
    }
    
    public ContinuousRange getRightX() {
        return gamepad.getAxis(4);
    }
    
    
    
    
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
}

