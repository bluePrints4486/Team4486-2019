package org.usfirst.frc.team4486.robot.subsystems;

import org.usfirst.frc.team4486.robot.OI;
import org.usfirst.frc.team4486.robot.RobotMap;
import org.usfirst.frc.team4486.robot.commands.MoveWinch;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class Winch extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	VictorSP doubleWinchMotor = new VictorSP(RobotMap.DOUBLE_WINCH_MOTOR);

    Encoder winchEncoder = new Encoder(0,1);

    public Winch(){
      winchEncoder.setDistancePerPulse(.01884);
        winchEncoder.reset();
    }

	public void moveWinch(){
		SmartDashboard.putNumber("Encoder", winchEncoder.getDistance());
		doubleWinchMotor.set(-OI.manipulator.getY());
	}
	

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new MoveWinch());
    }
}

