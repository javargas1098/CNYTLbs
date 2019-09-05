

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;





public class CalculatorTest {
	@Test
	void testSuma() {

		// TestCase
		Complex c1 = new Complex(4, 3);
		Complex c2 = new Complex(3, -1);
		Complex c3 = c1.sumComplex(c2);
		Complex answer = new Complex(7, 2);
		 //System.out.println(c3);

		// Respuesta
		assertEquals(answer,c3);
	}

	@Test
	void testResta() {

		// TestCase
		Complex c1 = new Complex(4, 3);
		Complex c2 = new Complex(3, -1);
		Complex c3 = c1.resComplex(c2);
		Complex answer = new Complex(1, 4);
		// System.out.println(c3);

		// Respuesta
		assertEquals(answer,c3);
	}

	@Test
	void testProducto() {

		// TestCase
		Complex c1 = new Complex(4, 3);
		Complex c2 = new Complex(3, -1);
		Complex c3 = c1.mulComplex(c2);
		Complex answer = new Complex(15, 5);
		//System.out.println(c3);

		// Respuesta
		assertEquals(answer,c3);
	}

	@Test
	void testDivision() {

		// TestCase
		Complex c1 = new Complex(4, 3);
		Complex c2 = new Complex(3, -1);
		Complex c3 = c1.divComplex(c2);
		Complex answer = new Complex(0.9, 1.3);
//		System.out.println(c3);

		// Respuesta 
		assertEquals(answer,c3);

	}

	@Test
	void testModulus() {

		// TestCase
		Complex c1 = new Complex(4, 3);
		double c2 = c1.setModule();;
//		System.out.println(c2);

		// Respuesta 
		assertEquals(5.0, c2);
	}

	@Test
	void testConjugate() {

		// TestCase
		Complex c1 = new Complex(4, 3);
		Complex c2 = new Complex(0, 0);
		Complex c3 = c2.conComplex(c1);
		Complex answer = new Complex(4, -3);
		//System.out.println(c3);

		// Respuesta 
		assertEquals(answer,c3);
	}



	@Test
	void testPolarToCartesian() {

		// TestCase
		Complex c1 = new Complex(0,0);
		Complex c2 = c1.setPolartoCartesian(5.0, 36.86989764584402);
		Complex answer = new Complex(4, 3);
		//System.out.println(c2);

		// Respuesta 
		assertEquals(answer,c2);

	}

	@Test
	void testCartesianToPolar() {

		// TestCase
		Complex c1 = new Complex(4, 3);
		Complex c2 = new Complex(0, 0);
		Complex c3 = c2.setCartesiantoPolar(c1);
		Complex answer = new Complex(5, 36.86989764584402);
		//System.out.println(c3);

		// Respuesta 
		assertEquals(answer,c3);

	}
	@Test
	void testPhase() {

		// TestCase
		Complex c1 = new Complex(4, 3);
		double c2 = c1.setFase();
		//System.out.println(c2);

		// Respuesta 
		assertEquals(0.6435011087932844, c2);
	}

}
