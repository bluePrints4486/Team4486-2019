package org.usfirst.frc.team4486.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
	
	//drive speed controllers
	public static final int DOUBLE_RIGHT_MOTOR = 0;
	public static final int DOUBLE_LEFT_MOTOR = 2;
	public static final int SINGLE_RIGHT_MOTOR = 1;
	public static final int SINGLE_LEFT_MOTOR = 3;
	
	//winch speed controllrs/ Intake Outake
	
	public static final int DOUBLE_WINCH_MOTOR = 4;
	public static final int DOUBLE_PICKUP_MOTOR = 6;
	public static final int PICKUP_WINCH = 7;
	
	public static final int DRIVER_JOYSTICK = 0;
	public static final int MANIPULATOR_JOYSTICK = 1;

	//pnumatic solenoids
	public static final int SNOUT_IN = 0;
	public static final int SNOUT_OUT = 1;

	public static final int LATCH_IN = 2;
	public static final int LATCH_OUT = 3;
	
	//Buttons
	public static final int INTAKE_BUTTON = 1;
	public static final int OUTTAKE_BUTTON =2;
	public static final int INTAKE_UP_BUTTON = 5;
	public static final int INTAKE_DOWN_BUTTON = 3;
	public static final int SNOUT_OPEN_BUTTON = 11;
	public static final int SNOUT_CLOSE_BUTTON =12;
	public static final int UNLATCH_BUTTON = 4;
	
}
