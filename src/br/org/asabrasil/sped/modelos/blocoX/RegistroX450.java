package br.org.asabrasil.sped.modelos.blocoX;

import java.util.List;

import br.org.asabrasil.sped.modelos.Linha;
import br.org.asabrasil.sped.util.Util;

public class RegistroX450 extends Linha {

	private String pais;
	private String vlServAssist;
	private String vlServSemAssist;
	private String vlServSemAssistExt;
	private String vlJuroPf;
	private String vlJuroPj;
	private String vlDemaisJuros;
	private String vlDividPf;
	private String vlDividPj;

	public String getPais() {
		return Util.validaAtributoString(pais);
	}

	public String getVlServAssist() {
		return Util.validaAtributoString(vlServAssist);
	}

	public String getVlServSemAssist() {
		return Util.validaAtributoString(vlServSemAssist);
	}

	public String getVlServSemAssistExt() {
		return Util.validaAtributoString(vlServSemAssistExt);
	}

	public String getVlJuroPf() {
		return Util.validaAtributoString(vlJuroPf);
	}

	public String getVlJuroPj() {
		return Util.validaAtributoString(vlJuroPj);
	}

	public String getVlDemaisJuros() {
		return Util.validaAtributoString(vlDemaisJuros);
	}

	public String getVlDividPf() {
		return Util.validaAtributoString(vlDividPf);
	}

	public String getVlDividPj() {
		return Util.validaAtributoString(vlDividPj);
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public void setVlServAssist(String vlServAssist) {
		this.vlServAssist = vlServAssist;
	}

	public void setVlServSemAssist(String vlServSemAssist) {
		this.vlServSemAssist = vlServSemAssist;
	}

	public void setVlServSemAssistExt(String vlServSemAssistExt) {
		this.vlServSemAssistExt = vlServSemAssistExt;
	}

	public void setVlJuroPf(String vlJuroPf) {
		this.vlJuroPf = vlJuroPf;
	}

	public void setVlJuroPj(String vlJuroPj) {
		this.vlJuroPj = vlJuroPj;
	}

	public void setVlDemaisJuros(String vlDemaisJuros) {
		this.vlDemaisJuros = vlDemaisJuros;
	}

	public void setVlDividPf(String vlDividPf) {
		this.vlDividPf = vlDividPf;
	}

	public void setVlDividPj(String vlDividPj) {
		this.vlDividPj = vlDividPj;
	}

	public RegistroX450() {
		super();
		preencheCamposDefault();
	}

	@Override
	public void preencheCamposDefault() {
	}

	@Override
	public void gerarRegistro(List<StringBuilder> listaRegistros) {
	}
}