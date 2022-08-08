<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ProfSistem</title>
    </head>
    <body>
        <form action="index.jsp" method="POST">
            <fieldset>
                <legend>Login</legend>
                Usuário: <input type="text" name="email" /><br/>
                Senha: <input type="password" name="senha" /><br/>
                <input type="submit" name="botaoLogin" value="Login" />
            </fieldset>
        </form>
    </body>
</html>

