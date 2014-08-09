import ar.edu.unlam.eduweb.usuario.Usuario
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_eduweb2014_2_usuarioshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/usuario/show.gsp" }
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
if(true && (usuarioInstance?.dni)) {
printHtmlPart(18)
invokeTag('message','g',34,['code':("usuario.dni.label"),'default':("Dni")],-1)
printHtmlPart(19)
invokeTag('fieldValue','g',36,['bean':(usuarioInstance),'field':("dni")],-1)
printHtmlPart(20)
}
printHtmlPart(21)
if(true && (usuarioInstance?.apellido)) {
printHtmlPart(22)
invokeTag('message','g',43,['code':("usuario.apellido.label"),'default':("Apellido")],-1)
printHtmlPart(23)
invokeTag('fieldValue','g',45,['bean':(usuarioInstance),'field':("apellido")],-1)
printHtmlPart(20)
}
printHtmlPart(21)
if(true && (usuarioInstance?.nombre)) {
printHtmlPart(24)
invokeTag('message','g',52,['code':("usuario.nombre.label"),'default':("Nombre")],-1)
printHtmlPart(25)
invokeTag('fieldValue','g',54,['bean':(usuarioInstance),'field':("nombre")],-1)
printHtmlPart(20)
}
printHtmlPart(21)
if(true && (usuarioInstance?.username)) {
printHtmlPart(26)
invokeTag('message','g',61,['code':("usuario.username.label"),'default':("Username")],-1)
printHtmlPart(27)
invokeTag('fieldValue','g',63,['bean':(usuarioInstance),'field':("username")],-1)
printHtmlPart(20)
}
printHtmlPart(21)
if(true && (usuarioInstance?.email)) {
printHtmlPart(28)
invokeTag('message','g',70,['code':("usuario.email.label"),'default':("Email")],-1)
printHtmlPart(29)
invokeTag('fieldValue','g',72,['bean':(usuarioInstance),'field':("email")],-1)
printHtmlPart(20)
}
printHtmlPart(21)
if(true && (usuarioInstance?.cursos)) {
printHtmlPart(30)
invokeTag('message','g',79,['code':("usuario.cursos.label"),'default':("Cursos")],-1)
printHtmlPart(31)
for( c in (usuarioInstance.cursos) ) {
printHtmlPart(32)
createTagBody(4, {->
expressionOut.print(c?.nombre)
printHtmlPart(33)
expressionOut.print(c?.profesor.apellido)
printHtmlPart(34)
expressionOut.print(c?.profesor.nombre)
printHtmlPart(35)
})
invokeTag('link','g',82,['controller':("curso"),'action':("show"),'id':(c.id)],4)
printHtmlPart(36)
}
printHtmlPart(37)
}
printHtmlPart(21)
if(true && (usuarioInstance?.temas)) {
printHtmlPart(38)
invokeTag('message','g',90,['code':("usuario.temas.label"),'default':("Temas")],-1)
printHtmlPart(31)
for( t in (usuarioInstance.temas) ) {
printHtmlPart(39)
createTagBody(4, {->
expressionOut.print(t?.titulo)
})
invokeTag('link','g',93,['controller':("tema"),'action':("show"),'id':(t.id)],4)
printHtmlPart(36)
}
printHtmlPart(37)
}
printHtmlPart(21)
if(true && (usuarioInstance?.actividades)) {
printHtmlPart(40)
invokeTag('message','g',101,['code':("usuario.actividades.label"),'default':("Actividades")],-1)
printHtmlPart(31)
for( a in (usuarioInstance.actividades) ) {
printHtmlPart(41)
createTagBody(4, {->
expressionOut.print(a?.encodeAsHTML())
})
invokeTag('link','g',104,['controller':("actividad"),'action':("show"),'id':(a.id)],4)
printHtmlPart(36)
}
printHtmlPart(37)
}
printHtmlPart(21)
if(true && (usuarioInstance?.accountExpired)) {
printHtmlPart(42)
invokeTag('message','g',112,['code':("usuario.accountExpired.label"),'default':("Account Expired")],-1)
printHtmlPart(43)
invokeTag('formatBoolean','g',114,['boolean':(usuarioInstance?.accountExpired)],-1)
printHtmlPart(20)
}
printHtmlPart(21)
if(true && (usuarioInstance?.accountLocked)) {
printHtmlPart(44)
invokeTag('message','g',121,['code':("usuario.accountLocked.label"),'default':("Account Locked")],-1)
printHtmlPart(45)
invokeTag('formatBoolean','g',123,['boolean':(usuarioInstance?.accountLocked)],-1)
printHtmlPart(20)
}
printHtmlPart(21)
if(true && (usuarioInstance?.passwordExpired)) {
printHtmlPart(46)
invokeTag('message','g',130,['code':("usuario.passwordExpired.label"),'default':("Password Expired")],-1)
printHtmlPart(47)
invokeTag('formatBoolean','g',132,['boolean':(usuarioInstance?.passwordExpired)],-1)
printHtmlPart(20)
}
printHtmlPart(48)
createTagBody(2, {->
printHtmlPart(49)
createTagBody(3, {->
invokeTag('message','g',140,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',140,['class':("edit"),'action':("edit"),'resource':(usuarioInstance)],3)
printHtmlPart(50)
invokeTag('actionSubmit','g',141,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(51)
})
invokeTag('form','g',143,['url':([resource:usuarioInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(52)
})
invokeTag('captureBody','sitemesh',145,[:],1)
printHtmlPart(53)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1407563380052L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
