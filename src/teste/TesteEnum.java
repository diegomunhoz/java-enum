package teste;

import util.Cursos;

/**
 * Classe responsável por demonstrar a utilização de ENUM
 * 
 * @author Diego Munhoz
 * @since 07/04/2021
 * @version 1.0
 */
public class TesteEnum {

	public static void main(String[] args) {

		System.out.println("Curso de " + Cursos.JAVA + " duração de " + Cursos.JAVA.getHoras()
							+ " no período " + Cursos.JAVA.getPeriodo());
		
	
		System.out.println("Todos os Cursos");
		for (Cursos c : Cursos.values()) {
			System.out.println(c + " com total de horas " + c.getHoras());
		}
	
	}

}
