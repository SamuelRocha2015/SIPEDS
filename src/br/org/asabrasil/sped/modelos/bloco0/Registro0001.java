package br.org.asabrasil.sped.modelos.bloco0;

import br.org.asabrasil.sped.modelos.Registro;
import br.org.asabrasil.sped.util.ConstantesSistema;

public class Registro0001 extends Registro {
	private String indicMovimento;

	public String getIndicMovimento() {
		return indicMovimento;
	}

	public void setIndicMovimento(String indicMovimento) {
		this.indicMovimento = indicMovimento;
	}

	public void preencheCamposDefault() {
		
		//preenche a identificacao do registro
		this.setIdentRegistro(ConstantesSistema.REG_REGISTRO_0001);
		
		//preenche os demais campos padrão
		this.indicMovimento = ConstantesSistema.IND_DAD;
	}
	
}
