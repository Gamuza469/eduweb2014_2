package ar.edu.unlam.eduweb.curso

import ar.edu.unlam.eduweb.foro.Tema
import ar.edu.unlam.eduweb.usuario.Usuario

class Curso {
	
	String nombre
	String descripcion
	
	static hasMany = [
		temas: Tema, 
		actividades: Actividad, 
		usuarios: Usuario, 
		apuntes: Apunte
	]
	
	static hasOne = [
		profesor: Usuario	
	]

    static constraints = {
    }
}