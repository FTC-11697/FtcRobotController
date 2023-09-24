package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class Chassis extends Subsystem {
//    public DcMotor frontLeft;
//    public DcMotor frontRight;
//    public DcMotor rearLeft;
//    public DcMotor rearRight;
//
//    public DcMotor[] motors = {frontLeft, frontRight, rearLeft, rearRight};

    public Chassis(LinearOpMode linearOpMode) {
        super(linearOpMode);
    }

    @Override
    public void init() {
        log("Chassis Inited", "Log");
//        frontLeft = hardwareMap.dcMotor.get("frontLeft");
//        frontRight = hardwareMap.dcMotor.get("frontRight");
//        rearLeft = hardwareMap.dcMotor.get("rearLeft");
//        rearRight = hardwareMap.dcMotor.get("rearRight");
//
//        for (DcMotor motor : motors) {
//            motor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
//            motor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
//        }
//
//        frontLeft.setDirection(DcMotorSimple.Direction.FORWARD);
//        frontRight.setDirection(DcMotorSimple.Direction.REVERSE);
//        rearLeft.setDirection(DcMotorSimple.Direction.FORWARD);
//        rearRight.setDirection(DcMotorSimple.Direction.REVERSE);
    }

    @Override
    public void update() {
        log("Chassis Updating", "Log");
    }

    @Override
    public void stop() {
//        for (DcMotor motor : motors) {
//            motor.setPower(0);
//        }
        log("Chassis Stopped", "Log");
    }
}
