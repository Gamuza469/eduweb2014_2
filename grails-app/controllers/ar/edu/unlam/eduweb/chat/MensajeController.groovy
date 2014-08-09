package ar.edu.unlam.eduweb.chat

class MensajeController {
	
	def springSecurityService
	
	def index() {
		def usuarioConectado = getAuthenticatedUser()
		respond model: [nombreUsuario: usuarioConectado.username]
	}

    def join(String nombreUsuario) {
        if ( nombreUsuario.trim() == '' ) {
            redirect(action:'index')
        } else {
            session.nombreUsuario = nombreUsuario
            render (view: 'chat')
        }
    }
	
	def retrieveLatestMessages() {
		def messages = Mensaje.listOrderByDate(order: 'desc', max:10)
		[messages:messages.reverse()]
	}
	def submitMessage(String message) {
		new Mensaje(nombreUsuario: session.nombreUsuario, mensaje:message).save()
		render "<script>retrieveLatestMessages()</script>"
	}
	
}
