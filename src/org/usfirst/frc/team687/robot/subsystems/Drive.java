package org.usfirst.frc.team687.robot.subsystems;

import org.usfirst.frc.team687.robot.RobotMap;
import org.usfirst.frc.team687.robot.commands.ArcadeDrive;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drive extends Subsystem {

	private final Victor m_driveVictor1;
	private final Victor m_driveVictor2;
	private final Victor m_driveVictor3;
	private final Victor m_driveVictor4;
	
	public Drive() {
		m_driveVictor1 = new Victor(RobotMap.DriveVictor1);
		m_driveVictor2 = new Victor(RobotMap.DriveVictor2);
		m_driveVictor3 = new Victor(RobotMap.DriveVictor3);
		m_driveVictor4 = new Victor(RobotMap.DriveVictor4);
		
	}
	
	public void SetPower(double leftPower, double rightPower) {
		m_driveVictor1.set(leftPower);
		m_driveVictor2.set(leftPower);
		m_driveVictor3.set(rightPower);
		m_driveVictor4.set(rightPower);
	}
	
    public void initDefaultCommand() {
        setDefaultCommand(new ArcadeDrive());
    }
}

