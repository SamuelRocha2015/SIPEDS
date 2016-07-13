package br.org.asabrasil.sped.modelos.blocoU;

import br.org.asabrasil.sped.modelos.RegistroFechaBloco;
import br.org.asabrasil.sped.util.ConstantesSistema;

public class RegistroU990 extends RegistroFechaBloco {

	public RegistroU990() {
		super();
		preencheCamposDefault();	
	}

	@Override
	public void preencheCamposDefault() {
		// preenche a identificacao do registro
		this.setIdentRegistro(ConstantesSistema.REG_REGISTRO_U990);
	}

}
