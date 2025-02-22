package main.java.frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveTrain;
import frc.robot.subsystems.PhotonVision;

public class SpinToTarget extends CommandBase {
    public final PhotonVision photon;
    public final DriveTrain dt;

    /** Creates a new SpinToTarget */
public SpinToTarget(DriveTrain dt, PhotonVision photon) {
    // Use addRequirements() here to declare subsytem dependencies.
    this.photon = photon;
    this.dt = dt;
}

// Called when the command is initially scheduled.
@Override
public void initialize() {}

//Called every time the scheduler runs while the command is scheduled.
@Override
public void execute () {
    dt.tankDrive(-0.2, 0.2);
}

//Called once the command ends or is interupted
@Override
public void end(boolean interupted) {}

// Returns true when the command should end.
@Override 
public boolean isFinished() {
    return photon.targetExists();
}

}




























































































