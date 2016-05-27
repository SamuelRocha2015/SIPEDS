package br.org.asabrasil.sped.modelos.blocoC;

import br.org.asabrasil.sped.modelos.RegistroFechaBloco;
import br.org.asabrasil.sped.util.ConstantesSistema;

public class RegistroC990 extends RegistroFechaBloco {

	public RegistroC990() {
		super();
		preencheCamposDefault();
	}


	@Override
	public void preencheCamposDefault() {
		// preenche a identificacao do registro
		this.setIdentRegistro(ConstantesSistema.REG_REGISTRO_C990);
	}

}
