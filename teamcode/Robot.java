package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

public class Robot {
    LinearOpMode ln;

    DcMotor lF;
    String lFInit = "lF";

    DcMotor lB;
    String lBInit = "lB";

    DcMotor rF;
    String rFInit = "rF";

    DcMotor rB;
    String rBInit = "rB";

    public Robot(LinearOpMode ln){
        lF = ln.hardwareMap.dcMotor.get(lFInit);
        lB = ln.hardwareMap.dcMotor.get(lBInit);
        rF = ln.hardwareMap.dcMotor.get(rFInit);
        rB = ln.hardwareMap.dcMotor.get(rBInit);
    }

}