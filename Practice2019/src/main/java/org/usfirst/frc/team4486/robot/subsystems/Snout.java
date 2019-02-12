/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team4486.robot.subsystems;

import org.usfirst.frc.team4486.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Add your docs here.
 */
public class Snout extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  DoubleSolenoid snoutSolenoid = new DoubleSolenoid(RobotMap.SNOUT_IN, RobotMap.SNOUT_OUT);

  public void openSnout(){
    snoutSolenoid.set(DoubleSolenoid.Value.kForward);
  }

  public void closeSnout(){
    snoutSolenoid.set(DoubleSolenoid.Value.kReverse);
  }


  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
