<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Chat Eduweb</title>
</head>
<body>
<g:form action="join">
    <label for="nombreUsuario">Por favor escriba su nombre/apodo:</label>
    <g:textField name="nombreUsuario" value="${nombreUsuario}"/>
    <g:submitButton name="Ingresar al Chat"/>
</g:form>
</body>
</html>