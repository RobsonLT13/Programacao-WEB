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
 * Servlet implementation class ServletTela2Cadastro
 */
@WebServlet("/ServletRegistroRealizado")
public class ServletRegistroRealizado extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletRegistroRealizado() {
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
		
    	HttpSession sessao = request.getSession();
    	String nome = (String) sessao.getAttribute("NOME");
    	String sobrenome = (String) sessao.getAttribute("SOBRENOME");
    	String rua = (String) sessao.getAttribute("RUA");
    	String complemento = (String) sessao.getAttribute("COMPLEMENTO");
    	String cidade = (String) sessao.getAttribute("CIDADE");
    	String cep = (String) sessao.getAttribute("CEP");
    	String estado = (String) sessao.getAttribute("ESTADO");
    	

    	resposta.write("<html>");
        resposta.write("<head>");
        resposta.write("<title>Confirmação de registro</title>");
        resposta.write("</head>");
        resposta.write("<body>");
        resposta.write("<h2>Registro realizado!</h2><br/><br/>");
        resposta.write("<b>Seus dados pessoais:</b><br/>");
        resposta.write("Nome: "+ nome + " " + sobrenome);
        resposta.write("<br/>");
        resposta.write("Rua: " + rua);
        resposta.write("<br/>");
        resposta.write("Complemento: " + complemento);
        resposta.write("<br/>");
        resposta.write("Cidade: " + cidade);
        resposta.write("; ");
        resposta.write("CEP: " + cep);
        resposta.write("; ");
        resposta.write("Estado: " + estado);
        resposta.write("<br/><br/>");
        resposta.write("<b>dados profissionais:</b><br/>");
        resposta.write("Empresa: " + request.getParameter("empresa"));
        resposta.write("<br/>");
        resposta.write("Rua: " + request.getParameter("ruaEmpresa"));
        resposta.write("<br/>");
        resposta.write("Complemento: " + request.getParameter("complementoEmpresa"));
        resposta.write("<br/>");
        resposta.write("Cidade: " + request.getParameter("cidadeEmpresa"));
        resposta.write("; ");
        resposta.write("CEP: " + request.getParameter("cepEmpresa"));
        resposta.write("; ");
        resposta.write("Estado: " + request.getParameter("estadoEmpresa"));
        resposta.write("</body></html>");

    }

}
