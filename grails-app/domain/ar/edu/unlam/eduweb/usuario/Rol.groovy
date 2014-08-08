package ar.edu.unlam.eduweb.usuario

class Rol {

	String authority

	static mapping = {
		cache true
	}

	static constraints = {
		authority blank: false, unique: true, inList: [
			"ROLE_ADMIN",
			"ROLE_DATA_ENTRY",
			"ROLE_PROFESOR",
			"ROLE_ALUMNO"
		]
	}
}
