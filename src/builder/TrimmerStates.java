package builder;

public class TrimmerStates {
	State offState;
	State onState;
	State idleState;
	State runningState;
	State highGearState;
	State state;


	public TrimmerStates() {
		offState = new OffState(this);
		onState = new OnState(this);
		idleState = new IdleState(this);
		runningState = new RunningState(this);
		highGearState = new HighGearState(this);

		state = offState;
	}
	public void setState(State state) {
		this.state = state;
	}
	public State getState() {
		return this.state;
	}
	public State getOffState() {
		return offState;
	}
	public State getOnState() {
		return onState;
	}
	public State getIdleState() {
		return idleState;
	}
	public State getRunningState() {
		return runningState;
	}
	public State getHighGearState() {
		return highGearState;
	}
	public void turnOn() {
		state.turnOn();
	}
	public void turnOff() {
		state.turnOff();
	}
	public void turnIdle() {
		state.turnIdle();
	}
	public void turnRunning() {
		state.turnRunning();
	}
	public void turnHighGear() {
		state.turnHighGear();
	}
	public String toString() {
		StringBuffer result = new StringBuffer();

		result.append("------- Lawn Keeper ------- ");
		result.append("\nTrimmer is " + state + "\n");

		return result.toString();
	}

}
