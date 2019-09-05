

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;





public class MatrixTest {

	@Test
	void testMatSuma() {
		// TestCase
		MatrizComplex mat1 = new MatrizComplex(2, 2);
		MatrizComplex mat2 = new MatrizComplex(2, 2);

		MatrizComplex mat3 = new MatrizComplex(2, 2);
		// math1
		Complex c1 = new Complex(2, 2);
		Complex c2 = new Complex(2, 0);
		Complex c3 = new Complex(1, -4);
		Complex c4 = new Complex(0, 0);
		// mat2
		Complex c7 = new Complex(3, 0);
		Complex c8 = new Complex(1, 4);
		Complex c9 = new Complex(2, 2);
		Complex c10 = new Complex(5, 0);
		// math answer
		Complex c5 = new Complex(5, 2);
		Complex c6 = new Complex(3, 4);
		Complex c11 = new Complex(3, -2);
		Complex c12 = new Complex(5, 0);

		mat1.addComplex(0, 0, c1);
		mat1.addComplex(0, 1, c2);
		mat1.addComplex(1, 0, c3);
		mat1.addComplex(1, 1, c4);

		mat2.addComplex(0, 0, c7);
		mat2.addComplex(0, 1, c8);
		mat2.addComplex(1, 0, c9);
		mat2.addComplex(1, 1, c10);

		mat3.addComplex(0, 0, c5);
		mat3.addComplex(0, 1, c6);
		mat3.addComplex(1, 0, c11);
		mat3.addComplex(1, 1, c12);

		MatrizComplex mathfinal = MatrixCalculator.sumMatrix(mat1, mat2);

		// System.out.println(mathfinal.toString());

		// Respuesta
		assertEquals(mat3, mathfinal);

	}

	@Test
	void testMatResta() {
		// TestCase
		MatrizComplex mat1 = new MatrizComplex(2, 2);
		MatrizComplex mat2 = new MatrizComplex(2, 2);

		MatrizComplex mat3 = new MatrizComplex(2, 2);
		// math1
		Complex c1 = new Complex(2, 2);
		Complex c2 = new Complex(2, 0);
		Complex c3 = new Complex(1, -4);
		Complex c4 = new Complex(0, 0);
		// mat2
		Complex c7 = new Complex(3, 0);
		Complex c8 = new Complex(1, 4);
		Complex c9 = new Complex(2, 2);
		Complex c10 = new Complex(5, 0);
		// math answer
		Complex c5 = new Complex(-1, 2);
		Complex c6 = new Complex(1, -4);
		Complex c11 = new Complex(-1, -6);
		Complex c12 = new Complex(-5, 0);

		mat1.addComplex(0, 0, c1);
		mat1.addComplex(0, 1, c2);
		mat1.addComplex(1, 0, c3);
		mat1.addComplex(1, 1, c4);

		mat2.addComplex(0, 0, c7);
		mat2.addComplex(0, 1, c8);
		mat2.addComplex(1, 0, c9);
		mat2.addComplex(1, 1, c10);

		mat3.addComplex(0, 0, c5);
		mat3.addComplex(0, 1, c6);
		mat3.addComplex(1, 0, c11);
		mat3.addComplex(1, 1, c12);

		MatrizComplex mathfinal = MatrixCalculator.resMatrix(mat1, mat2);

		// System.out.println(mathfinal.toString());

		// Respuesta
		assertEquals(mat3, mathfinal);

	}

	@Test
	void testMatScalar() {
		// TestCase
		MatrizComplex mat1 = new MatrizComplex(2, 2);

		MatrizComplex mat3 = new MatrizComplex(2, 2);
		// math1
		Complex c1 = new Complex(2, 2);
		Complex c2 = new Complex(2, 0);
		Complex c3 = new Complex(1, -4);
		Complex c4 = new Complex(0, 0);
		// scalar
		Complex c8 = new Complex(1, 4);
		// math answer
		Complex c5 = new Complex(-6, 10);
		Complex c6 = new Complex(2, 8);
		Complex c11 = new Complex(17, 0);
		Complex c12 = new Complex(0, 0);

		mat1.addComplex(0, 0, c1);
		mat1.addComplex(0, 1, c2);
		mat1.addComplex(1, 0, c3);
		mat1.addComplex(1, 1, c4);

		mat3.addComplex(0, 0, c5);
		mat3.addComplex(0, 1, c6);
		mat3.addComplex(1, 0, c11);
		mat3.addComplex(1, 1, c12);

		MatrizComplex mathfinal = MatrixCalculator.scalarMatrix(c8, mat1);

		// System.out.println(mathfinal.toString());

		// Respuesta
		assertEquals(mat3, mathfinal);

	}

	@Test
	void testMatTraspuesta() {
		// TestCase
		MatrizComplex mat1 = new MatrizComplex(2, 2);

		MatrizComplex mat3 = new MatrizComplex(2, 2);
		// math1
		Complex c1 = new Complex(2, 2);
		Complex c2 = new Complex(2, 0);
		Complex c3 = new Complex(1, -4);
		Complex c4 = new Complex(0, 0);

		// math answer
		Complex c5 = new Complex(2, 2);
		Complex c6 = new Complex(1, -4);
		Complex c11 = new Complex(2, 0);
		Complex c12 = new Complex(0, 0);

		mat1.addComplex(0, 0, c1);
		mat1.addComplex(0, 1, c2);
		mat1.addComplex(1, 0, c3);
		mat1.addComplex(1, 1, c4);

		mat3.addComplex(0, 0, c5);
		mat3.addComplex(0, 1, c6);
		mat3.addComplex(1, 0, c11);
		mat3.addComplex(1, 1, c12);

		MatrizComplex mathfinal = MatrixCalculator.trasMatrix(mat1);

		// System.out.println(mathfinal.toString());

		// Respuesta
		assertEquals(mat3, mathfinal);

	}

	@Test
	void testMatConju() {
		// TestCase
		MatrizComplex mat1 = new MatrizComplex(2, 2);

		MatrizComplex mat3 = new MatrizComplex(2, 2);
		// math1
		Complex c1 = new Complex(2, 2);
		Complex c2 = new Complex(2, 0);
		Complex c3 = new Complex(1, -4);
		Complex c4 = new Complex(0, 0);

		// math answer
		Complex c5 = new Complex(2, -2);
		Complex c6 = new Complex(2, 0);
		Complex c11 = new Complex(1, 4);
		Complex c12 = new Complex(0, 0);

		mat1.addComplex(0, 0, c1);
		mat1.addComplex(0, 1, c2);
		mat1.addComplex(1, 0, c3);
		mat1.addComplex(1, 1, c4);

		mat3.addComplex(0, 0, c5);
		mat3.addComplex(0, 1, c6);
		mat3.addComplex(1, 0, c11);
		mat3.addComplex(1, 1, c12);

		MatrizComplex mathfinal = MatrixCalculator.conMatrix(mat1);

		// System.out.println(mathfinal.toString());
		// System.out.println(mat3.toString());

		// Respuesta
		assertEquals(mat3, mathfinal);

	}

	@Test
	void testMatAdj() {
		// TestCase
		MatrizComplex mat1 = new MatrizComplex(2, 2);

		MatrizComplex mat3 = new MatrizComplex(2, 2);
		// math1
		Complex c1 = new Complex(2, 2);
		Complex c2 = new Complex(2, 0);
		Complex c3 = new Complex(1, -4);
		Complex c4 = new Complex(0, 0);

		// math answer
		Complex c5 = new Complex(2, -2);
		Complex c6 = new Complex(1, 4);
		Complex c11 = new Complex(2, -0);
		Complex c12 = new Complex(0, -0);

		mat1.addComplex(0, 0, c1);
		mat1.addComplex(0, 1, c2);
		mat1.addComplex(1, 0, c3);
		mat1.addComplex(1, 1, c4);

		mat3.addComplex(0, 0, c5);
		mat3.addComplex(0, 1, c6);
		mat3.addComplex(1, 0, c11);
		mat3.addComplex(1, 1, c12);

		MatrizComplex mathfinal = MatrixCalculator.adjMatrix(mat1);

		// System.out.println(mathfinal.toString());
		// System.out.println(mat3.toString());

		// Respuesta
		assertEquals(mat3, mathfinal);

	}

	@Test
	void testMatMul() {
		// TestCase
		MatrizComplex mat1 = new MatrizComplex(2, 2);
		MatrizComplex mat2 = new MatrizComplex(2, 2);

		MatrizComplex mat3 = new MatrizComplex(2, 2);
		// math1
		Complex c1 = new Complex(2, 2);
		Complex c2 = new Complex(2, 0);
		Complex c3 = new Complex(1, -4);
		Complex c4 = new Complex(0, 0);
		// mat2
		Complex c7 = new Complex(3, 0);
		Complex c8 = new Complex(1, 4);
		Complex c9 = new Complex(2, 2);
		Complex c10 = new Complex(5, 0);
		// math answer
		Complex c5 = new Complex(10, 10);
		Complex c6 = new Complex(4, 10);
		Complex c11 = new Complex(3, -12);
		Complex c12 = new Complex(17, 0);

		mat1.addComplex(0, 0, c1);
		mat1.addComplex(0, 1, c2);
		mat1.addComplex(1, 0, c3);
		mat1.addComplex(1, 1, c4);

		mat2.addComplex(0, 0, c7);
		mat2.addComplex(0, 1, c8);
		mat2.addComplex(1, 0, c9);
		mat2.addComplex(1, 1, c10);

		mat3.addComplex(0, 0, c5);
		mat3.addComplex(0, 1, c6);
		mat3.addComplex(1, 0, c11);
		mat3.addComplex(1, 1, c12);

		MatrizComplex mathfinal = MatrixCalculator.mulMatriz(mat1, mat2);

		// System.out.println(mathfinal.toString());

		// Respuesta
		assertEquals(mat3, mathfinal);

	}
	@Test
	void testMatAc() {
		// TestCase
		MatrizComplex mat1 = new MatrizComplex(2, 2);
		MatrizComplex mat2 = new MatrizComplex(2, 2);

		MatrizComplex mat3 = new MatrizComplex(2, 2);
		// math1
		Complex c1 = new Complex(2, 2);
		Complex c2 = new Complex(2, 0);
		Complex c3 = new Complex(1, -4);
		Complex c4 = new Complex(0, 0);
		// mat2
		Complex c7 = new Complex(3, 0);
		Complex c8 = new Complex(1, 4);
		Complex c9 = new Complex(2, 2);
		Complex c10 = new Complex(5, 0);
		// math answer
		Complex c5 = new Complex(10, 10);
		Complex c6 = new Complex(4, 10);
		Complex c11 = new Complex(3, -12);
		Complex c12 = new Complex(17, 0);

		mat1.addComplex(0, 0, c1);
		mat1.addComplex(0, 1, c2);
		mat1.addComplex(1, 0, c3);
		mat1.addComplex(1, 1, c4);

		mat2.addComplex(0, 0, c7);
		mat2.addComplex(0, 1, c8);
		mat2.addComplex(1, 0, c9);
		mat2.addComplex(1, 1, c10);

		mat3.addComplex(0, 0, c5);
		mat3.addComplex(0, 1, c6);
		mat3.addComplex(1, 0, c11);
		mat3.addComplex(1, 1, c12);

		MatrizComplex mathfinal = MatrixCalculator.actionMatrix(mat1, mat2);

		// System.out.println(mathfinal.toString());

		// Respuesta
		assertEquals(mat3, mathfinal);

	}

	@Test
	void testMatNor() {
		// TestCase
		MatrizComplex mat1 = new MatrizComplex(2, 2);

		Double mat3 = new Double(40.31370849898476);
		// math1
		Complex c1 = new Complex(2, 2);
		Complex c2 = new Complex(2, 0);
		Complex c3 = new Complex(1, -4);
		Complex c4 = new Complex(0, 0);

		mat1.addComplex(0, 0, c1);
		mat1.addComplex(0, 1, c2);
		mat1.addComplex(1, 0, c3);
		mat1.addComplex(1, 1, c4);

		Double rfinal = MatrixCalculator.norMatriz(mat1);

		// System.out.println(rfinal);

		// Respuesta
		assertEquals(mat3, rfinal);
	}

	@Test
	void testMatDis() {
		// TestCase
		MatrizComplex mat1 = new MatrizComplex(2, 2);
		MatrizComplex mat2 = new MatrizComplex(2, 2);

		Double mat3 = new Double(140.5685424949238);
		// math1
		Complex c1 = new Complex(2, 2);
		Complex c2 = new Complex(2, 0);
		Complex c3 = new Complex(1, -4);
		Complex c4 = new Complex(0, 0);
		// mat2
		Complex c7 = new Complex(3, 0);
		Complex c8 = new Complex(1, 4);
		Complex c9 = new Complex(2, 2);
		Complex c10 = new Complex(5, 0);

		mat1.addComplex(0, 0, c1);
		mat1.addComplex(0, 1, c2);
		mat1.addComplex(1, 0, c3);
		mat1.addComplex(1, 1, c4);

		mat2.addComplex(0, 0, c7);
		mat2.addComplex(0, 1, c8);
		mat2.addComplex(1, 0, c9);
		mat2.addComplex(1, 1, c10);

		Double mfinal = MatrixCalculator.disMatriz(mat1, mat2);

		// System.out.println(mfinal);

		// Respuesta
		assertEquals(mat3, mfinal);

	}

	@Test
	void testMatHer() {
		// TestCase
		MatrizComplex mat1 = new MatrizComplex(2, 2);
		MatrizComplex mat2 = new MatrizComplex(2, 2);

		Boolean mat3 = false;
		Boolean mat4 = true;
		// math1
		Complex c1 = new Complex(2, 2);
		Complex c2 = new Complex(2, 0);
		Complex c3 = new Complex(1, -4);
		Complex c4 = new Complex(0, 0);

		Complex c5 = new Complex(7, 0);
		Complex c6 = new Complex(6, 5);
		Complex c7 = new Complex(6, -5);
		Complex c8 = new Complex(-3, 0);

		mat1.addComplex(0, 0, c1);
		mat1.addComplex(0, 1, c2);
		mat1.addComplex(1, 0, c3);
		mat1.addComplex(1, 1, c4);

		mat2.addComplex(0, 0, c5);
		mat2.addComplex(0, 1, c6);
		mat2.addComplex(1, 0, c7);
		mat2.addComplex(1, 1, c8);

		Boolean mfinal1 = MatrixCalculator.isHermitian(mat2);
		Boolean mfinal = MatrixCalculator.isHermitian(mat1);

		// System.out.println(mfinal);

		// Respuesta
		assertEquals(mat3, mfinal);
		assertEquals(mat4, mfinal1);

	}

	@Test
	void testMatTen() {
		// TestCase
		MatrizComplex mat1 = new MatrizComplex(2, 2);
		MatrizComplex mat2 = new MatrizComplex(2, 2);

		MatrizComplex mat3 = new MatrizComplex((mat1.getFilas() * mat2.getFilas()),
				(mat1.getColumnas() * mat2.getColumnas()));

		// math1
		Complex c1 = new Complex(2, 2);
		Complex c2 = new Complex(2, 0);
		Complex c3 = new Complex(1, -4);
		Complex c4 = new Complex(0, 0);
		// mat2
		Complex c7 = new Complex(3, 0);
		Complex c8 = new Complex(1, 4);
		Complex c9 = new Complex(2, 2);
		Complex c10 = new Complex(5, 0);
		// math answer
		Complex c5 = new Complex(6, 6);
		Complex c6 = new Complex(-6, 10);
		Complex c11 = new Complex(6, 0);
		Complex c12 = new Complex(2, 8);
		Complex c13 = new Complex(0, 8);
		Complex c14 = new Complex(10, 10);
		Complex c15 = new Complex(4, 4);
		Complex c16 = new Complex(10, 0);
		Complex c17 = new Complex(3, -12);
		Complex c18 = new Complex(17, 0);
		Complex c19 = new Complex(0, 0);
		Complex c20 = new Complex(0, 0);
		Complex c21 = new Complex(10, -6);
		Complex c22 = new Complex(5, -20);
		Complex c23 = new Complex(0, 0);
		Complex c24 = new Complex(0, 0);

		// mat1
		mat1.addComplex(0, 0, c1);
		mat1.addComplex(0, 1, c2);
		mat1.addComplex(1, 0, c3);
		mat1.addComplex(1, 1, c4);
		// mat2
		mat2.addComplex(0, 0, c7);
		mat2.addComplex(0, 1, c8);
		mat2.addComplex(1, 0, c9);
		mat2.addComplex(1, 1, c10);
		// math answer

		mat3.addComplex(0, 0, c5);
		mat3.addComplex(0, 1, c6);
		mat3.addComplex(0, 2, c11);
		mat3.addComplex(0, 3, c12);

		mat3.addComplex(1, 0, c13);
		mat3.addComplex(1, 1, c14);
		mat3.addComplex(1, 2, c15);
		mat3.addComplex(1, 3, c16);

		mat3.addComplex(2, 0, c17);
		mat3.addComplex(2, 1, c18);
		mat3.addComplex(2, 2, c19);
		mat3.addComplex(2, 3, c20);

		mat3.addComplex(3, 0, c21);
		mat3.addComplex(3, 1, c22);
		mat3.addComplex(3, 2, c23);
		mat3.addComplex(3, 3, c24);

		MatrizComplex mathfinal = MatrixCalculator.tenMatriz(mat1, mat2);

		// System.out.println(mathfinal.toString());

		// Respuesta
		assertEquals(mat3, mathfinal);

	}

	@Test
	void testMatUni() {
		// TestCase
		MatrizComplex mat1 = new MatrizComplex(2, 2);
		MatrizComplex mat3 = new MatrizComplex(2, 2);

		Boolean mat4 = false;
		Boolean mat5 = true;

		// math1
		Complex c1 = new Complex(1, 0);
		Complex c2 = new Complex(0, 0);
		Complex c3 = new Complex(0, 0);
		Complex c4 = new Complex(0, 1);

		// math answer
		Complex c5 = new Complex(2, 0);
		Complex c6 = new Complex(0, 2);
		Complex c11 = new Complex(4, 4);
		Complex c12 = new Complex(1, 0);

		mat1.addComplex(0, 0, c1);
		mat1.addComplex(0, 1, c2);
		mat1.addComplex(1, 0, c3);
		mat1.addComplex(1, 1, c4);

		mat3.addComplex(0, 0, c5);
		mat3.addComplex(0, 1, c6);
		mat3.addComplex(1, 0, c11);
		mat3.addComplex(1, 1, c12);

		Boolean mfinal = MatrixCalculator.isUnitari(mat1);
		Boolean mfinal2 = MatrixCalculator.isUnitari(mat3);

		// System.out.println(mfinal);

		// Respuesta
		assertEquals(mat5, mfinal);
		assertEquals(mat4, mfinal2);

	}

}
