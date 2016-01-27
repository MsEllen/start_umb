package demo;

import java.util.ArrayList;
import java.util.List;

import vyhladavanieLin.LinearSearcher;

public class LinearSearcherDemo {

	/**
	 * Demonstracia pouzitia metod IndexOf a LastIndexOf na zozname celych cisel a retazcov.
	 */
	public static void main(String[] args) {
		LinearSearcher hladanie = new LinearSearcher();
		List<Integer> list = new ArrayList<Integer>();
		list.add(new Integer(4));
		list.add(new Integer(1));
		list.add(new Integer(5));
		list.add(new Integer(4));
		list.add(new Integer(1));
		list.add(new Integer(5));
		list.add(new Integer(4));
		list.add(new Integer(1));
		list.add(new Integer(10));
		System.out.println("Ak sa nam ukaze cislo -1, tak hladany prvok nie je v zozname"+"\n");
		System.out.println("Prve hladanie sa uskutocni v zozname celych cisel: "+list+"\n");
		System.out.println("Pomocou IndexOf sa naslo cislo 1 na pozicii: "+hladanie.indexOf(list, new Integer(1)) + "\n"
				+ "Pomocou LastIndexOf sa naslo cislo 10 na pozicii: "+hladanie.lastIndexOf(list, new Integer(10)));
		
		List<String> list2 = new ArrayList<String>();
		list2.add("Aladar");
		list2.add("Zita");
		list2.add("Cyril");
		list2.add("Frantisek");
		list2.add("Dezider");
		list2.add("Milan");
		list2.add("Henrieta");
		list2.add("Karol");
		list2.add("Olina");
		System.out.println("\n"+"Druhe hladanie bude v zozname retazcov(mien): "+list2+"\n");
		System.out.println("Pomocou IndexOf sa naslo meno Dezider na pozicii: "+hladanie.indexOf(list2, "Dezider") + "\n"
				+ "Pomocou LastIndexOf sa naslo meno Frantisek na pozicii: "+hladanie.lastIndexOf(list2, "Fr"));

	}

}
