package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Constructor;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//configuração
//@WebServlet(urlPatterns = "/oi")
@WebServlet(urlPatterns="/oi", loadOnStartup=1)
public class OiMundoServlet extends HttpServlet {

	public OiMundoServlet() {
		System.out.println("Criando ou mudo servlet");
	}
	
	
	
	
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException  {
   PrintWriter out	=resp.getWriter();
   out.println("<html>");
   out.println("<body>");
   out.println("Oi mundo, parabens vc escreveu o primeiro servlets.");
   out.println("</body>");
   out.println("</html>");

   System.out.println("  oi servlets foi chamada  ");
   System.out.println("  oi servlets foi chamada  ");
		
	}
		
		

	
	
	
	
	

}
