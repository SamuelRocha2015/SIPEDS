package br.org.asabrasil.sped.modelos.bloco0;

import br.org.asabrasil.sped.modelos.Registro;
import br.org.asabrasil.sped.util.ConstantesSistema;
import br.org.asabrasil.sped.util.Util;

public class Registro0035 extends Registro {

	private String identSCP;
	private String descricaoSCP;

	public String getIdentSCP() {
		return Util.validaAtributoString(identSCP);
	}

	public String getDescricaoSCP() {
		return Util.validaAtributoString(descricaoSCP);
	}

	public void setIdentSCP(String identSCP) {
		this.identSCP = identSCP;
	}

	public void setDescricaoSCP(String descricaoSCP) {
		this.descricaoSCP = descricaoSCP;
	}

	@Override
	public void preencheCamposDefault() {
		// preenche a identificacao do registro
		this.setIdentRegistro(ConstantesSistema.REG_REGISTRO_0035);

		// preenche os demais campos padrão

	}

}
