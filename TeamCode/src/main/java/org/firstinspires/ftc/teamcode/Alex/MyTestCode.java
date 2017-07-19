package org.firstinspires.ftc.teamcode.Alex;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;

/**
 * Created by lsatt on 7/18/2017.
 */

public class MyTestCode extends OpMode{

    DcMotor RightMotor;
    DcMotor LeftMotor;
    DcMotor LiftMotor;
    double RightPower;
    double LeftPower;
    double LiftPower;



    @Override
    public void init() {
        RightMotor = hardwareMap.dcMotor.get("rm");
        LeftMotor = hardwareMap.dcMotor.get("lm");
        LiftMotor = hardwareMap.dcMotor.get("lift");
        RightMotor.setDirection(DcMotorSimple.Direction.REVERSE);
        LiftMotor.setDirection(DcMotorSimple.Direction.REVERSE);
    }

    @Override
    public void loop() {
    RightPower = gamepad1.right_stick_y;
    LeftPower = gamepad1.left_stick_y;

    RightMotor.setPower(RightPower);
    LeftMotor.setPower(LeftPower);


    if (gamepad1.right_bumper){
            LiftPower = 1;
        }
    else if (gamepad1.left_bumper){
          LiftPower = -1;
    }
    else
          LiftPower = 0;

    }
}
