package Operations;


import java.util.Arrays;

public class MatrizComplex {
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + columnas;
		result = prime * result + filas;
		result = prime * result + Arrays.deepHashCode(matriz);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MatrizComplex other = (MatrizComplex) obj;
		if (columnas != other.columnas)
			return false;
		if (filas != other.filas)
			return false;
		if (!Arrays.deepEquals(matriz, other.matriz))
			return false;
		return true;
	}

	private int filas, columnas;
	Complex[][] matriz;

	public MatrizComplex(int filas, int columnas) {
		// TODO Auto-generated constructor stub
		this.filas = filas;
		this.columnas = columnas;
		matriz = new Complex[filas][columnas];
	}

	public void addComplex(int fila, int columna, Complex number) {
		matriz[fila][columna] = number;
	}

	public Complex getPosition(int fila, int columna) {
		return matriz[fila][columna];
	}

	public int getFilas() {
		return filas;
	}

	public void setFilas(int filas) {
		this.filas = filas;
	}

	public int getColumnas() {
		return columnas;
	}

	public void setColumnas(int columnas) {
		this.columnas = columnas;
	}

	public String toString() {
		String matrix = "";
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				matrix += "  " + this.matriz[i][j];

			}
			matrix += "\n";

		}
		return matrix;
	}

}
