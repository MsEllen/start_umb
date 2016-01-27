package vyhladavanieLin;

import java.util.List;

/**
 * 
 *V tejto triede su uvedene algoritmy na vyhladanie lubovolneho prvku v
 * zozname. Metody pouzite na vyhladanie prvku vratia index hladaneho prvku. Ak
 * sa hladany prvok nenachadza v zozname, tak potom metoda vrati hodnotu -1.
 * Metoda IndexOf prehladava zoznam od zaciatku a metoda LastIndexOf zase od
 * jeho konca.
 * 
 */

public class LinearSearcher {
	public int indexOf(List<?> list, Object object) {
		int hodnota = -1;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals(object)) {
				hodnota = i;
				break;
			}
		}

		return hodnota;
	}

	public int lastIndexOf(List<?> list, Object object) {
		int hodnota = -1;
		for (int i = list.size() - 1; i >= 0; i--) {
			if (list.get(i).equals(object)) {
				hodnota = i;
				break;
			}
		}
		return hodnota;
	}
}
