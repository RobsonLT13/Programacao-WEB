package com.notas.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.notas.model.Disciplina;
import com.notas.model.SistemaNotas;

/**
 * Servlet implementation class ServletControlador
 */
@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletControlador() {
        super();
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Define uma vari�vel para receber o valor do par�metro acao
		String acao = request.getParameter("acao");
		
		// Define uma vari�vel para pegar o ojeto intanciado na classe ContextListener
		
		SistemaNotas sistema = (SistemaNotas) getServletContext().getAttribute(ContextListener.SISTEMA_NOTAS);
		
		// O usu�rio ser� redirecionado para esta p�gina assim que esteja autenticado
		String resp = "menu.jsp";;
		
		HttpSession sessao = request.getSession(false);
        
		if (sessao == null || sessao.getAttribute(ServletControladorAutentica.USUARIO) == null) {
        	/*
        	 * Redireciona o usu�rio para a p�gina de autentica��o,se a sess�o for nula, ou, 
        	 * se o usu�rio n�o estiver autenticado
        	 */
        	resp = "autentica.jsp";
        } else {
        	// De acordo com a acao requisita, a variavel resp receber� o caminho que ser� redirecionado
        	if ("cadastrar".equals(acao)) {
        		resp = "cadastroDisciplinas.jsp";
        	} else if ("confirmarCadastro".equals(acao)) {
        		/*
        		 * Grava os dados inseridos pelo usu�rio no objeto d, 
        		 * para adicion�-los numa lista que ser� apresentada em "listaDisciplinas.jsp"
        		 */
        		Disciplina d = new Disciplina();
        		d.setNomeDisciplina(request.getParameter("nomeDisciplina"));
        		d.setNota(Double.valueOf(request.getParameter("nota")));
        		sistema.adicionar(d);
        		request.setAttribute("lista", sistema.consultarNotas());
        		resp= "listaDisciplinas.jsp";
        	} else if ("consultar".equals(acao)) {
        		request.setAttribute("lista", sistema.consultarNotas());
        		resp = "listaDisciplinas.jsp";
        	} else if ("sair".equals(acao)) {
        		sessao.invalidate();
        		resp = "autentica.jsp";
			}	
		}
		// Respons�vel por redirecionar � pagina.jsp correta
		request.getRequestDispatcher(resp).forward(request, response);
	}
	
}
