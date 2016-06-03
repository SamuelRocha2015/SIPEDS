package br.org.asabrasil.sped.modelos.blocoM;

import br.org.asabrasil.sped.modelos.LinhaAbreBloco;
import br.org.asabrasil.sped.util.ConstantesSistema;

public class RegistroM001 extends LinhaAbreBloco {

	public RegistroM001() {
		super();
		preencheCamposDefault();
	}

	@Override
	public void preencheCamposDefault() {
		// preenche a identificacao do registro
		this.setIdentRegistro(ConstantesSistema.REG_REGISTRO_M001);
		this.setIndicMovimento(ConstantesSistema.IND_DAD_BLOCO_M);
	}
	
}
