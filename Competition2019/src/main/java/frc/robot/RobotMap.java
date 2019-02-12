/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

  public static final int DoubleRightMotor = 0;
  public static final int SingleRightMotor = 1;
  // single is mimi sim double is both full sims

  public static final int Doubleleftmotor = 2;
  public static final int SingleLeftMotor = 3;
  public static final int DoubleWinchMotor = 4;
  public static final int DoubleZBarWinch = 5;
  public static final int DoublePickupMotor = 6;
  public static final int PickupWinch = 7;


  
  public static final int WinchEncoderA = 0;
  public static final int WinchEncoderB = 1;
  public static final int Winch_P = 0;
  public static final int Winch_I = 0;
  public static final int Winch_D = 0;



  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static final int leftMotor = 1;
  // public static final int rightMotor = 2;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;

}
