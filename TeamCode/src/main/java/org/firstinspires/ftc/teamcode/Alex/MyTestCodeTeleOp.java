package org.firstinspires.ftc.teamcode.Alex;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

/**
 * Created by lsatt on 7/19/2017.
 */

public class MyTestCodeTeleOp extends MyTestCodeTelemetry{
    @Override
    public void loop() {
        RightPower = gamepad1.right_stick_y;
        LeftPower = gamepad1.left_stick_y;
        LiftPower = gamepad1.right_trigger;

        RightMotor.setPower(RightPower);
        LeftMotor.setPower(LeftPower);
        LiftMotor.setPower(LiftPower);


        if (gamepad1.right_bumper) {
            ArmPower = 1;
        } else if (gamepad1.left_bumper) {
            ArmPower = -1;
        } else {
            ArmPower = 0;

        }

    }
}
