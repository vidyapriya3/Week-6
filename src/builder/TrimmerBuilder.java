package builder;
import java.util.*;
public abstract class TrimmerBuilder {
	String name;
	List<String> parts = new ArrayList<String>();
	public abstract TrimmerBuilder addMotor();
	public abstract TrimmerBuilder addBatteries();
	public abstract TrimmerBuilder addBearings();
	public abstract TrimmerBuilder addBladeGuard();
	public abstract TrimmerBuilder addBreather();
	public abstract TrimmerBuilder addBrush();
	public abstract TrimmerBuilder addFuelTank();
	public abstract TrimmerBuilder addEngine();

	public Trimmer build() {
		Trimmer trimmer = new Trimmer();

		trimmer.setName(this.name);
		trimmer.addParts(parts);
		return trimmer;
	}
}
