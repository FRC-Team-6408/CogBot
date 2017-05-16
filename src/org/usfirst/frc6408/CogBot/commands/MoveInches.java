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

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc6408.CogBot.OI;
import org.usfirst.frc6408.CogBot.Robot;

//TODO: Test values to see if autocorrect is too much
public class MoveInches extends Command {
    private double inchesToMove;
    private double speed = 0.45;  //In percent.
    private double rightMod = -0.005;  //Extra speed.
    private int PrecisionMod = 100;
    private Timer timer;
    
    public MoveInches(double inchesToMove) {
        this.inchesToMove = inchesToMove;
        timer = new Timer();
        timer.start();
        requires(Robot.driveTrain);
        requires(Robot.encoders);
    }

    protected void initialize() {
    	Robot.encoders.resetEncoders();  //Resets encoders to make sure they dont have any past values in them.
    }

    protected void execute() {
    	/*
    	long leftDistance = Math.round(Robot.encoders.encR.getDistance() * PrecisionMod);  //Gets left encoder value to two decimal places
    	long rightDistance = Math.round(Robot.encoders.encL.getDistance() * PrecisionMod);  //Gets right encoder value to two decimal places
    	if(leftDistance > rightDistance) {
    		rightMod += 1 / PrecisionMod;
    		System.out.println(leftDistance + " is the left distance.  Smaller.");
    		System.out.println(rightDistance + " is the right distance.  Smaller.");
    		System.out.println((rightDistance - leftDistance) + " is the difference in distances.  Smaller.");
    		Robot.driveTrain.driveMotors(-speed, -speed - rightMod);  //- is fine
    	}
    	else if (leftDistance < rightDistance) {
    		rightMod -= 1 / (PrecisionMod * 10);
    		System.out.println(leftDistance + " is the left distance.  Larger.");
    		System.out.println(rightDistance + " is the right distance.  Larger.");
    		System.out.println((rightDistance - leftDistance) + " is the difference in distances.  Larger.");
    		Robot.driveTrain.driveMotors(-speed, -speed - rightMod);  //- is fine
    	}
    	else {
    		if(PrecisionMod < 100000) {
    			PrecisionMod *= 10;
    		}
    		else
    		{
    			System.out.println(rightMod + " is the PERFECT modifier.");
    		}
    		System.out.println(rightMod + " is the right modifier.");
    		System.out.println((rightDistance - leftDistance) + " is the difference in distances.  Same.  Precision: " + PrecisionMod);
    	}
    	*/
    	//Robot.driveTrain.driveMotors(-0.5 * 1.02, -0.5);
    	Robot.driveTrain.driveMotors(-0.5 * 1.22, -0.5);
    }

    protected boolean isFinished() {
        return timer.get() >= 2 ? true : false;  //usually 5
    	//return (Robot.encoders.getAverageDistance() >= inchesToMove) ? true : false;  //Checks if the robot has moved the required distance.
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
