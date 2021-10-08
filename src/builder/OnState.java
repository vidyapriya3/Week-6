package builder;

public class OnState implements State {
	TrimmerStates trimmerStates;
	public OnState(TrimmerStates trimmerStates) {
		this.trimmerStates = trimmerStates;
	}

	@Override
	public void turnOff() {
		System.out.println("Trimmer turned off");
		trimmerStates.setState(trimmerStates.getOffState());

	}

	@Override
	public void turnOn() {
		System.out.println("Trimmer is on");

	}

	@Override
	public void turnIdle() {
		System.out.println("Trimmer turned to idle mode");
		trimmerStates.setState(trimmerStates.getIdleState());

	}

	@Override
	public void turnRunning() {
		System.out.println("Trimmer turn to running mode");
		trimmerStates.setState(trimmerStates.getRunningState());

	}

	@Override
	public void turnHighGear() {
		System.out.println("The trimmer has to be running");



	}
	public String toString() {
		return " ON";
	}
}
