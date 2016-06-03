import java.sql.Connection;

import br.org.asabrasil.sped.DAOUtil.ConnectionFactory;


public class TestaConnection {

	public static void main(String[] args) {
		 try {
	            Connection con = new ConnectionFactory().getConnection();
	            con.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	}

}
