package glace;

public class TripleChocolat extends CoupeGlacee {
	public static final TripleChocolat SINGLETON = new TripleChocolat();
	private TripleChocolat() {
	this.parfums.add(Parfum.CHOCONOIR);
	this.parfums.add(Parfum.CHOCOBLANC);
	this.parfums.add(Parfum.CHOCOLAIT);
	}
	public float cout() {
	return 6;
	}
}
