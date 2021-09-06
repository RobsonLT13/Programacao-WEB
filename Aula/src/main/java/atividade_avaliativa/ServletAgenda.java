package atividade_avaliativa;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletAgenda
 */
@WebServlet("/ServletAgenda")
public class ServletAgenda extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletAgenda() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter saida = response.getWriter();
    	saida.write("<HTML><BODY>");
    	saida.write("<h2>Agenda</h2><br>");
    	
    	Enumeration<String> nomesParametros = request.getParameterNames();
    	
    	while (nomesParametros.hasMoreElements()) {
    		String valorParametro = nomesParametros.nextElement().toString();
    		saida.write(valorParametro);
    		saida.write(": ");
    		saida.write(request.getParameter(valorParametro));
    		saida.write("<br>");
		}
    	
    	saida.write("</BODY></HTML>");
    	saida.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
