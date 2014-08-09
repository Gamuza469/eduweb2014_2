import ar.edu.unlam.eduweb.foro.Comentario
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_eduweb2014_2_comentarioshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/comentario/show.gsp" }
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
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'comentario.label', default: 'Comentario'))],-1)
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
if(true && (comentarioInstance?.mensaje)) {
printHtmlPart(18)
invokeTag('message','g',34,['code':("comentario.mensaje.label"),'default':("Mensaje")],-1)
printHtmlPart(19)
invokeTag('fieldValue','g',36,['bean':(comentarioInstance),'field':("mensaje")],-1)
printHtmlPart(20)
}
printHtmlPart(21)
if(true && (comentarioInstance?.autor)) {
printHtmlPart(22)
invokeTag('message','g',43,['code':("comentario.autor.label"),'default':("Autor")],-1)
printHtmlPart(23)
invokeTag('fieldValue','g',45,['bean':(comentarioInstance),'field':("autor")],-1)
printHtmlPart(20)
}
printHtmlPart(21)
if(true && (comentarioInstance?.tema)) {
printHtmlPart(24)
invokeTag('message','g',52,['code':("comentario.tema.label"),'default':("Tema")],-1)
printHtmlPart(25)
createTagBody(3, {->
expressionOut.print(comentarioInstance?.tema?.encodeAsHTML())
})
invokeTag('link','g',54,['controller':("tema"),'action':("show"),'id':(comentarioInstance?.tema?.id)],3)
printHtmlPart(20)
}
printHtmlPart(21)
if(true && (comentarioInstance?.fechaCreacion)) {
printHtmlPart(26)
invokeTag('message','g',61,['code':("comentario.fechaCreacion.label"),'default':("Fecha Creacion")],-1)
printHtmlPart(27)
invokeTag('formatDate','g',63,['date':(comentarioInstance?.fechaCreacion)],-1)
printHtmlPart(20)
}
printHtmlPart(28)
createTagBody(2, {->
printHtmlPart(29)
createTagBody(3, {->
invokeTag('message','g',71,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',71,['class':("edit"),'action':("edit"),'resource':(comentarioInstance)],3)
printHtmlPart(30)
invokeTag('actionSubmit','g',72,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(31)
})
invokeTag('form','g',74,['url':([resource:comentarioInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(32)
})
invokeTag('captureBody','sitemesh',76,[:],1)
printHtmlPart(33)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1407564380324L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
