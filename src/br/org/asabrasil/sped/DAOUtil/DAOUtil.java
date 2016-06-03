package br.org.asabrasil.sped.DAOUtil;

import java.sql.PreparedStatement;

public final class DAOUtil {

	private DAOUtil() {
	}

	
	/**
	 * Esse metodo substitui os NameDsParameters do SQL por Prepared Statements
	 * A necessidade desse metodo � que o jdbc n�o suporta NameDsParameters
	 * Ent�o se voc� tem um sql com varios parametros repetidos, voc� pode substitui-los 
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
