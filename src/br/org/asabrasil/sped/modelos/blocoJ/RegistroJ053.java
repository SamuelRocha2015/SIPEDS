package br.org.asabrasil.sped.modelos.blocoJ;

import java.util.List;

import br.org.asabrasil.sped.modelos.Linha;
import br.org.asabrasil.sped.util.ConstantesSistema;
import br.org.asabrasil.sped.util.Util;

public class RegistroJ053 extends Linha {

	private String codIdentGrupoFormado;
	private String codSubcontaCorrelata;

	public RegistroJ053() {
		super();
		preencheCamposDefault();
	}

	public String getCodIdentGrupoFormado() {
		return Util.validaAtributoString(codIdentGrupoFormado);
	}

	public String getCodSubcontaCorrelata() {
		return Util.validaAtributoString(codSubcontaCorrelata);
	}

	public void setCodIdentGrupoFormado(String codIdentGrupoFormado) {
		this.codIdentGrupoFormado = codIdentGrupoFormado;
	}

	public void setCodSubcontaCorrelata(String codSubcontaCorrelata) {
		this.codSubcontaCorrelata = codSubcontaCorrelata;
	}

	@Override
	public void preencheCamposDefault() {
		// preenche a identificacao do registro
		this.setIdentRegistro(ConstantesSistema.REG_REGISTRO_J053);

	}

	@Override
	public void gerarRegistro(List<StringBuilder> listaRegistros) {
		// TODO Auto-generated method stub

	}

}
