<%-- 
    Document   : Test
    Created on : 14 Nov, 2018, 2:08:44 PM
    Author     : Parmjot Singh chahal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><%= session.getAttribute("EMAIL") %></h1>
        <% if(session.getAttribute("SignUpResult").equals("true")){ %>
        <h1>
            Success
        </h1>
        <% } 
            else{ %>
                    <h1>
                        fail
                    </h1>
            <%    }
        %>
    </body>
</html>
