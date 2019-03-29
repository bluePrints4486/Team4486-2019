/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team4486.robot.subsystems;

import org.usfirst.frc.team4486.robot.RobotMap;
import org.usfirst.frc.team4486.robot.commands.Zbarstop;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

/**	
	public void stopWinch(){
    	zbarMotor.set(0);
	}
 * Add your docs here.
 */
public class Zbar extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  VictorSP zbarMotor = new VictorSP (RobotMap.Z_BAR_WINCH);
  public void up(){	
		zbarMotor.set(1);
	}
	
	public void down(){
		zbarMotor.set(-1);
	}

	
  @Override
  public void initDefaultCommand() {

    // Set the default command for a subsystem here.
     setDefaultCommand(new Zbarstop());
  }

public void stopWinch() {
}
}
