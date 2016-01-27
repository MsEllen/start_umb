package kvadraticka;

/**
 * Algoritmus na vypocet realnych korenov kvadratickej rovnice a*x^2 + b*x + c = 0
 */

public class RiesitelKvadratickychRovnic {

	/*
	 * metoda getRealneKorene vrati pole s 0 prvkami v pripade komplexnych
	 * korenov, s 1 prvkom ak ide o jeden zdruzeny koren a s 2 prvkami ak ide o
	 * dva rozne realne korene
	 */

	public double[] getRealneKorene(double a, double b, double c) {
		double diskriminant = (b * b) - (4 * a * c); // deklaracia
														// diskriminantu, ktory
														// udava pocet korenov
		if (a == 0) { // tato podmienka zistuje, ci ide o kvadraticku rovnicu
			double[] koren = new double[0]; // vytvorenie pola s 0 prvkami,
											// kedze linearnu rovnicu netreba
											// pocitat
			return koren; // volanie prvku pola, v ktorom je ulozeny koren
		} else { // ak nejde o linearnu rovnicu, pokracujeme testovanim
					// diskriminantu kvadratickej rovnice
			if (diskriminant < 0) {
				double[] koren = new double[0]; // pole nebude obsahovat ziaden
												// prvok, pretoze sa pocitaju
												// realne korene
				
			}
			if (diskriminant == 0) {
				double[] koren = new double[1];
				koren[0] = (-b) / (2 * a);
				return koren;
			} else {
				double[] koren = new double[2];
				koren[0] = ((-b) - Math.sqrt(diskriminant)) / (2 * a); // funkcia
																		// Math.sqrt(diskriminant)
																		// pocita
																		// druhu
																		// odmocninu
																		// z
																		// diskriminantu
				koren[1] = ((-b) + Math.sqrt(diskriminant)) / (2 * a);
				return koren;

			}
		}

	}
}
