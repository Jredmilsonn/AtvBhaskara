<%@page import="br.bhaskara.Bhaskara"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Fórmula de Bhaskara</title>
    </head>
    <body>
        <h1> Fórmula de Bhaskara </h1>
        <hr>
        <% 
            int coeA, coeB, coeC;
            
            coeA = Integer.getInteger(request.getParameter("coeA"));
            coeB = Integer.getInteger(request.getParameter("coeB"));
            coeC = Integer.getInteger(request.getParameter("coeC"));
           //Passando os parâmetros dos Coeficientes;
           
            Bhaskara bhaskara = new Bhaskara();
            
            bhaskara.setCoeA(coeA);
            bhaskara.setCoeB(coeB);
            bhaskara.setCoeC(coeC);
          
%>  
<strong> Dados Informados: </strong>
<ul>
    <li> <strong>Coeficiente A: </strong><%= coeA %> </li>
    <li> <strong>Coeficiente B: </strong><%= coeB %> </li>
    <li> <strong>Coeficiente C: </strong><%= coeC %> </li>
</ul>
<strong> Calculo da Fórmula de Bhaskara </strong>
<ul>
    <li> <strong> Fórmula de Bhaskara: </strong> <%= String.format("%.2f", bhaskara.getresultadoDelta()) %> </li>
</ul>

    //Aqui você deve colocar a lógica para exeibir o delta, e as raizes
        //Somente podem exisitr raizes se o delta for > 0
        //O valor "a" nunca poderá ser zero-->
    </body>
</html>