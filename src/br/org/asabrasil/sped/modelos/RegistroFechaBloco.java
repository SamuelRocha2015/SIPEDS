package br.org.asabrasil.sped.modelos;

import br.org.asabrasil.sped.util.Util;

public abstract class RegistroFechaBloco extends Registro implements LinhaArquivo, LinhaFechaBloco {

	private String qtdLinhas;

	public String getQtdLinhas() {
		return Util.validaAtributoString(qtdLinhas);
	}

	public void setQtdLinhas(String qtdLinhas) {
		this.qtdLinhas = qtdLinhas;
	}

}
