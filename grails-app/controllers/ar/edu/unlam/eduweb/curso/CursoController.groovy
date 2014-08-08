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
				def cursoCriteria = Curso.createCriteria()
					
				cursosDelUsuario = cursoCriteria.list() {
					alumnos {
						eq('alumno', usuarioConectado)
					}
				}
			} else if (role.getAuthority() == 'ROLE_PROFESOR') {
				def cursoCriteria = Curso.createCriteria()
					
				cursosDelUsuario = cursoCriteria.list() {
					eq('profesor', usuarioConectado)
				}
			}
		}
		
		respond cursosDelUsuario
	}

}


