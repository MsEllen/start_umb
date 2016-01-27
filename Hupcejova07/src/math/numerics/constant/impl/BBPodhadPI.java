package math.numerics.constant.impl;

import java.math.BigDecimal;
import java.math.MathContext;

import math.numerics.AbstractNumericalAlg;
import math.numerics.constant.ConstantAlg;

/**
 * 
 * Trieda je urcena na zapisanie algoritmu pre vypocet hodnoty konstaty PI
 * pomocou BBP-odhadu. Jej hodnota sa zistuje pre Double a BigDecimal. Najprv sa
 * vypocita presna hodnota pre Double a pre ten isty datovy typ sa pocita odhad
 * konstaty(pouzity BBP). Rovnako je pri type BigDecimal.
 * 
 */

public class BBPodhadPI extends AbstractNumericalAlg implements ConstantAlg {

	//private static final BigDecimal PI = new BigDecimal(
			//"3.14159265358979323846264338327950288419716939937510");

			private static final BigDecimal PI = new BigDecimal(
			"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679821480865132823066470938446095505822317253594081284811174502841027019385211055596446229489549303819644288109756659334461284756482337867831652712019091456485669234603486104543266482133936072602491412737245870066063155881748815209209628292540917153643678925903600113305305488204665213841469519415116094330572703657595919530921861173819326117931051185480744623799627495673518857527248912279381830119491298336733624406566430860213949463952247371907021798609437027705392171762931767523846748184676694051320005681271452635608277857713427577896091736371787214684409012249534301465495853710507922796892589235420199561121290219608640344181598136297747713099");
			
	@Override
	public String getName() {
		return "Odhad konstanty PI pomocou BBP-odhadu";
	}

	@Override
	public double getExactValue() {
		return Math.PI;
	}

	@Override
	public BigDecimal getBigExactValue() {
		return PI;
	}

	@Override
	public double getEstimate() {
		int k = 0;
		double OldPI = 0.0;
		//double PI = 47.0 / 15.0;// hodnota formuly pre k=0;
		//double k31 = new double ("3.1");
		//double PI = double.ONE.divide(double.valueOf(3),mc).divide(double.valueOf(10),mc).add(k31);
		double PI = ((1.0/3.0)/(10.0))+3.1;

		while (!isNegligible(PI - OldPI)) {
			nextIteration();

			k++;
			OldPI = PI;
			double prvy = 1.0 / Math.pow(16.0, k);// clen pred zatvorkou
			double K = 8.0 * k;
			PI = prvy
					* ((4.0 / (K + 1.0)) - (2.0 / (K + 4.0))
							- (1.0 / (K + 5.0)) - (1.0 / (K + 6.0)));
			PI = OldPI + PI;
		}

		return PI;
	}

	@Override
	public BigDecimal getBigEstimate() {
		MathContext mc = getMathContext();

		int k = 0;
		BigDecimal OldPI = BigDecimal.ZERO;
		BigDecimal PI = new BigDecimal("3.133333");// hodnota formuly pre k = 0
		// v tvare desatinneho cisla
		// pre ziskanie presnejsej
		// hodnoty
		
		//BigDecimal k31 = new BigDecimal("3.1");
		//BigDecimal PI = BigDecimal.ONE.divide(BigDecimal.valueOf(3),mc).divide(BigDecimal.valueOf(10),mc).add(k31);

		while (!isNegligible(PI.subtract(OldPI))) {
			nextIteration();

			k++;
			OldPI = PI;

			BigDecimal prvy = BigDecimal.ONE.divide(BigDecimal.valueOf(16.0)
					.pow(k, mc));// clen pred zatvrokou
			BigDecimal K = BigDecimal.valueOf(8.0).multiply(
					BigDecimal.valueOf(k), mc);
			BigDecimal a = BigDecimal.valueOf(4.0).divide(
					K.add(BigDecimal.valueOf(1.0)), mc);// prvy clen v zatvorke
			BigDecimal b = BigDecimal.valueOf(2.0).divide(
					K.add(BigDecimal.valueOf(4.0)), mc);
			BigDecimal c = BigDecimal.valueOf(1.0).divide(
					K.add(BigDecimal.valueOf(5.0)), mc);
			BigDecimal d = BigDecimal.valueOf(1.0).divide(
					K.add(BigDecimal.valueOf(6.0)), mc);
			PI = prvy.multiply(a.subtract(b).subtract(c).subtract(d), mc);
			PI = OldPI.add(PI);
		}
		return PI;
	}

}