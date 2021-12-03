package com.notas.model;

public class Disciplina {
	// Classe para para receber os dados que entrariam no banco de dados
	
	// Define os atributos e os tipos de dados que serão recebidos
	private String nomeDisciplina;
	private Double nota;
	
	// Métodos Getters e Setters
	public String getNomeDisciplina() {
		return nomeDisciplina;
	}
	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}
	public Double getNota() {
		return nota;
	}
	public void setNota(Double nota) {
		this.nota = nota;
	}
	
	// Método que retorna um texto para informar se está aprovado ou reprovado
	public String getResultado() {
		if (this.nota >= 5) {
			return "Aprovado";
		} else {
			return "Reprovado";
		}
	}

}
