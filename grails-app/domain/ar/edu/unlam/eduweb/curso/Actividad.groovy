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
				"Ejercitaci�n",
				"Trabajo Pr�ctico Individual",
				"Trabajo Pr�ctico Grupal",
				"Examen Parcial",
				"Examen Final",
				"Examen Recuperatorio"
		]
		fechaInicio min: new Date()
		archivo nullable: true
    }
}
