package org.usfirst.frc6408.CogBot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class LeftLiftAutonomousMovement extends CommandGroup {
    public LeftLiftAutonomousMovement() {
    	addSequential(new MoveInches(93.3 - (30.5 / 2))); //93.3 / (Robot Length / 2)
    	addSequential(new RotateDegrees(-90 + 29.7));  //Negitave goes left
    	addSequential(new MoveInches(62.2 - (30.5 / 2))); //62.2 / (Robot Length / 2)
    }
}
