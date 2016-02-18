<%--
  Created by IntelliJ IDEA.
  User: russel
  Date: 5/5/14
  Time: 11:33 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main">
    <title>Login</title>
</head>
<body>
<div class="body">
    <h1>Login</h1>
    <g:if test="${flash.message}">
        <div class="message" role="status">${flash.message}</div>
    </g:if>
    <g:form action="authenticate" >   <%-- call the 'authenticate' controller method --%>
            <div class="dialog">
            <table>
                <tbody>
                    <tr class="prop">
                        <td valign="top" class="name">
                            <label for="login">Login:</label>
                        </td>
                        <td valign="top">
                            <input type="text" id="login" name="login" />
                        </td>
                    </tr>

                    <tr class="prop">
                        <td valign="top" class="name">
                            <label for="password">Password:</label>
                        </td>
                        <td valign="top">
                            <input type="text" id="password" name="password"/>
                        </td>
                    </tr>
                </tbody>
            </table>
        </div>

        <fieldset class="buttons">
            <g:submitButton name="submit" value="login" />
        </fieldset>
    </g:form>
</div>
</body>
</html>