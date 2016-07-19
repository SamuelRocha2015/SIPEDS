package br.org.asabrasil.sped.modelos.blocoX;

import java.util.List;

import br.org.asabrasil.sped.modelos.BaseX;
import br.org.asabrasil.sped.util.ConstantesSistema;

public class RegistroX292 extends BaseX {


	public RegistroX292() {
		super();
		preencheCamposDefault();
	}

	@Override
	public void preencheCamposDefault() {
		this.setIdentRegistro(ConstantesSistema.REG_REGISTRO_X292);

	}

	@Override
	public void gerarRegistro(List<StringBuilder> listaRegistros) {
		// TODO Auto-generated method stub

	}

}
