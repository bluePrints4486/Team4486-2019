package org.usfirst.frc.team4486.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team4486.robot.RobotMap;
import org.usfirst.frc.team4486.robot.commands.Autodrive;
import org.usfirst.frc.team4486.robot.commands.CloseSnout;
import org.usfirst.frc.team4486.robot.commands.OpenLatch;
import org.usfirst.frc.team4486.robot.commands.OpenSnout;
import org.usfirst.frc.team4486.robot.commands.RunIntake;
import org.usfirst.frc.team4486.robot.commands.RunOutake;
import org.usfirst.frc.team4486.robot.commands.WinchPickupDown;
import org.usfirst.frc.team4486.robot.commands.WinchPickupUp;
import org.usfirst.frc.team4486.robot.commands.Zbardown;
import org.usfirst.frc.team4486.robot.commands.ZbardownFront;
import org.usfirst.frc.team4486.robot.commands.Zbarup;
import org.usfirst.frc.team4486.robot.commands.ZbarupFront;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
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

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());
	
	public static Joystick driver = new Joystick(RobotMap.DRIVER_JOYSTICK);
	public static Joystick manipulator = new Joystick(RobotMap.MANIPULATOR_JOYSTICK);

	public static JoystickButton autoDriveButton = new JoystickButton(driver,RobotMap.AUTO_DRIVE_BUTTON);
	public static JoystickButton turboButton = new JoystickButton(driver, RobotMap.TURBO_BUTTON);
	
	public static JoystickButton intakeButton = new JoystickButton(manipulator,RobotMap.INTAKE_BUTTON);
	public static JoystickButton outakeButton = new JoystickButton(manipulator,RobotMap.OUTTAKE_BUTTON);

	public static JoystickButton intakeUpButton = new JoystickButton(manipulator,RobotMap.INTAKE_UP_BUTTON);
	public static JoystickButton intakeDownButton = new JoystickButton(manipulator,RobotMap.INTAKE_DOWN_BUTTON);
	
	public static JoystickButton unlatchButton = new JoystickButton(manipulator,RobotMap.UNLATCH_BUTTON);

	public static JoystickButton snout_InButton = new JoystickButton(manipulator,RobotMap.SNOUT_CLOSE_BUTTON);
	public static JoystickButton snout_OpenButton = new JoystickButton(manipulator,RobotMap.SNOUT_OPEN_BUTTON);

	public static JoystickButton zBarUpButton = new JoystickButton(driver, RobotMap.ZBAR_BUTTON_UP);
	public static JoystickButton zBarDownButton = new JoystickButton(driver, RobotMap.ZBAR_BUTTON_DOWN);

	public static JoystickButton zBarFrontUpButton = new JoystickButton(driver, RobotMap.ZBARFRONT_BUTTON_UP);
	public static JoystickButton zBarFrontDownButton = new JoystickButton(driver, RobotMap.ZBARFRONT_BUTTON_DOWN);  

	public OI(){

		autoDriveButton.whileHeld(new Autodrive());
		
		intakeButton.whileHeld(new RunIntake());
		outakeButton.whileHeld(new RunOutake());

		intakeUpButton.whileHeld(new WinchPickupUp());
		intakeDownButton.whileHeld(new WinchPickupDown());

		unlatchButton.whileHeld(new OpenLatch());

		snout_InButton.whenPressed(new OpenSnout());
		snout_OpenButton.whenPressed(new CloseSnout());

		zBarUpButton.whileHeld(new Zbarup());
		zBarDownButton.whileHeld(new Zbardown());

		zBarFrontDownButton.whileHeld(new ZbardownFront());
		zBarFrontUpButton.whileHeld(new ZbarupFront());
		
	}
	
}
      

