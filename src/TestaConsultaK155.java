import java.util.List;

import br.org.asabrasil.sped.DAOImpl.BlocoKDAOImpl;
import br.org.asabrasil.sped.modelos.blocoK.RegistroK155;


public class TestaConsultaK155 {

	public static void main(String[] args) {

		try {
			
			List<RegistroK155> listaConsultaK155 = BlocoKDAOImpl.getInstance().consultaK155();
			for (RegistroK155 registroK155 : listaConsultaK155) {
				System.out.println(registroK155.getCodAnaliticaPatrimonial());
			}
		
			System.out.println("ok!");
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}

