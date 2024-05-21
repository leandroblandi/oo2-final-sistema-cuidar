package datos;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.Set;

public class Ubicacion extends Lugar {
	private double latitud;
	private double longitud;

	@Override
	public boolean ingresoHabilitado(int idPermiso, LocalDate fecha) {
		boolean habilitado = false;
		Iterator<Permiso> permisosIterator = permisos.iterator();

		while (permisosIterator.hasNext() && !habilitado) {
			Permiso permisoActual = permisosIterator.next();

			if (permisoActual.getIdPermiso() == idPermiso && permisoActual.getFecha().equals(fecha)) {
				habilitado = true;
			}
		}
		return habilitado;
	}

	public Ubicacion() {

	}

	public Ubicacion(int idLugar, String lugar, Set<Permiso> permisos, double latitud, double longitud) {
		super(idLugar, lugar, permisos);
		this.setLatitud(latitud);
		this.setLongitud(longitud);
	}

	public double getLatitud() {
		return latitud;
	}

	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	@Override
	public String toString() {
		return "Ubicacion [" + super.toString() + ", latitud=" + latitud + ", longitud=" + longitud + "]";
	}
}
