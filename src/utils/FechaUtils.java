package utils;

import java.time.LocalDate;

public final class FechaUtils {

	private FechaUtils() {

	}

	/**
	 * 
	 * Compara si la fecha solicitada, del tercer argumento Esta en el rango de la
	 * fecha de inicio + los dias de validez
	 * 
	 * @param fechaInicio
	 * @param dias
	 * @param fechaConsulta
	 * @return
	 */
	public static boolean estaEnPeriodoDeFecha(LocalDate fechaInicio, int dias, LocalDate fechaConsulta) {
		LocalDate fechaLimite = fechaInicio.plusDays(dias);
		return (fechaConsulta.equals(fechaInicio) || fechaConsulta.isAfter(fechaInicio))
				&& (fechaConsulta.isBefore(fechaLimite) || fechaConsulta.equals(fechaLimite));
	}

}
