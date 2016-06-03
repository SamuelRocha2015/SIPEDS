package br.org.asabrasil.sped.modelos.blocoK;

import java.util.List;

import br.org.asabrasil.sped.modelos.Linha;
import br.org.asabrasil.sped.util.ConstantesSistema;

public class RegistroK356 extends Linha {

	
	public RegistroK356() {
		super();
		preencheCamposDefault();
	}

	@Override
	public void preencheCamposDefault() {
		this.setIdentRegistro(ConstantesSistema.REG_REGISTRO_K356);

	}

	@Override
	public void gerarRegistro(List<StringBuilder> listaRegistros) {
		// TODO Auto-generated method stub

	}

}
