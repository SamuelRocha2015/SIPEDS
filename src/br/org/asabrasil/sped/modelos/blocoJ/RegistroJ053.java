package br.org.asabrasil.sped.modelos.blocoJ;

import java.util.List;

import br.org.asabrasil.sped.modelos.Linha;
import br.org.asabrasil.sped.util.ConstantesSistema;
import br.org.asabrasil.sped.util.Util;

public class RegistroJ053 extends Linha {

	private String codIdentGrupoFormado;
	private String codSubcontaCorrelata;
	private String natSubconta;


	public String getNatSubconta() {
		return Util.validaAtributoString(natSubconta);
	}

	public void setNatSubconta(String natSubconta) {
		this.natSubconta = natSubconta;
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

	public RegistroJ053() {
		super();
		preencheCamposDefault();
	}

	
	@Override
	public void preencheCamposDefault() {
		// preenche a identificacao do registro
		this.setIdentRegistro(ConstantesSistema.REG_REGISTRO_J053);
		this.setNatSubconta(ConstantesSistema.NAT_SUB_CNT);
	}

	@Override
	public void gerarRegistro(List<StringBuilder> listaRegistros) {

		StringBuilder reg = new StringBuilder();
		
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		reg.append(this.getIdentRegistro());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);

		reg.append(this.getCodIdentGrupoFormado());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);

		reg.append(this.getCodSubcontaCorrelata());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);

		reg.append(this.getNatSubconta());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);

		reg.append(this.geraFinalRegistro());

		listaRegistros.add(reg);

	}

}
