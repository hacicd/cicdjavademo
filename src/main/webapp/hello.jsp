<%@page import="java.util.Date"%>
    <%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
        <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
        <html>

        <head>
            <title>Sample Application JSP Page</title>
        </head>

        <body bgcolor=white>

            <table border="0" cellpadding="10">
                <tr>
                    <td>
                        <h1>CICD Demo JSP Page</h1>
                    </td>
                </tr>
            </table>

            <br />
            <p>This is the output of a JSP page that is part of the CICD Demo Application.</p>

            <%= new String("JSP Hello!") %>

        </body>

        </html>