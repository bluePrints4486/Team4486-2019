package org.usfirst.frc.team4486.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import org.usfirst.frc.team4486.robot.OI;
import org.usfirst.frc.team4486.robot.RobotMap;
import org.usfirst.frc.team4486.robot.commands.MoveWinch;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class Winch extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
    WPI_TalonSRX leftWinchMotor = new WPI_TalonSRX(RobotMap.WINCH_MOTOR_0);
    WPI_TalonSRX rightWinchMotor = new WPI_TalonSRX(RobotMap.WINCH_MOTOR_1);


    Encoder winchEncoder = new Encoder(0,1);

    public Winch(){
      winchEncoder.setDistancePerPulse(.01884);
        winchEncoder.reset();
    }

	public void moveWinch(){
        SmartDashboard.putNumber("Encoder", winchEncoder.getDistance());
        leftWinchMotor.set(-OI.manipulator.getY());
        rightWinchMotor.set(-OI.manipulator.getY());

	}
	

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new MoveWinch());
    }
}

