package builder;

public class HighGearState implements State {
	TrimmerStates trimmerStates;
	public HighGearState(TrimmerStates trimmerStates) {
		this.trimmerStates = trimmerStates;
	}

	@Override
	public void turnOff() {
		System.out.println("Turn off Trimmer");
		trimmerStates.setState(trimmerStates.getOffState());
	}

	@Override
	public void turnOn() {
		System.out.println("Sorry the trimmer is on");

	}

	@Override
	public void turnIdle() {
		System.out.println("Trimmer turned idle state");
		trimmerStates.setState(trimmerStates.getIdleState());

	}

	@Override
	public void turnRunning() {
		System.out.println("Trimmer switched to high state");
		trimmerStates.setState(trimmerStates.getRunningState());

	}

	@Override
	public void turnHighGear() {
		System.out.println("Trimmer in High Gear");
		System.out.println("Testing Finished:\n Creating  Trimmer\n");

		TrimmerBuilder trimmerBuilder = new ElectricTrimmerBuilder();
		Trimmer trimmer = trimmerBuilder.addBatteries().addBearings().addBladeGuard().addBreather().addBrush().addEngine().addFuelTank().addMotor().build();

		trimmer.prepare();
		trimmer.mergeParts();
		trimmer.screwParts();
		trimmer.pack();

		System.out.println(trimmer);


		trimmerBuilder = new GasTrimmerBuilder();
		trimmer = trimmerBuilder.addBatteries().addBearings().addBladeGuard().addBreather().addBrush().addEngine().addFuelTank().addMotor().build();

		trimmer.prepare();
		trimmer.mergeParts();
		trimmer.screwParts();
		trimmer.pack();

//		System.out.println(trimmer);
	}
	public String toString() {
		return " High Gear";
	}
}
