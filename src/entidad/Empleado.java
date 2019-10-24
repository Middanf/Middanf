package entidad;

public class Empleado {
	
	private int codigo;
	private String nombre,apelliedos;
	private String login,clave;
	public int getCodigo() {
	return codigo;
	}
	public void setCodigo(int codigo) {
	this.codigo = codigo;
	}
	public String getNombre() {
	return nombre;
	}
	public void setNombre(String nombre) { this.nombre = nombre;
	}
	public String getApelliedos() {
	return apelliedos;
	}
	
	public void setApelliedos(String apelliedos) { this.apelliedos = apelliedos;
	}
	public String getLogin() {
	return login;
	}
	public void setLogin(String login) {
	this.login = login;
	}
	public String getClave() {
	return clave;
	}
	public void setClave(String clave) {
	this.clave = clave;
	}

}
