package br.org.asabrasil.sped.modelos.bloco0;

import br.org.asabrasil.sped.modelos.RegistroFechaBloco;
import br.org.asabrasil.sped.util.ConstantesSistema;

public class Registro0990 extends RegistroFechaBloco {

	public Registro0990() {
		super();
		preencheCamposDefault();
	}


	@Override
	public void preencheCamposDefault() {
		// preenche a identificacao do registro
		this.setIdentRegistro(ConstantesSistema.REG_REGISTRO_0990);

	}

}
