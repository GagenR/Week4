package Week4;

public class Demo {
	public static void main(String[]args) {
		System.out.println("1");
		System.out.println(Hond.naamOudsteHond);
		System.out.println("2");
		Hond hond = new Hond("Fikkie");// je moet weten van wie je de voornaam wilt hebben, 
		// dus nieuw Hond object instantieren 
		System.out.println("3");
		Hond hond2 = new Hond("Takkie");
		System.out.println("4");
		System.out.println(hond.naam); 
		System.out.println("5");
		hond.naamOudsteHond = "Pebbles";
		System.out.println("6");
		System.out.println(Hond.naamOudsteHond);
		System.out.println("7");
		hond.Voorstellen();
		hond2.Voorstellen();
		Hond.naamOudsteHond = "Goofy";
		System.out.println(Hond.naamOudsteHond);
		hond.Voorstellen();
		hond2.Voorstellen();
		
	}
}
class Hond{
	static String naamOudsteHond = mk();
	String naam;
	
	static String mk() { // deze moet static worden, anders blijft regel 23 rood
		//je kan niet vanuit statische omgeving naar normale
		System.out.println("De zin wordt nu geladen in mk");
		return "Joris";
	}
	
	Hond (String naam){
		this.naam = naam;
	}
	void Voorstellen() {
		System.out.println("Blaff blaff, ik ben " + naam + "de oudtste hond heet " + naamOudsteHond);
	}
}
