package glace;

public class Pepsi extends Boisson {
	public static final Pepsi SINGLETON = new Pepsi();
	public float cout() {
		return 1.5f;
	}
	public String description() {
		return "delicious Pepsi cola";
	}
}
