package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class Intake extends Subsystem {
    public Intake(LinearOpMode linearOpMode) {
        super(linearOpMode);
    }

    @Override
    public void init() {
        log("Intake Inited", "Log");
    }

    @Override
    public void update() {
        log("Intake Updating", "Log");
    }

    @Override
    public void stop() {
        log("Intake Stopped", "Log");
    }
}
