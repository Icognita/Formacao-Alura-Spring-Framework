package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NovaEmpresaServlet
 */
@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// posso colocar só o doPost- e não dá suporte a o get ou doGet- se que da
	// suport
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("Cadastrando uma nova empresa");

		String nomeEmpresa = request.getParameter("nome");
		String paramDataEmpresa = request.getParameter("data");// sempre devolve um string//
		
				
		 Date dataAbertura = null;
		    try {
		        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		        dataAbertura = sdf.parse(paramDataEmpresa);
		    } catch (ParseException e) {
		            throw new ServletException(e);
		    }

		    Empresa empresa = new Empresa();
		    empresa.setNome(nomeEmpresa);
		    empresa.setDataAbertura(dataAbertura);
		
		
		
		Banco banco = new Banco();
		banco.adciona(empresa);

		// chamar o JSp vai paralista de 
		
		
		//metodo para fazer um novo direcionmento// vou devolver para o navegador uma resposnta p/ ele me devolver um redirecionamentos
		
		request.setAttribute("empresa",empresa.getNome());
		
		response.sendRedirect("listaEmpresas");

		
//		RequestDispatcher rd = request.getRequestDispatcher("/listaEmpresas");
//		request.setAttribute("empresa",empresa.getNome());
//		rd.forward(request, response);

		// codigo estatico para renderzar a página
		// o codio será comentado para usar uma pagina .jsp e usandodo o scriptlet

//	      PrintWriter out = response.getWriter();
//	      
//	      out.println("<html>");
//	      out.println("<body>");
//	      out.println( "Empresa   " + nomeEmpresa+ "   cadastrada com sucesso");
//	      out.println("</body>");
//	      out.println("</html>");
//	

	}

}
