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
				"Ejercitaci�n",
				"Trabajo Pr�ctico Individual",
				"Trabajo Pr�ctico Grupal",
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
