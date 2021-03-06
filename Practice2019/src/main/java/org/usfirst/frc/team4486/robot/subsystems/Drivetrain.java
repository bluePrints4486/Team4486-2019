package org.usfirst.frc.team4486.robot.subsystems;

import org.usfirst.frc.team4486.robot.OI;
import org.usfirst.frc.team4486.robot.RobotMap;
import org.usfirst.frc.team4486.robot.commands.*;
import org.usfirst.frc.team4486.robot.utilities.PIDoutputWrapper;
import org.usfirst.frc.team4486.robot.utilities.PIDsourceWrapper;

import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;

/**
 *
 */
public class Drivetrain extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	 DifferentialDrive drive;

	 PIDoutputWrapper pidOut;
	 PIDsourceWrapper pidIn;
	 PIDController visionController;
	 
	public Drivetrain(){
		VictorSP doubleRightMotor = new VictorSP(RobotMap.DOUBLE_RIGHT_MOTOR);
		VictorSP singleRightMotor = new VictorSP(RobotMap.SINGLE_RIGHT_MOTOR);
		
		SpeedControllerGroup scRight = new SpeedControllerGroup(doubleRightMotor,singleRightMotor);
		
		VictorSP doubleLeftMotor = new VictorSP(RobotMap.DOUBLE_LEFT_MOTOR);
		VictorSP singleLeftMotor = new VictorSP(RobotMap.SINGLE_LEFT_MOTOR);
		
		SpeedControllerGroup scLeft = new SpeedControllerGroup(doubleLeftMotor,singleLeftMotor); 
				
	drive  = new DifferentialDrive(scLeft,scRight);
	
	drive.setMaxOutput(.25);

	}
	
	public void drive(){
		drive.tankDrive(-OI.driver.getThrottle(), -OI.driver.getY());
		
		
	}

	public void initAutodrive(){
		pidOut = new PIDoutputWrapper();
		pidIn = new PIDsourceWrapper();
		pidIn.setPIDSourceType(PIDSourceType.kDisplacement);

		visionController = new PIDController(RobotMap.VISION_P, RobotMap.VISION_I, RobotMap.VISION_D,
				pidIn,
				pidOut);
	
		visionController.enable();
		visionController.setAbsoluteTolerance(2);
		visionController.setSetpoint(0);

	}

	public void autodrive(){
		NetworkTable table = NetworkTableInstance.getDefault().getTable("limelight");
		NetworkTableEntry tx = table.getEntry("tx");
		NetworkTableEntry ty = table.getEntry("ty");
		NetworkTableEntry ta = table.getEntry("ta");

		double x = tx.getDouble(0.0);
		double y = ty.getDouble(0.0);
		double area = ta.getDouble(0.0);

		SmartDashboard.putNumber("LimelightX", x);
		SmartDashboard.putNumber("LimelightY", y);
		SmartDashboard.putNumber("LimelightArea", area);

		pidIn.setPIDsource(x);
		visionController.setSetpoint(0);


		drive.tankDrive(-OI.driver.getThrottle() + pidOut.getOutput(), -OI.driver.getY() + -pidOut.getOutput());



	}

	public void endAutodrive(){
		visionController.disable();
		visionController.close();
	}
	

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	
    	setDefaultCommand(new Drive());
    	
	}
	
}
