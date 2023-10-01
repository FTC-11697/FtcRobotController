package org.firstinspires.ftc.teamcode.subsystems;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.teamcode.routines.Routine;

public abstract class Subsystem {
	protected Routine routine;
	protected Telemetry telemetry;

	public Subsystem(Routine routine) {
		this.routine = routine;
		this.telemetry = routine.telemetry;
	}

	public void onInit() {}

	public void onStart() {}

	protected boolean isStopRequested() {
		return routine.isStopRequested();
	}
}
