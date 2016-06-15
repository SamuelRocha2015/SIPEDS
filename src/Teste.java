import java.math.BigDecimal;

import br.org.asabrasil.sped.util.Util;


public class Teste {

	public static void main(String[] args) {
		
		//Imprime a data formatada para dd/mm/aaaa
//		System.out.println (Util.dataInicialOuFinalApuracaoSemMascara(true));
		
		
		BigDecimal valor = new BigDecimal(75000.39);
		
		System.out.println(Util.moedaFormatada(valor));
		
//		DecimalFormat formatoDois = 
//				new DecimalFormat("##0.00", new DecimalFormatSymbols (new Locale ("pt", "BR")));
//		formatoDois.setMinimumFractionDigits(2); 
//		formatoDois.setParseBigDecimal (true);
//		System.out.println(formatoDois.format(valor));
		
	}
}
