package ar.edu.unlam.eduweb.curso

class Apunte {
	
	String nombre
	Date fecha

	static belongsTo = [
		curso: Curso	
	]
	
    static constraints = {
    }
}
