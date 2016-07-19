package br.org.asabrasil.sped.modelos.bloco9;

import br.org.asabrasil.sped.modelos.LinhaAbreBloco;
import br.org.asabrasil.sped.util.ConstantesSistema;

public class Registro9001 extends LinhaAbreBloco {
	
	public Registro9001() {
		super();
		preencheCamposDefault();
	}

	@Override
	public void preencheCamposDefault() {
		// preenche a identificacao do registro
		this.setIdentRegistro(ConstantesSistema.REG_REGISTRO_9001);
		this.setIndicMovimento(ConstantesSistema.IND_DAD_BLOCO_9);
	}

}
