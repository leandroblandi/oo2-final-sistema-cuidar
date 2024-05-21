package datos;

import java.time.LocalDate;
import java.util.Set;

public abstract class Lugar {
	protected int idLugar;
	protected String lugar;
	protected Set<Permiso> permisos;

	protected Lugar() {
	}

	protected Lugar(int idLugar, String lugar, Set<Permiso> permisos) {
		this.setIdLugar(idLugar);
		this.setLugar(lugar);
		this.setPermisos(permisos);
	}

	protected abstract boolean ingresoHabilitado(int idPermiso, LocalDate fecha);

	public int getIdLugar() {
		return idLugar;
	}

	public void setIdLugar(int idLugar) {
		this.idLugar = idLugar;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public Set<Permiso> getPermisos() {
		return permisos;
	}

	public void setPermisos(Set<Permiso> permisos) {
		this.permisos = permisos;
	}

	@Override
	public String toString() {
		return "idLugar=" + idLugar + ", lugar=" + lugar;
	}
}
