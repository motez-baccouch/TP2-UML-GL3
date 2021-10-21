package glace;

import java.io.*;
import java.util.*;

public class Commande {
	private List<Produit> lesCoupes;
	public Commande() {
		lesCoupes = new ArrayList<Produit>();
	};
	
	public void ajouterCoupe(Produit c) {
		lesCoupes.add(c);
	};
	public void publieFacture() {
		float total = 0;
		System.out.print("Une coupe ");
		for (Iterator it = this.lesCoupes.iterator(); it.hasNext();) {
		Produit coupe = (Produit) it.next();
		System.out.print(coupe.description()+" ");
		total = total + coupe.cout();
		}
		System.out.println("\n TOTAL : "+total);
		}

}
