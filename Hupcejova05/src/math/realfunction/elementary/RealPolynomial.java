package math.realfunction.elementary;

import math.realfunction.AbstractRealFunction;
import math.realfunction.RealFunction;

public class RealPolynomial extends AbstractRealFunction {// trieda
															// RealPolynomial
															// rozsiruje triedu
															// AbstractRealFunction

	/**
	 * Trieda RealPolynomial je vytvorena pre pracu s polynomami, ktorych
	 * koeficienty su realne cisla. Su tu vytvorene metody, ktore umoznuju vypis
	 * polynomu, s ktorym chceme pracovat(STRING), vypocet hodnoty polynomu pre
	 * nejake cislo(GETVALUE), najdenie derivacie polynomu(DERIVATE) a zistenie
	 * integralu polynomu(INTEGRATE). Polynom sa vytvori pomocou konstruktora
	 * RealPolynomial s parametrom, ktorym je pole. Pole predstavuje realne
	 * koeficienty polynomu, ktory chceme vytvorit.
	 */

	private double[] pole; // instancna premenna

	public RealPolynomial(double... pole1) { // konstruktor vytvarajuci polynom
		this.pole = pole1;
	}

	@Override
	public double getValue(double x) { // vypocet hodnoty polynomu v nejakom
										// cisle
		double a = pole[pole.length - 1]; // pomocna premenna
		double y = a;
		for (int i = pole.length - 1; i > 0; i--) {
			y = y * x + pole[i - 1];
		}
		return y;
	}

	@Override
	public RealFunction derivate() {
		double[] pole2 = new double[pole.length - 1]; // vytvorenie noveho pola
														// odobrenim jedneho
														// prvku zo zadaneho
														// pola
		for (int i = 0; i < pole2.length; i++) {
			pole2[i] = (i + 1) * pole[i + 1];
		}
		return new RealPolynomial(pole2);
	}

	@Override
	public RealFunction integrate() {
		double[] pole2 = new double[pole.length + 1]; // vytvorenie noveho pola
														// zo zadaneho pridanim
														// prvku
		pole2[0] = 0.0; // napln pridaneho prvku, potrebneho na zvysenie mocniny x
		for (int i = 1; i < pole2.length; i++) {
			pole2[i] = pole[i - 1] / i;
		}
		return new RealPolynomial(pole2);
	}

	@Override
	public String toString() { // metoda na vypis polynomu
		String polynom = "";
		for (int i = 0; i < pole.length; i++) {
			if (i == 1) {
				if (pole[i - 1] < 0) { // osetrenie vypisu pre zaporny
										// koeficient
					polynom = pole[i] + "x" + polynom;
				} else {
					polynom = pole[i] + "x+" + polynom;
				}
			}
			if (i == 0) {
				polynom = pole[i] + polynom;
			}
			if ((!(i == 0)) && (!(i == 1))) {
				if (pole[i - 1] < 0) { // osetrenie vypisu pre koeficient < 0
					polynom = pole[i] + "x^" + i + "" + polynom;
				} else {
					polynom = pole[i] + "x^" + i + "+" + polynom;
				}
			}
		}
		return polynom;

	}

}
