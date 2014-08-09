import ar.edu.unlam.eduweb.curso.Apunte
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_eduweb2014_2_apunte_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/apunte/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: apunteInstance, field: 'nombre', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("apunte.nombre.label"),'default':("Nombre")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("nombre"),'required':(""),'value':(apunteInstance?.nombre)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: apunteInstance, field: 'fecha', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("apunte.fecha.label"),'default':("Fecha")],-1)
printHtmlPart(2)
invokeTag('datePicker','g',19,['name':("fecha"),'precision':("day"),'value':(apunteInstance?.fecha)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: apunteInstance, field: 'curso', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("apunte.curso.label"),'default':("Curso")],-1)
printHtmlPart(2)
invokeTag('select','g',28,['id':("curso"),'name':("curso.id"),'from':(ar.edu.unlam.eduweb.curso.Curso.list()),'optionKey':("id"),'required':(""),'value':(apunteInstance?.curso?.id),'class':("many-to-one")],-1)
printHtmlPart(6)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1407562182150L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
