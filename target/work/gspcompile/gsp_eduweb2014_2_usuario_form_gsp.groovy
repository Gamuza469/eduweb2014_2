import ar.edu.unlam.eduweb.usuario.Usuario
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_eduweb2014_2_usuario_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/usuario/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: usuarioInstance, field: 'dni', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("usuario.dni.label"),'default':("Dni")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("dni"),'required':(""),'value':(usuarioInstance?.dni)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: usuarioInstance, field: 'apellido', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("usuario.apellido.label"),'default':("Apellido")],-1)
printHtmlPart(2)
invokeTag('textField','g',19,['name':("apellido"),'required':(""),'value':(usuarioInstance?.apellido)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: usuarioInstance, field: 'nombre', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("usuario.nombre.label"),'default':("Nombre")],-1)
printHtmlPart(2)
invokeTag('textField','g',28,['name':("nombre"),'required':(""),'value':(usuarioInstance?.nombre)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: usuarioInstance, field: 'username', 'error'))
printHtmlPart(6)
invokeTag('message','g',34,['code':("usuario.username.label"),'default':("Username")],-1)
printHtmlPart(2)
invokeTag('textField','g',37,['name':("username"),'required':(""),'value':(usuarioInstance?.username)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: usuarioInstance, field: 'email', 'error'))
printHtmlPart(7)
invokeTag('message','g',43,['code':("usuario.email.label"),'default':("Email")],-1)
printHtmlPart(2)
invokeTag('textField','g',46,['name':("email"),'required':(""),'value':(usuarioInstance?.email)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: usuarioInstance, field: 'cursos', 'error'))
printHtmlPart(8)
invokeTag('message','g',52,['code':("usuario.cursos.label"),'default':("Cursos")],-1)
printHtmlPart(9)
for( c in (usuarioInstance?.cursos) ) {
printHtmlPart(10)
createTagBody(2, {->
expressionOut.print(c?.encodeAsHTML())
})
invokeTag('link','g',58,['controller':("curso"),'action':("show"),'id':(c.id)],2)
printHtmlPart(11)
}
printHtmlPart(12)
createTagBody(1, {->
expressionOut.print(message(code: 'default.add.label', args: [message(code: 'curso.label', default: 'Curso')]))
})
invokeTag('link','g',61,['controller':("curso"),'action':("create"),'params':(['usuario.id': usuarioInstance?.id])],1)
printHtmlPart(13)
expressionOut.print(hasErrors(bean: usuarioInstance, field: 'temas', 'error'))
printHtmlPart(14)
invokeTag('message','g',70,['code':("usuario.temas.label"),'default':("Temas")],-1)
printHtmlPart(15)
invokeTag('select','g',73,['name':("temas"),'from':(ar.edu.unlam.eduweb.foro.Tema.list()),'multiple':("multiple"),'optionKey':("id"),'size':("5"),'value':(usuarioInstance?.temas*.id),'class':("many-to-many")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: usuarioInstance, field: 'actividades', 'error'))
printHtmlPart(16)
invokeTag('message','g',79,['code':("usuario.actividades.label"),'default':("Actividades")],-1)
printHtmlPart(15)
invokeTag('select','g',82,['name':("actividades"),'from':(ar.edu.unlam.eduweb.curso.Actividad.list()),'multiple':("multiple"),'optionKey':("id"),'size':("5"),'value':(usuarioInstance?.actividades*.id),'class':("many-to-many")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: usuarioInstance, field: 'accountExpired', 'error'))
printHtmlPart(17)
invokeTag('message','g',88,['code':("usuario.accountExpired.label"),'default':("Account Expired")],-1)
printHtmlPart(15)
invokeTag('checkBox','g',91,['name':("accountExpired"),'value':(usuarioInstance?.accountExpired)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: usuarioInstance, field: 'accountLocked', 'error'))
printHtmlPart(18)
invokeTag('message','g',97,['code':("usuario.accountLocked.label"),'default':("Account Locked")],-1)
printHtmlPart(15)
invokeTag('checkBox','g',100,['name':("accountLocked"),'value':(usuarioInstance?.accountLocked)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: usuarioInstance, field: 'passwordExpired', 'error'))
printHtmlPart(19)
invokeTag('message','g',106,['code':("usuario.passwordExpired.label"),'default':("Password Expired")],-1)
printHtmlPart(15)
invokeTag('checkBox','g',109,['name':("passwordExpired"),'value':(usuarioInstance?.passwordExpired)],-1)
printHtmlPart(20)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1407561342391L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
