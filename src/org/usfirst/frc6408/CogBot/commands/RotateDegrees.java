package org.usfirst.frc6408.CogBot.commands;

import org.usfirst.frc6408.CogBot.Robot;
import org.usfirst.frc6408.CogBot.subsystems.Encoders;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class RotateDegrees extends Command {
	private double degreesMovedEachRotation = 10;  //it is not 10
	private double degToRotate = 0;
	private double rightMod = 0.05;  //Extra speed.
	
	
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
    	Robot.driveTrain.driveMotors(0.5, -0.5 - rightMod); 
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return (Robot.encoders.getLeftEncoderInRotations() * degreesMovedEachRotation >= degToRotate) ? true : false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
