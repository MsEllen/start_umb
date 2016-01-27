package demo;

import charakteristikyPola.*;

public class ArrayFunctionsDemo {

	/**
	 * Metoda vypocita konkretne hodnoty, pricom vyuziva predtym vytvoreny
	 * algoritmus ulozeny v triede charakteristikyPola. Tu vytvarame pole
	 * obsahujuce hodnoty, s ktorymi chceme pracovat.
	 */
	public static void main(String[] args) {
		double[] pole = {          }; //5.6, 19.4, 2.3, 3.7, 8.6 };

		System.out.println("Maximalny prvok zadaneho pola je: "
				+ ArrayFunctions.max(pole)); // vypis hodnoty maximalneho prvku
		// pola pomocou volania metody
		// max
		System.out.println("Minimalny prvok pola je: "
				+ ArrayFunctions.min(pole)); // vypis hodnoty minimalneho prvku
		// pola pomocou volania metody
		// min
		System.out.println("Sucet prvkov v poli je: "
				+ ArrayFunctions.sum(pole)); // vypis suctu hodnot prvkov pola
		// pomocou volania metody sum
		System.out.println("Sucin prvkov pola je: "
				+ ArrayFunctions.product(pole)); // vypis sucinu hodnot prvkov
		// pola pomocou volania
		// metody product
	}

}
