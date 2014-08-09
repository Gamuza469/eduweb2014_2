import ar.edu.unlam.eduweb.curso.Actividad
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_eduweb2014_2_actividadshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/actividad/show.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'actividad.label', default: 'Actividad'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',8,['code':("default.show.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',8,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',8,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',9,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
expressionOut.print(createLink(controller:'Curso', action: 'index'))
printHtmlPart(5)
expressionOut.print(createLink(controller:'Tema', action: 'index'))
printHtmlPart(6)
expressionOut.print(createLink(controller:'Mensaje', action: 'index'))
printHtmlPart(7)
expressionOut.print(assetPath(src:'chicos2.png'))
printHtmlPart(8)
invokeTag('message','g',17,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(9)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(10)
invokeTag('message','g',20,['code':("default.home.label")],-1)
printHtmlPart(11)
createTagBody(2, {->
invokeTag('message','g',21,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('link','g',21,['class':("list"),'action':("index")],2)
printHtmlPart(12)
createTagBody(2, {->
invokeTag('message','g',22,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',22,['class':("create"),'action':("create")],2)
printHtmlPart(13)
invokeTag('message','g',26,['code':("default.show.label"),'args':([entityName])],-1)
printHtmlPart(14)
if(true && (flash.message)) {
printHtmlPart(15)
expressionOut.print(flash.message)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (actividadInstance?.titulo)) {
printHtmlPart(18)
invokeTag('message','g',34,['code':("actividad.titulo.label"),'default':("Titulo")],-1)
printHtmlPart(19)
invokeTag('fieldValue','g',36,['bean':(actividadInstance),'field':("titulo")],-1)
printHtmlPart(20)
}
printHtmlPart(21)
if(true && (actividadInstance?.tipo)) {
printHtmlPart(22)
invokeTag('message','g',43,['code':("actividad.tipo.label"),'default':("Tipo")],-1)
printHtmlPart(23)
invokeTag('fieldValue','g',45,['bean':(actividadInstance),'field':("tipo")],-1)
printHtmlPart(20)
}
printHtmlPart(21)
if(true && (actividadInstance?.consigna)) {
printHtmlPart(24)
invokeTag('message','g',52,['code':("actividad.consigna.label"),'default':("Consigna")],-1)
printHtmlPart(25)
invokeTag('fieldValue','g',54,['bean':(actividadInstance),'field':("consigna")],-1)
printHtmlPart(20)
}
printHtmlPart(21)
if(true && (actividadInstance?.fechaInicio)) {
printHtmlPart(26)
invokeTag('message','g',61,['code':("actividad.fechaInicio.label"),'default':("Fecha Inicio")],-1)
printHtmlPart(27)
invokeTag('formatDate','g',63,['format':("dd/MM/yyyy"),'date':(actividadInstance?.fechaInicio)],-1)
printHtmlPart(20)
}
printHtmlPart(21)
if(true && (actividadInstance?.fechaEntrega)) {
printHtmlPart(28)
invokeTag('message','g',70,['code':("actividad.fechaEntrega.label"),'default':("Fecha Entrega")],-1)
printHtmlPart(29)
invokeTag('formatDate','g',72,['format':("dd/MM/yyyy"),'date':(actividadInstance?.fechaEntrega)],-1)
printHtmlPart(20)
}
printHtmlPart(21)
if(true && (actividadInstance?.archivo)) {
printHtmlPart(30)
invokeTag('message','g',79,['code':("actividad.archivo.label"),'default':("Archivo")],-1)
printHtmlPart(31)
invokeTag('fieldValue','g',81,['bean':(actividadInstance),'field':("archivo")],-1)
printHtmlPart(20)
}
printHtmlPart(21)
if(true && (actividadInstance?.curso)) {
printHtmlPart(32)
invokeTag('message','g',88,['code':("actividad.curso.label"),'default':("Curso")],-1)
printHtmlPart(33)
createTagBody(3, {->
expressionOut.print(actividadInstance?.curso?.nombre)
printHtmlPart(34)
expressionOut.print(actividadInstance?.curso?.profesor.apellido)
printHtmlPart(35)
expressionOut.print(actividadInstance?.curso?.profesor.nombre)
printHtmlPart(36)
})
invokeTag('link','g',90,['controller':("curso"),'action':("show"),'id':(actividadInstance?.curso?.id)],3)
printHtmlPart(20)
}
printHtmlPart(37)
createTagBody(2, {->
printHtmlPart(38)
createTagBody(3, {->
invokeTag('message','g',98,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',98,['class':("edit"),'action':("edit"),'resource':(actividadInstance)],3)
printHtmlPart(39)
invokeTag('actionSubmit','g',99,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(40)
})
invokeTag('form','g',101,['url':([resource:actividadInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(41)
})
invokeTag('captureBody','sitemesh',103,[:],1)
printHtmlPart(42)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1407564255940L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
