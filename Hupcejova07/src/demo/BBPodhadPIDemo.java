package demo;

import java.math.BigDecimal;

import math.numerics.constant.ConstantAlg;
import math.numerics.constant.impl.*;

/**
 * 
 * V tejto triede nastavime hodnoty chyby, presnosti a pocet iteracii a
 * demonstruje sa, co to pre dane parametre spravi. Pri vypise sa nam uvedie
 * presna hodnota konstanty, jej odhad, ktory sme robili, tiez chyba odhadu a aj
 * cas, ktory bol potrebny na cely vypocet.
 * 
 */

public class BBPodhadPIDemo {

	public static void main(String[] args) {
		demoBbp();
	}

	protected static void demoBbp() {
		ConstantAlg alg = new ConstantBbp();
		alg.setError(1e-5);
		alg.setPrecision(600);
		alg.setMaxIterations(Integer.MAX_VALUE);
		demonstrateAlgorithm(alg);
	}

	protected static BigDecimal demonstrateAlgorithm(ConstantAlg alg) {
		if (alg == null)
			throw new NullPointerException();

		System.out.println("+++++++++ " + alg.getName().toUpperCase()
				+ " (odhad cez double) +++++++++");
		long time = System.nanoTime();
		double est = alg.getEstimate();
		double timeMilliSec = (System.nanoTime() - time) / 1000000.0; // cas
																		// potrebny
																		// na
																		// vypocet
		double err = est - alg.getExactValue();

		System.out.println("Pozadovana presnost:\t" + alg.getError());
		System.out.println("Cas:\t\t\t" + timeMilliSec + " ms");

		System.out.println("Presna hodnota:\t\t" + alg.getExactValue());
		System.out.println("Odhad:\t\t\t" + est);
		System.out.println("Chyba odhadu:\t\t" + err);
		System.out.println();

		// BigDecimal-estimate
		System.out.println("+++++++++ " + alg.getName().toUpperCase()
				+ " (odhad cez BigDecimal) +++++++++");
		time = System.nanoTime();
		BigDecimal estBig = alg.getBigEstimate();
		timeMilliSec = (System.nanoTime() - time) / 1000000.0; // cas potrebny
																// na vypocet
		double errBig = Double.NaN;
		if (estBig != null) {
			errBig = estBig.subtract(alg.getBigExactValue()).doubleValue();
		}

		System.out.println("Pozadovana presnost:\t" + alg.getPrecision()
				+ " cislic(e)");
		System.out.println("Cas:\t\t\t" + timeMilliSec + " ms");
		System.out.println("Presna hodnota:\t\t" + alg.getBigExactValue());
		System.out.println("Odhad:\t\t\t" + estBig);
		System.out.println("Chyba odhadu:\t\t" + errBig);
		System.out.println();

		return estBig;
	}
}