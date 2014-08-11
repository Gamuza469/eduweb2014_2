package ar.edu.unlam.eduweb.curso

class Actividad {
	
	Date fechaInicio
	Date fechaEntrega
	String consigna
	String titulo
	String tipo
	File archivo
	//Integer nota
	//String estado
	
	static belongsTo = [
		curso: Curso	
	] 

    static constraints = { 
		titulo ()
		consigna ()
		tipo inList: [
				"Ejercitación",
				"Trabajo Práctico Individual",
				"Trabajo Práctico Grupal",
				"Examen Parcial",
				"Examen Final",
				"Examen Recuperatorio"
		]
		fechaInicio min: new Date()
		fechaEntrega ()
		archivo nullable: true
    }
}
