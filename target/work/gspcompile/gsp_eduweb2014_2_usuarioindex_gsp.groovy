import ar.edu.unlam.eduweb.usuario.Usuario
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_eduweb2014_2_usuarioindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/usuario/index.gsp" }
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
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'usuario.label', default: 'Usuario'))],-1)
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
invokeTag('sortableColumn','g',33,['property':("dni"),'title':(message(code: 'usuario.dni.label', default: 'Dni'))],-1)
printHtmlPart(17)
invokeTag('sortableColumn','g',35,['property':("apellido"),'title':(message(code: 'usuario.apellido.label', default: 'Apellido'))],-1)
printHtmlPart(17)
invokeTag('sortableColumn','g',37,['property':("nombre"),'title':(message(code: 'usuario.nombre.label', default: 'Nombre'))],-1)
printHtmlPart(17)
invokeTag('sortableColumn','g',39,['property':("username"),'title':(message(code: 'usuario.username.label', default: 'Username'))],-1)
printHtmlPart(17)
invokeTag('sortableColumn','g',41,['property':("email"),'title':(message(code: 'usuario.email.label', default: 'Email'))],-1)
printHtmlPart(17)
invokeTag('sortableColumn','g',43,['property':("accountExpired"),'title':(message(code: 'usuario.accountExpired.label', default: 'Account Expired'))],-1)
printHtmlPart(18)
loop:{
int i = 0
for( usuarioInstance in (usuarioInstanceList) ) {
printHtmlPart(19)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(20)
createTagBody(3, {->
expressionOut.print(fieldValue(bean: usuarioInstance, field: "dni"))
})
invokeTag('link','g',51,['action':("show"),'id':(usuarioInstance.id)],3)
printHtmlPart(21)
expressionOut.print(fieldValue(bean: usuarioInstance, field: "apellido"))
printHtmlPart(21)
expressionOut.print(fieldValue(bean: usuarioInstance, field: "nombre"))
printHtmlPart(21)
expressionOut.print(fieldValue(bean: usuarioInstance, field: "username"))
printHtmlPart(21)
expressionOut.print(fieldValue(bean: usuarioInstance, field: "email"))
printHtmlPart(21)
invokeTag('formatBoolean','g',61,['boolean':(usuarioInstance.accountExpired)],-1)
printHtmlPart(22)
i++
}
}
printHtmlPart(23)
invokeTag('paginate','g',68,['total':(usuarioInstanceCount ?: 0)],-1)
printHtmlPart(24)
})
invokeTag('captureBody','sitemesh',71,[:],1)
printHtmlPart(25)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1407561341690L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
