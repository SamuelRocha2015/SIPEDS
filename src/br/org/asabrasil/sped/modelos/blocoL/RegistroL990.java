package br.org.asabrasil.sped.modelos.blocoL;

import br.org.asabrasil.sped.modelos.RegistroFechaBloco;
import br.org.asabrasil.sped.util.ConstantesSistema;

public class RegistroL990 extends RegistroFechaBloco {
	
	public RegistroL990() {
		super();
		preencheCamposDefault();
	}

	@Override
	public void preencheCamposDefault() {
		// preenche a identificacao do registro
		this.setIdentRegistro(ConstantesSistema.REG_REGISTRO_L990);
	}

}
