package ar.edu.unlam.eduweb.usuario

import ar.edu.unlam.eduweb.curso.Actividad
import ar.edu.unlam.eduweb.curso.Curso
import ar.edu.unlam.eduweb.foro.Tema

class Usuario {

	transient springSecurityService

	String username
	String password
	boolean enabled = true
	boolean accountExpired
	boolean accountLocked
	boolean passwordExpired
	
	String nombre
	String apellido
	String dni
	String email
	
	static belongsTo = ar.edu.unlam.eduweb.curso.Curso
	
	static hasMany = [
		cursos: Curso, 
		temas: Tema, 
		actividades: Actividad
	]

	static transients = ['springSecurityService']

	static constraints = {
		username blank: false, unique: true
		password blank: false
	}

	static mapping = {
		password column: '`password`'
	}

	Set<Rol> getAuthorities() {
		UsuarioRol.findAllByUsuario(this).collect { it.rol }
	}

	def beforeInsert() {
		encodePassword()
	}

	def beforeUpdate() {
		if (isDirty('password')) {
			encodePassword()
		}
	}

	protected void encodePassword() {
		password = springSecurityService?.passwordEncoder ? springSecurityService.encodePassword(password) : password
	}
}
