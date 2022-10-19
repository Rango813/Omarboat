package frc.robot.Subsystems;

import com.revrobotics.CANSparkMax;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drivetrain extends SubsystemBase {

    public Drivetrain(CANSparkMax frontRight, CANSparkMax frontLeft, CANSparkMax backRight,
        CANSparkMax backLeft) {
        MotorControllerGroup left = new MotorControllerGroup(frontLeft, backLeft);
        MotorControllerGroup right = new MotorControllerGroup(frontRight, backRight);
        DifferentialDrive drive = new DifferentialDrive(left, right);

    }

    public void tankDrive() {

    }

}
