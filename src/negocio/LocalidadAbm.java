package negocio;

import dao.LugarDao;
import datos.Localidad;

public class LocalidadAbm {
	private LugarDao lugarDao;
	private static LocalidadAbm instancia;

	private LocalidadAbm() {
		this.lugarDao = LugarDao.getInstancia();
	}

	public static LocalidadAbm getInstancia() {
		if (instancia == null) {
			return new LocalidadAbm();
		}
		return instancia;
	}

	public Localidad traerLocalidad(int id) {
		return (Localidad) lugarDao.traerLugar(id);
	}
}
