package br.org.asabrasil.sped.modelos.blocoY;

import java.util.List;

import br.org.asabrasil.sped.modelos.Linha;
import br.org.asabrasil.sped.util.ConstantesSistema;
import br.org.asabrasil.sped.util.Util;

public class RegistroY720 extends Linha {

	private String lucLiq;
	private String dtLucLiq;
	private String recBrutAnt;

	public String getLucLiq() {
		return Util.validaAtributoString(lucLiq);
	}

	public String getDtLucLiq() {
		return Util.validaAtributoString(dtLucLiq);
	}

	public String getRecBrutAnt() {
		return Util.validaAtributoString(recBrutAnt);
	}

	public void setLucLiq(String lucLiq) {
		this.lucLiq = lucLiq;
	}

	public void setDtLucLiq(String dtLucLiq) {
		this.dtLucLiq = dtLucLiq;
	}

	public void setRecBrutAnt(String recBrutAnt) {
		this.recBrutAnt = recBrutAnt;
	}

	public RegistroY720() {
		super();
		preencheCamposDefault();
	}

	@Override
	public void preencheCamposDefault() {
		this.setIdentRegistro(ConstantesSistema.REG_REGISTRO_Y720);
	}

	@Override
	public void gerarRegistro(List<StringBuilder> listaRegistros) {
	}
}