package frc.robot.simulation;

import edu.wpi.first.wpilibj.RobotController;
import edu.wpi.first.math.geometry.Pose2d;
import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.wpilibj.smartdashboard.Field2d;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.subsystems.DriveTrain;
import frc.robot.subsystems.Turret;

public class Powercell {
    boolean wasShot;
    Pose2d ballPose = new Pose2d();
    Pose2d m_velocity = new Pose2d();

    double m_lastTimestamp;
    private int ballState = 0;


    String m_name;

    public Powercell(String name) {
        m_name = name;
    }

    public String getName() {
        return m_name;
    }

    public int getBallState() {
        return ballState;
    }

    public boolean getBallShotState() {
        return wasShot;
    }

    public void setBallState(int state) {
        ballState = state;
    }

    public void setBallShotState(boolean shotState) {
        wasShot = shotState;
    }

    public void setBallPose(Pose2d pose) {
        ballPose = pose;
    }

    public Pose2d getBallPose() {
        return ballPose;
    }

    public void setBallVelocity(Pose2d velocity) {
        m_velocity = velocity;
    }

    public Pose2d getBallVelocity() {
        return m_velocity;
    }

    public void setLastTimestamp(double timestamp) {
        m_lastTimestamp = timestamp;
    }

    public double getLastTimestamp() {
        return m_lastTimestamp;
    }

    public void simulationPeriodic() {
//        updateBallState();
    }
}
