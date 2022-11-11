package frc.robot.subsystems;

import javax.print.attribute.standard.PresentationDirection;

import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

public class DriveTrain extends SubsystemBase
{
    private final WPI_TalonSRX leftDriveTalon;
    private final WPI_TalonSRX rightDriveTalon;

    


    public DriveTrain() {
        leftDriveTalon = new WPI_TalonSRX(Constants.DriveTrainPorts.leftDriveTalonPort);
        rightDriveTalon = new WPI_TalonSrX(Constants.DriveTrainPorts.rightDriveTalonPort);
    }
    public void tankDrive(double leftSpeed, double rightSpeed) {
        rightDriveTalon.set(rightSpeed);
        leftDriveTalon.set(leftSpeed);
    }
}