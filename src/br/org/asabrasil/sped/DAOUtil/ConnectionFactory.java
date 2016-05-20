package br.org.asabrasil.sped.DAOUtil;

import java.sql.Connection;

public class ConnectionFactory {

	
    private static final String url = "jdbc:oracle:thin:@192.168.0.163:1521:siganet";  
    private static final String user = "asasiga1";
    private static final String pass = "siga";
    
    public Connection getConnection() {
    	Connection con = null;
    	return null;
    }
}
