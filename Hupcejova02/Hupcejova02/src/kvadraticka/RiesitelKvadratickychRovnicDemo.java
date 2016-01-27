package kvadraticka;

public class RiesitelKvadratickychRovnicDemo {

	/**
	 * Metoda pocita korene a vyuziva pritom vopred definovany algoritmus
	 * vypoctu
	 */
	public static void main(String[] args) {
		double a = 1; /*
					 * deklaracia a inicializacia premennych, ktore zastupuju
					 * koeficienty pri clenoch x^2, x, nakoniec absolutneho
					 * clena rovnice
					 */
		double b = 7;
		double c = 4;
		RiesitelKvadratickychRovnic rovnica = new RiesitelKvadratickychRovnic();
		double[] koren = rovnica.getRealneKorene(a, b, c);
		for (int i = 0; i < koren.length; i++) { // cyklus prechadzajuci polom,
													// v ktorom je ulozene
													// riesenie danej rovnice
			System.out.println("Riesenim kvadratickej rovnice " + a + "*x^2 + "
					+ b + "*x + " + c + " = 0 je cislo " + koren[i]);
		} // vypis zadanej kvadratickej rovnice a jej rieseni v realnych cislach
	}

}
