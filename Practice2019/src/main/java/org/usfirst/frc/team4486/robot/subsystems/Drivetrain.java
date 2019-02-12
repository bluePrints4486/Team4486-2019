package org.usfirst.frc.team4486.robot.subsystems;

import org.usfirst.frc.team4486.robot.OI;
import org.usfirst.frc.team4486.robot.RobotMap;
import org.usfirst.frc.team4486.robot.commands.*;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 *
 */
public class Drivetrain extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	 DifferentialDrive drive;
	 
	public Drivetrain(){
		VictorSP doubleRightMotor = new VictorSP(RobotMap.DOUBLE_RIGHT_MOTOR);
		VictorSP singleRightMotor = new VictorSP(RobotMap.SINGLE_RIGHT_MOTOR);
		
		SpeedControllerGroup scRight = new SpeedControllerGroup(doubleRightMotor,singleRightMotor);
		
		VictorSP doubleLeftMotor = new VictorSP(RobotMap.DOUBLE_LEFT_MOTOR);
		VictorSP singleLeftMotor = new VictorSP(RobotMap.SINGLE_LEFT_MOTOR);
		
		SpeedControllerGroup scLeft = new SpeedControllerGroup(doubleLeftMotor,singleLeftMotor); 
				
	drive  = new DifferentialDrive(scLeft,scRight);
	
	drive.setMaxOutput(.65);
	
	}
	
	public void drive(){
		drive.tankDrive(-OI.driver.getY(), -OI.driver.getThrottle());
		
		
	}
	

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	
    	setDefaultCommand(new Drive());
    	
    }
}
