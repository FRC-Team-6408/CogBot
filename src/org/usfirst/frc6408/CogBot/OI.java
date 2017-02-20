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

//TODO: Nothing
public class OI {
	
    public JoystickButton turnWinch;
    
    //Speed buttons control the speed of teleop.
    public JoystickButton speed0Button;
    public JoystickButton speed20Button;
    public JoystickButton speed40Button;
    public JoystickButton speed60Button;
    public JoystickButton speed80Button;
    public JoystickButton speed100Button;
    public Joystick mainJoy;

    public OI() {
        mainJoy = new Joystick(0);
        
        turnWinch = new JoystickButton(mainJoy, 1);
        turnWinch.whileHeld(new MoveWinch(95));  //TODO: set to 100, I set it to 95 so as not to break the machine.
        turnWinch.whenReleased(new MoveWinch(0));  //Stops movement
        
        speed100Button = new JoystickButton(mainJoy, 7);
        speed100Button.whenPressed(new SetDriveSpeed(100));
        speed80Button = new JoystickButton(mainJoy, 8);
        speed80Button.whenPressed(new SetDriveSpeed(80));
        speed60Button = new JoystickButton(mainJoy, 9);
        speed60Button.whenPressed(new SetDriveSpeed(60));
        speed40Button = new JoystickButton(mainJoy, 10);
        speed40Button.whenPressed(new SetDriveSpeed(40));
        speed20Button = new JoystickButton(mainJoy, 11);
        speed20Button.whenPressed(new SetDriveSpeed(20));
        speed0Button = new JoystickButton(mainJoy, 12);
        speed0Button.whenPressed(new SetDriveSpeed(0));

        SmartDashboard.putData("MoveInches", new MoveInches(12));
        SmartDashboard.putData("SetDriveSpeed", new SetDriveSpeed(50));
        SmartDashboard.putData("MoveWinch", new MoveWinch(50));
    }
    
    public Joystick getMainJoy() {
        return mainJoy;
    }
}

