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
 * Servlet implementation class ServletPaginaAgenda
 */
@WebServlet("/ServletPaginaAgenda")
public class ServletPaginaAgenda extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletPaginaAgenda() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	PrintWriter saida = response.getWriter();
    	saida.write("<HTML><BODY>");
    	saida.write("<h2>Registro</h2><br>");
    	saida.write("<form action='ServletAgenda' method='get'>");
    	saida.write("Nome:<br> <input type='text' name='Nome' /> <br>");
    	saida.write("Telefone:<br> <input type='text' name='Telefone' /> <br>");
    	saida.write("Data de nascimento(dd-mm-aaaa):<br> <input type='text' name='Data de Nascimento' /> <br><br>");
    	saida.write("<input type=submit value=Enviar />");
    	saida.write("</form>");
    	saida.write("</BODY></HTML>");
    	saida.close();
    }

}

