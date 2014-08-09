import ar.edu.unlam.eduweb.foro.Tema
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_eduweb2014_2_tema_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/tema/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: temaInstance, field: 'titulo', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("tema.titulo.label"),'default':("Titulo")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("titulo"),'required':(""),'value':(temaInstance?.titulo)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: temaInstance, field: 'mensaje', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("tema.mensaje.label"),'default':("Mensaje")],-1)
printHtmlPart(2)
invokeTag('textField','g',19,['name':("mensaje"),'required':(""),'value':(temaInstance?.mensaje)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: temaInstance, field: 'fechaCreacion', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("tema.fechaCreacion.label"),'default':("Fecha Creacion")],-1)
printHtmlPart(2)
invokeTag('datePicker','g',28,['name':("fechaCreacion"),'precision':("day"),'value':(temaInstance?.fechaCreacion)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: temaInstance, field: 'curso', 'error'))
printHtmlPart(6)
invokeTag('message','g',34,['code':("tema.curso.label"),'default':("Curso")],-1)
printHtmlPart(2)
invokeTag('select','g',37,['id':("curso"),'name':("curso.id"),'from':(ar.edu.unlam.eduweb.curso.Curso.list()),'optionKey':("id"),'required':(""),'value':(temaInstance?.curso?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: temaInstance, field: 'comentarios', 'error'))
printHtmlPart(7)
invokeTag('message','g',43,['code':("tema.comentarios.label"),'default':("Comentarios")],-1)
printHtmlPart(8)
for( c in (temaInstance?.comentarios) ) {
printHtmlPart(9)
createTagBody(2, {->
expressionOut.print(c?.encodeAsHTML())
})
invokeTag('link','g',49,['controller':("comentario"),'action':("show"),'id':(c.id)],2)
printHtmlPart(10)
}
printHtmlPart(11)
createTagBody(1, {->
expressionOut.print(message(code: 'default.add.label', args: [message(code: 'comentario.label', default: 'Comentario')]))
})
invokeTag('link','g',52,['controller':("comentario"),'action':("create"),'params':(['tema.id': temaInstance?.id])],1)
printHtmlPart(12)
expressionOut.print(hasErrors(bean: temaInstance, field: 'bloqueado', 'error'))
printHtmlPart(13)
invokeTag('message','g',61,['code':("tema.bloqueado.label"),'default':("Bloqueado")],-1)
printHtmlPart(14)
invokeTag('checkBox','g',64,['name':("bloqueado"),'value':(temaInstance?.bloqueado)],-1)
printHtmlPart(15)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1407562662882L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
