package ar.edu.unlam.eduweb.curso

import ar.edu.unlam.eduweb.usuario.Usuario

class Entrega {
	
	String estado
	Integer nota
	File archivo
	
	static belongsTo = [
		alumno: Usuario,
		actividad: Actividad
	]

    static constraints = {
		alumno ()
		actividad ()
		estado inList: [
			"No entregado",
			"Entregado",
			"Aprobado",
			"Desaprobado",
			"Reentregar"	
		]
		nota ()
		archivo ()
    }
}
