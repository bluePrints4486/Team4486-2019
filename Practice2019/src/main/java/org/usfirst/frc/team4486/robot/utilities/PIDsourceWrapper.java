/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team4486.robot.utilities;

import edu.wpi.first.wpilibj.PIDSource;
import edu.wpi.first.wpilibj.PIDSourceType;

/**
 * Add your docs here.
 */
public class PIDsourceWrapper implements PIDSource {

    private PIDSourceType type;
    private double source = 0;

    public void setPIDsource(double source){
        this.source = source;
    }

    @Override
    public void setPIDSourceType(PIDSourceType pidSource) {
        this.type = pidSource;
    }

    @Override
    public PIDSourceType getPIDSourceType() {
        return this.type;
    }

    @Override
    public double pidGet() {
        return source;
	}


}
