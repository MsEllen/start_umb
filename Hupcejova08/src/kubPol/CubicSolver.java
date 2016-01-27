package kubPol;

import com.sun.org.apache.xpath.internal.operations.Equals;

import math.polynomial.*;
import math.number.impl.Complex;
import math.number.impl.Real;

public class CubicSolver {

	public Complex[] getRoots(Polynomial<Real> polynomial) {
		
		Real a = polynomial.getCoeff(2).divide(polynomial.getCoeff(3));
		Real b = polynomial.getCoeff(1).divide(polynomial.getCoeff(3));
		Real c = polynomial.getCoeff(0).divide(polynomial.getCoeff(3));
			
		Complex A = new Complex(a.doubleValue(), 0.0);
		
		Real pr = b.subtract((a.pow(2)).divide(3));
		Real qr = c.add((((a.pow(3)).multiply(2)).subtract(a.multiply(b).multiply(9))).divide(27));
		
		Complex p = new Complex(pr.doubleValue(), 0.0);
		Complex q = new Complex(qr.doubleValue(), 0.0);
		
		Complex pNa3 = (p.pow(3)).divide(27);
		Complex qNa2 = (q.pow(2)).divide(4);
		Complex podOdmoc = (pNa3.add(qNa2)).sqrt();
		Complex prvyPod3Odmoc = (q.negate()).divide(2);
		Complex u1 = ((prvyPod3Odmoc).add(podOdmoc)).cbrt();
		Complex u2pom = new Complex((-1.0)/(2.0), (Math.sqrt(3.0))/(2.0));
		Complex u2 = u2pom.multiply(u1);
		Complex u3pom = new Complex((-1.0)/(2.0), -Math.sqrt(3.0)/(2.0));
		Complex u3 = u3pom.multiply(u1);
		
		Complex x1 = u1.subtract(p.divide(u1.multiply(3))).subtract(A.divide(3));
		Complex x2 = u2.subtract(p.divide(u2.multiply(3))).subtract(A.divide(3));
		Complex x3 = u3.subtract(p.divide(u3.multiply(3))).subtract(A.divide(3));
		
		Complex[] korene = new Complex[3];
		korene[0] = x1;
		korene[1] = x2;
		korene[2] = x3;
		
		return korene;
		
	}
}

Iterator<String> it = coll.iterator;{
while hasNext() {
	String s = it.next();
}
}

to iste ako for(Sttring s : coll)
	 
iterable - prechoditelne cyklom

unmodifiabe - nemodifikovatelne 

ArrayList -  ak neviem dopredu povedat, aku dlzku bude mat pole

LinkedList -  pri vkladani do prostriedku
			- prvok si pamata, co je pred nim a co je za nim...
			-dva prvky si pamataju null(prvy a posledny)
Set - mnozina
	- kazdy prvok sa v nej nachadza prave raz

Linked HashSet - pamat si poardie vkladania

Set<K>keys = map.keySet(;)
for(K key : kys){
	V value = map.get(key);
}

statisktika - nminalne data - frekvencia vyskytov....Osoby: statna prislusnost, narodnost..Kolko je tam slovakov?
			- vstupom je kolekcia, vystupom je mapa
			
Do prazdnej mapy sa uz potom neda nic pridavat

Unmodifiable -  vstup obali a vytvori novu kolekciu

Disjoint - ci su dve kolekcie disjunktne

Pole menim na zoznam - Arrays a jej metoda AsList

Trieda Comparator-porovnava triedu inu
				- nestandardne triedenia....podla abecedy(priezvisko, funkcie) a na to treba samostane komparatory...
				
				-Sharkovskeho usporiadanie- ine triedenie prirodzenych cisel: najmensie je 1, 2, 4, 8, ...cisel najvacsie je
				- vyuzitie v dynamickych systemoch
			
Kolekcie - Dynamicke polia

MIN SORT:
6 3 4 -1
min = -1
-1 6 3 4
min = 3
-1 3 6 4 
min = 4
-1 3 4 6

prechod kolekciou cez cyklus...LIst<T> list...//na zaciatku i = 0 a j  = 3
								for (int i = 0; i < list.size()-1; i++){
									//min index = j...i....size-1
									//vymenim prvky i a j obojstranne
								}
				
INSERT SORT:
6 3 4 -1
jeden prvok )(6) je dobre zotriedeny..cisel..teraz treba zotriedit podzoznam dlzky dva a musim vsuvat
6 3 ....nie je zotriedene...preto treba 3 sparvne zaradit..cisel..metoda remove(1) a add(0, )
podzoznam dlky 3...  3 a 6 je dobre, ale 4 to pokazi...ale 4 zobrat prec a najst,kam ju mam dat....znova remove a add na index 1
podzozanm dlzky 4....add 3 4 6 -1.....-1 to pokazila a ta musi ist na zaciatok...
da sa vyuzit binarne vyhladavanie

BUBBLE SORT:
6 3 4 -1
porovnavam len susedne prvky!
3 6 4 -1.....6 a 4 ste dobre zotriedene? da kladne cislo, zaporne alebo 0, ak sa rovnaju...
na konci dostanem to, ze na konci je maximum....
Koniec Prveho Bublania

Zaciatok Druheho Bublania
3 4 -1 6
3 a 4 ste dobre? ano
3 4 -1 6....add.4 a -1 ste dobre utriedene?nie
3 -1 4 6

Tretie Bublanie
3 a -1
-1 3 4 6

SHAKE SORT:
bubl: 3 4 -1 6
		3 -1 4 6
		-1 3 4 6...na tomto spravime druhe bublanie
		
QUICK SORT:
3 6 3 4 -1 2 5
preusporiadame tak...-1 a 2 a 3 dame pred prvu 3 = pivot
to iste ....2 krok....add na -1 2 a  3... a na dalsej casti ...6 4 5...v prvej je pivot 3 a v druhej je pivot6...
-1 2 3...3.... 4 5 6

metda Sort(list, int indOd, int indDo){
	kratky zoznam, jednoprvkovy, ziadny, tak koncim
	///1krok: 
	sort(list, int indOd, int indDo).CubicSolver...lava cast...
	teraz prava.....
	Toto sa vola rekurzia...

Vyhladavnie linerarne:
	3 6 3 ......pytam sa kazdeho jedneho, si 4?
	indexOf(4)..pouzivam metodu Equals
	Last index Of...ide od zadu....CubicSolver
	
Binarne vyhladavnie...na zotriedenom poli
-1 2 3 3 4 5 6
hladame 2..idex Of(2)
	pytam sa toho, ktory je v polke...v strede... si dvojka == ako ten stred?...si vacsi ako 2?....ano, tak dva bude v prvej polovici.....preto tu druhu polku uz neeriem do uvahy
	teraz z lavej casti prostrednu...si dvojka? a ano je.. :) a mame to...
	ak by to nebola dvojka, tak s aspytame, ci jevacsi ako dvojka alebo mensi ako dvojka....ano tak dalje...
	ak uz nemame nic v lavo a naic v pravo, tak sme nasli to, co trebalo alebo sme nenasli nic.... podla toho, co za vysledok nam to da, ak sa spytame, ci si rovnaka?
			

ZOZNAMY....PORADIE PRVKOV:
	
	6 3 -1 4 2...a chceme poradie
	
	poradie = podla velkosti...(index)
	4 - List<Integer>
	
	6 3 -1 4 2
	0 1 2 3 4 
	
	teraz to zotriedime podla prveho riadku a beriem cislo s indexom spolu....presuvame indexy
	
	-1 2 3 4 6
	2 4 1 3 0
	
	vystup bude pole:   rank (2) = 0
						rank (4) = 1
						rank (1) = 2
						rank (3) = 3
						rank (0) = 4
						
alebo si vytvorime dvojicu Pair.prorovnavame len cisla...
v neparametrickej statistike to treba

DELITELE:
	na mnozinu
	kazdy delitel bol iba raz
	
	AllDivisors...for(int i = 1; i<= odmoc(n); i++)
		
	PrimeDivisors...prvociselne delitele..... 	84 = 2.2.3.7
												p = 2...n = 84/2 = 42
														n = 42/2 = 21
														
												p = 3...n = 21/3 = 7
												p = 4...nie
												p = 5...nie
												p = 6...nie
												p = 7...n = 1...koniec
												
23.4.2009....
parse - z retazca vytvori objekt

decimalFormat- bez argumentu....podla narodneho nastavenia systemu....control panel atd
			- pattern - na kolko destainnych miest mi zibrazi cislo
			symbol - ako zobrazi destainnu ciarku
			
percent format-ak x....(100.x)%


	



}




