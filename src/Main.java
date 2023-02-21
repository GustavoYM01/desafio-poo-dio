import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso("Java POO", "Do basico ao intermediario", 8);
		
		Curso curso2 = new Curso("JavaScript", "Do basico ao avancado", 14);
		
		Mentoria mentoria = new Mentoria("Avancando em Java", 
				"Aprenda mais sobre essa linguagem orientada a objetos", LocalDate.now());
		
		Conteudo conteudo1 = new Curso("Estrutura de dados", "Principais conceitos", 10);
		
		Conteudo conteudo2 = new Mentoria("Avancando em estrutura de dados", 
				"Aprenda mais sobre estrutura de dados", LocalDate.now());
		
		Bootcamp bootcamp = new Bootcamp();
		
		bootcamp.setNome("Bootcamp Java Master");
		bootcamp.setDescricao("Bootcamp para impulsionar seus conhecimentos em Java");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devPedro = new Dev();
		
		devPedro.setNome("Pedro");
		devPedro.inscreverBootcamp(bootcamp);
		
		System.out.println("Conteudos em que Pedro esta inscrito: " + devPedro.getConteudosInscritos());
		
		devPedro.progredir();
		devPedro.progredir();
		devPedro.progredir();
		
		System.out.println("==================");
		System.out.println("Conteudos em que Pedro esta inscrito: " + devPedro.getConteudosInscritos());
		System.out.println("Conteudos que Pedro concluiu: " + devPedro.getConteudosConcluidos());
		System.out.println("XP: " + devPedro.calcularTotalXp());

	}

}
