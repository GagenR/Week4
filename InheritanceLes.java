package Week4;

public class InheritanceLes {

	public static void main(String[] args) {
		Dier a = new Leeuw();
		//	a.brullen();   kan niet, omdat a een Dier is, hij kan niet bij methode van Leeuw
		// je kan dit oplossen door aanspreekniveau kleiner te maken, dus:
		// Leeuw a = new Leeuw(); , of door te casten, dus:
		 Leeuw l = (Leeuw)a;
		 l.brullen();
		 Dierenarts dierenarts = new Dierenarts();
		 dierenarts.genezen(new Leeuw());
		 RR rr = new RR();
	//	 rr.voiden(new PP()); // je kan dit oplossen door te casten:
	//	 QQ q = (QQ) new PP();
	//	 rr.voiden( q);

	}
}

class QQ extends PP{
	
}
class PP{
	
}

class RR{
	void voiden(QQ pp) {
		
	}
}

class Dierenarts {
	void genezen(Dier dier) {// je moet een Dier meenemen, omdat een dierenarts geneest Dieren
		// een boolean meegeven mag ook
		System.out.println("genezen in dierenarts");
		dier.voortbewegen();
	}
}

class Dier{
	void voortbewegen() {
		System.out.println("voortbewegen in dier");
	}
	
}
class Leeuw extends Dier{
	void brullen() {
		System.out.println("Brullen in leeuw");		
	}
	void voortbewegen() {
		System.out.println("voortbewegen in Leeuw");
	}
}
class Mus extends Dier{
	
}