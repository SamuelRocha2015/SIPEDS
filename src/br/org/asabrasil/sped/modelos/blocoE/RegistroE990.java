package br.org.asabrasil.sped.modelos.blocoE;

import br.org.asabrasil.sped.modelos.RegistroFechaBloco;
import br.org.asabrasil.sped.util.ConstantesSistema;

public class RegistroE990 extends RegistroFechaBloco {

	public RegistroE990() {
		super();
		preencheCamposDefault();
	}


	@Override
	public void preencheCamposDefault() {
		// preenche a identificacao do registro
		this.setIdentRegistro(ConstantesSistema.REG_REGISTRO_E990);
	}

}
