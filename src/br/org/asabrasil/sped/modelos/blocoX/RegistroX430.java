package br.org.asabrasil.sped.modelos.blocoX;

import java.util.List;

import br.org.asabrasil.sped.modelos.Linha;
import br.org.asabrasil.sped.util.ConstantesSistema;
import br.org.asabrasil.sped.util.Util;

public class RegistroX430 extends Linha {

	private String pais;
	private String vlServAssist;
	private String vlServSemAssist;
	private String vlServSemAssistExt;
	private String vlJuro;
	private String vlDemaisJuros;
	private String vlDivid;

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

	public String getVlJuro() {
		return Util.validaAtributoString(vlJuro);
	}

	public String getVlDemaisJuros() {
		return Util.validaAtributoString(vlDemaisJuros);
	}

	public String getVlDivid() {
		return Util.validaAtributoString(vlDivid);
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

	public void setVlJuro(String vlJuro) {
		this.vlJuro = vlJuro;
	}

	public void setVlDemaisJuros(String vlDemaisJuros) {
		this.vlDemaisJuros = vlDemaisJuros;
	}

	public void setVlDivid(String vlDivid) {
		this.vlDivid = vlDivid;
	}

	public RegistroX430() {
		super();
		preencheCamposDefault();
	}

	@Override
	public void preencheCamposDefault() {
		this.setIdentRegistro(ConstantesSistema.REG_REGISTRO_X430);
	}

	@Override
	public void gerarRegistro(List<StringBuilder> listaRegistros) {
	}
}