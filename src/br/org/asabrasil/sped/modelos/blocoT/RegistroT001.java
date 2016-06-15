package br.org.asabrasil.sped.modelos.blocoT;

import br.org.asabrasil.sped.modelos.LinhaAbreBloco;
import br.org.asabrasil.sped.util.ConstantesSistema;

public class RegistroT001 extends LinhaAbreBloco{

	public RegistroT001() {
		super();
		preencheCamposDefault();
	}
	
	
	@Override
	public void preencheCamposDefault() {
		// preenche a identificacao do registro
		this.setIdentRegistro(ConstantesSistema.REG_REGISTRO_T001);
		this.setIndicMovimento(ConstantesSistema.IND_DAD_BLOCO_T);
	}
	
}
