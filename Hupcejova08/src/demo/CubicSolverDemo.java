package demo;

import math.number.impl.Complex;
import math.number.impl.Real;
import math.polynomial.Polynomial;
import kubPol.CubicSolver;

public class CubicSolverDemo {
	public static void main(String[] args){
		CubicSolver riesenie = new CubicSolver();
		Real[] koeficienty ={new Real(2.0),new Real(-1.0),new Real(-2.0),new Real(1.0)};
		
		Polynomial<Real> polynom = new Polynomial<Real>(koeficienty);
		Complex[] korene=riesenie.getRoots(polynom);
		for (int i = 0; i<=2; i++) {
			System.out.println(korene[i]);
		}
		
		
	}
	
}
