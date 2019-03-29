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
	public static final int RIGHT_MOTOR_0 = 7;
	public static final int RIGHT_MOTOR_1 = 8;
	public static final int RIGHT_MOTOR_2 = 9;
	public static final int LEFT_MOTOR_0 = 4;
	public static final int LEFT_MOTOR_1 = 5;
	public static final int LEFT_MOTOR_2 = 6;

	
	//winch speed controllrs/ Intake Outake
	
	public static final int WINCH_MOTOR_0 = 10;
	public static final int WINCH_MOTOR_1 = 11;

	public static final int PICKUP_MOTOR_BOTTOM = 0;
	public static final int PICKUP_MOTOR_TOP = 1;

	public static final int PICKUP_WINCH = 3;
	
	public static final int DRIVER_JOYSTICK = 0;
	public static final int MANIPULATOR_JOYSTICK = 1;

	public static final int Z_BAR_WINCH = 2;
	public static final int Z_BAR_WINCH_FRONT = 12;
	

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
	public static final int SNOUT_OPEN_BUTTON = 6;
	public static final int SNOUT_CLOSE_BUTTON = 4;
	public static final int UNLATCH_BUTTON = 12;

	public static final int AUTO_DRIVE_BUTTON = 5;
	public static final int TURBO_BUTTON = 6;
	public static final int ZBAR_BUTTON_UP = 7;
	public static final int ZBAR_BUTTON_DOWN = 8;
	public static final int ZBARFRONT_BUTTON_UP = 1;
	public static final int ZBARFRONT_BUTTON_DOWN = 2;

	//PID Constants
	public static final double VISION_P = .4;
	public static final double VISION_I = 0;
	public static final double VISION_D = 0;
	
}
