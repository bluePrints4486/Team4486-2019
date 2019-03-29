/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team4486.robot.utilities;

import edu.wpi.first.wpilibj.PIDOutput;

/**
 * Add your docs here.
 */
public class PIDoutputWrapper implements PIDOutput{

    private double output = 0;

    @Override
    public void pidWrite(double output) {
        this.output = output;
    }

    public double getOutput(){
        return this.output;
    }

}
