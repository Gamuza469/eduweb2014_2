package ar.edu.unlam.eduweb.curso

import ar.edu.unlam.eduweb.usuario.Usuario
import ar.edu.unlam.eduweb.usuario.Alumno

class CursoController {
	
	def springSecurityService
	
	static scaffold = true
	
	def index () {
		def usuarioConectado = getAuthenticatedUser()
		def roles = springSecurityService.getPrincipal().getAuthorities()
		def cursosDelUsuario
		
		for(def role in roles){ 
			if (role.getAuthority() == 'ROLE_ADMIN') {
				cursosDelUsuario = Curso.list()
			} else if (role.getAuthority() == 'ROLE_ALUMNO') {
				cursosDelUsuario = Alumno.findAllByAlumno(usuarioConectado).toList()
			} else if (role.getAuthority() == 'ROLE_PROFESOR') {
				cursosDelUsuario = usuarioConectado.cursos
			}
		}
		
		respond cursosDelUsuario
	}

}


