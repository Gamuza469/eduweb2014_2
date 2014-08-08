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
		tipo inList: [
				"Ejercitación",
				"Trabajo Práctico Individual",
				"Trabajo Práctico Grupal",
				"Examen Parcial",
				"Examen Final",
				"Examen Recuperatorio"
		]
		fechaInicio min: new Date()
		archivo nullable: true
    }
}
