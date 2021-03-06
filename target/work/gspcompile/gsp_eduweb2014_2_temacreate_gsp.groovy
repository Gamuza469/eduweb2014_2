import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_eduweb2014_2_temacreate_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/tema/create.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
invokeTag('set','g',5,['var':("entityName"),'value':(message(code: 'tema.label', default: 'Tema'))],-1)
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',6,['code':("default.create.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',6,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',6,[:],2)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',7,[:],1)
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
invokeTag('message','g',15,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(8)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(9)
invokeTag('message','g',18,['code':("default.home.label")],-1)
printHtmlPart(10)
createTagBody(2, {->
invokeTag('message','g',19,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('link','g',19,['class':("list"),'action':("index")],2)
printHtmlPart(11)
invokeTag('message','g',23,['code':("default.create.label"),'args':([entityName])],-1)
printHtmlPart(12)
if(true && (flash.message)) {
printHtmlPart(13)
expressionOut.print(flash.message)
printHtmlPart(14)
}
printHtmlPart(15)
createTagBody(2, {->
printHtmlPart(16)
createTagBody(3, {->
printHtmlPart(17)
if(true && (error in org.springframework.validation.FieldError)) {
printHtmlPart(18)
expressionOut.print(error.field)
printHtmlPart(19)
}
printHtmlPart(20)
invokeTag('message','g',30,['error':(error)],-1)
printHtmlPart(21)
})
invokeTag('eachError','g',31,['bean':(temaInstance),'var':("error")],3)
printHtmlPart(22)
})
invokeTag('hasErrors','g',33,['bean':(temaInstance)],2)
printHtmlPart(15)
createTagBody(2, {->
printHtmlPart(23)
invokeTag('render','g',36,['template':("form")],-1)
printHtmlPart(24)
invokeTag('submitButton','g',39,['name':("create"),'class':("save"),'value':(message(code: 'default.button.create.label', default: 'Create'))],-1)
printHtmlPart(25)
})
invokeTag('form','g',41,['url':([resource:temaInstance, action:'save'])],2)
printHtmlPart(26)
})
invokeTag('captureBody','sitemesh',43,[:],1)
printHtmlPart(27)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1407562662494L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
