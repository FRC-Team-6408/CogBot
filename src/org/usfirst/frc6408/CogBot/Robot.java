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
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import org.usfirst.frc6408.CogBot.commands.*;
import org.usfirst.frc6408.CogBot.subsystems.*;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */

//TODO: Probably done, just test the autocorrect
public class Robot extends IterativeRobot {

    Command autonomousCommand;

    public static OI oi;
    public static DriveTrain driveTrain;
    public static Encoders encoders;
    public static Winch winch;

    public void robotInit() {
    RobotMap.init();

    	//Instantiate subsystems
        driveTrain = new DriveTrain();
        encoders = new Encoders();
        winch = new Winch();

        oi = new OI();  //DO NOT MOVE THIS CODE.

        //Instantiate the command used for the autonomous period
        autonomousCommand = new MoveInches(0);
    }

    public void disabledInit(){

    }

    public void disabledPeriodic() {
        Scheduler.getInstance().run();
    }

    public void autonomousInit() {
    	//Run the command for autonomous.
    	autonomousCommand = new MoveInches(86.3 - 24.25); //distance to move
        if (autonomousCommand != null) autonomousCommand.start();
    }

    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {
        if (autonomousCommand != null) autonomousCommand.cancel();
    }

    public void teleopPeriodic() {
    	driveTrain.driveDirection(-oi.getMainJoy().getY(), -oi.getMainJoy().getX());  //This moves the robot during teleop.
        Scheduler.getInstance().run();
    }

    public void testPeriodic() {
        LiveWindow.run();
    }
}
