<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main"/>
		<title>Bienvenido a Eduweb</title>
		<style type="text/css" media="screen">
			.texto_principal{
				width:500px;
				float:left;
				text-align:left;
				margin-left:30px;
				margin-top:-60px;
			}
			
			.texto_principal h1{
				font-size:40px;
				color:#2E9AFE;
			}
			
			 .texto_principal img{
				 margin-top:-90px;
				 margin-left:170px;
			}

			.ie6 #status {
				display: inline; /* float double margin fix http://www.positioniseverything.net/explorer/doubled-margin.html */
			}

			#status ul {
				font-size: 0.9em;
				list-style-type: none;
				margin-bottom: 0.6em;
				padding: 0;
			}

			#status li {
				line-height: 1.3;
			}

			#status h1 {
				text-transform: uppercase;
				font-size: 1.1em;
				margin: 0 0 0.3em;
			}

			#page-body {
				margin: 2em 1em 1.25em 18em;
			}

			h2 {
				margin-top: 1em;
				margin-bottom: 0.3em;
				font-size: 1em;
				visibility:hidden;
			}

			p {
				line-height: 1.5;
				margin: 0.25em 0;
			}

			#controller-list ul {
				list-style-position: inside;
				visibility:hidden;
			}

			#controller-list li {
				line-height: 1.3;
				list-style-position: inside;
				margin: 0.25em 0;
				visibility:hidden;
			}

			@media screen and (max-width: 480px) {
				#status {
					display: none;
				}

				#page-body {
					margin: 0 1em 1em;
				}

				#page-body h1 {
					margin-top: 0;
				}
			}
		</style>
	</head>
	<body>
		<div id="status" role="complementary">
		    <a href="${createLink(controller:'Curso', action: 'index')}" >Ver Cursos</a>
			<a href="${createLink(controller:'Tema', action: 'index')}" >Ingresar al Foro</a>
			<a href="#">Chat</a>
			<img src="${assetPath(src:'chicos2.png')}" width='321' height='115'/>
		</div>
		<div id="page-body" role="main">
			<div class='texto_principal'>
			<sec:ifLoggedIn>
				<h1>Bienvenido:</h1>
				<h1>${applicationContext.springSecurityService.currentUser.username}</h1>
            </sec:ifLoggedIn>
            <img src="${assetPath(src:'computadora2.png')}" width='321' height='115'/>
			<p>
			Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce mi turpis, 
			adipiscing in ante quis, mattis gravida ligula. Aliquam aliquam metus neque, 
			ac malesuada magna viverra in. Fusce eleifend pulvinar lorem, nec consectetur 
			tellus convallis tincidunt. Nam suscipit eros eget tortor faucibus ultricies.
			Vivamus pellentesque et nisi id ultricies. Etiam quis erat eu magna luctus 
			auctor. Nam velit enim, mattis a orci at, venenatis dictum dui. Praesent
			non mauris vestibulum, ultrices metus a, congue quam. Suspendisse potenti.
			Nunc sit amet bibendum nulla. Etiam nibh lorem, aliquet adipiscing lorem 
			aliquet, tincidunt bibendum orci. Vivamus pellentesque, magna condimentum
			sollicitudin fringilla, justo velit tincidunt mauris, eu elementum metus
			nulla sit amet neque.
			</p>
            </div>
			<div id="controller-list" role="navigation">
				<h2>Available Controllers:</h2>
				<ul>
					<g:each var="c" in="${grailsApplication.controllerClasses.sort { it.fullName } }">
						<li class="controller"><g:link controller="${c.logicalPropertyName}">${c.fullName}</g:link></li>
					</g:each>
				</ul>
			</div>
		</div>
	</body>
</html>
