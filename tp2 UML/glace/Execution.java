package glace;

import java.io.PrintWriter;

public class Execution {

	public static void main(String[] args) {
	PrintWriter writer = new PrintWriter(System.out);
	Produit c= TripleChocolat.SINGLETON;
	Produit cola = Pepsi.SINGLETON;
	Chantilly ch=new Chantilly(c);
	SauceChocolat sau=new SauceChocolat(c);
	Commande com = new Commande();
	com.ajouterCoupe(c);
	com.ajouterCoupe(sau);
	com.ajouterCoupe(ch);
	com.ajouterCoupe(cola);
	//System.out.println(c.cout());
	com.publieFacture();
	
	}

}
