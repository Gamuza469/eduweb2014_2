import ar.edu.unlam.eduweb.curso.Curso
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_eduweb2014_2_curso_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/curso/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: cursoInstance, field: 'nombre', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("curso.nombre.label"),'default':("Nombre")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("nombre"),'required':(""),'value':(cursoInstance?.nombre)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: cursoInstance, field: 'descripcion', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("curso.descripcion.label"),'default':("Descripcion")],-1)
printHtmlPart(2)
invokeTag('textField','g',19,['name':("descripcion"),'required':(""),'value':(cursoInstance?.descripcion)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: cursoInstance, field: 'profesor', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("curso.profesor.label"),'default':("Profesor")],-1)
printHtmlPart(2)
invokeTag('select','g',28,['id':("profesor"),'name':("profesor.id"),'from':(ar.edu.unlam.eduweb.usuario.Usuario.list()),'optionKey':("id"),'required':(""),'value':(cursoInstance?.profesor?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: cursoInstance, field: 'actividades', 'error'))
printHtmlPart(6)
invokeTag('message','g',34,['code':("curso.actividades.label"),'default':("Actividades")],-1)
printHtmlPart(7)
for( a in (cursoInstance?.actividades) ) {
printHtmlPart(8)
createTagBody(2, {->
expressionOut.print(a?.encodeAsHTML())
})
invokeTag('link','g',40,['controller':("actividad"),'action':("show"),'id':(a.id)],2)
printHtmlPart(9)
}
printHtmlPart(10)
createTagBody(1, {->
expressionOut.print(message(code: 'default.add.label', args: [message(code: 'actividad.label', default: 'Actividad')]))
})
invokeTag('link','g',43,['controller':("actividad"),'action':("create"),'params':(['curso.id': cursoInstance?.id])],1)
printHtmlPart(11)
expressionOut.print(hasErrors(bean: cursoInstance, field: 'apuntes', 'error'))
printHtmlPart(12)
invokeTag('message','g',52,['code':("curso.apuntes.label"),'default':("Apuntes")],-1)
printHtmlPart(7)
for( a in (cursoInstance?.apuntes) ) {
printHtmlPart(8)
createTagBody(2, {->
expressionOut.print(a?.encodeAsHTML())
})
invokeTag('link','g',58,['controller':("apunte"),'action':("show"),'id':(a.id)],2)
printHtmlPart(9)
}
printHtmlPart(10)
createTagBody(1, {->
expressionOut.print(message(code: 'default.add.label', args: [message(code: 'apunte.label', default: 'Apunte')]))
})
invokeTag('link','g',61,['controller':("apunte"),'action':("create"),'params':(['curso.id': cursoInstance?.id])],1)
printHtmlPart(11)
expressionOut.print(hasErrors(bean: cursoInstance, field: 'temas', 'error'))
printHtmlPart(13)
invokeTag('message','g',70,['code':("curso.temas.label"),'default':("Temas")],-1)
printHtmlPart(7)
for( t in (cursoInstance?.temas) ) {
printHtmlPart(8)
createTagBody(2, {->
expressionOut.print(t?.encodeAsHTML())
})
invokeTag('link','g',76,['controller':("tema"),'action':("show"),'id':(t.id)],2)
printHtmlPart(9)
}
printHtmlPart(10)
createTagBody(1, {->
expressionOut.print(message(code: 'default.add.label', args: [message(code: 'tema.label', default: 'Tema')]))
})
invokeTag('link','g',79,['controller':("tema"),'action':("create"),'params':(['curso.id': cursoInstance?.id])],1)
printHtmlPart(14)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1407560390335L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
