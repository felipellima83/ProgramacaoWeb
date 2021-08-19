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
		// TODO Auto-generated method stub
		PrintWriter saida = response.getWriter();
		saida.write("<HTML>"
					+ "<BODY>"
						+ "<form action=\"/pagina-processa-dados-do-form\" method=\"post\">\r\n"
						+ "    <div>\r\n"
						+ "        <label for=\"name\">Nome:</label>\r\n"
						+ "        <input type=\"text\" id=\"name\" />\r\n"
						+ "    </div></br>\r\n"
						+ "    <div>\r\n"
						+ "        <label for=\"telefone\">Telefone:</label>\r\n"
						+ "        <input type=\"text\" id=\"telefone\" />\r\n"
						+ "    </div></br>\r\n"
						+ "    <div>\r\n"
						+ "        <label for=\"dt_nasc\">Data de Nascimento:</label>\r\n"
						+ "        <input type=\"text\" id=\"dt_nasc\" />\r\n"
						+ "    </div></br>\r\n"
						+ "    <div class=\"button\">\r\n"
						+ "        <button type=\"submit\">Enviar sua mensagem</button>\r\n"
						+ "    </div>\r\n"
						+ "</form>"
					+ "</BODY>"
				+ "</HTML>");
		saida.close();
	}
}