<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css" type="text/css"/>  
<link rel="stylesheet" href="./css/bootstrap.min.css" type="text/css"/>
<link rel="stylesheet" href="./css/bootstrap-responsive.min.css" type="text/css"/>
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript" src="./autorizar/autorizar.controller.js"></script>
<script type="text/javascript" src="./services/service.js"></script>
<title>VW - AUTENTICAR</title>
</head>
<body>
    <form class="container" action="/Eleicao/autorizar" id="form" method="POST">
        <div class="aut">
          <p>Titulo do Eleitor</p>
            <input type="text" name="usuario" id="usuario" placeholder="titulo do eleitor" class="input" value="${requestScope.usuario}"/>
        </div>            
        <div class="aut">
          <p>Nome</p>      
          <input type="text" id="nome" name="nome" value="${requestScope.nome}" class="input" class="input" readonly/>
          <p>Autorizado a votar?</p>
          <input type="text" id="liberado" name="liberado" value="${requestScope.liberado}" class="input" readonly/>
          <p>Ja votou?</p>
          <input type="text" id="javotou" name="javotou" value="${requestScope.javotou}" class="input" readonly/>
          <input type="hidden" id="func" name="func" value="${sessionScope.titulo}" class="input" readonly/>  
          <input type="hidden" id="nivel" name="nivel" value="${sessionScope.nivel}" class="input" readonly/>
        </div>
        <button class="btn btn-sucess" onclick="validar()">Validar</button>
        <button class="btn btn-sucess" onclick="autorizar()">Autorizar</button>        
        <button class="btn btn-primary" onclick="backPage('func')">Voltar</button>
    </form>
</body>
</html>