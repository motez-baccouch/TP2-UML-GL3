package glace;

public class SauceChocolat extends DecoratorToppings {
public SauceChocolat(Produit c) {
	this.coupe=c;
};
	@Override
	public float cout() {
		// TODO Auto-generated method stub
		return (float)0.7;
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return "et sa delicieuse sauce chocolat";
	}

}
