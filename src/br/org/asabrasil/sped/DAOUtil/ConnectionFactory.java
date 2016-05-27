package br.org.asabrasil.sped.DAOUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 
 * @author samuel.rocha
 * @since 20/05/2016
 * Classe de conexão com o banco de dados
 */
public class ConnectionFactory {

	
    private static final String url = "jdbc:oracle:thin:@192.168.0.163:1521:siganet";  
    private static final String user = "asasiga1";
    private static final String pass = "siga";
    
    public Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("oracle.jdbc.OracleDriver").newInstance();
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("Conexão estabelecida com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e ){
        	e.printStackTrace();
        }
        return con;
    }
}
