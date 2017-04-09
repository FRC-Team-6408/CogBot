package org.usfirst.frc6408.CogBot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc6408.CogBot.Robot;

public class ChangeForwardDirection extends Command {

    public ChangeForwardDirection() {
    	requires(Robot.driveTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if(Robot.driveTrain.isNegitave == -1)
    	{
    		Robot.driveTrain.isNegitave = 1;
    	}
    	else
    	{
    		Robot.driveTrain.isNegitave = -1;
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
