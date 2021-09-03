package aula04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calculadora
 */
@WebServlet("/Calculadora")
public class Calculadora extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Calculadora() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter saida = response.getWriter();
		saida.write("<HTML><Body>");
		saida.write("<form action=Calculadora method=post>");
		saida.write("<label for=\"op1\">Operando 1</label>");
		saida.write("<input id=\"op1\" name=\"op1\" type=\"text\"> <br>");
		saida.write("<label for=\"op2\">Operando 2</label>");
		saida.write("<input id=\"op2\" name=\"op2\" type=\"text\"> <br> <br>");
		saida.write("<input type=\"submit\">");
		saida.write("</form>");
		saida.write("</Body></HTML>");
		saida.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String op1 = request.getParameter("op1");
		String op2 = request.getParameter("op2");
		PrintWriter saida = response.getWriter();
		float operando1 = Float.parseFloat(op1);
		float operando2 = Float.parseFloat(op2);
		float resultado = 0;		
		resultado = operando1 + operando2;		
		saida.print("O resultado da soma é igual a: " + resultado);
	}

}
