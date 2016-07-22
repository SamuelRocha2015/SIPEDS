package br.org.asabrasil.sped.util;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO: Esses valores veem do desktop. No futuro modificar para a propria aplicação consultar e montar esse registro.
 * @author samuel.rocha
 *
 */
public final class FonteDadosX390 {

	public FonteDadosX390() {
	}

	public static List<String> getX390(){
		
		List<String> listaX390 = new ArrayList<>();

		listaX390.add("|X390|1|ORIGEM DE RECURSOS||\r\n");
		listaX390.add("|X390|4|Rendimentos de Aplicações Financeiras de Renda Fixa|87823,39|\r\n");
		listaX390.add("|X390|6|Doações e Subvenções|11691884,14|\r\n");
		listaX390.add("|X390|7|Outros Recursos|360827,11|\r\n");
		listaX390.add("|X390|8|TOTAL|12140534,64|\r\n");
		listaX390.add("|X390|9|APLICAÇÃO DE RECURSOS||\r\n");
		listaX390.add("|X390|10|Ordenados, Gratificações e Outros Pagamentos, Inclusive Encargos Sociais|8215157,21|\r\n");
		listaX390.add("|X390|11|IR Retido sobre Rendimentos de Aplicações Financeiras de Renda Fixa|15410,44|\r\n");
		listaX390.add("|X390|13|Impostos, Taxas e Contribuições|4,77|\r\n");
		listaX390.add("|X390|14|Despesas de Manutenção|263689,16|\r\n");
		listaX390.add("|X390|15|Outras Despesas|3945338,63|\r\n");
		listaX390.add("|X390|16|TOTAL|12439600,21|\r\n");
		//listaX390.add("|X390|15|SUPERAVIT/DEFICIT|299065,57|\r\n");

		return listaX390;
	}
	
}
