package builder;

public class ElectricTrimmerBuilder extends TrimmerBuilder{

	public ElectricTrimmerBuilder() {
		this.name = "Electric Trimmer";
	}
	public TrimmerBuilder addMotor() {
		this.parts.add("Motor");
		return this;
	}
	public TrimmerBuilder addBearings() {
		this.parts.add("Bearing");
		return this;
	}
	public TrimmerBuilder addBrush() {
		this.parts.add("Brushes");
		return this;
	}
	public TrimmerBuilder addBladeGuard() {
		this.parts.add("Blade Guard");
		return this;
	}
	public TrimmerBuilder addBreather() {
//		this.parts.add("Breather");
		return this;
	}
	public TrimmerBuilder addBatteries() {
		this.parts.add("Batteries");
		return this;
	}
	public TrimmerBuilder addEngine() {
		return this;
	}
	public TrimmerBuilder addFuelTank() {
		return this;
	}



}
