package br.org.asabrasil.sped.modelos.blocoX;

import br.org.asabrasil.sped.modelos.LinhaAbreBloco;
import br.org.asabrasil.sped.util.ConstantesSistema;

public class RegistroX001 extends LinhaAbreBloco  {

	public RegistroX001() {
		super();
		preencheCamposDefault();
	}

	
	@Override
	public void preencheCamposDefault() {
		this.setIdentRegistro(ConstantesSistema.REG_REGISTRO_X001);
		this.setIndicMovimento(ConstantesSistema.IND_DAD_BLOCO_X);
	}

}
