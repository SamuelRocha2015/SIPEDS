package br.org.asabrasil.sped.modelos.blocoQ;

import br.org.asabrasil.sped.modelos.LinhaAbreBloco;
import br.org.asabrasil.sped.util.ConstantesSistema;

public class RegistroQ001 extends LinhaAbreBloco {

	public RegistroQ001() {
		super();
		preencheCamposDefault();
	}

	@Override
	public void preencheCamposDefault() {
		// preenche a identificacao do registro
		this.setIdentRegistro(ConstantesSistema.REG_REGISTRO_Q001);
		this.setIndicMovimento(ConstantesSistema.IND_DAD_BLOCO_Q);
	}
}
