package br.org.asabrasil.sped.modelos.blocoL;

import br.org.asabrasil.sped.modelos.LinhaAbreBloco;
import br.org.asabrasil.sped.util.ConstantesSistema;

public class RegistroL001 extends LinhaAbreBloco {

	public RegistroL001() {
		super();
		preencheCamposDefault();
	}

	@Override
	public void preencheCamposDefault() {
		// preenche a identificacao do registro
		this.setIdentRegistro(ConstantesSistema.REG_REGISTRO_L001);
		this.setIndicMovimento(ConstantesSistema.IND_DAD_BLOCO_L);
	}

}
