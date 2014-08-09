import ar.edu.unlam.eduweb.foro.Comentario
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_eduweb2014_2_comentario_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/comentario/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: comentarioInstance, field: 'mensaje', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("comentario.mensaje.label"),'default':("Mensaje")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("mensaje"),'required':(""),'value':(comentarioInstance?.mensaje)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: comentarioInstance, field: 'autor', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("comentario.autor.label"),'default':("Autor")],-1)
printHtmlPart(5)
expressionOut.print(hasErrors(bean: comentarioInstance, field: 'tema', 'error'))
printHtmlPart(6)
invokeTag('message','g',25,['code':("comentario.tema.label"),'default':("Tema")],-1)
printHtmlPart(2)
invokeTag('select','g',28,['id':("tema"),'name':("tema.id"),'from':(ar.edu.unlam.eduweb.foro.Tema.list()),'optionKey':("id"),'required':(""),'value':(comentarioInstance?.tema?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: comentarioInstance, field: 'fechaCreacion', 'error'))
printHtmlPart(7)
invokeTag('message','g',34,['code':("comentario.fechaCreacion.label"),'default':("Fecha Creacion")],-1)
printHtmlPart(2)
invokeTag('datePicker','g',37,['name':("fechaCreacion"),'precision':("day"),'value':(comentarioInstance?.fechaCreacion)],-1)
printHtmlPart(8)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1407564382219L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
