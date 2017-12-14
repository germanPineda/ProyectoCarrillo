<%-- 
    Document   : alumno
    Created on : 13/12/2017, 03:40:20 PM
    Author     : Zeus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Alumno</title>
        <link rel="stylesheet" type="text/css" href="css/styleAlumnoJsp.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script>
function myFunction() {
    var table = document.getElementById("myTable");
    var row = table.insertRow(1);
    var cell1 = row.insertCell(0);
    cell1.innerHTML = ${control};
}
        </script>
    </head>
    <body>
        <div id="alumno">
            Alumno                      
            <input type="button" id="bton" value="Imprimir" onclick="location.href='index.html';">
            <input type="button" id="bton" value="Salir" onclick="location.href='index.html';">
        </div>
        <div id="content" class="flex-container">
            <div id="menu">
                <ul>
                <li class="nivel1"><a onclick="myFunction()" class="nivel1">Informacion</a></li>
                <li class="nivel1"><a href="#" class="nivel1">Reporte</a></li>
                </ul>
            </div>
            <div id="vista">

                        <th>${control}</th>
                        <th>${nombres}</th>
                        <th>${apellidos}</th>
                        <th>${feN}</th>
                        <th>${perIn}</th>

            </div>
        </div>
    </body> 
</html>