<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">		
        <meta name="viewport" content="width=device-width, initial-scale=1.0">         
        <meta http-equiv="X-UA-Compatible" content="IE=edge, chrome=1" />
        <link rel="stylesheet" href="./css/style.css" type="text/css"/>  
        <script type="text/javascript" src="./services/jquery.js"></script>
        <script type="text/javascript" src="./services/service.js"></script>
		<title>VW - Votação Web</title>
		</head>
	<body>
    <form class="container" action="/Eleicao/autenticar" method="POST">
      <h1>Votação Online</h1>
      <div class="login">
        <p>Titulo de Eleitor<p>
          <input type="text" name="titulo" id="titulo" class="input" required/>
      </div>            
      <div class="login">
        <p>Senha</p>
        <input type="password" name="senha" id="senha" class="input" required/>
      </div>
      <button class="btn btn-primary" type="submit">Entrar</button>
    </form>
	</body>
</html>