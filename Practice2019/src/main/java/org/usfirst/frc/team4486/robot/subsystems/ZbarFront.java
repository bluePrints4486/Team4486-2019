/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team4486.robot.subsystems;

import org.usfirst.frc.team4486.robot.RobotMap;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Add your docs here.
 */
public class ZbarFront extends Subsystem {
  VictorSP zbarFrontMotor = new VictorSP (RobotMap.Z_BAR_WINCH_FRONT);
  public void up(){	
    zbarFrontMotor.set(1);
    
  }
  public void down(){
		zbarFrontMotor.set(-1);
	}
  
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    
    
    // Set theetDefaultCommand(new Zbarstop()); default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
