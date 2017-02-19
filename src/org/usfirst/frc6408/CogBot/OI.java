// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc6408.CogBot;

import org.usfirst.frc6408.CogBot.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.*;
import org.usfirst.frc6408.CogBot.subsystems.*;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

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


    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public JoystickButton turnWinch;
    public JoystickButton speed0Button;
    public JoystickButton speed20Button;
    public JoystickButton speed40Button;
    public JoystickButton speed60Button;
    public JoystickButton speed80Button;
    public JoystickButton speed100Button;
    public Joystick mainJoy;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        mainJoy = new Joystick(0);
        
        speed100Button = new JoystickButton(mainJoy, 7);
        speed100Button.whenPressed(new SetDriveSpeed(100));
        speed80Button = new JoystickButton(mainJoy, 8);
        speed80Button.whenPressed(new SetDriveSpeed(80));
        speed60Button = new JoystickButton(mainJoy, 9);
        speed60Button.whenPressed(new SetDriveSpeed(60));
        speed40Button = new JoystickButton(mainJoy, 10);
        speed40Button.whenPressed(new SetDriveSpeed(40));
        speed20Button = new JoystickButton(mainJoy, 11);
        speed20Button.whenPressed(new SetDriveSpeed(0));
        speed0Button = new JoystickButton(mainJoy, 12);
        speed0Button.whenPressed(new SetDriveSpeed(0));
        turnWinch = new JoystickButton(mainJoy, 1);
        turnWinch.whileHeld(new MoveWinch(100));


        // SmartDashboard Buttons
        SmartDashboard.putData("MoveInches", new MoveInches(12));
        SmartDashboard.putData("SetDriveSpeed", new SetDriveSpeed(50));
        SmartDashboard.putData("MoveWinch", new MoveWinch(50));

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getMainJoy() {
        return mainJoy;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}
