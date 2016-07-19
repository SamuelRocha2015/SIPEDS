package br.org.asabrasil.sped.modelos.bloco9;

import java.util.List;

import br.org.asabrasil.sped.modelos.RegistroFechaBloco;
import br.org.asabrasil.sped.util.ConstantesSistema;

public class Registro9990 extends RegistroFechaBloco {

	public Registro9990() {
		super();
		preencheCamposDefault();
	}

	@Override
	public void preencheCamposDefault() {
		this.setIdentRegistro(ConstantesSistema.REG_REGISTRO_9990);
	}


}
