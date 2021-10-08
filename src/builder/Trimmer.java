package builder;
import java.util.*;
public class Trimmer {


		String name;
		List<String> parts;
		public void addParts(List<String> parts) {
			this.parts = parts;
		}
		void prepare() {
			System.out.println("Prepare " + name);
			System.out.println("Screwing Parts together with bolts");
			for(String part: parts) {
				System.out.println("   " + part);
			}
		}
		void mergeParts() {
			System.out.println("Merge parts of trimmer");
		}
		void screwParts() {
			System.out.println("Screw parts in place ");
		}
		void pack() {
			System.out.println("Pack Trimmer\n");
		}
		public void setName(String name) {
			this.name = name;

		}
		public String toString() {
			StringBuffer display = new StringBuffer();
			display.append("-----" + this.name + "-----");
			for(String part : parts) {
				display.append(part + "\n");
			}
			return display.toString();
		}



}
