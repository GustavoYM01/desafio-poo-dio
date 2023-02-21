import java.time.LocalDate;

import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		Curso curso = new Curso("Java POO", "Do basico ao intermediario", 8);
		
		Mentoria mentoria = new Mentoria("Avancando em Java", 
				"Aprenda mais sobre essa linguagem orientada a objetos", LocalDate.now());
		
		Conteudo conteudo1 = new Curso("Estrutura de dados", "Principais conceitos", 10);
		Conteudo conteudo2 = new Mentoria("Avancando em estrutura de dados", 
				"Aprenda mais sobre estrutura de dados", LocalDate.now());
		
		System.out.println(curso);
		System.out.println(mentoria);
		
		System.out.println(conteudo1);
		System.out.println(conteudo2);

	}

}
