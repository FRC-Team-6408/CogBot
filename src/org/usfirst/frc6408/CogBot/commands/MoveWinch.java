// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

package org.usfirst.frc6408.CogBot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc6408.CogBot.Robot;

//TODO: Nothing
public class MoveWinch extends Command {
    private double speed;
    
    public MoveWinch(double percent) {
        speed = percent;  //Converts percent to a useable value
        requires(Robot.winch);
    }
    
    protected void initialize() {
    }

    protected void execute() {
    	Robot.winch.turnWinch(speed);  //Turns the winch
    	System.out.println("CommandRun");
    }

    protected boolean isFinished() {
        return true;  //TODO: correct?
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
