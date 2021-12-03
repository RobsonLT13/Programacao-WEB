package com.notas.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletControladorAutentica
 */
@WebServlet("/ServletControladorAutentica")
public class ServletControladorAutentica extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletControladorAutentica() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public static final String USUARIO = "user";

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Servlet responsável por permitir que os usuário autorizados acessem o sistema
		PrintWriter resposta = response.getWriter();
		
		resposta.write("<html><body>");
		
		String nomeUsuario = request.getParameter(USUARIO);
		String senhaUsuario = request.getParameter("password");
		/*
		 * Verifica se o usuário e a senha digitados são válidos
		 * Se sim, envia para a ServletControlador 
		 * Senão, apresenta uma mensagem informando a situação
		 */
		if (autenticar(nomeUsuario,senhaUsuario)) {
			HttpSession sessao = request.getSession();
			sessao.setAttribute(USUARIO, nomeUsuario);
			request.getRequestDispatcher("ServletControlador").forward(request, response);
		} else {
			resposta.write("O usuário e a senha são inválidos.<br><br>");
			resposta.write("<a href=\"autentica.jsp\">Voltar</a>");
		}
		resposta.write("</body></html>");
	}
		
	private boolean autenticar(String usuario, String senha) {
		// Função responsável pela aautenticação do sistema
		if (usuario.equals("professor") && senha.equals("Progweb2021")) {
			return true;
		}			
		return false;
	}

}