<%@  taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<%@  taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:url value="/alteraEmpresa" var="linkServletNovaEmpresa"/>

<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro</title>
</head>
<body>




 <form action="${linkServletNovaEmpresa}" method="post">

              Nome: </br>
              <input type="text" name="nome"  value="${empresa.nome}" />
                </br>
                
               Data de Abertura: </br>
               
               <input type="text"  name="data" value="<fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/>"  /> </br>
					
				 </br>
        		<input type="hidden" name="id" value="${empresa.id}"/>
        		</br>
           <input type="submit"/>
    </form>
					

</body>
</html>