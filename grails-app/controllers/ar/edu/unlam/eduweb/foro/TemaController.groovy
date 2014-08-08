package ar.edu.unlam.eduweb.foro

class TemaController {
	
	def springSecurityService

    static scaffold = true
	
	def index () {
		def usuarioConectado = getAuthenticatedUser()
		def roles = springSecurityService.getPrincipal().getAuthorities()
		def temasDeLosCursos
		
		for(def role in roles){
			if (role.getAuthority() == 'ROLE_ADMIN') {
				temasDeLosCursos = Tema.list()
			} else if (role.getAuthority() == 'ROLE_ALUMNO') {
				def temaCriteria = Tema.createCriteria()
					
				temasDeLosCursos = temaCriteria.list() {
					curso {
						alumnos {
							eq('alumno', usuarioConectado)
						}
					}
				}
			} else if (role.getAuthority() == 'ROLE_PROFESOR') {
				def temaCriteria = Tema.createCriteria()
					
				temasDeLosCursos = temaCriteria.list() {
					curso {
						eq('profesor', usuarioConectado)
					}
				}
			}
		}
		
		respond temasDeLosCursos
	}
	
}
