package br.org.asabrasil.sped.modelos.blocoU;

import br.org.asabrasil.sped.modelos.LinhaAbreBloco;
import br.org.asabrasil.sped.util.ConstantesSistema;

public class RegistroU001 extends LinhaAbreBloco {

	public RegistroU001() {
		super();
		preencheCamposDefault();
	}


	@Override
	public void preencheCamposDefault() {
		this.setIdentRegistro(ConstantesSistema.REG_REGISTRO_U001);
		this.setIndicMovimento(ConstantesSistema.IND_DAD_BLOCO_U);
	}

}
