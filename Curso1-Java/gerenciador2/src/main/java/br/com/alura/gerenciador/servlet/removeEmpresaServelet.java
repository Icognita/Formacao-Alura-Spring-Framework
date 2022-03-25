package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/removeEmpresa")
public class removeEmpresaServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//como o METODODO PARAMENTER SÓ RECEBE STRING TEMOS QUE FAQZER O PARCEINT.
		
	String paramId=	request.getParameter("id");
	Integer id	=Integer.valueOf(paramId);
	System.out.println(id);
	
//	fazendo a conexão com o banco/ no nosso caso este é so um simuldor
	
	Banco banco = new Banco();
	banco.removeEmpresa(id);
	
	
	
	//redirecionar para listaEmpresas.
	
	response.sendRedirect("listaEmpresas");
	
	
	}

}
