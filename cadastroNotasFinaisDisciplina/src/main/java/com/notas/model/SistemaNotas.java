package com.notas.model;

import java.util.ArrayList;
import java.util.List;


public class SistemaNotas {
	/*
	 * Classe que faria a comunicação com o banco de dados.
	 * Nesse caso, os objetos da classe Disciplina serão armazenados
	 * numa lista
	 */
	
	// Lista de objetos da classe Encontro
	private List<Disciplina> notas = new ArrayList<Disciplina>();
	
	public void adicionar(Disciplina d) {
		// Adiciona o objeto d na lista notas
		notas.add(d);
	}
	
	public List<Disciplina> consultarNotas() {
		// Retorna a lista notas 
		return notas;
	}
}
