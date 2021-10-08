package builder;

public class OffState implements State {
	TrimmerStates trimmerStates;
	public OffState(TrimmerStates trimmerStates) {
		this.trimmerStates = trimmerStates;
	}

	@Override
	public void turnOff() {

		System.out.println("Sorry Trimmer is turned off");
	}

	@Override
	public void turnOn() {
		System.out.println("Trimmer turned on");
		trimmerStates.setState(trimmerStates.getOnState());
	}

	@Override
	public void turnIdle() {
		System.out.println("Trimmer is off");

	}

	@Override
	public void turnRunning() {

		System.out.println("Trimmer is Off");
	}

	@Override
	public void turnHighGear() {
		System.out.println("Trimmer is Off");

	}
	public String toString() {
		return " OFF";
	}

}
