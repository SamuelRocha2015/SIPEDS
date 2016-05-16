package br.org.asabrasil.sped.modelos.blocoC;

import br.org.asabrasil.sped.modelos.Registro;
import br.org.asabrasil.sped.util.ConstantesSistema;

public class RegistroC001 extends Registro {

	@Override
	public void preencheCamposDefault() {
		//preenche a identificacao do registro
		this.setIdentRegistro(ConstantesSistema.REG_REGISTRO_C001);

	}
}
