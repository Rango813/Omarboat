package frc.robot.Subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;


public class Drivetrain extends SubsystemBase {
    CANSparkMax frontRight =
        new CANSparkMax(Constants.Motors.frontRightID, CANSparkMaxLowLevel.MotorType.kBrushless);
    CANSparkMax frontLeft =
        new CANSparkMax(Constants.Motors.frontleftID, CANSparkMaxLowLevel.MotorType.kBrushless);
    CANSparkMax backLeft =
        new CANSparkMax(Constants.Motors.backrleftID, CANSparkMaxLowLevel.MotorType.kBrushless);
    CANSparkMax backRight =
        new CANSparkMax(Constants.Motors.backrightID, CANSparkMaxLowLevel.MotorType.kBrushless);

    MotorControllerGroup leftMotors = new MotorControllerGroup(frontLeft, backLeft);
    MotorControllerGroup rightMotors = new MotorControllerGroup(frontRight, backRight);

    DifferentialDrive differentialTankDrive = new DifferentialDrive(leftMotors, rightMotors);

    public Drivetrain() {



    }

    public void tankDrive(double left, double right) {
        differentialTankDrive.tankDrive(left, right);
    }

}
