package org.usfirst.frc6408.CogBot.commands;

import org.usfirst.frc6408.CogBot.Robot;
import org.usfirst.frc6408.CogBot.subsystems.Encoders;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class RotateDegrees extends Command {
	private double degreesMovedEachRotation = 10;  //it is not 10
	double currentAmountOfDegrees = 0;
	double degToRotate = 0;
	
	
    public RotateDegrees(double rotateDegrees) {
    	 degToRotate = rotateDegrees;
         requires(Robot.driveTrain);
         requires(Robot.encoders);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.encoders.resetEncoders();  //Set the encoders to zero to start tracking.
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.encoders.getLeftEncoderInRotations();
    	Robot.encoders.getRightEncoderInRotations();
    	
    	
    	if (Robot.encoders.encL.getDistance() >= 1)
    	{
    		currentAmountOfDegrees += Robot.encoders.getLeftEncoder();
    		Robot.encoders.resetEncoders();
    	}
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return (currentAmountOfDegrees > degToRotate) ? true : false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
