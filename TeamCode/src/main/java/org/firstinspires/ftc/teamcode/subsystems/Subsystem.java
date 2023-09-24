package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.teamcode.opmodes.MainTeleOp;

public abstract class Subsystem {
    public HardwareMap hardwareMap;
    public Telemetry telemetry;
    public LinearOpMode linearOpMode;

    public Subsystem(LinearOpMode linearOpMode) {
        this.linearOpMode = linearOpMode;
        this.hardwareMap = linearOpMode.hardwareMap;
        this.telemetry = linearOpMode.telemetry;
    }

    public abstract void init();
    public abstract void update();
    public abstract void stop();

    public void log(String caption, String value) {
        telemetry.setAutoClear(false);
        telemetry.addData(caption, value);
        telemetry.update();
    }
}