package datos;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.Set;

import utils.FechaUtils;

public class Localidad extends Lugar {
	private String codPostal;
	private boolean cumplirCuarentena;

	@Override
	public boolean ingresoHabilitado(int idPermiso, LocalDate fecha) {
		boolean habilitado = false;
		Iterator<Permiso> permisosIterator = permisos.iterator();

		while (permisosIterator.hasNext() && !habilitado) {
			Permiso permisoActual = permisosIterator.next();
			if (FechaUtils.estaEnPeriodoDeFecha(fecha, permisoActual.getCantDias(), permisoActual.getFecha())) {
				habilitado = true;
			}
		}
		return habilitado;
	}

	public Localidad() {

	}

	public Localidad(int idLugar, String lugar, Set<Permiso> permisos, String codPostal, boolean cumplirCuarentena) {
		super(idLugar, lugar, permisos);
		this.setCodPostal(codPostal);
		this.setCumplirCuarentena(cumplirCuarentena);
	}

	public String getCodPostal() {
		return codPostal;
	}

	public void setCodPostal(String codPostal) {
		this.codPostal = codPostal;
	}

	public boolean isCumplirCuarentena() {
		return cumplirCuarentena;
	}

	public void setCumplirCuarentena(boolean cumplirCuarentena) {
		this.cumplirCuarentena = cumplirCuarentena;
	}

	@Override
	public String toString() {
		return "Localidad [" + super.toString() + ", codPostal=" + codPostal + ", cumplirCuarentena="
				+ cumplirCuarentena + "]";
	}
}
