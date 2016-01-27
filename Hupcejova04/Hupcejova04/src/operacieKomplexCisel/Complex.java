package operacieKomplexCisel;

/**
 * 
 * Trieda Complex obsahuje metody na pracu s komplexnymi cislami, konkretne su
 * to negacia komplexneho cisla (NEGATE), spocitavanie komplexnych cisel (ADD) a
 * ich odpocitavanie (SUBTRACT), sucin (MULTIPLY) a podiel (DIVIDE), tiez je tu
 * metoda, ktora vrati prevratenu, reciprocnu hodnotu komplexneho cisla
 * (INVERSE) a nakoniec metoda pocitajuca n-tu mocninu komplexneho cisla (POW),
 * v ktorej sa vyuziva vopred definovana metoda na vypocet druhej mocniny
 * komplex.cisla(SQUARE). Metody subtract a divide som robila inym sposobom ako
 * je obvykle, a to tak, ze namiesto priameho odpocitavania cisel som
 * pripocitala negaciu toho cisla, ktore som chcela od daneho odpocitat a
 * podobne pri deleni, cize namiesto bezneho delenia som pouzila nasobenie
 * prevratenou hodnotou toho komplexneho cisla, co predstavuje delitela. Este
 * spomeniem, ze komplexne cisla su zlozene z realnej a imaginarnej zlozky.
 * 
 */

public class Complex {

	public static final Complex ZERO = new Complex(0, 0); // deklaracia konstant
	public static final Complex ONE = new Complex(1, 0);
	public static final Complex I = new Complex(0, 1);

	private double real; // instancne premenne
	private double imag;

	public Complex(double real1, double imag1) { // konstruktor, ktory "vyrobi"
		// komplexne cislo
		real = real1;
		imag = imag1;
	}

	public String toString() {// metoda prevadzajuca cislo na retazec (potrebna
		// pri vypise cisel)
		if (real == 0) {
			return Double.toString(imag);
		}
		if (imag == 0) {
			return Double.toString(real);
		}
		return real + " + i*" + imag;
	}

	public Complex negate() {// negacia komplex.cisla
		return new Complex(-real, -imag);
	}

	public Complex add(Complex other) {// metoda spocitavania
		if (((other.real == 0) && (other.imag == 0)) || (other == null)) {
			return this;
		}
		return new Complex(this.real + other.real, this.imag + other.imag);
	}

	public Complex subtract(Complex other) {// metoda odpocitavania
		if (((other.real == 0) && (other.imag == 0)) || (other == null)) {
			return this;
		}
		Complex a = other.negate();
		return new Complex(this.real + a.real, this.imag + a.imag);
	}

	public Complex multiply(Complex other) {// metoda nasobenia
		if ((other == ZERO) || (this == ZERO)) {
			return ZERO;
		}
		if ((other == null) || (this == null)) {
			throw new IllegalArgumentException("Neviem tak nasobit.");
		}
		return new Complex(
				((this.real * other.real) - (this.imag * other.imag)),
				((this.real * other.imag) + (other.real * this.imag)));
	}

	public Complex inverse() {// metoda, ktora vrati prevratenu, reciprocnu
		// hodnotu komplex.cisla
		double den = (Math.pow(this.real, 2)) + (Math.pow(this.imag, 2));
		if ((den == 0) || (this == null)) {
			throw new ArithmeticException(
					"Zmen cislo, nemoze byt 0 alebo nic v menovateli zlomku.");
		}

		return new Complex((this.real) / den, -(this.imag) / den);
	}

	public Complex divide(Complex other) {// metoda delenia komplex.cisel
		if ((other == ZERO) || (other == null)) {
			throw new ArithmeticException(
					"Zmen cislo, lebo delenie nie je mozne.");
		}
		Complex b = other.inverse();
		return this.multiply(b);
	}

	public Complex square() {// metoda pocitajuca druhu mocninu komplexneho
								// cisla, potrebna v dalsej metode, ktora bude
								// pocitat n-tu mocninu komplexneho cisla
		return this.multiply(this);
	}

	public Complex pow(int n) {// metoda nam vrati n-tu mocninu komplex.cisla
		Complex baseToPow2;
		if (n >= 0) {
			baseToPow2 = this;
		} else {
			baseToPow2 = inverse();
			n = -n;
		}
		Complex result = ONE;

		while (n > 0) {
			if ((n % 2) == 1) {
				result = result.multiply(baseToPow2);
			return result;
			
		}else{
		n = n / 2;
		
			baseToPow2 = baseToPow2.square();
		}return baseToPow2;
			}
		}

	
	}


