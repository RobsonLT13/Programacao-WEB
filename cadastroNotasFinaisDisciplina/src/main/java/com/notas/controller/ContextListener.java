package com.notas.controller;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.notas.model.SistemaNotas;

@WebListener
public class ContextListener implements ServletContextListener {
	/*
	 * Classe para intanciar e guardar a refer�ncia do sistemaNotas(),
	 * para que qualquer servlet que seja criada possa acessar o sistema
	 */
	public static final String SISTEMA_NOTAS = "sistemaNotas";

	@Override
	public void contextInitialized(ServletContextEvent event) {
		// M�todo executado automaticamente quando o sistema se inicia
		ServletContext context = event. getServletContext();
		context.setAttribute(SISTEMA_NOTAS, new SistemaNotas());
	}

	@Override
	public void contextDestroyed(ServletContextEvent event) {
		// M�todo executado automaticamente quando o sistema � finalizado
		ServletContext context = event.getServletContext();
		context.removeAttribute(SISTEMA_NOTAS);
	}
	
}
