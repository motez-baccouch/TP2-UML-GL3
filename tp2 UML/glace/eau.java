package glace;

public class eau extends Boisson {
	public static final eau SINGLETON = new eau();
	public float cout() {
		return 1;
	}
	public String description() {
		return "fresh water";
	}
}
