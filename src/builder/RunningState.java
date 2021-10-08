package builder;

public class RunningState implements State {
	TrimmerStates trimmerStates;
	public RunningState(TrimmerStates trimmerStates) {
		this.trimmerStates = trimmerStates;
	}

	@Override
	public void turnOff() {
		System.out.println("Trimmer Turned off");
		trimmerStates.setState(trimmerStates.getOffState());
	}

	@Override
	public void turnOn() {
		System.out.println("Sorry the Trimmer is On");

	}

	@Override
	public void turnIdle() {
		System.out.println("Trimmer turn to idle mode");
		trimmerStates.setState(trimmerStates.getIdleState());

	}

	@Override
	public void turnRunning() {
		System.out.println("Sorry Trimmer is in running mode");

	}

	@Override
	public void turnHighGear() {
		System.out.println("Trimmer switched to high gear");
		trimmerStates.setState(trimmerStates.getHighGearState());

	}
	public String toString() {
		return " running";
	}

}
