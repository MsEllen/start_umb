package demo;

import math.planegeom.impl.ParabolaOfNeile;
import math.ui.chart.ChartFrame;

public class ParabolOfNeileDemo {

	private static ChartFrame frame;

	/**
	 * Tato trieda sluzi na vykreslenie grafu prislusnej paraboly.
	 */
	public static void main(String[] args) {
		frame = new ChartFrame("ParabolOfNeileDemo");

		demoParabolOfNeil();

		frame.showOnScreen();

	}

	private static void demoParabolOfNeil() {
		frame.addPlaneCurve(new ParabolaOfNeile(700000));
		frame.addPlaneCurve(new ParabolaOfNeile(1000600));
	}
}
