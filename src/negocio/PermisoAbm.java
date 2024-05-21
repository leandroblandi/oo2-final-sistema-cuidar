package negocio;

import dao.PermisoDao;
import datos.Permiso;

public class PermisoAbm {

	private PermisoDao permisoDao;
	private static PermisoAbm instancia;

	private PermisoAbm() {
		this.permisoDao = PermisoDao.getInstancia();
	}

	public static PermisoAbm getInstancia() {
		if (instancia == null) {
			return new PermisoAbm();
		}
		return instancia;
	}

	public Permiso traerPermiso(int id) {
		return permisoDao.traerPermiso(id);
	}
}
