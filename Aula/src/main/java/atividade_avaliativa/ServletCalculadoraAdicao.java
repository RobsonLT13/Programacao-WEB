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
 * Servlet implementation class ServletCalculadoraAdicao
 */
@WebServlet("/ServletCalculadoraAdicao")
public class ServletCalculadoraAdicao extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet() saida.write("+" );
     */
    public ServletCalculadoraAdicao() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter saida = response.getWriter();
    	saida.write("<HTML><BODY>");
    	saida.write("Calculadora <br><br>");

    	Enumeration<String> nomesParametros = request.getParameterNames();
    	int soma = 0;
    	while (nomesParametros.hasMoreElements()) {
    		String parametro = nomesParametros.nextElement().toString();
    		saida.write(request.getParameter(parametro));
    		if (nomesParametros.hasMoreElements()) {
    			saida.write(" + ");
    		}
    		String valor = request.getParameter(parametro);
            int valorconvertido = Integer.parseInt(valor);
    		soma += valorconvertido;
		}
    	saida.write(" = " + soma);
    	saida.write("</BODY></HTML>");
    	saida.close();
	}

}
