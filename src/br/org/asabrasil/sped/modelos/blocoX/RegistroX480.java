package br.org.asabrasil.sped.modelos.blocoX;

import java.util.List;

import br.org.asabrasil.sped.modelos.BaseX;
import br.org.asabrasil.sped.util.ConstantesSistema;

public class RegistroX480 extends BaseX {


	public RegistroX480() {
		super();
		preencheCamposDefault();
	}

	@Override
	public void preencheCamposDefault() {
		this.setIdentRegistro(ConstantesSistema.REG_REGISTRO_X480);
	}

	@Override
	public void gerarRegistro(List<StringBuilder> listaRegistros) {
	}
}