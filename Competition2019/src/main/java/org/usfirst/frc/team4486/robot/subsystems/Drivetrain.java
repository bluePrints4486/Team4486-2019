package org.usfirst.frc.team4486.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import org.usfirst.frc.team4486.robot.OI;
import org.usfirst.frc.team4486.robot.RobotMap;
import org.usfirst.frc.team4486.robot.commands.*;
import org.usfirst.frc.team4486.robot.utilities.PIDoutputWrapper;
import org.usfirst.frc.team4486.robot.utilities.PIDsourceWrapper;

import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
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
		WPI_TalonSRX RightMotor0 = new WPI_TalonSRX(RobotMap.RIGHT_MOTOR_0);
		WPI_TalonSRX RightMotor1 = new WPI_TalonSRX(RobotMap.RIGHT_MOTOR_1);
		WPI_TalonSRX RightMotor2 = new WPI_TalonSRX(RobotMap.RIGHT_MOTOR_2);

		
		SpeedControllerGroup scRight = new SpeedControllerGroup(RightMotor0,RightMotor1,RightMotor2);
		
		WPI_TalonSRX LeftMotor0 = new WPI_TalonSRX(RobotMap.LEFT_MOTOR_0);
		WPI_TalonSRX LeftMotor1 = new WPI_TalonSRX(RobotMap.LEFT_MOTOR_1);
		WPI_TalonSRX LeftMotor2 = new WPI_TalonSRX(RobotMap.LEFT_MOTOR_2);

		
		SpeedControllerGroup scLeft = new SpeedControllerGroup(LeftMotor0,LeftMotor1,LeftMotor2); 
				
	drive  = new DifferentialDrive(scLeft,scRight);
	
	drive.setMaxOutput(.45);

	}
	
	public void drive(){
		if(OI.turboButton.get()){
			drive.setMaxOutput(.65);
		} else {
			drive.setMaxOutput(.45);
		}

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
