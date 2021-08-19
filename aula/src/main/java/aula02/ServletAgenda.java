package aula02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletAgenda
 */
@WebServlet(name="/ServletAgenda", urlPatterns="/ServletAgenda")
public class ServletAgenda extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override 
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException { 

		PrintWriter writer = resp.getWriter(); writer.println("página de cadastro acessada");

		String nome = req.getParameter("nome");
		String telefone = req.getParameter("telefone"); 
		String nascimento = req.getParameter("nascimento");
		
		}

}