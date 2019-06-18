<%@ page language="java"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
    
<%@page import="dao.CandidatoDao"%>
<%@page import="model.Candidato"%>
<%@page import="java.util.List"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css" type="text/css"/>  
<script type="text/javascript" src="./services/service.js"></script>
<title>VW - RESULTADO</title>
</head>
<body>
<% List<Candidato> candidatos = new CandidatoDao().findAll(); %>
	<table>
	    <!-- percorre contatos montando as linhas da tabela -->
	    <% for(Candidato cand : candidatos) { %>
	        <ul>
				<li><b>Numero:   </b>	<%=cand.getNumero() %></li>
				<li><b>Nome: 	 </b>	<%=cand.getNome() %></li>
				<li><b>Votos: 	 </b>	<%=cand.getVotos() %></li>
			</ul>
			<hr>
		<%} %>
		
		<button class="btn btn-primary" onclick="goTo()">VOLTAR</button>
	</table>
</body>
</html>