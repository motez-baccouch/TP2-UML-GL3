package glace;

public class Chantilly extends DecoratorToppings {
public Chantilly(Produit c) {
this.coupe=c;};
	@Override
	public float cout() {
		// TODO Auto-generated method stub
		return (float)0.5;
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return "Chantilly";
	}

}
