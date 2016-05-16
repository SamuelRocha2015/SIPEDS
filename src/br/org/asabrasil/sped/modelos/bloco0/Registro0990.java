package br.org.asabrasil.sped.modelos.bloco0;

import br.org.asabrasil.sped.modelos.Registro;
import br.org.asabrasil.sped.util.ConstantesSistema;
import br.org.asabrasil.sped.util.Util;

public class Registro0990 extends Registro {

	private String qtdLinhas;

	public String getQtdLinhas() {
		return Util.validaAtributoString(qtdLinhas);
	}

	
	public void setQtdLinhas(String qtdLinhas) {
		this.qtdLinhas = qtdLinhas;
	}

	@Override
	public void preencheCamposDefault() {
		// preenche a identificacao do registro
		this.setIdentRegistro(ConstantesSistema.REG_REGISTRO_0990);

	}
}
