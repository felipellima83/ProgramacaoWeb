package aula06;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/MostraCadastro")
public class MostraCadastro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MostraCadastro() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter resposta = response.getWriter();
		HttpSession sessao = request.getSession(true);

		String nome = (String) sessao.getAttribute("nome");
		String ultimo_nome = (String) sessao.getAttribute("ultimo_nome");
		String rua = (String) sessao.getAttribute("rua");
		String logradouro = (String) sessao.getAttribute("logradouro");
		String cidade = (String) sessao.getAttribute("cidade");
		String cep = (String) sessao.getAttribute("cep");
		String estado = (String) sessao.getAttribute("estado");
		
		String empresa = (String) sessao.getAttribute("nome_empresa");
		String rua_empresa = (String) sessao.getAttribute("rua_empresa");
		String logradouro_empresa = (String) sessao.getAttribute("logradouro_empresa");
		String cidade_empresa = (String) sessao.getAttribute("cidade_empresa");
		String cep_empresa = (String) sessao.getAttribute("cep_empresa");
		String estado_empresa = (String) sessao.getAttribute("estado_empresa");
		
		resposta.println("Nome: "+ nome);
		resposta.println("Sobrenome: "+ ultimo_nome);
		resposta.println("Rua: "+ rua);
		resposta.println("Logradouro: "+ logradouro);
		resposta.println("Cidade: "+ cidade);
		resposta.println("Cep: "+ cep);
		resposta.println("Estado: "+ estado);
		resposta.println("Empresa: "+ empresa);
		resposta.println("Rua Empresa: "+ rua_empresa);
		resposta.println("Logradouro Empresa: "+ logradouro_empresa);
		resposta.println("Cidade Empresa: "+ cidade_empresa);
		resposta.println("CEP empresa: "+ cep_empresa);
		resposta.println("Estado Empresa: "+ estado_empresa);
	}
}