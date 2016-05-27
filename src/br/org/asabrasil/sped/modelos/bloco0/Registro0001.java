package br.org.asabrasil.sped.modelos.bloco0;

import br.org.asabrasil.sped.modelos.LinhaAbreBloco;
import br.org.asabrasil.sped.util.ConstantesSistema;

public class Registro0001 extends LinhaAbreBloco {

	public Registro0001() {
		super();
		preencheCamposDefault();
	}

	@Override
	public void preencheCamposDefault() {
		// preenche a identificacao do registro
		this.setIdentRegistro(ConstantesSistema.REG_REGISTRO_0001);
		// preenche os demais campos padrão
		this.setIndicMovimento(ConstantesSistema.IND_DAD_BLOCO_0);
	}

}
