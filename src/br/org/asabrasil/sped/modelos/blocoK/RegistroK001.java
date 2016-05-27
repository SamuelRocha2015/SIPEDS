package br.org.asabrasil.sped.modelos.blocoK;

import br.org.asabrasil.sped.modelos.LinhaAbreBloco;
import br.org.asabrasil.sped.util.ConstantesSistema;

public class RegistroK001 extends LinhaAbreBloco {

	public RegistroK001() {
		super();
		preencheCamposDefault();
	}


	@Override
	public void preencheCamposDefault() {
		// preenche a identificacao do registro
		this.setIdentRegistro(ConstantesSistema.REG_REGISTRO_K001);
		this.setIndicMovimento(ConstantesSistema.IND_DAD_BLOCO_K);
		
	}

}
