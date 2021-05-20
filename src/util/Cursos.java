package util;

/**
 * Classe responsável por demonstrar o conceito de ENUM
 * 
 * @author Diego Munhoz
 * @since 07/04/2021
 * @version 1.0
 */
public enum Cursos {
	
	JAVA(180, "Noturno"),
	COBOL(160, "Vespertino"),
	PHP(40, "Noturno/Vespertino"),
	UNITY(100, "Diurno");
	
	private int horas;
	private String periodo;
	
	Cursos(int horas, String periodo) {
		this.horas = horas;
		this.periodo = periodo;
	}
	
	public int getHoras() {
		return horas;
	}
	
	public String getPeriodo() {
		return periodo;
	}

}
