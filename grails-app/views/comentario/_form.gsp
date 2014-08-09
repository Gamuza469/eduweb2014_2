<%@ page import="ar.edu.unlam.eduweb.foro.Comentario" %>



<div class="fieldcontain ${hasErrors(bean: comentarioInstance, field: 'mensaje', 'error')} required">
	<label for="mensaje">
		<g:message code="comentario.mensaje.label" default="Mensaje" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="mensaje" required="" value="${comentarioInstance?.mensaje}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: comentarioInstance, field: 'autor', 'error')} required">
	<label for="autor">
		<g:message code="comentario.autor.label" default="Autor" />
		<span class="required-indicator">*</span>
	</label>
	

</div>

<div class="fieldcontain ${hasErrors(bean: comentarioInstance, field: 'tema', 'error')} required">
	<label for="tema">
		<g:message code="comentario.tema.label" default="Tema" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="tema" name="tema.id" from="${ar.edu.unlam.eduweb.foro.Tema.list()}" optionKey="id" required="" value="${comentarioInstance?.tema?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: comentarioInstance, field: 'fechaCreacion', 'error')} required">
	<label for="fechaCreacion">
		<g:message code="comentario.fechaCreacion.label" default="Fecha Creacion" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="fechaCreacion" precision="day"  value="${comentarioInstance?.fechaCreacion}"  />

</div>

