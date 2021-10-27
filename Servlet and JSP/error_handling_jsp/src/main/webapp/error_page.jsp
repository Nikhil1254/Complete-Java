<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page isErrorPage="true" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error Page</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous" />
    </head>
    <body>
        <div class="container p-3 text-center">
            <img style="width: 30%" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSZYsJ1gjOd6u19RU6hNFtOhlQXKHJbcASEInbrAhtRob4pdVhlEAm8xOFwt3DAuvCp-VU&usqp=CAU" class="img-fluid">
            <h3 class="display-3" style="font-size: 40px;" >Sorry something went wrong!!!</h3>
            <p class="text-danger"><%= exception %></p>
            <a class="btn btn-outline-primary" href="index.html">Home</a>
        </div>

    </body>
</html>
