import ar.edu.unlam.eduweb.foro.Tema
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_eduweb2014_2_temashow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/tema/show.gsp" }
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
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'tema.label', default: 'Tema'))],-1)
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
if(true && (temaInstance?.titulo)) {
printHtmlPart(18)
invokeTag('message','g',34,['code':("tema.titulo.label"),'default':("Titulo")],-1)
printHtmlPart(19)
invokeTag('fieldValue','g',36,['bean':(temaInstance),'field':("titulo")],-1)
printHtmlPart(20)
}
printHtmlPart(21)
if(true && (temaInstance?.mensaje)) {
printHtmlPart(22)
invokeTag('message','g',43,['code':("tema.mensaje.label"),'default':("Mensaje")],-1)
printHtmlPart(23)
invokeTag('fieldValue','g',45,['bean':(temaInstance),'field':("mensaje")],-1)
printHtmlPart(20)
}
printHtmlPart(21)
if(true && (temaInstance?.fechaCreacion)) {
printHtmlPart(24)
invokeTag('message','g',52,['code':("tema.fechaCreacion.label"),'default':("Fecha Creacion")],-1)
printHtmlPart(25)
invokeTag('formatDate','g',54,['format':("dd/MM/yyyy"),'date':(temaInstance?.fechaCreacion)],-1)
printHtmlPart(20)
}
printHtmlPart(21)
if(true && (temaInstance?.curso)) {
printHtmlPart(26)
invokeTag('message','g',61,['code':("tema.curso.label"),'default':("Curso")],-1)
printHtmlPart(27)
createTagBody(3, {->
expressionOut.print(temaInstance?.curso?.nombre)
printHtmlPart(28)
expressionOut.print(temaInstance?.curso?.profesor.apellido)
printHtmlPart(29)
expressionOut.print(temaInstance?.curso?.profesor.nombre)
printHtmlPart(30)
})
invokeTag('link','g',63,['controller':("curso"),'action':("show"),'id':(temaInstance?.curso?.id)],3)
printHtmlPart(20)
}
printHtmlPart(21)
if(true && (temaInstance?.comentarios)) {
printHtmlPart(31)
invokeTag('message','g',70,['code':("tema.comentarios.label"),'default':("Comentarios")],-1)
printHtmlPart(32)
for( c in (temaInstance.comentarios) ) {
printHtmlPart(33)
createTagBody(4, {->
expressionOut.print(c?.autor.apellido)
printHtmlPart(29)
expressionOut.print(c?.autor.nombre)
printHtmlPart(34)
expressionOut.print(c?.mensaje)
})
invokeTag('link','g',73,['controller':("comentario"),'action':("show"),'id':(c.id)],4)
printHtmlPart(35)
}
printHtmlPart(36)
}
printHtmlPart(21)
if(true && (temaInstance?.bloqueado)) {
printHtmlPart(37)
invokeTag('message','g',81,['code':("tema.bloqueado.label"),'default':("Bloqueado")],-1)
printHtmlPart(38)
invokeTag('formatBoolean','g',83,['boolean':(temaInstance?.bloqueado)],-1)
printHtmlPart(20)
}
printHtmlPart(39)
createTagBody(2, {->
printHtmlPart(40)
createTagBody(3, {->
invokeTag('message','g',91,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',91,['class':("edit"),'action':("edit"),'resource':(temaInstance)],3)
printHtmlPart(41)
invokeTag('actionSubmit','g',92,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(42)
})
invokeTag('form','g',94,['url':([resource:temaInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(43)
})
invokeTag('captureBody','sitemesh',96,[:],1)
printHtmlPart(44)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1407564336437L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
