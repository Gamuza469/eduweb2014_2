package ar.edu.unlam.eduweb.usuario

import ar.edu.unlam.eduweb.curso.Actividad
import ar.edu.unlam.eduweb.curso.Curso
import ar.edu.unlam.eduweb.foro.Tema

class Usuario {

	transient springSecurityService
	
	String nombre
	String apellido
	String dni
	String email
	
	String username
	String password
	
	boolean enabled = true
	boolean accountExpired
	boolean accountLocked
	boolean passwordExpired
	
	static hasMany = [
		cursos: Curso, 
		temas: Tema, 
		actividades: Actividad,
		alumnos: Alumno
	]
	
	static mappedBy = [
		cursos: 'profesor'
	]

	static transients = ['springSecurityService']

	static constraints = {
		dni unique: true
		apellido ()
		nombre ()
		username blank: false, unique: true
		email ()
		cursos ()
		temas ()
		actividades display: false 
		alumnos nullable: true, display: false
		password blank: false, display: false
		enabled display: false
	}

	static mapping = {
		password column: '`password`'
	}
	
	static fecthMode = [
		cursos: 'eager'
	]

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
