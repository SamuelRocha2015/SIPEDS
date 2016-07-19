package br.org.asabrasil.sped.modelos.blocoX;

import br.org.asabrasil.sped.modelos.RegistroFechaBloco;
import br.org.asabrasil.sped.util.ConstantesSistema;

public class RegistroX990 extends RegistroFechaBloco {

	public RegistroX990() {
		super();
		preencheCamposDefault();
	}

	@Override
	public void preencheCamposDefault() {
		this.setIdentRegistro(ConstantesSistema.REG_REGISTRO_X990);
	} 

}
