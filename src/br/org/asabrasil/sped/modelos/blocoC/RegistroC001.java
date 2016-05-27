package br.org.asabrasil.sped.modelos.blocoC;

import br.org.asabrasil.sped.modelos.LinhaAbreBloco;
import br.org.asabrasil.sped.util.ConstantesSistema;

public class RegistroC001 extends LinhaAbreBloco {
	
	public RegistroC001() {
		super();
		preencheCamposDefault();
	}

	@Override
	public void preencheCamposDefault() {
		// preenche a identificacao do registro
		this.setIdentRegistro(ConstantesSistema.REG_REGISTRO_C001);
		this.setIndicMovimento(ConstantesSistema.IND_DAD_BLOCO_C);
		
	}

}
