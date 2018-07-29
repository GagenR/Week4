package Week4;


public class TestClass{
    
    public static void main(String[] args) {

        System.out.println(getBoem((char)25));

    }

    public static String getBoem(char p){
        String boem  = "De waarde is ";
        boem = boem.concat("kleiner dan P");
        boem.replace('P', p);
        String rest = " en groter dan 0";
        boem.concat(rest);
        return boem;
    }
}
