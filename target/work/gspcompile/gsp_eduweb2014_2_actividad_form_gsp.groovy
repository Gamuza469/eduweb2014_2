import ar.edu.unlam.eduweb.curso.Actividad
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_eduweb2014_2_actividad_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/actividad/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: actividadInstance, field: 'titulo', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("actividad.titulo.label"),'default':("Titulo")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("titulo"),'required':(""),'value':(actividadInstance?.titulo)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: actividadInstance, field: 'tipo', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("actividad.tipo.label"),'default':("Tipo")],-1)
printHtmlPart(2)
invokeTag('select','g',19,['name':("tipo"),'from':(actividadInstance.constraints.tipo.inList),'required':(""),'value':(actividadInstance?.tipo),'valueMessagePrefix':("actividad.tipo")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: actividadInstance, field: 'consigna', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("actividad.consigna.label"),'default':("Consigna")],-1)
printHtmlPart(2)
invokeTag('textField','g',28,['name':("consigna"),'required':(""),'value':(actividadInstance?.consigna)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: actividadInstance, field: 'fechaInicio', 'error'))
printHtmlPart(6)
invokeTag('message','g',34,['code':("actividad.fechaInicio.label"),'default':("Fecha Inicio")],-1)
printHtmlPart(2)
invokeTag('datePicker','g',37,['name':("fechaInicio"),'precision':("day"),'value':(actividadInstance?.fechaInicio)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: actividadInstance, field: 'fechaEntrega', 'error'))
printHtmlPart(7)
invokeTag('message','g',43,['code':("actividad.fechaEntrega.label"),'default':("Fecha Entrega")],-1)
printHtmlPart(2)
invokeTag('datePicker','g',46,['name':("fechaEntrega"),'precision':("day"),'value':(actividadInstance?.fechaEntrega)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: actividadInstance, field: 'archivo', 'error'))
printHtmlPart(8)
invokeTag('message','g',52,['code':("actividad.archivo.label"),'default':("Archivo")],-1)
printHtmlPart(9)
expressionOut.print(hasErrors(bean: actividadInstance, field: 'curso', 'error'))
printHtmlPart(10)
invokeTag('message','g',61,['code':("actividad.curso.label"),'default':("Curso")],-1)
printHtmlPart(2)
invokeTag('select','g',64,['id':("curso"),'name':("curso.id"),'from':(ar.edu.unlam.eduweb.curso.Curso.list()),'optionKey':("id"),'required':(""),'value':(actividadInstance?.curso?.id),'class':("many-to-one")],-1)
printHtmlPart(11)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1407561715264L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
