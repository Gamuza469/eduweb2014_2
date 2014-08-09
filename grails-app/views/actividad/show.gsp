
<%@ page import="ar.edu.unlam.eduweb.curso.Actividad" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'actividad.label', default: 'Actividad')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<div id="status" role="complementary">
		    <a href="${createLink(controller:'Curso', action: 'index')}" >Ver Cursos</a>
			<a href="${createLink(controller:'Tema', action: 'index')}" >Ingresar al Foro</a>
			<a href="${createLink(controller:'Mensaje', action: 'index')}">Chat</a> 
			<img src="${assetPath(src:'chicos2.png')}" width='321' height='115'/>
		</div>
		<a href="#show-actividad" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-actividad" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list actividad">
			
				<g:if test="${actividadInstance?.titulo}">
				<li class="fieldcontain">
					<span id="titulo-label" class="property-label"><g:message code="actividad.titulo.label" default="Titulo" /></span>
					
						<span class="property-value" aria-labelledby="titulo-label"><g:fieldValue bean="${actividadInstance}" field="titulo"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${actividadInstance?.tipo}">
				<li class="fieldcontain">
					<span id="tipo-label" class="property-label"><g:message code="actividad.tipo.label" default="Tipo" /></span>
					
						<span class="property-value" aria-labelledby="tipo-label"><g:fieldValue bean="${actividadInstance}" field="tipo"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${actividadInstance?.consigna}">
				<li class="fieldcontain">
					<span id="consigna-label" class="property-label"><g:message code="actividad.consigna.label" default="Consigna" /></span>
					
						<span class="property-value" aria-labelledby="consigna-label"><g:fieldValue bean="${actividadInstance}" field="consigna"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${actividadInstance?.fechaInicio}">
				<li class="fieldcontain">
					<span id="fechaInicio-label" class="property-label"><g:message code="actividad.fechaInicio.label" default="Fecha Inicio" /></span>
					
						<span class="property-value" aria-labelledby="fechaInicio-label"><g:formatDate format="dd/MM/yyyy" date="${actividadInstance?.fechaInicio}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${actividadInstance?.fechaEntrega}">
				<li class="fieldcontain">
					<span id="fechaEntrega-label" class="property-label"><g:message code="actividad.fechaEntrega.label" default="Fecha Entrega" /></span>
					
						<span class="property-value" aria-labelledby="fechaEntrega-label"><g:formatDate format="dd/MM/yyyy" date="${actividadInstance?.fechaEntrega}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${actividadInstance?.archivo}">
				<li class="fieldcontain">
					<span id="archivo-label" class="property-label"><g:message code="actividad.archivo.label" default="Archivo" /></span>
					
						<span class="property-value" aria-labelledby="archivo-label"><g:fieldValue bean="${actividadInstance}" field="archivo"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${actividadInstance?.curso}">
				<li class="fieldcontain">
					<span id="curso-label" class="property-label"><g:message code="actividad.curso.label" default="Curso" /></span>
					
						<span class="property-value" aria-labelledby="curso-label"><g:link controller="curso" action="show" id="${actividadInstance?.curso?.id}">${actividadInstance?.curso?.nombre} (${actividadInstance?.curso?.profesor.apellido}, ${actividadInstance?.curso?.profesor.nombre})</g:link></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:actividadInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${actividadInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
