package ar.edu.unlam.eduweb.curso

import ar.edu.unlam.eduweb.foro.Tema
import ar.edu.unlam.eduweb.usuario.Alumno
import ar.edu.unlam.eduweb.usuario.Usuario

class Curso {
	
	String nombre
	String descripcion
	Usuario profesor
	
	static belongsTo = Usuario
	
	static hasMany = [
		temas: Tema, 
		actividades: Actividad, 
		alumnos: Alumno, 
		apuntes: Apunte
	]

    static constraints = {
		nombre ()
		descripcion ()
		profesor ()
		actividades ()
		apuntes()
		temas ()
		alumnos nullable: true, display: false
    }
}