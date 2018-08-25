package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp
public class ExampleMotorControl extends OpMode {
    private DcMotor frontLeft, frontRight, backLeft, backRight;

    @Override
    public void init() {
        frontLeft = hardwareMap.get(DcMotor.class, "[frontleft]");
        frontRight = hardwareMap.get(DcMotor.class, "[frontright]");
        backLeft = hardwareMap.get(DcMotor.class, "[backleft]");
        backRight = hardwareMap.get(DcMotor.class, "[backright]");
    }

    @Override
    public void loop() {
        frontLeft.setPower((gamepad1.right_stick_x - gamepad1.right_stick_y) +((-1 * (gamepad1.left_stick_x))-gamepad1.left_stick_y));
        frontRight.setPower(((gamepad1.left_stick_x)-gamepad1.left_stick_y) - gamepad1.right_stick_x - gamepad1.right_stick_y);
        backLeft.setPower((-1 * (gamepad1.left_stick_x)-gamepad1.left_stick_y) - gamepad1.right_stick_x - gamepad1.right_stick_y);
        backRight.setPower((gamepad1.right_stick_x-gamepad1.right_stick_y) + ((gamepad1.left_stick_x)-gamepad1.left_stick_y));
        /*frontRight.setPower(-gamepad1.right_stick_x - gamepad1.right_stick_y);*/

    }
}
