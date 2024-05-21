package datos;

import java.time.LocalDate;
import java.util.Set;

public class Permiso {
	private int idPermiso;
	private LocalDate fecha;
	private int cantDias;
	private Persona persona;
	private Rodado rodado;
	private Set<Lugar> desdeHasta;

	public Permiso() {

	}

	public Permiso(int idPermiso, Persona persona, LocalDate fecha, int cantDias, Rodado rodado,
			Set<Lugar> desdeHasta) {
		this.setIdPermiso(idPermiso);
		this.setPersona(persona);
		this.setFecha(fecha);
		this.setCantDias(cantDias);
		this.setRodado(rodado);
		this.setDesdeHasta(desdeHasta);
	}

	public int getIdPermiso() {
		return idPermiso;
	}

	protected void setIdPermiso(int idPermiso) {
		this.idPermiso = idPermiso;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public int getCantDias() {
		return cantDias;
	}

	public void setCantDias(int cantDias) {
		this.cantDias = cantDias;
	}

	public Rodado getRodado() {
		return rodado;
	}

	public void setRodado(Rodado rodado) {
		this.rodado = rodado;
	}

	public Set<Lugar> getDesdeHasta() {
		return desdeHasta;
	}

	public void setDesdeHasta(Set<Lugar> desdeHasta) {
		this.desdeHasta = desdeHasta;
	}

	@Override
	public String toString() {
		return "Permiso [idPermiso=" + idPermiso + ", persona=" + persona + ", fecha=" + fecha + ", cantDias="
				+ cantDias + ", rodado=" + rodado + ", desdeHasta=" + desdeHasta + "]";
	}
}
