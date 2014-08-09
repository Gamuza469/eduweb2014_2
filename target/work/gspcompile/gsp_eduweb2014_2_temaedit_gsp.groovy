import ar.edu.unlam.eduweb.foro.Tema
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_eduweb2014_2_temaedit_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/tema/edit.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
invokeTag('set','g',6,['var':("entityName"),'value':(message(code: 'tema.label', default: 'Tema'))],-1)
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',7,['code':("default.edit.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',7,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',7,[:],2)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',8,[:],1)
printHtmlPart(2)
createTagBody(1, {->
printHtmlPart(3)
expressionOut.print(createLink(controller:'Curso', action: 'index'))
printHtmlPart(4)
expressionOut.print(createLink(controller:'Tema', action: 'index'))
printHtmlPart(5)
expressionOut.print(createLink(controller:'Mensaje', action: 'index'))
printHtmlPart(6)
expressionOut.print(assetPath(src:'chicos2.png'))
printHtmlPart(7)
invokeTag('message','g',16,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(8)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(9)
invokeTag('message','g',19,['code':("default.home.label")],-1)
printHtmlPart(10)
createTagBody(2, {->
invokeTag('message','g',20,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('link','g',20,['class':("list"),'action':("index")],2)
printHtmlPart(11)
createTagBody(2, {->
invokeTag('message','g',21,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',21,['class':("create"),'action':("create")],2)
printHtmlPart(12)
invokeTag('message','g',25,['code':("default.edit.label"),'args':([entityName])],-1)
printHtmlPart(13)
if(true && (flash.message)) {
printHtmlPart(14)
expressionOut.print(flash.message)
printHtmlPart(15)
}
printHtmlPart(16)
createTagBody(2, {->
printHtmlPart(17)
createTagBody(3, {->
printHtmlPart(18)
if(true && (error in org.springframework.validation.FieldError)) {
printHtmlPart(19)
expressionOut.print(error.field)
printHtmlPart(20)
}
printHtmlPart(21)
invokeTag('message','g',32,['error':(error)],-1)
printHtmlPart(22)
})
invokeTag('eachError','g',33,['bean':(temaInstance),'var':("error")],3)
printHtmlPart(23)
})
invokeTag('hasErrors','g',35,['bean':(temaInstance)],2)
printHtmlPart(16)
createTagBody(2, {->
printHtmlPart(24)
invokeTag('hiddenField','g',37,['name':("version"),'value':(temaInstance?.version)],-1)
printHtmlPart(25)
invokeTag('render','g',39,['template':("form")],-1)
printHtmlPart(26)
invokeTag('actionSubmit','g',42,['class':("save"),'action':("update"),'value':(message(code: 'default.button.update.label', default: 'Update'))],-1)
printHtmlPart(27)
})
invokeTag('form','g',44,['url':([resource:temaInstance, action:'update']),'method':("PUT")],2)
printHtmlPart(28)
})
invokeTag('captureBody','sitemesh',46,[:],1)
printHtmlPart(29)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1407562662322L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
