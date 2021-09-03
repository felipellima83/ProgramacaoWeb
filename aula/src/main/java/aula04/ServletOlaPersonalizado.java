package aula04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletOlaPersonalizado
 */
@WebServlet("/ServletOlaPersonalizado")
public class ServletOlaPersonalizado extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public ServletOlaPersonalizado() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter saida = response.getWriter();
		saida.write("<HTML><Body>");
		saida.write("<form action=ServletOlaPersonalizado method=post>");
		saida.write("<label for=\"primeiro\">Primeiro nome</label>");
		saida.write("<input id=\"primeiro\" name=\"primeiro\" type=\"text\">");
		saida.write("<label for=\"ultimo\">Último nome</label>");
		saida.write("<input id=\"ultimo\" name=\"ultimo\" type=\"text\">");
		saida.write("<input type=\"submit\">");
		saida.write("</form>");
		saida.write("</Body></HTML>");
		saida.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String primeiro = request.getParameter("primeiro");
		String ultimo = request.getParameter("ultimo");
		PrintWriter saida = response.getWriter();
		saida.write("<HTML><Body>");
		saida.write("Olá " + primeiro + " " + ultimo + ", que bom ter você aqui!");
		saida.write("</Body></HTML>");
		saida.close();
	}

}
