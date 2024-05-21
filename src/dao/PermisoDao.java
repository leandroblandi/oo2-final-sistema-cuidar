package dao;

import org.hibernate.Hibernate;

import datos.Permiso;

public class PermisoDao extends Dao {

	private static PermisoDao instancia = null;

	private PermisoDao() {

	}

	public static PermisoDao getInstancia() {
		if (instancia == null) {
			return new PermisoDao();
		}
		return instancia;
	}

	public Permiso traerPermiso(int id) {
		Permiso permiso = null;
		try {
			iniciaOperacion();
			permiso = (Permiso) session.get(Permiso.class, id);
			Hibernate.initialize(permiso.getPersona());
			Hibernate.initialize(permiso.getDesdeHasta());
			Hibernate.initialize(permiso.getRodado());
		} finally {
			session.close();
		}
		return permiso;
	}
}
