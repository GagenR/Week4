package Week4;

public class DemoLes14 {
	static Gebouw gebouw = new Flat(5);
	Flat flat = go();

	public static void main(String[] args) {
		System.out.println("hoi");
	}
	Flat go() {
		return new Flat(3);
	}
}

class Gebouw{
	int id; Gebouw(int i){this.id = id;} public String toString() {return "Gebouw:"+id;}
	
	
	static int voltage;
	int hoogte;
	Raam raam = new Raam(2);
}
class Flat extends Gebouw{
	Flat(int id) {super(id);}
	int hoogte;
}
class Raam{
	int id; Raam(int id){this.id = id;} public String toString() {return "Raam:"+id;}
	
}