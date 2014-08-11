package ar.edu.unlam.eduweb.foro

import ar.edu.unlam.eduweb.usuario.Usuario

class Comentario {
	
	String mensaje
	Date fechaCreacion
	
	static belongsTo = [
		autor: Usuario,
		tema: Tema	
	]

    static constraints = {
    }
}
