package br.org.asabrasil.sped.DAOImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.org.asabrasil.sped.DAOUtil.ConnectionFactory;
import br.org.asabrasil.sped.DAOUtil.SQL;
import br.org.asabrasil.sped.modelos.blocoU.RegistroU100;

public class BlocoUDAOImpl {
	
	private static BlocoUDAOImpl uniqueInstance = new BlocoUDAOImpl();
	private Connection con;

	private BlocoUDAOImpl() {
		this.con = new ConnectionFactory().getConnection();
	}

	public static synchronized BlocoUDAOImpl getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new BlocoUDAOImpl();
		}

		return uniqueInstance;
	}

	public List<RegistroU100> consultaU100() {
		PreparedStatement stmt = null;
		ResultSet rs = null;
		List<RegistroU100> listaConsultaU100 = new ArrayList<>();
		
		try {
			String sql = SQL.consultaRegistroU100().toString();
			stmt = con.prepareStatement(sql);
			
			//TODO: terminar o metodo quando tiver o sql. 
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listaConsultaU100;

	}
} 
