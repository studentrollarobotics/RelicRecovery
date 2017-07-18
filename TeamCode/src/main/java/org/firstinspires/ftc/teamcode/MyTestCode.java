package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;

/**
 * Created by lsatt on 7/18/2017.
 */

public class MyTestCode extends OpMode{

    DcMotor RightMotor;
    DcMotor LeftMotor;

    double RightPower;
    double LeftPower;



    @Override
    public void init() {
        RightMotor = hardwareMap.dcMotor.get("rm");
        LeftMotor = hardwareMap.dcMotor.get("lm");
        
    }

    @Override
    public void loop() {

    }
}
