import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		Curso curso = new Curso("Java POO", "Do basico ao intermediario", 8);
		
		Mentoria mentoria = new Mentoria("Avancando em Java", 
				"Aprenda mais sobre essa linguagem orientada a objetos", LocalDate.now());
		
		System.out.println(curso);
		System.out.println(mentoria);

	}

}
