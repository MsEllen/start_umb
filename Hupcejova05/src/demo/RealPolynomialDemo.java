package demo;

import math.realfunction.RealFunction;
import math.realfunction.elementary.RealPolynomial;

public class RealPolynomialDemo {

	/**
	 * Tato trieda demonstruje pouzitie metod vytvorenych v triede
	 * RealPolynomial a konkretne ukazuje s akym polynomom chceme pracovat, aka
	 * je jeho 1.derivacia a integral. Pri vypocte integralu neuvazujeme
	 * konstantu C (pre zjednodusenie). Nasledne sa vypocitaju hodnoty daneho
	 * polynomu, jeho 1.derivacie a integralu pre cisla, ktore si zvolime (pre
	 * tuto demonstraciu sa pouzili cisla -1, 0, 1).
	 */
	public static void main(String[] args) {
		RealFunction polynom = new RealPolynomial(-1.0, 6.0, -5.0, 4.0);
		System.out.println("Zadali ste takyto polynom: " + polynom);
		System.out.println("Prva derivacia vasho polynomu: "
				+ polynom.derivate());
		System.out.println("Integral vasho polynomu: " + polynom.integrate());
		for (int i = -1; i < 2; i++) {
			System.out
					.println("Vypocitam hodnoty 1.derivacie, integralu a hodnotu v zadanom polynome, ktory je: "
							+ polynom);
			System.out.println("Hodnota polynomu pre cislo " + i + ": "
					+ polynom.getValue(i));
			System.out.println("Hodonota 1.derivacie polynomu pre cislo " + i
					+ ": " + polynom.derivate().getValue(i));
			System.out.println("Hodnota integralu polynomu v cisle " + i + ": "
					+ polynom.integrate().getValue(i));
		}

	}

}
