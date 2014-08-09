package ar.edu.unlam.eduweb.foro

import ar.edu.unlam.eduweb.curso.Curso

class Tema {
	
	String titulo
	String mensaje
	Date fechaCreacion
	Boolean bloqueado
	
	static belongsTo = [
		curso: Curso	
	]
	
	static hasMany = [
		comentarios: Comentario	
	]

    static constraints = {
		titulo ()
		mensaje ()
		fechaCreacion ()
		curso ()
		comentarios ()
		bloqueado nullable: true
    }
}
