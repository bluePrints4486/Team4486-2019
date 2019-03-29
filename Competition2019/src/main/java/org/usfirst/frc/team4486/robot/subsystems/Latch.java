/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team4486.robot.subsystems;

import org.usfirst.frc.team4486.robot.RobotMap;
import org.usfirst.frc.team4486.robot.commands.CloseLatch;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * Add your docs here.
 */
public class Latch extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  Compressor compressor = new Compressor();
  DoubleSolenoid latchSolenoid = new DoubleSolenoid(RobotMap.LATCH_IN, RobotMap.LATCH_OUT);
 
  
  public void openLatch(){
    latchSolenoid.set(DoubleSolenoid.Value.kForward);
  }

  public void closeLatch(){
    SmartDashboard.putBoolean("Compressor On", !compressor.getPressureSwitchValue());
    latchSolenoid.set(DoubleSolenoid.Value.kReverse);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    setDefaultCommand(new CloseLatch());
   
  }
}
