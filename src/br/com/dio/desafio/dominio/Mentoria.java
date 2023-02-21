package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
	
	private LocalDate data;
	
	@Override
	public double calcularXp() {
		return XP_PADRAO + 20;
	}
		
	public Mentoria() {
	}
	
	public Mentoria(String titulo, String descricao, LocalDate data) {
		setTitulo(titulo);
		setDescricao(descricao);
		this.data = data;
	}
	
	public LocalDate getData() {
		return data;
	}
	
	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Mentoria [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", data=" + data + "]";
	}
	
}
