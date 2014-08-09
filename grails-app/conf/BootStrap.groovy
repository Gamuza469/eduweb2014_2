import ar.edu.unlam.eduweb.usuario.Rol
import ar.edu.unlam.eduweb.usuario.Usuario
import ar.edu.unlam.eduweb.usuario.UsuarioRol

class BootStrap {

    def init = { servletContext ->
		/*def alumnoRole = new Rol(authority: 'ROLE_ALUMNO')
		def profesorRole = new Rol(authority: 'ROLE_PROFESOR')
		def dataEntryRole = new Rol(authority: 'ROLE_DATA_ENTRY')
		def adminRole = new Rol(authority: 'ROLE_ADMIN')
		
		alumnoRole.save(flush: true)
		profesorRole.save(flush: true)
		dataEntryRole.save(flush: true)
		adminRole.save(flush: true)
	
		def usuarioAdmin = new Usuario(username: 'damio', password: 'malcomp', nombre: 'Damian', apellido: 'Berruezo', dni:'12334456',email:'asd@asd')
		def usuarioDataEntry = new Usuario(username: 'marcos', password: 'calzoto', nombre: 'Marcos', apellido: 'Scalzotto', dni: '34738845', email: 'mar@calzot')
		def usuarioProfe1 = new Usuario(username: 'lucas', password: 'videla', nombre: 'Lucas', apellido: 'Videla', dni: '28838857', email: 'l@videla')
		def usuarioProfe2 = new Usuario(username: 'matias', password: 'gonzalez', nombre: 'Matias', apellido: 'Gonzalez', dni: '38338457', email: 'm@gon')
		def usuarioProfe3 = new Usuario(username: 'ruben', password: 'dario', nombre: 'Ruben', apellido: 'Dario', dni: '25898417', email: 'ruben@dario')
		def usuarioAlumno1 = new Usuario(username: 'Tim', password: 'timoty', nombre: 'Jorge', apellido: 'Hylan', dni: '29598557', email: 't@hylan')
		def usuarioAlumno2 = new Usuario(username: 'Pepe', password: 'pepin', nombre: 'Jose', apellido: 'Ginobart', dni: '34598557', email: 'pepe@gino')
		def usuarioAlumno3 = new Usuario(username: 'Alice', password: 'alice', nombre: 'Alicia', apellido: 'Rosenthal', dni: '20538657', email: 'a@rosenthal')
		
		usuarioAdmin.save(flush: true)
		usuarioDataEntry.save(flush: true)
		usuarioProfe1.save(flush: true)
		usuarioProfe2.save(flush: true)
		usuarioProfe3.save(flush: true)
		usuarioAlumno1.save(flush: true)
		usuarioAlumno2.save(flush: true)
		usuarioAlumno3.save(flush: true)
		
		UsuarioRol.create(usuarioAdmin,adminRole,true)
		UsuarioRol.create(usuarioDataEntry,dataEntryRole,true)
		UsuarioRol.create(usuarioProfe1,profesorRole,true)
		UsuarioRol.create(usuarioProfe2,profesorRole,true)
		UsuarioRol.create(usuarioProfe3,profesorRole,true)
		UsuarioRol.create(usuarioAlumno1,alumnoRole,true)
		UsuarioRol.create(usuarioAlumno2,alumnoRole,true)
		UsuarioRol.create(usuarioAlumno3,alumnoRole,true)
		
		assert Usuario.count() == 8
		assert Rol.count() == 4
		assert UsuarioRol.count() == 8
		*/
	}
	
    def destroy = {
    }
}
