package datos;

public class Persona {
	private int idPersona;
	private String nombre;
	private String apellido;
	private long dni;

	public Persona() {

	}

	public Persona(int idPersona, String nombre, String apellido, long dni) {
		this.setIdPersona(idPersona);
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setDni(dni);
	}

	public int getIdPersona() {
		return idPersona;
	}

	protected void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni
				+ "]";
	}
}
