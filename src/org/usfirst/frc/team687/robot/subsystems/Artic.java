package org.usfirst.frc.team687.robot.subsystems;

import org.usfirst.frc.team687.robot.RobotMap;
import org.usfirst.frc.team687.robot.commands.Articulation;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Artic extends Subsystem {
	private final Victor m_articVictor;
    
	public Artic() {
		m_articVictor = new Victor(RobotMap.ArticVictor);
	}

	public void setPower(double power) {
		m_articVictor.set(power);
	}
	
    public void initDefaultCommand() {
        setDefaultCommand(new Articulation());
    }
}

