package builder;

public class IdleState implements State {
	TrimmerStates trimmerStates;
	public IdleState(TrimmerStates trimmerStates) {
		this.trimmerStates = trimmerStates;
	}

	@Override
	public void turnOff() {

		System.out.println("Trimmer turned off");
		trimmerStates.setState(trimmerStates.getOffState());
	}

	@Override
	public void turnOn() {
		System.out.println("Sorry trimmer is on");

	}

	@Override
	public void turnIdle() {
		System.out.println("Sorry trimmer in Idle State");

	}

	@Override
	public void turnRunning() {
		System.out.println("Trimmer set to running mode");
		trimmerStates.setState(trimmerStates.getRunningState());
	}

	@Override
	public void turnHighGear() {
		System.out.println("Trimmer Turned to high gear");
		trimmerStates.setState(trimmerStates.getHighGearState());
	}
	public String toString() {
		return " IDLE";
	}

}
