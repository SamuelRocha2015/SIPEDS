package br.org.asabrasil.sped.modelos.blocoN;

import br.org.asabrasil.sped.modelos.LinhaAbreBloco;
import br.org.asabrasil.sped.util.ConstantesSistema;

public class RegistroN001 extends LinhaAbreBloco {

	public RegistroN001() {
		super();
		preencheCamposDefault();
	}

	@Override
	public void preencheCamposDefault() {
		// preenche a identificacao do registro
		this.setIdentRegistro(ConstantesSistema.REG_REGISTRO_N001);
		this.setIndicMovimento(ConstantesSistema.IND_DAD_BLOCO_N);
	}
	
}
