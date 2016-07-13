package br.org.asabrasil.sped.modelos.blocoT;

import br.org.asabrasil.sped.modelos.RegistroFechaBloco;
import br.org.asabrasil.sped.util.ConstantesSistema;

public class RegistroT990 extends RegistroFechaBloco {

	
	public RegistroT990() {
		super();
		preencheCamposDefault();
	}

	
	@Override
	public void preencheCamposDefault() {		
		// preenche a identificacao do registro
		this.setIdentRegistro(ConstantesSistema.REG_REGISTRO_T990);
	}

}


