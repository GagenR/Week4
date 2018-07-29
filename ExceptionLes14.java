package Week4;

public class ExceptionLes14 {

	public static void main(String[] args) throws Exception{
		new Thee().drinken();

	}
}
class Thee{
	boolean isVies = true;
	void drinken() throws Exception{
		int getal = 3;
		if(isVies) {
			try {
				getal = 6;
			throw new NietTeDrinkenException();
			}catch(Exception e) {
				throw new WelTeDrinkenException();
			}finally {
				throw new SomsDrinkenException();
			}
		//	System.out.println(getal);
	}
}
class NietTeDrinkenException extends Exception{
	
}
}

class WelTeDrinkenException extends Exception{
	
}

class SomsDrinkenException extends Exception{
	
	
}