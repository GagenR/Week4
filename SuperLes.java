package Week4;

public class SuperLes extends SuperLesOuder{
	int getal;
	public static void main(String[] args) {
		SuperLes demo = new SuperLes();
		demo.gasgeven(5);
	
	}
	void gasgeven(int getal) {
		System.out.println("het werkt");
		AAA aaa = new AAA();
		BBB bbb = new BBB();
		CCC ccc = new CCC();
		bbb.doen();
		ccc.doen();
		this.doen();
		getal = 5;
		this.getal = 7;
		super.kopen();
		kopen();
		super.oudergetal = 12;
		
	}
	void kopen() {
		super.kopen();
		System.out.println("kopen in demo");
	}
	
	
	void doen() {System.out.println("in Demo doen");}
}
class AAA{
	void doen() {System.out.println("in AAA don");}
	

}
class BBB{
	void doen() {System.out.println("in BBB doen");}
}
class CCC{
	void doen() {System.out.println("in CCC doen");}
}

class SuperLesOuder{
	int oudergetal;
	void kopen() {
		System.out.println("kopen in SuperLesOuder");
		
	}
	
}