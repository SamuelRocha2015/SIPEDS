package br.org.asabrasil.sped.modelos.blocoP;

import br.org.asabrasil.sped.modelos.LinhaAbreBloco;
import br.org.asabrasil.sped.util.ConstantesSistema;

public class RegistroP001 extends LinhaAbreBloco {

	public RegistroP001() {
		super();
		preencheCamposDefault();
	}

	@Override
	public void preencheCamposDefault() {
		// preenche a identificacao do registro
		this.setIdentRegistro(ConstantesSistema.REG_REGISTRO_P001);
		this.setIndicMovimento(ConstantesSistema.IND_DAD_BLOCO_P);
	}
}
