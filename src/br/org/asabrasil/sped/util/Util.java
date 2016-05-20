package br.org.asabrasil.sped.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public final class Util {

	private Util() {
	}

	public static String converteCalendarParaString(Calendar data) {
		String novaData = "";
		if (data != null) {
			novaData = new SimpleDateFormat("dd/MM/yyyy")
					.format(data.getTime());
		}
		return novaData;
	}
//	
//	TODO: Remover esse metodo no futuro
//	public static Calendar converteStringParaCalendar(String stringSata) {
//		Calendar data = null;
//
//		try {
//			Date date = new SimpleDateFormat("dd/MM/yyyy").parse(stringSata);
//			data = Calendar.getInstance();
//			data.setTime(date);
//
//		} catch (ParseException ex) {
//			ex.printStackTrace();
//		}
//
//		return data;
//	}

	public static String removeCaracteresEspeciais(String string) {
		String novaString = "";
		if (string != null && !string.isEmpty()) {
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

	public static Calendar recuperaDataAtualizacao() {
		Calendar cal = Calendar.getInstance();
		
		GregorianCalendar  calG = new GregorianCalendar ();
		System.out.println(calG.getActualMinimum(Calendar.DAY_OF_MONTH));
//		cal.setTimeInMillis(new Long());
		
		return cal;
	}

}
