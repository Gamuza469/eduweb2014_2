package ar.edu.unlam.eduweb.curso

class Apunte {
	
	String nombre
	Date fecha
	File archivo

	static belongsTo = [
		curso: Curso	
	]
	
    static constraints = {
		nombre ()
		fecha ()
		curso ()
		archivo nullable: true, display: false
    }
}
