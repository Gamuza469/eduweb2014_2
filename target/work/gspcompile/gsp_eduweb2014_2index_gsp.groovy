import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_eduweb2014_2index_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',5,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',5,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',88,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
expressionOut.print(createLink(controller:'Curso', action: 'index'))
printHtmlPart(6)
expressionOut.print(createLink(controller:'Tema', action: 'index'))
printHtmlPart(7)
expressionOut.print(createLink(controller:'Mensaje', action: 'index'))
printHtmlPart(8)
expressionOut.print(assetPath(src:'chicos2.png'))
printHtmlPart(9)
createTagBody(2, {->
printHtmlPart(10)
expressionOut.print(applicationContext.springSecurityService.currentUser.username)
printHtmlPart(11)
})
invokeTag('ifLoggedIn','sec',101,[:],2)
printHtmlPart(12)
expressionOut.print(assetPath(src:'computadora2.png'))
printHtmlPart(13)
for( c in (grailsApplication.controllerClasses.sort { it.fullName }) ) {
printHtmlPart(14)
createTagBody(3, {->
expressionOut.print(c.fullName)
})
invokeTag('link','g',121,['controller':(c.logicalPropertyName)],3)
printHtmlPart(15)
}
printHtmlPart(16)
})
invokeTag('captureBody','sitemesh',126,[:],1)
printHtmlPart(17)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1407559063656L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
