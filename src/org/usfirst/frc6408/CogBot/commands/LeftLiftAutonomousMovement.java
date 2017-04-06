package org.usfirst.frc6408.CogBot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class LeftLiftAutonomousMovement extends CommandGroup {
    public LeftLiftAutonomousMovement() {
    	addSequential(new MoveInches(93.3 - 16)); //93.3 / (~32 / 2)
    	addSequential(new RotateDegrees(-90 + 29.7));  //Negitave goes left
    	addSequential(new MoveInches(62.2 - 16)); //62.2 / (~32 / 2)
    }
}
