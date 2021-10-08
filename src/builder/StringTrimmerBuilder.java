package builder;

public class StringTrimmerBuilder {

	public static void main(String[] args) {
		TrimmerStates trimmerStates = new TrimmerStates();
		System.out.println(trimmerStates);

		trimmerStates.turnHighGear();
		trimmerStates.turnIdle();
		trimmerStates.turnRunning();
		trimmerStates.turnOff();

		System.out.println(trimmerStates);

		trimmerStates.turnOn();
		System.out.println(trimmerStates);

		trimmerStates.turnIdle();
		System.out.println(trimmerStates);
		trimmerStates.turnRunning();
		trimmerStates.turnHighGear();

		trimmerStates.turnHighGear();
		System.out.println(trimmerStates);

		trimmerStates.turnOff();

	}

}
