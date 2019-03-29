package org.usfirst.frc.team4486.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import org.usfirst.frc.team4486.robot.OI;
import org.usfirst.frc.team4486.robot.RobotMap;
import org.usfirst.frc.team4486.robot.commands.StopIntake;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class BallIntake extends Subsystem {
	
	
	WPI_TalonSRX bottomIntakeMotor = new WPI_TalonSRX (RobotMap.PICKUP_MOTOR_BOTTOM);
	WPI_TalonSRX topIntakeMotor = new WPI_TalonSRX (RobotMap.PICKUP_MOTOR_TOP);

	WPI_TalonSRX pickupWinchMotor = new WPI_TalonSRX(RobotMap.PICKUP_WINCH);

	

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	public void runIntake(){
		topIntakeMotor.set(-.75);
		bottomIntakeMotor.set(.75);
	}
	
	public void runOutake(){
		topIntakeMotor.set(1);
		bottomIntakeMotor.set(-1);
	}
	
	public void stopIntake(){
		topIntakeMotor.set(0);
		bottomIntakeMotor.set(0);
	}

	public void moveWinch(){
		
		pickupWinchMotor.set(-OI.manipulator.getY());
   }
  
  	public void up(){	
		pickupWinchMotor.set(.95);
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
    
    


