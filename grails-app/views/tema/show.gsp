
<%@ page import="ar.edu.unlam.eduweb.foro.Tema" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'tema.label', default: 'Tema')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<div id="status" role="complementary">
		    <a href="${createLink(controller:'Curso', action: 'index')}" >Ver Cursos</a>
			<a href="${createLink(controller:'Tema', action: 'index')}" >Ingresar al Foro</a>
			<a href="${createLink(controller:'Mensaje', action: 'index')}">Chat</a> 
			<img src="${assetPath(src:'chicos2.png')}" width='321' height='115'/>
		</div>
		<a href="#show-tema" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-tema" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list tema">
			
				<g:if test="${temaInstance?.titulo}">
				<li class="fieldcontain">
					<span id="titulo-label" class="property-label"><g:message code="tema.titulo.label" default="Titulo" /></span>
					
						<span class="property-value" aria-labelledby="titulo-label"><g:fieldValue bean="${temaInstance}" field="titulo"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${temaInstance?.mensaje}">
				<li class="fieldcontain">
					<span id="mensaje-label" class="property-label"><g:message code="tema.mensaje.label" default="Mensaje" /></span>
					
						<span class="property-value" aria-labelledby="mensaje-label"><g:fieldValue bean="${temaInstance}" field="mensaje"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${temaInstance?.fechaCreacion}">
				<li class="fieldcontain">
					<span id="fechaCreacion-label" class="property-label"><g:message code="tema.fechaCreacion.label" default="Fecha Creacion" /></span>
					
						<span class="property-value" aria-labelledby="fechaCreacion-label"><g:formatDate format="dd/MM/yyyy" date="${temaInstance?.fechaCreacion}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${temaInstance?.curso}">
				<li class="fieldcontain">
					<span id="curso-label" class="property-label"><g:message code="tema.curso.label" default="Curso" /></span>
					
						<span class="property-value" aria-labelledby="curso-label"><g:link controller="curso" action="show" id="${temaInstance?.curso?.id}">${temaInstance?.curso?.nombre} (${temaInstance?.curso?.profesor.apellido}, ${temaInstance?.curso?.profesor.nombre})</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${temaInstance?.comentarios}">
				<li class="fieldcontain">
					<span id="comentarios-label" class="property-label"><g:message code="tema.comentarios.label" default="Comentarios" /></span>
					
						<g:each in="${temaInstance.comentarios}" var="c">
						<span class="property-value" aria-labelledby="comentarios-label"><g:link controller="comentario" action="show" id="${c.id}">${c?.autor.apellido}, ${c?.autor.nombre} -&gt; ${c?.mensaje}</g:link></span>
						</g:each>
					
				</li>
				</g:if>
			
				<g:if test="${temaInstance?.bloqueado}">
				<li class="fieldcontain">
					<span id="bloqueado-label" class="property-label"><g:message code="tema.bloqueado.label" default="Bloqueado" /></span>
					
						<span class="property-value" aria-labelledby="bloqueado-label"><g:formatBoolean boolean="${temaInstance?.bloqueado}" /></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:temaInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${temaInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
