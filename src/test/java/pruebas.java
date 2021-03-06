import static org.junit.jupiter.api.Assertions.assertEquals;

import Operations.Complex;
import Operations.MatrixCalculator;
import Operations.MatrizComplex;
import Operations.VectorComplex;

public class pruebas {
	public static void main(String[] args) {

//		Complex c1 = new Complex(1, 0);
//		Complex c2 = new Complex(0, 0);
//		Complex c3 = new Complex(0, 0);
//		Complex c4 = new Complex(0, 1);
//
//		Complex c7 = new Complex(3, 0);
//		Complex c8 = new Complex(1, 4);
//		Complex c9 = new Complex(2, 2);
//		Complex c10 = new Complex(5, 0);
//
//		MatrizComplex mat1 = new MatrizComplex(2, 2);
//		MatrizComplex mat2 = new MatrizComplex(2, 2);
//
//		mat1.addComplex(0, 0, c1);
//		mat1.addComplex(0, 1, c2);
//		mat1.addComplex(1, 0, c3);
//		mat1.addComplex(1, 1, c4);
//
//		mat2.addComplex(0, 0, c7);
//		mat2.addComplex(0, 1, c8);
//		mat2.addComplex(1, 0, c9);
//		mat2.addComplex(1, 1, c10);

		// System.out.println(mat1.toString());
		// System.out.println(mat2.toString());

		// System.out.println(c4.setModule());
		// System.out.println(c3.setPolartoCartesian(6.4, 51).toString());
		// System.out.println(MatrixCalculator.tenMatriz(mat1,mat2).toString());
		//System.out.println(MatrixCalculator.isUnitari(mat1));
		// System.out.println(c1.divComplex(c2).toString());
		// System.out.println(c1.mulComplex(c2).toString());
		MatrizComplex mat1 = new MatrizComplex(2, 2);
		 VectorComplex v1 = new VectorComplex(2);

		MatrizComplex mat3 = new MatrizComplex(2, 1);
		// math1
		Complex c1 = new Complex(2, 2);
		Complex c2 = new Complex(2, 0);
		Complex c3 = new Complex(1, -4);
		Complex c4 = new Complex(0, 0);
		// v1
		Complex c7 = new Complex(3, 0);
		Complex c8 = new Complex(1, 4);
		Complex c9 = new Complex(2, 2);
		Complex c10 = new Complex(5, 0);
		// math answer
		Complex c5 = new Complex(8, 14);
		Complex c11 = new Complex(3, -12);

		mat1.addComplex(0, 0, c1);
		mat1.addComplex(0, 1, c2);
		mat1.addComplex(1, 0, c3);
		mat1.addComplex(1, 1, c4);

		v1.addToMatrix(0, c7);
		v1.addToMatrix(1, c8);

		mat3.addComplex(0, 0, c5);
		mat3.addComplex(1, 0, c11);

		MatrizComplex mathfinal = MatrixCalculator.actionMatrix(mat1, v1);

		 System.out.println(mathfinal.toString());
		 System.out.println(mat3.toString());
		 
		 assertEquals(mathfinal.toString(), mat3.toString());
	}

}
