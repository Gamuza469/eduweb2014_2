
<%@ page import="ar.edu.unlam.eduweb.foro.Tema" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'tema.label', default: 'Tema')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<div id="status" role="complementary">
		    <a href="${createLink(controller:'Curso', action: 'index')}" >Ver Cursos</a>
			<a href="${createLink(controller:'Tema', action: 'index')}" >Ingresar al Foro</a>
			<a href="${createLink(controller:'Mensaje', action: 'index')}">Chat</a> 
			<img src="${assetPath(src:'chicos2.png')}" width='321' height='115'/> 
		</div>
		<a href="#list-tema" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-tema" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="titulo" title="${message(code: 'tema.titulo.label', default: 'Titulo')}" />
					
						<g:sortableColumn property="mensaje" title="${message(code: 'tema.mensaje.label', default: 'Mensaje')}" />
					
						<g:sortableColumn property="fechaCreacion" title="${message(code: 'tema.fechaCreacion.label', default: 'Fecha Creacion')}" />
					
						<th><g:message code="tema.curso.label" default="Curso" /></th>
					
						<g:sortableColumn property="bloqueado" title="${message(code: 'tema.bloqueado.label', default: 'Bloqueado')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${temaInstanceList}" status="i" var="temaInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${temaInstance.id}">${fieldValue(bean: temaInstance, field: "titulo")}</g:link></td>
					
						<td>${fieldValue(bean: temaInstance, field: "mensaje")}</td>
					
						<td><g:formatDate format="dd/MM/yyyy" date="${temaInstance.fechaCreacion}" /></td>
					
						<td>${fieldValue(bean: temaInstance.curso, field: "nombre")} (${fieldValue(bean: temaInstance.curso.profesor, field: "apellido")}, ${fieldValue(bean: temaInstance.curso.profesor, field: "nombre")})</td>
					
						<td><g:formatBoolean boolean="${temaInstance.bloqueado}" /></td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${temaInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
