package br.org.asabrasil.sped.modelos.blocoJ;

import java.util.List;

import br.org.asabrasil.sped.modelos.Linha;
import br.org.asabrasil.sped.util.ConstantesSistema;
import br.org.asabrasil.sped.util.Util;

public class RegistroJ051 extends Linha {

	private String codCentroCustos;
	private String codContaPlanoContas;

	public RegistroJ051() {
		super();
		preencheCamposDefault();
	}

	public String getCodCentroCustos() {
		return Util.validaAtributoString(codCentroCustos);
	}

	public String getCodContaPlanoContas() {
		return Util.validaAtributoString(codContaPlanoContas);
	}

	public void setCodCentroCustos(String codCentroCustos) {
		this.codCentroCustos = codCentroCustos;
	}

	public void setCodContaPlanoContas(String codContaPlanoContas) {
		this.codContaPlanoContas = codContaPlanoContas;
	}

	@Override
	public void preencheCamposDefault() {
		// preenche a identificacao do registro
		this.setIdentRegistro(ConstantesSistema.REG_REGISTRO_J051);

	}

	@Override
	public void gerarRegistro(List<StringBuilder> listaRegistros) {
		
		StringBuilder reg = new StringBuilder();
		
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		reg.append(this.getIdentRegistro());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		reg.append(this.getCodCentroCustos());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		reg.append(this.getCodContaPlanoContas());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);

		reg.append(this.geraFinalRegistro());
		
		listaRegistros.add(reg);

	}

}
