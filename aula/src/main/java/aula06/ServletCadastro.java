package aula6;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ServletCadastro")
public class ServletCadastro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletCadastro() {
        super();
    }
    
    public static final String NOME = "nome";
    public static final String ULTIMO_NOME = "ultimo_nome";
    public static final String RUA = "rua";
    public static final String LOGRADOURO = "logradouro";
    public static final String CIDADE = "cidade";
    public static final String CEP = "cep";
    public static final String ESTADO = "estado";
    public static final String EMPRESA = "empresa";
    public static final String RUA_EMPRESA = "rua_empresa";
    public static final String LOGRADOURO_EMPRESA = "logradouro_empresa";
    public static final String CIDADE_EMPRESA = "cidade_empresa";
    public static final String CEP_EMPRESA = "cep_empresa";
    public static final String ESTADO_EMPRESA = "estado_empresa";

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter resposta = response.getWriter();
				
		String nomeUsuario = request.getParameter(NOME);
		String ultimoNomeUsuario = request.getParameter(ULTIMO_NOME);
		String ruaUsuario = request.getParameter(RUA);
		String logradouroUsuario = request.getParameter(LOGRADOURO);
		String cidadeUsuario = request.getParameter(CIDADE);
		String cepUsuario = request.getParameter(CEP);
		String estadoUsuario = request.getParameter(ESTADO);
		String empresa = request.getParameter(EMPRESA);
		String ruaEmpresa = request.getParameter(RUA_EMPRESA);
		String complementoEmpresa = request.getParameter(LOGRADOURO_EMPRESA);
		String cidadeEmpresa = request.getParameter(CIDADE_EMPRESA);
		String cepEmpresa = request.getParameter(CEP_EMPRESA);
		String estadoEmpresa = request.getParameter(ESTADO_EMPRESA);
		
		HttpSession sessao = request.getSession();
		if (nomeUsuario != null && sobrenomeUsuario != null && ruaUsuario != null && complementoUsuario != null && !nomeUsuario.isEmpty() && !sobrenomeUsuario.isEmpty() && !ruaUsuario.isEmpty() && !complementoUsuario.isEmpty()) {
			sessao.setAttribute(NOME, nomeUsuario);
			sessao.setAttribute(SOBRENOME, sobrenomeUsuario);
			sessao.setAttribute(RUA, ruaUsuario);
			sessao.setAttribute(COMPLEMENTO, complementoUsuario);
			sessao.setAttribute(CIDADE, cidadeUsuario);
			sessao.setAttribute(CEP, cepUsuario);
			sessao.setAttribute(ESTADO, estadoUsuario);
		}
		if (empresa != null && ruaEmpresa != null && complementoEmpresa != null && !empresa.isEmpty() && !ruaEmpresa.isEmpty() && !complementoEmpresa.isEmpty()) {
			sessao.setAttribute(EMPRESA, empresa);
			sessao.setAttribute(RUA_EMPRESA, ruaEmpresa);
			sessao.setAttribute(LOGRADOURO_EMPRESA, logradouroEmpresa);
			sessao.setAttribute(CIDADE_EMPRESA, cidadeEmpresa);
			sessao.setAttribute(CEP_EMPRESA, cepEmpresa);
			sessao.setAttribute(ESTADO_EMPRESA, estadoEmpresa);
			response.sendRedirect(request.getContextPath()+ "/MostraCadastro");
		}else {
			response.sendRedirect(request.getContextPath()+ "/cadastro1.jsp");
		}		
	}
}