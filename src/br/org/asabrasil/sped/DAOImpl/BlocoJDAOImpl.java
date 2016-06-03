package br.org.asabrasil.sped.DAOImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.org.asabrasil.sped.DAOUtil.ConnectionFactory;
import br.org.asabrasil.sped.DAOUtil.SQL;
import br.org.asabrasil.sped.modelos.blocoJ.RegistroJ050;
import br.org.asabrasil.sped.modelos.blocoJ.RegistroJ051;

public class BlocoJDAOImpl {
	
	private static BlocoJDAOImpl uniqueInstance = new BlocoJDAOImpl();
	private Connection con;

	private BlocoJDAOImpl() {
		this.con = new ConnectionFactory().getConnection();
	}
	
	public static synchronized BlocoJDAOImpl getInstance() {
		if (uniqueInstance == null){
			uniqueInstance = new BlocoJDAOImpl();
		}

		return uniqueInstance;
	}

	public List<RegistroJ050> consultaJ050() {
		List<RegistroJ050> listaJ050 = new ArrayList<>();
		PreparedStatement stmt = null;
		ResultSet rs = null;

		try {
			stmt = con.prepareStatement(SQL.consultaRegistroJ050().toString());

			rs = stmt.executeQuery();
			
			 while (rs.next()) {
				 
				 RegistroJ050 reg = new RegistroJ050();
				 reg.setCodNatureza(rs.getString("NATUREZA_CONTA_GRUPO"));
				 reg.setIndicTpConta(rs.getString("INDICADOR"));
				 reg.setNivelConta(rs.getString("NIVEL"));
				 reg.setCodContaAnaliticaSintetica(rs.getString("CONTA_ANALITICA"));
				 reg.setCodContaSinteticaSuperior(rs.getString("CONTA_SINTETICA"));
				 reg.setNomeContaAnaliticaSintetica(rs.getString("NOME_CONTA"));
				 
				 listaJ050.add(reg);
			 }

		} catch (Exception e) {
			e.printStackTrace();
		}
		return listaJ050;
	}
	
	
	public List<RegistroJ051> consultaJ051() {
		List<RegistroJ051> listaJ051 = new ArrayList<>();
		PreparedStatement stmt = null;
		ResultSet rs = null;

		try {
			stmt = con.prepareStatement(SQL.consultaRegistroJ051().toString());
			
			rs = stmt.executeQuery();

			while (rs.next()) {
				RegistroJ051 reg = new RegistroJ051();
				reg.setCodContaPlanoContas(rs.getString("CODIGO"));
				listaJ051.add(reg);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return listaJ051;
	}

}
