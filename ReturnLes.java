package Week4;

public class ReturnLes {

	public static void main(String[] args) {
		A a = new A();
		a.AA(null);
	//	a.AA(a).vermenigvuldigen();
		
	}
}
class B extends A{
	A b = new B();
	int getal = 0;
	
	void vermenigvuldigen() {
		System.out.println("in vermenigvuldigen");
	}
}

class A{
	static A A() {
		System.out.println("in methode a");
		return new A();
	}
	int optellen() {
		System.out.println("in optellen");
		return 3;
	}
	A AA(A A) {
		System.out.println("in aa"+A.optellen());
		return new A();
	}
}

