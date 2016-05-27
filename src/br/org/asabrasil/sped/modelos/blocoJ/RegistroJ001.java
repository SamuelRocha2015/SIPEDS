package br.org.asabrasil.sped.modelos.blocoJ;

import br.org.asabrasil.sped.modelos.LinhaAbreBloco;
import br.org.asabrasil.sped.util.ConstantesSistema;

public class RegistroJ001 extends LinhaAbreBloco {

	public RegistroJ001() {
		super();
		preencheCamposDefault();
	}

	@Override
	public void preencheCamposDefault() {
		// preenche a identificacao do registro
		this.setIdentRegistro(ConstantesSistema.REG_REGISTRO_J001);
		this.setIndicMovimento(ConstantesSistema.IND_DAD_BLOCO_J);
	}

}
