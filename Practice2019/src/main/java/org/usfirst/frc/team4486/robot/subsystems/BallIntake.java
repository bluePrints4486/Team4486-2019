package org.usfirst.frc.team4486.robot.subsystems;

import org.usfirst.frc.team4486.robot.OI;
import org.usfirst.frc.team4486.robot.RobotMap;
import org.usfirst.frc.team4486.robot.commands.StopIntake;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class BallIntake extends Subsystem {
	
	
	VictorSP doubleIntakeMotor = new VictorSP (RobotMap.DOUBLE_PICKUP_MOTOR);
	VictorSP pickupWinchMotor = new VictorSP(RobotMap.PICKUP_WINCH);

	

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	public void runIntake(){
		
		doubleIntakeMotor.set(.75);
	}
	
	public void runOutake(){
		doubleIntakeMotor.set(-.75);
	}
	
	public void stopIntake(){
			doubleIntakeMotor.set(0);
	}

	public void moveWinch(){
		
		pickupWinchMotor.set(-OI.manipulator.getY());
   }
  
  	public void up(){	
		pickupWinchMotor.set(.75);
	}
	
	public void down(){
		pickupWinchMotor.set(-.25);
	}
	
	public void stopWinch(){
    	pickupWinchMotor.set(0);
	}
	

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	
    	setDefaultCommand(new StopIntake());
    	
		}
}
    
    


