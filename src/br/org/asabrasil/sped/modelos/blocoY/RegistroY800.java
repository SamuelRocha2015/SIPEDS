package br.org.asabrasil.sped.modelos.blocoY;

import java.util.List;

import br.org.asabrasil.sped.modelos.Linha;
import br.org.asabrasil.sped.util.ConstantesSistema;
import br.org.asabrasil.sped.util.Util;

public class RegistroY800 extends Linha {

	private String arqRtf;
	private String indFimRtf;

	public String getArqRtf() {
		return Util.validaAtributoString(arqRtf);
	}

	public String getIndFimRtf() {
		return Util.validaAtributoString(indFimRtf);
	}

	public void setArqRtf(String arqRtf) {
		this.arqRtf = arqRtf;
	}

	public void setIndFimRtf(String indFimRtf) {
		this.indFimRtf = indFimRtf;
	}

	public RegistroY800() {
		super();
		preencheCamposDefault();
		
	}

	@Override
	public void preencheCamposDefault() {
		this.setIdentRegistro(ConstantesSistema.REG_REGISTRO_Y800);
	}

	@Override
	public void gerarRegistro(List<StringBuilder> listaRegistros) {
	}
}