
<%@ page import="ar.edu.unlam.eduweb.curso.Curso" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'curso.label', default: 'Curso')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<div id="status" role="complementary">
		    <a href="${createLink(controller:'Curso', action: 'index')}" >Ver Cursos</a>
			<a href="${createLink(controller:'Tema', action: 'index')}" >Ingresar al Foro</a>
			<a href="${createLink(controller:'Mensaje', action: 'index')}">Chat</a> 
			<img src="${assetPath(src:'chicos2.png')}" width='321' height='115'/>
		</div>
		<a href="#show-curso" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-curso" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list curso">
			
				<g:if test="${cursoInstance?.nombre}">
				<li class="fieldcontain">
					<span id="nombre-label" class="property-label"><g:message code="curso.nombre.label" default="Nombre" /></span>
					
						<span class="property-value" aria-labelledby="nombre-label"><g:fieldValue bean="${cursoInstance}" field="nombre"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${cursoInstance?.descripcion}">
				<li class="fieldcontain">
					<span id="descripcion-label" class="property-label"><g:message code="curso.descripcion.label" default="Descripcion" /></span>
					
						<span class="property-value" aria-labelledby="descripcion-label"><g:fieldValue bean="${cursoInstance}" field="descripcion"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${cursoInstance?.profesor}">
				<li class="fieldcontain">
					<span id="profesor-label" class="property-label"><g:message code="curso.profesor.label" default="Profesor" /></span>
					
						<span class="property-value" aria-labelledby="profesor-label"><g:link controller="usuario" action="show" id="${cursoInstance?.profesor?.id}">${cursoInstance?.profesor?.apellido}, ${cursoInstance?.profesor?.nombre}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${cursoInstance?.actividades}">
				<li class="fieldcontain">
					<span id="actividades-label" class="property-label"><g:message code="curso.actividades.label" default="Actividades" /></span>
					
						<g:each in="${cursoInstance.actividades}" var="a">
						<span class="property-value" aria-labelledby="actividades-label"><g:link controller="actividad" action="show" id="${a.id}">${a?.titulo} - ${a?.tipo}</g:link></span>
						</g:each>
					
				</li>
				</g:if>
			
				<g:if test="${cursoInstance?.apuntes}">
				<li class="fieldcontain">
					<span id="apuntes-label" class="property-label"><g:message code="curso.apuntes.label" default="Apuntes" /></span>
					
						<g:each in="${cursoInstance.apuntes}" var="a">
						<span class="property-value" aria-labelledby="apuntes-label"><g:link controller="apunte" action="show" id="${a.id}">${a?.nombre}</g:link></span>
						</g:each>
					
				</li>
				</g:if>
			
				<g:if test="${cursoInstance?.temas}">
				<li class="fieldcontain">
					<span id="temas-label" class="property-label"><g:message code="curso.temas.label" default="Temas" /></span>
					
						<g:each in="${cursoInstance.temas}" var="t">
						<span class="property-value" aria-labelledby="temas-label"><g:link controller="tema" action="show" id="${t.id}">${t?.titulo}</g:link></span>
						</g:each>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:cursoInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${cursoInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
