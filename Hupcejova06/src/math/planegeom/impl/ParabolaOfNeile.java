package math.planegeom.impl;

import math.planegeom.AbstractCartesianPlaneCurve;
import math.realfunction.RealFunction;
import math.realfunction.elementary.RealPolynomial;

/**
 * 
 * Trieda sluzi na vytvorenie Neilovej paraboly(semikubicka parabola), ktora ma
 * parametricke vyjadrenie x = t^2 a y = t^3. Tato parabola je zaujimava tym, ze
 * sa jej graf vykresluje len v 1. a 4. kvadrante suradnicovej sustavy.
 * 
 */

public class ParabolaOfNeile extends AbstractCartesianPlaneCurve {

	private double a;

	private RealFunction xFunction;

	private RealFunction yFunction;

	public ParabolaOfNeile(double a) {// konstruktor
		super(-1, 1);

		checkFinite(a, "a");

		if (a == 0.0) {
			throw new IllegalArgumentException("a musi byt rozne od 0.0");// inak
																			// dostaneme
																			// nulovu
																			// funkciu,
																			// co
																			// nechceme
		}

		this.a = a;

		this.xFunction = new RealPolynomial(0, 0, 1);// priradi x-ovej suradnici
														// polynom tvaru 1.t^2 +
														// 0.t + 0

		this.yFunction = new RealPolynomial(0, 0, 0, a);// y-ova suradnica bude
														// polynom a.t^3 + 0.t^2
														// + 0.t + 0
	}

	@Override
	public RealFunction getXFunction() {
		return xFunction;
	}

	@Override
	public RealFunction getYFunction() {
		return yFunction;
	}

	public double getA() {
		return a;
	}

	@Override
	public String toString() {
		return "Parabola[y=" + yFunction.toString() + "]";
	}

}
