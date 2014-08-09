
<%@ page import="ar.edu.unlam.eduweb.foro.Comentario" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'comentario.label', default: 'Comentario')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<div id="status" role="complementary">
		    <a href="${createLink(controller:'Curso', action: 'index')}" >Ver Cursos</a>
			<a href="${createLink(controller:'Tema', action: 'index')}" >Ingresar al Foro</a>
			<a href="${createLink(controller:'Mensaje', action: 'index')}">Chat</a> 
			<img src="${assetPath(src:'chicos2.png')}" width='321' height='115'/> 
		</div>
		<a href="#list-comentario" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-comentario" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="mensaje" title="${message(code: 'comentario.mensaje.label', default: 'Mensaje')}" />
					
						<g:sortableColumn property="autor" title="${message(code: 'comentario.autor.label', default: 'Autor')}" />
					
						<th><g:message code="comentario.tema.label" default="Tema" /></th>
					
						<g:sortableColumn property="fechaCreacion" title="${message(code: 'comentario.fechaCreacion.label', default: 'Fecha Creacion')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${comentarioInstanceList}" status="i" var="comentarioInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${comentarioInstance.id}">${fieldValue(bean: comentarioInstance, field: "mensaje")}</g:link></td>
					
						<td>${fieldValue(bean: comentarioInstance, field: "autor")}</td>
					
						<td>${fieldValue(bean: comentarioInstance, field: "tema")}</td>
					
						<td><g:formatDate date="${comentarioInstance.fechaCreacion}" /></td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${comentarioInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
