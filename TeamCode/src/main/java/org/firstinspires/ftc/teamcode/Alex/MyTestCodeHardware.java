package org.firstinspires.ftc.teamcode.Alex;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;

/**
 * Created by lsatt on 7/18/2017.
 */

public class MyTestCodeHardware extends OpMode {

    DcMotor RightMotor;
    DcMotor LeftMotor;
    DcMotor LiftMotor;
    DcMotor ArmMotor;
    double RightPower;
    double LeftPower;
    double LiftPower;
    double ArmPower;


    @Override
    public void init() {
        RightMotor = hardwareMap.dcMotor.get("rm");
        LeftMotor = hardwareMap.dcMotor.get("lm");
        LiftMotor = hardwareMap.dcMotor.get("lift");
        ArmMotor = hardwareMap.dcMotor.get("Arm");

        RightMotor.setDirection(DcMotorSimple.Direction.REVERSE);
        LiftMotor.setDirection(DcMotorSimple.Direction.REVERSE);
        ArmMotor.setDirection(DcMotorSimple.Direction.REVERSE);
    }

    @Override
    public void loop() {
       

    }

    protected void Telemetry() {

        telemetry.addData("Right Motor Power", RightPower);
        telemetry.addData("Left Motor Power", LeftPower);
        telemetry.addData("Lift Motor Power", LiftPower);
        telemetry.addData("Arm Motor Power", ArmPower);
    }
}


