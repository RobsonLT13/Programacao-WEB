package com.notas.model;

public class Disciplina {
	// Classe para para receber os dados que entrariam no banco de dados
	
	// Define os atributos e os tipos de dados que ser�o recebidos
	private String nomeDisciplina;
	private Double nota;
	
	// M�todos Getters e Setters
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
	
	// M�todo que retorna um texto para informar se est� aprovado ou reprovado
	public String getResultado() {
		if (this.nota >= 5) {
			return "Aprovado";
		} else {
			return "Reprovado";
		}
	}

}
