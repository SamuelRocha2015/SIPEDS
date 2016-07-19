package br.org.asabrasil.sped.modelos.bloco9;

import java.util.List;

import br.org.asabrasil.sped.modelos.Linha;
import br.org.asabrasil.sped.util.ConstantesSistema;
import br.org.asabrasil.sped.util.Util;

public class Registro9900 extends Linha {

	private String regBlc;
	private String qtdRegBlc;
	private String versao;
	private String idTabDin;

	public String getRegBlc() {
		return Util.validaAtributoString(regBlc);
	}

	public String getQtdRegBlc() {
		return Util.validaAtributoString(qtdRegBlc);
	}

	public String getVersao() {
		return Util.validaAtributoString(versao);
	}

	public String getIdTabDin() {
		return Util.validaAtributoString(idTabDin);
	}

	public void setRegBlc(String regBlc) {
		this.regBlc = regBlc;
	}

	public void setQtdRegBlc(String qtdRegBlc) {
		this.qtdRegBlc = qtdRegBlc;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	public void setIdTabDin(String idTabDin) {
		this.idTabDin = idTabDin;
	}

	public Registro9900() {
		super();
		preencheCamposDefault();
	}

	@Override
	public void preencheCamposDefault() {
		this.setIdentRegistro(ConstantesSistema.REG_REGISTRO_9900);
	}

	@Override
	public void gerarRegistro(List<StringBuilder> listaRegistros) {
	}
}