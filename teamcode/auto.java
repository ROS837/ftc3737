package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.util.ElapsedTime;

@com.qualcomm.robotcore.eventloop.opmode.Autonomous(name = "Autonomous", group = "Autonomous")
public class auto extends LinearOpMode {
    Robot robot;

    private ElapsedTime runDuration = new ElapsedTime();




    @Override
    public void runOpMode() throws InterruptedException {
        robot = new Robot(this);

        waitForStart();

        while(opModeIsActive() && runDuration.seconds() < 10) {
            robot.lF.setDirection(DcMotorSimple.Direction.FORWARD);
            robot.rB.setDirection(DcMotorSimple.Direction.REVERSE);
            robot.rF.setDirection(DcMotorSimple.Direction.REVERSE);
            robot.lB.setDirection(DcMotorSimple.Direction.FORWARD);
            robot.lF.setPower(1);
            robot.lB.setPower(1);
            robot.rF.setPower(1);
            robot.rB.setPower(1);

            robot.lF.setPower(0);
            robot.lB.setPower(0);
            robot.rF.setPower(0);
            robot.rB.setPower(0);
        }
        }
    }
