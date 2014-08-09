import ar.edu.unlam.eduweb.foro.Comentario
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_eduweb2014_2_comentarioindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/comentario/index.gsp" }
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
invokeTag('message','g',8,['code':("default.list.label"),'args':([entityName])],-1)
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
invokeTag('message','g',21,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',21,['class':("create"),'action':("create")],2)
printHtmlPart(12)
invokeTag('message','g',25,['code':("default.list.label"),'args':([entityName])],-1)
printHtmlPart(13)
if(true && (flash.message)) {
printHtmlPart(14)
expressionOut.print(flash.message)
printHtmlPart(15)
}
printHtmlPart(16)
invokeTag('sortableColumn','g',33,['property':("mensaje"),'title':(message(code: 'comentario.mensaje.label', default: 'Mensaje'))],-1)
printHtmlPart(17)
invokeTag('sortableColumn','g',35,['property':("autor"),'title':(message(code: 'comentario.autor.label', default: 'Autor'))],-1)
printHtmlPart(18)
invokeTag('message','g',37,['code':("comentario.tema.label"),'default':("Tema")],-1)
printHtmlPart(19)
invokeTag('sortableColumn','g',39,['property':("fechaCreacion"),'title':(message(code: 'comentario.fechaCreacion.label', default: 'Fecha Creacion'))],-1)
printHtmlPart(20)
loop:{
int i = 0
for( comentarioInstance in (comentarioInstanceList) ) {
printHtmlPart(21)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(22)
createTagBody(3, {->
expressionOut.print(fieldValue(bean: comentarioInstance, field: "mensaje"))
})
invokeTag('link','g',47,['action':("show"),'id':(comentarioInstance.id)],3)
printHtmlPart(23)
expressionOut.print(fieldValue(bean: comentarioInstance, field: "autor"))
printHtmlPart(23)
expressionOut.print(fieldValue(bean: comentarioInstance, field: "tema"))
printHtmlPart(23)
invokeTag('formatDate','g',53,['date':(comentarioInstance.fechaCreacion)],-1)
printHtmlPart(24)
i++
}
}
printHtmlPart(25)
invokeTag('paginate','g',60,['total':(comentarioInstanceCount ?: 0)],-1)
printHtmlPart(26)
})
invokeTag('captureBody','sitemesh',63,[:],1)
printHtmlPart(27)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1407564380906L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
