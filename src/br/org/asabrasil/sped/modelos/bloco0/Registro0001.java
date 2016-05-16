package br.org.asabrasil.sped.modelos.bloco0;

import br.org.asabrasil.sped.modelos.Registro;
import br.org.asabrasil.sped.util.ConstantesSistema;
import br.org.asabrasil.sped.util.Util;

public class Registro0001 extends Registro {
	private String indicMovimento;

	public String getIndicMovimento() {
		return Util.validaAtributoString(indicMovimento);
	}

	@Override
	public void preencheCamposDefault() {
		
		//preenche a identificacao do registro
		this.setIdentRegistro(ConstantesSistema.REG_REGISTRO_0001);
		
		//preenche os demais campos padrão
		this.indicMovimento = ConstantesSistema.IND_DAD;
	}
	
}
