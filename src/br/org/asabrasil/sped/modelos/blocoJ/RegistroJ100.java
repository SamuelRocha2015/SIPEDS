package br.org.asabrasil.sped.modelos.blocoJ;

import java.util.List;

import br.org.asabrasil.sped.modelos.Linha;
import br.org.asabrasil.sped.util.ConstantesSistema;
import br.org.asabrasil.sped.util.Util;

public class RegistroJ100 extends Linha {

	private String dtAlteracao;
	private String codCentroCustos;
	private String nomeCentroCustos;

	public RegistroJ100() {
		super();
		preencheCamposDefault();
	}

	public String getDtAlteracao() {
		return Util.validaAtributoString(dtAlteracao);
	}

	public String getCodCentroCustos() {
		return Util.validaAtributoString(codCentroCustos);
	}

	public String getNomeCentroCustos() {
		return Util.validaAtributoString(nomeCentroCustos);
	}

	public void setDtAlteracao(String dtAlteracao) {
		this.dtAlteracao = dtAlteracao;
	}

	public void setCodCentroCustos(String codCentroCustos) {
		this.codCentroCustos = codCentroCustos;
	}

	public void setNomeCentroCustos(String nomeCentroCustos) {
		this.nomeCentroCustos = nomeCentroCustos;
	}

	@Override
	public void preencheCamposDefault() {
		this.setIdentRegistro(ConstantesSistema.REG_REGISTRO_J053);
	}

	@Override
	public void gerarRegistro(List<StringBuilder> listaRegistros) {

		StringBuilder reg = new StringBuilder();
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		reg.append(this.getIdentRegistro());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);

		reg.append(this.getDtAlteracao());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);

		reg.append(this.getCodCentroCustos());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);

		reg.append(this.getNomeCentroCustos());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);

		reg.append(this.geraFinalRegistro());

		listaRegistros.add(reg);
	}
}
