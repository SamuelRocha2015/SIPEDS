package br.org.asabrasil.sped.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public final class Util {

	private Util(){	
	}
	
	public static String converteCalendarParaString(Calendar data) {
		String novaData = "";
		if (data != null){
			novaData = new SimpleDateFormat("dd/MM/yyyy").format(data.getTime());
		}
		return novaData;
	}

	public static Calendar converteStringParaCalendar(String stringSata) {
		Calendar data = null;

		try {
			Date date = new SimpleDateFormat("dd/MM/yyyy").parse(stringSata);
			data = Calendar.getInstance();
			data.setTime(date);

		} catch (ParseException ex) {
			ex.printStackTrace();
		}

		return data;
	}
	

	public static String removeCaracteresEspeciais(String string){
		String novaString = "";
		if(string != null && !string.isEmpty()){
			novaString =  string.replace("/", "");
		}
		 return novaString;
	}
	

	public static boolean isStringVazia(String str){
		return (str==null || str.isEmpty());
	}
	
}
