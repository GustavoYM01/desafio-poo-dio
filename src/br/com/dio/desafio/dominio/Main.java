package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Curso curso = new Curso("Java poo", "Do basico ao intermediario", 8);
		
		Mentoria mentoria = new Mentoria("Avancando em Java", 
				"Aprenda mais sobre essa linguagem", LocalDate.now());
		
		System.out.println(curso);
		System.out.println(mentoria);
	}

}
