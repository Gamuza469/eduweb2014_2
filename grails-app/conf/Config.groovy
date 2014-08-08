// locations to search for config files that get merged into the main config;
// config files can be ConfigSlurper scripts, Java properties files, or classes
// in the classpath in ConfigSlurper format

// grails.config.locations = [ "classpath:${appName}-config.properties",
//                             "classpath:${appName}-config.groovy",
//                             "file:${userHome}/.grails/${appName}-config.properties",
//                             "file:${userHome}/.grails/${appName}-config.groovy"]

// if (System.properties["${appName}.config.location"]) {
//    grails.config.locations << "file:" + System.properties["${appName}.config.location"]
// }

grails.project.groupId = appName // change this to alter the default package name and Maven publishing destination

// The ACCEPT header will not be used for content negotiation for user agents containing the following strings (defaults to the 4 major rendering engines)
grails.mime.disable.accept.header.userAgents = ['Gecko', 'WebKit', 'Presto', 'Trident']
grails.mime.types = [ // the first one is the default format
    all:           '*/*', // 'all' maps to '*' or the first available format in withFormat
    atom:          'application/atom+xml',
    css:           'text/css',
    csv:           'text/csv',
    form:          'application/x-www-form-urlencoded',
    html:          ['text/html','application/xhtml+xml'],
    js:            'text/javascript',
    json:          ['application/json', 'text/json'],
    multipartForm: 'multipart/form-data',
    rss:           'application/rss+xml',
    text:          'text/plain',
    hal:           ['application/hal+json','application/hal+xml'],
    xml:           ['text/xml', 'application/xml']
]

// URL Mapping Cache Max Size, defaults to 5000
//grails.urlmapping.cache.maxsize = 1000

// Legacy setting for codec used to encode data with ${}
grails.views.default.codec = "html"

// The default scope for controllers. May be prototype, session or singleton.
// If unspecified, controllers are prototype scoped.
grails.controllers.defaultScope = 'singleton'

// GSP settings
grails {
    views {
        gsp {
            encoding = 'UTF-8'
            htmlcodec = 'xml' // use xml escaping instead of HTML4 escaping
            codecs {
                expression = 'html' // escapes values inside ${}
                scriptlet = 'html' // escapes output from scriptlets in GSPs
                taglib = 'none' // escapes output from taglibs
                staticparts = 'none' // escapes output from static template parts
            }
        }
        // escapes all not-encoded output at final stage of outputting
        // filteringCodecForContentType.'text/html' = 'html'
    }
}


grails.converters.encoding = "UTF-8"
// scaffolding templates configuration
grails.scaffolding.templates.domainSuffix = 'Instance'

// Set to false to use the new Grails 1.2 JSONBuilder in the render method
grails.json.legacy.builder = false
// enabled native2ascii conversion of i18n properties files
grails.enable.native2ascii = true
// packages to include in Spring bean scanning
grails.spring.bean.packages = []
// whether to disable processing of multi part requests
grails.web.disable.multipart=false

// request parameters to mask when logging exceptions
grails.exceptionresolver.params.exclude = ['password']

// configure auto-caching of queries by default (if false you can cache individual queries with 'cache: true')
grails.hibernate.cache.queries = false

// configure passing transaction's read-only attribute to Hibernate session, queries and criterias
// set "singleSession = false" OSIV mode in hibernate configuration after enabling
grails.hibernate.pass.readonly = false
// configure passing read-only to OSIV session by default, requires "singleSession = false" OSIV mode
grails.hibernate.osiv.readonly = false
grails.dbconsole.enabled = true

environments {
    development {
        grails.logging.jul.usebridge = true
    }
    production {
        grails.logging.jul.usebridge = false
        // TODO: grails.serverURL = "http://www.changeme.com"
    }
}

// log4j configuration
log4j.main = {
    // Example of changing the log pattern for the default console appender:
    //
    //appenders {
    //    console name:'stdout', layout:pattern(conversionPattern: '%c{2} %m%n')
    //}

    error  'org.codehaus.groovy.grails.web.servlet',        // controllers
           'org.codehaus.groovy.grails.web.pages',          // GSP
           'org.codehaus.groovy.grails.web.sitemesh',       // layouts
           'org.codehaus.groovy.grails.web.mapping.filter', // URL mapping
           'org.codehaus.groovy.grails.web.mapping',        // URL mapping
           'org.codehaus.groovy.grails.commons',            // core / classloading
           'org.codehaus.groovy.grails.plugins',            // plugins
           'org.codehaus.groovy.grails.orm.hibernate',      // hibernate integration
           'org.springframework',
           'org.hibernate',
           'net.sf.ehcache.hibernate'
}


// Added by the Spring Security Core plugin:
grails.plugin.springsecurity.logout.postOnly = false
grails.plugin.springsecurity.userLookup.userDomainClassName = 'ar.edu.unlam.eduweb.usuario.Usuario'
grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'ar.edu.unlam.eduweb.usuario.UsuarioRol'
grails.plugin.springsecurity.authority.className = 'ar.edu.unlam.eduweb.usuario.Rol'
grails.plugin.springsecurity.controllerAnnotations.staticRules = [
	'/':                              ['permitAll'],
	'/index':                         ['permitAll'],
	'/index.gsp':                     ['permitAll'],
	'/assets/**':                     ['permitAll'],
	'/**/js/**':                      ['permitAll'],
	'/**/css/**':                     ['permitAll'],
	'/**/images/**':                  ['permitAll'],
	'/**/favicon.ico':                ['permitAll'],
	'/dbconsole/**' :                 ['permitAll'],
	
	
	//'/**' :                 		  ['ROLE_ADMIN'],
	
	//Usuario
	/*'/usuario/create':				  ['ROLE_ADMIN','ROLE_DATA_ENTRY'],
	'/usuario/save':				  ['ROLE_ADMIN','ROLE_DATA_ENTRY'],
	
	'/usuario/index':				  ['ROLE_ADMIN','ROLE_DATA_ENTRY'],
	'/usuario/show':				  ['ROLE_ADMIN','ROLE_DATA_ENTRY'],
	
	'/usuario/edit':				  ['ROLE_ADMIN'],
	'/usuario/update':				  ['ROLE_ADMIN'],
	
	'/usuario/delete':				  ['ROLE_ADMIN'],*/
	'/usuario/**':				 	  ['permitAll'],
	
	//Curso
	'/curso/create':				  ['ROLE_ADMIN'],
	'/curso/save':					  ['ROLE_ADMIN'],
	
	'/curso/index':					  ['ROLE_ADMIN','ROLE_PROFESOR','ROLE_ALUMNO'],
	'/curso/show':					  ['ROLE_ADMIN','ROLE_PROFESOR','ROLE_ALUMNO'],
	
	'/curso/edit':					  ['ROLE_ADMIN'],
	'/curso/update':				  ['ROLE_ADMIN'],
	
	'/curso/delete':				  ['ROLE_ADMIN'],
	
	//Tema
	'/tema/create':					  ['ROLE_ADMIN','ROLE_PROFESOR'],
	'/tema/save':					  ['ROLE_ADMIN','ROLE_PROFESOR'],
	
	'/tema/index':					  ['ROLE_ADMIN','ROLE_PROFESOR','ROLE_ALUMNO'],
	'/tema/show':					  ['ROLE_ADMIN','ROLE_PROFESOR','ROLE_ALUMNO'],
	
	'/tema/edit':					  ['ROLE_ADMIN'],
	'/tema/update':					  ['ROLE_ADMIN'],
	
	'/tema/delete':					  ['ROLE_ADMIN'],

	//Actividad
	'/actividad/create':			  ['ROLE_ADMIN','ROLE_PROFESOR'],
	'/actividad/save':				  ['ROLE_ADMIN','ROLE_PROFESOR'],
	
	'/actividad/index':				  ['ROLE_ADMIN','ROLE_PROFESOR','ROLE_ALUMNO'],
	'/actividad/show':				  ['ROLE_ADMIN','ROLE_PROFESOR','ROLE_ALUMNO'],
	
	'/actividad/edit':				  ['ROLE_ADMIN','ROLE_PROFESOR'],
	'/actividad/update':			  ['ROLE_ADMIN','ROLE_PROFESOR'],
	
	'/actividad/delete':			  ['ROLE_ADMIN','ROLE_PROFESOR'],
	
	
	//Apunte
	'/apunte/create':				  ['ROLE_ADMIN','ROLE_PROFESOR'],
	'/apunte/save':					  ['ROLE_ADMIN','ROLE_PROFESOR'],
	
	'/apunte/index':				  ['ROLE_ADMIN','ROLE_PROFESOR','ROLE_ALUMNO'],
	'/apunte/show':					  ['ROLE_ADMIN','ROLE_PROFESOR','ROLE_ALUMNO'],
	
	'/apunte/edit':					  ['ROLE_ADMIN','ROLE_PROFESOR'],
	'/apunte/update':				  ['ROLE_ADMIN','ROLE_PROFESOR'],
	
	'/apunte/delete':				  ['ROLE_ADMIN','ROLE_PROFESOR'],
	
	//Entrega
	'/entrega/create':				  ['ROLE_ADMIN'],
	'/entrega/save':				  ['ROLE_ADMIN','ROLE_PROFESOR','ROLE_ALUMNO'],
	
	'/entrega/index':				  ['ROLE_ADMIN'],
	'/entrega/show':				  ['ROLE_ADMIN','ROLE_PROFESOR','ROLE_ALUMNO'],
	
	'/entrega/edit':				  ['ROLE_ADMIN','ROLE_PROFESOR','ROLE_ALUMNO'],
	'/entrega/update':				  ['ROLE_ADMIN','ROLE_PROFESOR','ROLE_ALUMNO'],
	
	'/entrega/delete':				  ['ROLE_ADMIN'],
	 
	//Comentario
	'/comentario/create':			  ['ROLE_ADMIN','ROLE_PROFESOR','ROLE_ALUMNO'],
	'/comentario/save':				  ['ROLE_ADMIN','ROLE_PROFESOR','ROLE_ALUMNO'],
	
	'/comentario/index':			  ['ROLE_ADMIN','ROLE_PROFESOR','ROLE_ALUMNO'],
	'/comentario/show':				  ['ROLE_ADMIN','ROLE_PROFESOR','ROLE_ALUMNO'],
	
	'/comentario/edit':				  ['ROLE_ADMIN','ROLE_PROFESOR','ROLE_ALUMNO'],
	'/comentario/update':			  ['ROLE_ADMIN','ROLE_PROFESOR','ROLE_ALUMNO'],
	
	'/comentario/delete':			  ['ROLE_ADMIN','ROLE_PROFESOR','ROLE_ALUMNO'],
	
	//Rol
	/*'/rol/create':				 	  ['ROLE_ADMIN','ROLE_DATA_ENTRY'],
	'/rol/save':					  ['ROLE_ADMIN','ROLE_DATA_ENTRY'],
	
	'/rol/index':					  ['ROLE_ADMIN','ROLE_DATA_ENTRY'],
	'/rol/show':					  ['ROLE_ADMIN','ROLE_DATA_ENTRY'],
	
	'/rol/edit':				 	  ['ROLE_ADMIN'],
	'/rol/update':				 	  ['ROLE_ADMIN'],
	
	'/rol/delete':					  ['ROLE_ADMIN'],*/
	'/rol/**':					  ['permitAll'],
	
	//Alumno
	'/alumno/create':				  ['ROLE_ADMIN','ROLE_DATA_ENTRY'],
	'/alumno/save':					  ['ROLE_ADMIN','ROLE_DATA_ENTRY'],
	
	'/alumno/index':				  ['ROLE_ADMIN','ROLE_DATA_ENTRY'],
	'/alumno/show':					  ['ROLE_ADMIN','ROLE_DATA_ENTRY'],
	
	'/alumno/edit':				 	  ['ROLE_ADMIN'],
	'/alumno/update':			 	  ['ROLE_ADMIN'],
	
	'/alumno/delete':				  ['ROLE_ADMIN']
]


