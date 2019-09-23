package Operations;

public class VectorComplex extends MatrizComplex {

	public VectorComplex(int filas) {
		super(filas, 1);
		// TODO Auto-generated constructor stub
	}

	public VectorComplex(MatrizComplex m) {
		super(m.getFilas(), 1);
		if (m.getColumnas() == 1) {
			for (int i = 0; i < m.getFilas(); i++) {
				matriz[i][0] = m.getPosition(i, 0);
			}

		}
	}

	public void addToMatrix(int n, Complex c) {
		super.addComplex(n, 0, c);
	}

	public Complex getElement(int n) {
		return super.getPosition(n, 0);
	}

}
