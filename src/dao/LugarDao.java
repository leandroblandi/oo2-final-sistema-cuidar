package dao;

import datos.Lugar;

public class LugarDao extends Dao {
	private static LugarDao instancia = null;

	private LugarDao() {

	}

	public static LugarDao getInstancia() {
		if (instancia == null) {
			return new LugarDao();
		}
		return instancia;
	}

	public Lugar traerLugar(int id) {
		Lugar lugar = null;
		try {
			iniciaOperacion();
			lugar = session.get(Lugar.class, id);
		} finally {
			session.close();
		}
		return lugar;
	}
}
