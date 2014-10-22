
public class Application {

	public static void main(String[] args) {
		Fehler f = new Fehler(); //6
		f.variable1 = 10; //7
		f.variable2 = 10; //8
		f.variable3 = 20;
		f.methode1();
		f.methode2();
		f.methode3(); //10
		System.out.println("Alle Fehler sind verschwunden!");
	}

}
