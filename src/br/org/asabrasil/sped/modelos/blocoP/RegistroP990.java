package br.org.asabrasil.sped.modelos.blocoP;

import br.org.asabrasil.sped.modelos.RegistroFechaBloco;
import br.org.asabrasil.sped.util.ConstantesSistema;

public class RegistroP990 extends RegistroFechaBloco {

	
	
	public RegistroP990() {
		super();
		preencheCamposDefault();
	}

	@Override
	public void preencheCamposDefault() {
		// preenche a identificacao do registro
		this.setIdentRegistro(ConstantesSistema.REG_REGISTRO_P990);
	}

}
