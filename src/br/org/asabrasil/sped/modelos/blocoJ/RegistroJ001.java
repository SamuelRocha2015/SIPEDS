package br.org.asabrasil.sped.modelos.blocoJ;

import java.util.List;

import br.org.asabrasil.sped.modelos.Linha;
import br.org.asabrasil.sped.util.ConstantesSistema;
import br.org.asabrasil.sped.util.Util;

public class RegistroJ001 extends Linha {

	private String indicMovimento;

	public String getIndicMovimento() {
		return Util.validaAtributoString(indicMovimento);
	}

	
	
	public RegistroJ001() {
		super();
		preencheCamposDefault();
	}



	@Override
	public void preencheCamposDefault() {
		// preenche a identificacao do registro
		this.setIdentRegistro(ConstantesSistema.REG_REGISTRO_J001);
		this.indicMovimento = ConstantesSistema.IND_DAD_BLOCO_J;
		
	}

	@Override
	public void gerarRegistro(List<StringBuilder> listaRegistros) {
		StringBuilder reg = new StringBuilder();

		reg.append(this.getIdentRegistro());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		reg.append(this.getIndicMovimento());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		
		reg.append(this.geraFinalRegistro());
		listaRegistros.add(reg);

	}

}
