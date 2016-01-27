package charakteristikyPola;

/**
 * 
 * Algoritmus obsahuje staticke metody typu double, ktorych parametrom je pole.
 * Konkretne ide o metody MAX, MIN, SUM a PRODUCT, ktore vypocitaju jednotlive
 * charakteristiky pola, a to najdenie maximalneho prvku pola(metoda MAX), potom
 * jeho minimalneho prvku(metoda MIN), vypocet suctu prvkov pola(metoda SUM) a
 * nakoniec vypocet sucinu prvkov v zadanom poli(metoda PRODUCT). Metody su
 * osetrene proti nevhodnym zadaniam pola ako je prazdne pole alebo pole,
 * ktoreho dlzka je nulova. Vtedy program vypise, ze taketo zadanie pola nie je
 * korektne.
 * 
 */

public class ArrayFunctions {

	public static double max(double[] pole) {
		if ((pole == null) || (pole.length == 0)) {// testuje ci je zadanie pola
			// v poriadku
			throw new IllegalArgumentException("Nespravne zadane pole!"); // vykona
			// sa,
			// ak
			// testovacia
			// podmienka
			// bola
			// vyhodnotena
			// ako
			// pravdiva
		} else { // blok sa vykona, ak testovacia podmienka bola nepravdiva
			double max = Double.MIN_VALUE; // deklaracia a inicializacia
			// premennej max, do ktorej sa potom
			// priradi maximalny prvkov pola
			int i = 0; // potrebne inicializovat na hodnotu 0, pretoze prvy
			// prvok pola je ulozeny na mieste, ktore ma index 0

			while (i < pole.length) { // cyklus prechadza celou dlzkou zadaneho
				// pola
				if (max < pole[i]) { // porovnava doterajsiu maximalnu hodnotu
					// ulozenu v premennej max s
					// jednotlivymi prvkami pola
					max = pole[i]; // ak v premennej max je ulozena mensia
					// hodnota ako je ta, ktoru ma dany prvok,
					// tak nastava priradenie tohto prvku(ktory ma vyssiu
					// hodnotu) do premennej max
					i++; // zvacsenie hodnoty premennej i o 1 nam zabezpeci, ze
					// po priradeni sa bude dalej prechadzat polom, ale
					// zacne sa uz od nasledujuceho indexu
				} else
					i++;
			}
			return max; // volanie premennej, do ktorej sa ulozil maximalny
			// prvok pola
		}
	}

	public static double min(double[] pole) { // metoda na urcenie minimalneho
		// prvku pola, pracuje podobne
		// ako metoda max
		if ((pole == null) || (pole.length == 0)) {
			throw new IllegalArgumentException("Nespravne zadane pole!");
		} else {
			double min = Double.MAX_VALUE;
			int i = 0;

			while (i < pole.length) {
				if (min > pole[i]) {
					min = pole[i];
					i++;
				} else
					i++;
			}
			return min;
		}
	}

	public static double sum(double[] pole) {// metoda spocita sucet prvkov v
		// poli
		if ((pole == null) || (pole.length == 0)) {
			throw new IllegalArgumentException("Nespravne zadane pole!");
		} else {
			double sum = 0; // inicializacia na honotu 0, aby sa dalo spocitavat
			// a 0 nic v sucte nezmeni(je jeho neutralnym
			// prvkom)
			int i = 0;

			while (i < pole.length) {
				sum = sum + pole[i]; // sucet sa vytvara ako pripocitanie daneho
				// prvku pola k doterajsiemu suctu
				i++;
			}
			return sum;
		}
	}

	public static double product(double[] pole) {// metoda zisti, aky je sucin
		// vsetkych prvkov, ktore su
		// v poli
		if ((pole == null) || (pole.length == 0)) {
			throw new IllegalArgumentException("Nespravne zadane pole!");
		} else {
			double product = 1; // nastavenie premennej product na hodnotu 1
			// umozni jej pouzitie a zaroven je neutralnym
			// prvkom nasobenia
			int i = 0;

			while (i < pole.length) {
				product = product * pole[i]; // sucin sa vytvori pomocou
				// operacie nasobenia pouzitej
				// na dany prvok pola a
				// doterajsiu hodnotu sucinu
				i++;
			}
			return product;
		}
	}
}
