package br.org.asabrasil.sped.util;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public final class Util {

	private Util() {
	}

	public static String removeCaracteresEspeciais(String string) {
		String novaString = "";
		if (!isStringVazia(string)) {
			novaString = string.replace("/", "");
		}
		return novaString;
	}

	public static boolean isStringVazia(String str) {
		return (str == null || str.isEmpty());
	}

	public static String validaAtributoString(String campo) {
		if (!isStringVazia(campo)) {
			return campo;
		}
		return ConstantesSistema.CARACTERE_VAZIO;
	}

	public static String dataInicialOuFinalApuracaoSemMascara(boolean isDataInicial) {
		Calendar cal = Calendar.getInstance();
		
		
		if (isDataInicial) {
			cal.set(Calendar.MONTH, Calendar.JANUARY);
			cal.set(Calendar.DAY_OF_MONTH, 1);
		} else {
			cal.set(Calendar.MONTH, Calendar.DECEMBER);
			cal.set(Calendar.DAY_OF_MONTH, 31);	
		}
		
		
		cal.add(Calendar.YEAR, -1);

		return removeCaracteresEspeciais(new SimpleDateFormat("dd/MM/yyyy").format(cal.getTime()));
	}
	
	
	
	public static String moedaFormatada(BigDecimal valor) {
		DecimalFormat formatoDois = 
				new DecimalFormat("##0.00", new DecimalFormatSymbols (new Locale ("pt", "BR")));
		
		formatoDois.setMinimumFractionDigits(2); 
		formatoDois.setParseBigDecimal (true);
		
		return formatoDois.format(valor);
		
	}
}
