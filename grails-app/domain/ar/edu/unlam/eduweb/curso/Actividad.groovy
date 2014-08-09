package ar.edu.unlam.eduweb.curso

class Actividad {
	
	String titulo
	String tipo
	String consigna
	Date fechaInicio
	Date fechaEntrega
	File archivo
	
	static belongsTo = [
		curso: Curso 
	] 

    static constraints = { 
		titulo ()
		tipo inList: [
				"Ejercitación",
				"Trabajo Práctico Individual",
				"Trabajo Práctico Grupal",
				"Examen Parcial",
				"Examen Final",
				"Examen Recuperatorio"
		]
		consigna ()
		fechaInicio min: new Date()
		fechaEntrega ()
		archivo nullable: true
    }
}
