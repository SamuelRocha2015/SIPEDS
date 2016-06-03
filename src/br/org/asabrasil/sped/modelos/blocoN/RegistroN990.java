package br.org.asabrasil.sped.modelos.blocoN;

import br.org.asabrasil.sped.modelos.RegistroFechaBloco;
import br.org.asabrasil.sped.util.ConstantesSistema;

public class RegistroN990 extends RegistroFechaBloco {

	
	
	public RegistroN990() {
		super();
		preencheCamposDefault();
	}

	@Override
	public void preencheCamposDefault() {
		// preenche a identificacao do registro
		this.setIdentRegistro(ConstantesSistema.REG_REGISTRO_N990);
	}

}
