package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class listaEmpresasServlet
 */
@WebServlet("/listaEmpresas")
public class listaEmpresasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	Banco banco =new Banco();
	List<Empresa>lista = banco.getEmpresa();
	
	                     //no primeiro paramentro é um apelidio, no segundo um objeto
	 request.setAttribute("empresasCadastradas", lista);
	 
	 RequestDispatcher rd=request.getRequestDispatcher("/listaEmpresas.jsp");
	 rd.forward(request, response);// leva e requisição junto com a respostas
	 
	 
	

	
	
	
		
	
	 
	 
	
	}

}
