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
				"Ejercitaci�n",
				"Trabajo Pr�ctico Individual",
				"Trabajo Pr�ctico Grupal",
				"Examen Parcial",
				"Examen Final",
				"Examen Recuperatorio"
		]
		fechaInicio min: new Date()
		fechaEntrega ()
		archivo nullable: true
    }
}
