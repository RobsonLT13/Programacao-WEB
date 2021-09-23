package trabalho_sessoes;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletTela1Cadastro
 */
@WebServlet("/ServletCadastroEmpresa")
public class ServletCadastroEmpresa extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletCadastroEmpresa() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	doPost(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	PrintWriter resposta = response.getWriter();
    	
    	resposta.write("<html>");
        resposta.write("<head>");
        resposta.write("<title>Dados Profissionais</title>");
        resposta.write("</head>");
        resposta.write("<body>");
        resposta.write("Preencha seus dados profissionais:");
        resposta.write("<form action=\"ServletRegistroRealizado\">");

		HttpSession sessao = request.getSession();
		sessao.setAttribute("NOME", request.getParameter("nome"));
		sessao.setAttribute("SOBRENOME", request.getParameter("sobrenome"));
		sessao.setAttribute("RUA", request.getParameter("rua"));
		sessao.setAttribute("COMPLEMENTO", request.getParameter("complemento"));
		sessao.setAttribute("CIDADE", request.getParameter("cidade"));
		sessao.setAttribute("CEP", request.getParameter("cep"));
		sessao.setAttribute("ESTADO", request.getParameter("estado"));
		
        resposta.write("Empresa:<input type=\"text\" name=\"empresa\"> <BR>");
        resposta.write("Endereço profissional:<BR>");
        resposta.write("Rua: <input type=\"text\" name=\"ruaEmpresa\">");
        resposta.write("Complemento:<input type=\"text\" name=\"complementoEmpresa\"><BR>");
        resposta.write("Cidade:<input type=\"text\" name=\"cidadeEmpresa\">");
        resposta.write("CEP:<input type=\"text\" name=\"cepEmpresa\">");
        resposta.write("Estado:<input type=\"text\" name=\"estadoEmpresa\"><BR>");
        resposta.write("<input type=\"submit\" value=\"Confirmar\"><BR>");
        resposta.write("</form>");
        resposta.write("</body></html>");
    	
    }

}
