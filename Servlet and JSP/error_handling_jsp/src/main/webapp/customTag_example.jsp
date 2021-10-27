<%-- 
    Document   : customTag_example.jsp
    Created on : 25-Oct-2021, 10:23:17 am
    Author     : Nik
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/WEB-INF/tlds/mylib" prefix="t" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Custom tag example page</title>
    </head>
    <body>
        <h1>This is the output of myTag that we have created -</h1>
        <t:myTag></t:myTag>
            <hr/>
            <h1>This is the output of printTable tag that we have created - </h1>
        <t:printTable number="23" color="green"></t:printTable>
            <hr/>
        <t:printTable number="100" color="red"></t:printTable>
            <hr/>
        <t:printTable number="57" color="blue"></t:printTable>
            <!--we have created this printTable tag which can print table of number we have given with the given-->
            <hr/>
        <t:printTable number="12" color="orange"></t:printTable>
    </body>
</html>
