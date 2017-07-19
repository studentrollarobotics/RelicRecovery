package org.firstinspires.ftc.teamcode.Alex;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

/**
 * Created by lsatt on 7/19/2017.
 */

public class MyTestCodeTelemetry extends MyTestCodeHardware{



    public void Telemetry() {

        telemetry.addData("Right Motor Power", RightPower);
        telemetry.addData("Left Motor Power", LeftPower);
        telemetry.addData("Lift Motor Power", LiftPower);
        telemetry.addData("Arm Motor Power", ArmPower);
    }
}









