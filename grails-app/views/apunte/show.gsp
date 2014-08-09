
<%@ page import="ar.edu.unlam.eduweb.curso.Apunte" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'apunte.label', default: 'Apunte')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<div id="status" role="complementary">
		    <a href="${createLink(controller:'Curso', action: 'index')}" >Ver Cursos</a>
			<a href="${createLink(controller:'Tema', action: 'index')}" >Ingresar al Foro</a>
			<a href="${createLink(controller:'Mensaje', action: 'index')}">Chat</a> 
			<img src="${assetPath(src:'chicos2.png')}" width='321' height='115'/>
		</div>
		<a href="#show-apunte" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-apunte" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list apunte">
			
				<g:if test="${apunteInstance?.nombre}">
				<li class="fieldcontain">
					<span id="nombre-label" class="property-label"><g:message code="apunte.nombre.label" default="Nombre" /></span>
					
						<span class="property-value" aria-labelledby="nombre-label"><g:fieldValue bean="${apunteInstance}" field="nombre"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${apunteInstance?.fecha}">
				<li class="fieldcontain">
					<span id="fecha-label" class="property-label"><g:message code="apunte.fecha.label" default="Fecha" /></span>
					
						<span class="property-value" aria-labelledby="fecha-label"><g:formatDate format="dd/MM/yyyy" date="${apunteInstance?.fecha}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${apunteInstance?.curso}">
				<li class="fieldcontain">
					<span id="curso-label" class="property-label"><g:message code="apunte.curso.label" default="Curso" /></span>
					
						<span class="property-value" aria-labelledby="curso-label"><g:link controller="curso" action="show" id="${apunteInstance?.curso?.id}">${apunteInstance?.curso?.nombre} (${apunteInstance?.curso?.profesor.apellido}, ${apunteInstance?.curso?.profesor.nombre})</g:link></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:apunteInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${apunteInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
