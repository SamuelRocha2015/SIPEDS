package br.org.asabrasil.sped.DAOUtil;

import java.sql.PreparedStatement;

public final class DAOUtil {

	private DAOUtil() {
	}

	
	/**
	 * Esse metodo substitui os NameDsParameters do SQL por Prepared Statements
	 * A necessidade desse metodo é que o jdbc não suporta NameDsParameters
	 * Então se você tem um sql com varios parametros repetidos, você pode substitui-los 
	 * por um nameDsParameters 
	 * @param sql
	 * @param vlParametro
	 * @param ocorrencias
	 * @param stmt
	 */
	public static void substNamedParamSQL(String sql, String namedParameter,  String vlParametro, int ocorrencias, PreparedStatement stmt) {
		
		sql = sql.replaceAll(namedParameter, "?");
		try {
			for (int i = 1; i <= ocorrencias; i++) {
				stmt.setString(i, vlParametro);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
