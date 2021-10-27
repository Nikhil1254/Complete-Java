<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page isErrorPage="true" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error page</title>

        <style>
            div{
                background: #e2e2e2;
                padding: 20px;
            }

            body{
                padding: 0px;
                margin: 0px;
            }
        </style>

    </head>
    <body>

        <div>
            <h1>Sorry something went wrong!!!!</h1>
            <p style="font-size: 20px;color: red;"><b> <%= exception%> </b></p>
        </div>
    </body>
</html>
