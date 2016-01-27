package demo;

import operacieKomplexCisel.*;

public class ComplexOperationsDemo {

	/**
	 * Demonstracia metod vytvorenych v triede Complex predstavujucich vybrane
	 * operacie s komplexnymi cislami
	 */
	public static void main(String[] args) {

		Complex C1 = new Complex(1, -1);// vytvorenie konkretnych komple.cisel,
										// s
		// ktorymi sa bude pracovat
		Complex C2 = new Complex(2, -3);

		System.out.println("Prve zadane komplexne cislo C1: " + C1);// Vypisy
		// zadanych
		// cisel
		System.out.println("Druhe zadane komplexne cislo C2: " + C2);
		System.out.println("Negacia C1: " + C1.negate());// Vypisy vyslednych
		// hodnot, ktore vratia
		// metody z triedy
		// Complex
		System.out.println("Negacia C2: " + C2.negate());
		System.out.println("Rozdiel C2-C1: " + C2.subtract(C1));
		System.out.println("Dvojnasobny sucet C2: " + C2.add(C2));
		System.out.println("Nasobok cisel C2*C1: " + C2.multiply(C1));
		System.out.println("Prevratena hodnota komplexneho cisla C1: "
				+ C1.inverse());
		System.out.println("Podiel cisel C2/C1: " + C2.divide(C1));
		System.out.println("2. mocnina cisla C1: " + C1.pow(2));
		System.out.println("3. mocnina cisla C1: " + C1.pow(3));
		System.out.println("C1 na 0-tu: " + C1.pow(0));
	}

}
