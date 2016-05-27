package br.org.asabrasil.sped.modelos.blocoE;

import br.org.asabrasil.sped.modelos.LinhaAbreBloco;
import br.org.asabrasil.sped.util.ConstantesSistema;

public class RegistroE001 extends LinhaAbreBloco {

	public RegistroE001() {
		super();
		preencheCamposDefault();
	}

	@Override
	public void preencheCamposDefault() {
		// preenche a identificacao do registro
		this.setIdentRegistro(ConstantesSistema.REG_REGISTRO_E001);
		this.setIndicMovimento(ConstantesSistema.IND_DAD_BLOCO_E);
		
	}

}
