package negocio;

import dao.LugarDao;
import datos.Ubicacion;

public class UbicacionAbm {
	private LugarDao lugarDao;
	private static UbicacionAbm instancia;

	private UbicacionAbm() {
		this.lugarDao = LugarDao.getInstancia();
	}

	public static UbicacionAbm getInstancia() {
		if (instancia == null) {
			return new UbicacionAbm();
		}
		return instancia;
	}

	public Ubicacion traerUbicacion(int id) {
		return (Ubicacion) lugarDao.traerLugar(id);
	}
}
