package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.Telemetry;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Robot extends Subsystem {
    private Chassis chassis;
    private Intake intake;
    private ArrayList<Subsystem> subsystems = new ArrayList<Subsystem>();
    private ExecutorService executorService;

    public Robot(LinearOpMode linearOpMode) {
        super(linearOpMode);
        chassis = new Chassis(linearOpMode);
        intake = new Intake(linearOpMode);
        subsystems.add(chassis);
        subsystems.add(intake);

        executorService = Executors.newFixedThreadPool(subsystems.size());
    }

    @Override
    public void init() {
        log("Initing", "Status");
        for (Subsystem subsystem : subsystems) {
            subsystem.init();
        }
    }

    @Override
    public void update() {
        log("Updating", "Status");
        for (Subsystem subsystem : subsystems) {
            executorService.submit(subsystem::update);
        }
    }

    @Override
    public void stop() {
        log("Stopping", "Status");

        executorService.shutdown();
        try {
            executorService.awaitTermination(1, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        for (Subsystem subsystem : subsystems) {
            subsystem.stop();
        }
    }
}
