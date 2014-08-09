import ar.edu.unlam.eduweb.curso.Curso
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_eduweb2014_2_cursoshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/curso/show.gsp" }
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
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'curso.label', default: 'Curso'))],-1)
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
invokeTag('message','g',11,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(5)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(6)
invokeTag('message','g',14,['code':("default.home.label")],-1)
printHtmlPart(7)
createTagBody(2, {->
invokeTag('message','g',15,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('link','g',15,['class':("list"),'action':("index")],2)
printHtmlPart(8)
createTagBody(2, {->
invokeTag('message','g',16,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',16,['class':("create"),'action':("create")],2)
printHtmlPart(9)
invokeTag('message','g',20,['code':("default.show.label"),'args':([entityName])],-1)
printHtmlPart(10)
if(true && (flash.message)) {
printHtmlPart(11)
expressionOut.print(flash.message)
printHtmlPart(12)
}
printHtmlPart(13)
if(true && (cursoInstance?.alumnos)) {
printHtmlPart(14)
invokeTag('message','g',28,['code':("curso.alumnos.label"),'default':("Alumnos")],-1)
printHtmlPart(15)
for( a in (cursoInstance.alumnos) ) {
printHtmlPart(16)
createTagBody(4, {->
expressionOut.print(a?.encodeAsHTML())
})
invokeTag('link','g',31,['controller':("alumno"),'action':("show"),'id':(a.id)],4)
printHtmlPart(17)
}
printHtmlPart(18)
}
printHtmlPart(19)
if(true && (cursoInstance?.actividades)) {
printHtmlPart(20)
invokeTag('message','g',39,['code':("curso.actividades.label"),'default':("Actividades")],-1)
printHtmlPart(15)
for( a in (cursoInstance.actividades) ) {
printHtmlPart(21)
createTagBody(4, {->
expressionOut.print(a?.encodeAsHTML())
})
invokeTag('link','g',42,['controller':("actividad"),'action':("show"),'id':(a.id)],4)
printHtmlPart(17)
}
printHtmlPart(18)
}
printHtmlPart(19)
if(true && (cursoInstance?.apuntes)) {
printHtmlPart(22)
invokeTag('message','g',50,['code':("curso.apuntes.label"),'default':("Apuntes")],-1)
printHtmlPart(15)
for( a in (cursoInstance.apuntes) ) {
printHtmlPart(23)
createTagBody(4, {->
expressionOut.print(a?.encodeAsHTML())
})
invokeTag('link','g',53,['controller':("apunte"),'action':("show"),'id':(a.id)],4)
printHtmlPart(17)
}
printHtmlPart(18)
}
printHtmlPart(19)
if(true && (cursoInstance?.descripcion)) {
printHtmlPart(24)
invokeTag('message','g',61,['code':("curso.descripcion.label"),'default':("Descripcion")],-1)
printHtmlPart(25)
invokeTag('fieldValue','g',63,['bean':(cursoInstance),'field':("descripcion")],-1)
printHtmlPart(26)
}
printHtmlPart(19)
if(true && (cursoInstance?.nombre)) {
printHtmlPart(27)
invokeTag('message','g',70,['code':("curso.nombre.label"),'default':("Nombre")],-1)
printHtmlPart(28)
invokeTag('fieldValue','g',72,['bean':(cursoInstance),'field':("nombre")],-1)
printHtmlPart(26)
}
printHtmlPart(19)
if(true && (cursoInstance?.profesor)) {
printHtmlPart(29)
invokeTag('message','g',79,['code':("curso.profesor.label"),'default':("Profesor")],-1)
printHtmlPart(30)
createTagBody(3, {->
expressionOut.print(cursoInstance?.profesor?.encodeAsHTML())
})
invokeTag('link','g',81,['controller':("usuario"),'action':("show"),'id':(cursoInstance?.profesor?.id)],3)
printHtmlPart(26)
}
printHtmlPart(19)
if(true && (cursoInstance?.temas)) {
printHtmlPart(31)
invokeTag('message','g',88,['code':("curso.temas.label"),'default':("Temas")],-1)
printHtmlPart(15)
for( t in (cursoInstance.temas) ) {
printHtmlPart(32)
createTagBody(4, {->
expressionOut.print(t?.encodeAsHTML())
})
invokeTag('link','g',91,['controller':("tema"),'action':("show"),'id':(t.id)],4)
printHtmlPart(17)
}
printHtmlPart(18)
}
printHtmlPart(33)
createTagBody(2, {->
printHtmlPart(34)
createTagBody(3, {->
invokeTag('message','g',100,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',100,['class':("edit"),'action':("edit"),'resource':(cursoInstance)],3)
printHtmlPart(35)
invokeTag('actionSubmit','g',101,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(36)
})
invokeTag('form','g',103,['url':([resource:cursoInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(37)
})
invokeTag('captureBody','sitemesh',105,[:],1)
printHtmlPart(38)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1407544648031L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
