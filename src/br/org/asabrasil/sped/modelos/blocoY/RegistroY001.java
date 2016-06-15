package br.org.asabrasil.sped.modelos.blocoY;

import br.org.asabrasil.sped.modelos.LinhaAbreBloco;
import br.org.asabrasil.sped.util.ConstantesSistema;

public class RegistroY001 extends LinhaAbreBloco  {

	public RegistroY001() {
		super();
		preencheCamposDefault();
	}

	@Override
	public void preencheCamposDefault() {
		this.setIdentRegistro(ConstantesSistema.REG_REGISTRO_Y001);
		this.setIndicMovimento(ConstantesSistema.IND_DAD_BLOCO_Y);
	}

}
