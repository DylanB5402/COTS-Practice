package org.usfirst.frc.team687.robot.subsystems;

import org.usfirst.frc.team687.robot.RobotMap;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Shooter extends Subsystem {

    private final Victor m_flywheelVictor1;
    private final Victor m_flywheelVictor2;
    private final Compressor m_compressor;
    private final DoubleSolenoid m_shooterSolenoid;
    private double m_flywheelMaxPower;
    public Shooter() {
    	m_flywheelMaxPower = 0.8;
    	m_compressor = new Compressor();
    	m_compressor.start();
    	
    	m_flywheelVictor1 = new Victor(RobotMap.FlywheelVictor1);
    	m_flywheelVictor2 = new Victor(RobotMap.FlywheelVictor2);
    	
    	m_shooterSolenoid = new DoubleSolenoid(RobotMap.ShooterSolenoid1, RobotMap.ShooterSolenoid2);   	
    }
    
    public void chargeShooter(){
    	m_flywheelVictor1.set(m_flywheelMaxPower);
    	m_flywheelVictor2.set(m_flywheelMaxPower);
    }
    
    public void shoot() {
    	m_shooterSolenoid.set(DoubleSolenoid.Value.kForward);
    }
    
    public void retract() {
    	m_shooterSolenoid.set(DoubleSolenoid.Value.kReverse);
    }
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

