package br.org.asabrasil.sped.modelos;

import java.util.List;

import br.org.asabrasil.sped.util.ConstantesSistema;
import br.org.asabrasil.sped.util.Util;

public abstract class LinhaAbreBloco extends Linha {
	
	private String indicMovimento;

	public String getIndicMovimento() {
		return Util.validaAtributoString(indicMovimento);
	}

	public void setIndicMovimento(String indicMovimento) {
		this.indicMovimento = indicMovimento;
	}



	@Override
	public void preencheCamposDefault() {
		// TODO Auto-generated method stub

	}

	@Override
	public void gerarRegistro(List<StringBuilder> listaRegistros) {
		
		
		StringBuilder reg = new StringBuilder();
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		reg.append(this.getIdentRegistro());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);

		reg.append(this.getIndicMovimento());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);

		reg.append(this.geraFinalRegistro());
		listaRegistros.add(reg);

	}

}
