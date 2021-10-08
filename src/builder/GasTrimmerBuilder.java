package builder;

public class GasTrimmerBuilder extends TrimmerBuilder{

	public GasTrimmerBuilder() {
		this.name = "Gas Trimmer";
	}
	public TrimmerBuilder addMotor() {

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
		this.parts.add("Breather");
		return this;
	}
	public TrimmerBuilder addBatteries() {

		return this;
	}
	public TrimmerBuilder addEngine() {
		this.parts.add("Engine");
		return this;
	}
	public TrimmerBuilder addFuelTank() {
		this.parts.add("Fuel Tank");
		return this;
	}



}