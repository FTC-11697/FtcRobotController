package org.firstinspires.ftc.teamcode.subsystems;

import org.firstinspires.ftc.teamcode.routine.Routine;

public abstract class Subsystem {
	protected Routine routine;

	public Subsystem(Routine routine) {
		this.routine = routine;
	}
}
