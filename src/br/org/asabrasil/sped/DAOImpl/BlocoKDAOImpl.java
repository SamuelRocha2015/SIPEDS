package br.org.asabrasil.sped.DAOImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.org.asabrasil.sped.DAOUtil.ConnectionFactory;
import br.org.asabrasil.sped.DAOUtil.DAOUtil;
import br.org.asabrasil.sped.DAOUtil.SQL;
import br.org.asabrasil.sped.modelos.blocoK.RegistroK155;

public class BlocoKDAOImpl {
	private static BlocoKDAOImpl uniqueInstance = new BlocoKDAOImpl();
	private Connection con;

	private BlocoKDAOImpl() {
		this.con = new ConnectionFactory().getConnection();
	}

	public static synchronized BlocoKDAOImpl getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new BlocoKDAOImpl();
		}

		return uniqueInstance;
	}

	public List<RegistroK155> consultaK155() {
		PreparedStatement stmt = null;
		ResultSet rs = null;
		List<RegistroK155> listaConsultaK155 = new ArrayList<>();
		
		
		try {
			String sql = SQL.consultaRegistroK155().toString();
			stmt = con.prepareStatement(sql);
			
			DAOUtil.substNamedParamSQL(sql, ":dtInicial", "01012015", 28, stmt);
			
			
			rs = stmt.executeQuery();
			
			while (rs.next()) {
				
				RegistroK155 reg = new RegistroK155();
				reg.setCodAnaliticaPatrimonial(rs.getString("COD_CONTA_ANALITICA"));
				reg.setVlSaldoInicialPeriodo(rs.getBigDecimal("SALDO_ANTERIOR").toString());
				reg.setIndicSitSaldoInicial(rs.getString("INDICADOR_INICIAL"));
				reg.setVlTotalDebitosPeriodo(rs.getBigDecimal("VALOR_DEBITO").toString());
				reg.setVlTotalCreditosPeriodo(rs.getBigDecimal("VALOR_CREDITO").toString());
				reg.setVlSaldoFinalPeriodo(rs.getBigDecimal("SALDO_FINAL").toString());
				reg.setIndicSitSaldoFinal(rs.getString("INDICADOR_FINAL"));
				
				listaConsultaK155.add(reg);
				
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return listaConsultaK155;
	}

}
