
<%@ page import="ar.edu.unlam.eduweb.foro.Comentario" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'comentario.label', default: 'Comentario')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<div id="status" role="complementary">
		    <a href="${createLink(controller:'Curso', action: 'index')}" >Ver Cursos</a>
			<a href="${createLink(controller:'Tema', action: 'index')}" >Ingresar al Foro</a>
			<a href="${createLink(controller:'Mensaje', action: 'index')}">Chat</a> 
			<img src="${assetPath(src:'chicos2.png')}" width='321' height='115'/>
		</div>
		<a href="#show-comentario" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-comentario" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list comentario">
			
				<g:if test="${comentarioInstance?.mensaje}">
				<li class="fieldcontain">
					<span id="mensaje-label" class="property-label"><g:message code="comentario.mensaje.label" default="Mensaje" /></span>
					
						<span class="property-value" aria-labelledby="mensaje-label"><g:fieldValue bean="${comentarioInstance}" field="mensaje"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${comentarioInstance?.autor}">
				<li class="fieldcontain">
					<span id="autor-label" class="property-label"><g:message code="comentario.autor.label" default="Autor" /></span>
					
						<span class="property-value" aria-labelledby="autor-label"><g:fieldValue bean="${comentarioInstance.autor}" field="apellido"/>, <g:fieldValue bean="${comentarioInstance.autor}" field="nombre"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${comentarioInstance?.tema}">
				<li class="fieldcontain">
					<span id="tema-label" class="property-label"><g:message code="comentario.tema.label" default="Tema" /></span>
					
						<span class="property-value" aria-labelledby="tema-label"><g:link controller="tema" action="show" id="${comentarioInstance?.tema?.id}">${comentarioInstance?.tema?.titulo}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${comentarioInstance?.fechaCreacion}">
				<li class="fieldcontain">
					<span id="fechaCreacion-label" class="property-label"><g:message code="comentario.fechaCreacion.label" default="Fecha Creacion" /></span>
					
						<span class="property-value" aria-labelledby="fechaCreacion-label"><g:formatDate format="dd/MM/yyyy" date="${comentarioInstance?.fechaCreacion}" /></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:comentarioInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${comentarioInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
