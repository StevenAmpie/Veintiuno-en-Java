package proyectosemestral;

public enum Tipodecarta {
	
	TREBOL("C"),
	DIAMANTE ("D"), 
	CORAZON ("H"),
	ESPADA ("S");
	
	String nombreTipodecarta;
	
	Tipodecarta(String nombreTipodecarta) {
		this.nombreTipodecarta = nombreTipodecarta;
	}
	
	public String toString() {
		return nombreTipodecarta;
	}

	public String getNombreTipodecarta() {
		return nombreTipodecarta;
	}
	
	
	
	
}
