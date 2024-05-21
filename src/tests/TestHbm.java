package tests;

import java.time.LocalDate;

import datos.Localidad;
import datos.Permiso;
import datos.Ubicacion;
import negocio.LocalidadAbm;
import negocio.PermisoAbm;
import negocio.UbicacionAbm;

public class TestHbm {
	private static PermisoAbm permisoAbm = PermisoAbm.getInstancia();
	private static LocalidadAbm localidadAbm = LocalidadAbm.getInstancia();
	private static UbicacionAbm ubicacionAbm = UbicacionAbm.getInstancia();

	public static void main(String[] args) {
		// CU1
		Permiso permiso = permisoAbm.traerPermiso(4);
		System.out.println("=== CU1 ===");
		System.out.printf("%s\n", permiso);

		// CU2
		Localidad localidad = localidadAbm.traerLocalidad(3);
		System.out.println("=== CU2 ===");
		System.out.printf("%s\n", localidad);

		// CU3
		System.out.println("=== CU3 ===");
		boolean permisoHabilitado = localidad.ingresoHabilitado(4, LocalDate.of(2021, 5, 12));
		System.out.printf("El lugar con id %d, tiene permiso?: %s\n", localidad.getIdLugar(), permisoHabilitado);

		// CU4
		System.out.println("=== CU4 ===");
		permisoHabilitado = localidad.ingresoHabilitado(4, LocalDate.of(2021, 5, 20));
		System.out.printf("El lugar con id %d, tiene permiso?: %s\n", localidad.getIdLugar(), permisoHabilitado);

		// CU5
		System.out.println("=== CU5 ===");
		permisoHabilitado = localidad.ingresoHabilitado(4, LocalDate.of(2021, 5, 25));
		System.out.printf("El lugar con id %d, tiene permiso?: %s\n", localidad.getIdLugar(), permisoHabilitado);
	
		// CU6
		Ubicacion ubicacion = ubicacionAbm.traerUbicacion(4);
		System.out.println("=== CU6 ===");
		System.out.printf("%s\n", ubicacion);
		
		// CU7
		System.out.println("=== CU7 ===");
		permisoHabilitado = ubicacion.ingresoHabilitado(3, LocalDate.of(2021, 4, 30));
		System.out.printf("El lugar con id %d, tiene permiso?: %s\n", localidad.getIdLugar(), permisoHabilitado);

		// CU8
		System.out.println("=== CU8 ===");
		permisoHabilitado = ubicacion.ingresoHabilitado(3, LocalDate.of(2021, 3, 31));
		System.out.printf("El lugar con id %d, tiene permiso?: %s\n", localidad.getIdLugar(), permisoHabilitado);
	}
}
