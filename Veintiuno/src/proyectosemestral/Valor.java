package proyectosemestral;

public enum Valor {
	
	DOS ("2", 2),
	TRES ("3", 3),
	CUATRO ("4", 4),
	CINCO ("5", 5),
	SEIS ("6", 6),
	SIETE ("7", 7),
	OCHO ("8", 8),
	NUEVE ("9", 9),
	DIEZ ("10", 10),
	J ("J", 10),
	Q ("Q", 10),
	K ("K", 10),
	A ("A", 11);
	
	String nombreValor;
	int numeroValor;
	
	Valor(String nombreValor, int numeroValor) {
		this.nombreValor = nombreValor;
		this.numeroValor = numeroValor;
	}
	
	public String toString() {
		return nombreValor;
	}

	public String getNombreValor() {
		return nombreValor;
	}

	public int getNumeroValor() {
		return numeroValor;
	}
	
	
	
	
}
