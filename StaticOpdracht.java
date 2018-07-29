package Week4;

public class StaticOpdracht {

	public static void main(String[] args) {
		System.out.println(Ufo.oppervlakteGrootsteUfo);
		Ufo ufo = new Ufo(40);
		System.out.println(ufo.oppervlakte);
		Ruimteschip ruimteschip = new Ruimteschip();
		ruimteschip.VliegenMetRuimteSchip();
		System.out.println(ufo.aantalWapens);
		ufo.aantalWapens = 11;
		System.out.println(ufo.aantalWapens);
		System.out.println(ufo.oppervlakte);
		ufo.oppervlakte = 25;
		
	}
}

class Ufo{
	static int oppervlakteGrootsteUfo = 50;
	int oppervlakte;
	int aantalWapens = 10;
	
	Ufo(int oppervlakte){
		this.oppervlakte = 30;
	}
}

class Ruimteschip{
	int AantalAliensInRuimteSchip = 5;
	int oppervlakte = 10;

	void VliegenMetRuimteSchip(){
		System.out.println("Het ruimteschip gaat vliegen met " + AantalAliensInRuimteSchip + "aliens aan boord." );		
	}
}
