<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page
	import="java.util.List, br.com.alura.gerenciador.servlet.Empresa"%>
<%@  taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@  taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Java standard tagLib</title>

<style type="text/css">
ul {
	text-decoration: none
}

h1 {
	background: color green;
}
</style>
</head>
<body>

	<c:if test="${ not empty empresa}">
        Empresa ${empresa} cadastrada com sucesso!
</c:if>




	<h1>Lista de empresas</h1>


	<ul>
		<c:forEach items="${empresasCadastradas}" var="empresa">


			<li>${empresa.nome} - <fmt:formatDate
					value="${empresa.dataAbertura}" pattern="dd/MM/yyyy" />
					 <a
				href="/gerenciador2/removeEmpresa?id=${empresa.id}">
					<button>Remove</button>
			</a> 
			
			<a href="/gerenciador2/mostraEmrpesa?id=${empresa.id}">
					<button>Edita</button>
			</a>



			</li>

		</c:forEach>
	</ul>




</body>
</html>