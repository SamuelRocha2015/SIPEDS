package br.org.asabrasil.sped.modelos.blocoX;

import java.util.List;

import br.org.asabrasil.sped.modelos.BaseX;
import br.org.asabrasil.sped.util.ConstantesSistema;

public class RegistroX390 extends BaseX {

	public RegistroX390() {
		super();
		preencheCamposDefault();
	}

	@Override
	public void preencheCamposDefault() {
		this.setIdentRegistro(ConstantesSistema.REG_REGISTRO_X390);
		this.setCodigo(ConstantesSistema.CODIGO_REG_X390);
	}

	@Override
	public void gerarRegistro(List<StringBuilder> listaRegistros) {
		super.gerarRegistro(listaRegistros);
	}

}
