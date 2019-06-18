<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>VW - MENU</title>
        <meta charset="UTF-8">        
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="./css/style.css" type="text/css"/>
        <script type='text/javascript' src='./dashboards/Dashboard.controller.js'></script>
        <script type="text/javascript" src="./services/service.js"></script>
    </head>
    
    <body>
        <form class="container" action="/Eleicao/redirect" method="POST">
            <h1>Menu do usuário</h1>     
                     
            <button class="btn btn-primary" onclick="redirect('votacao')">Votar</button>
            
            <button style="display: none;" id="aut" class="btn btn-primary" onclick="redirect('autorizar')">Autenticar</button>
            <button class="btn btn-primary" id="computarVotos" onclick="redirect('computarVotos')">Resultado</button>
            
            

            <input type="hidden" name="titulo" id="titulo" value="${sessionScope.titulo}"/>
            <input type="hidden" name="nivel" id="nivel" value="${sessionScope.nivel}"/>
            <input type="hidden" name="pagina" id="pagina"/>
          </form>
    </body>
</html>
