package frc.robot.Commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Subsystems.Drivetrain;

public class TeleopDrivetrain extends CommandBase {
    Drivetrain drivetrain;
    XboxController driver;

    public TeleopDrivetrain(Drivetrain drivetrain, XboxController driver) {
        this.drivetrain = drivetrain;
        this.driver = driver;
    }

    @Override
    public void execute() {
        drivetrain.tankDrive(driver.getLeftY(), driver.getRightY());


    }
}
