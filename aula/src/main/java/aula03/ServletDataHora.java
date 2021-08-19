package aula03;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletDataHora")
public class ServletDataHora extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy - hh:mm:ss");
	
    public ServletDataHora() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    public void init() throws ServletException {
    	super.init();
    	log("ServletDataHora iniciado às " + format.format(new Date()));
    }
        
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter saida = response.getWriter();
		saida.write("<HTML><BODY>Olá! A data/hora atual é: " + format.format(new Date()) + "</BODY></HTML>");
		saida.close();
	}
	
	@Override
	public void destroy() {
		log("ServletDataHora finalizado às " + format.format(new Date()));
		super.destroy();
	}
}
