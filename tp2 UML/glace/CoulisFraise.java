package glace;

public class CoulisFraise extends DecoratorToppings {
	public CoulisFraise(CoupeGlacee c) {
		this.coupe=c;
	};
	@Override
	public float cout() {
		// TODO Auto-generated method stub
		return (float)1;
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return "au coulis de fraise fraiches";
	}

}
