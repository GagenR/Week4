package Week4;

public class Interface {

	public static void main(String[] args) {
		Interface Interface = new Interface();
		Interface.kopen().verkopen();;	
		//	Verkoopbaar verkoopbaar = new Verkoopbaar(); //je kan geen interface kan instantieren
	}
	void ergensVanafKomen(Verkoopbaar vk) {// je hebt nu typering en identifier van Interface
		vk.verkopen(); //dit kan voordat er iets gemaakt is
		vk.retourneren();
		
	}
	Verkoopbaar kopen() {
		return new Huis();
	}
}
interface Verkoopbaar{
	void verkopen();
	void retourneren(); // je mag meer eisen stellen aan iets wat verkoopbaar is
	
}
class Huis implements Verkoopbaar{
	public void verkopen() {
		System.out.println("Verkopen in huis");	
	}
	public void retourneren() {
		System.out.println("Retourneren in huis");
	}
	
}
