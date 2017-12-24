package org.usfirst.frc.team687.robot;

import org.usfirst.frc.team687.robot.commands.Shoot;
import org.usfirst.frc.team687.robot.commands.ShooterCharge;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	public static Joystick lStick;
	public static Joystick rStick;
	public static Joystick articStick;
	
	public static JoystickButton shooterCharge;
	public static JoystickButton shoot;
	
	public OI() {
		Joystick lStick = new Joystick(0);
		Joystick rStick = new Joystick(1);
		Joystick articStick = new Joystick(2);
		
		JoystickButton shooterCharge = new JoystickButton(lStick, 1);
		shooterCharge.whileHeld(new ShooterCharge());
		
		JoystickButton shoot = new JoystickButton(rStick, 1);	
		shoot.whenPressed(new Shoot());
	}
}
