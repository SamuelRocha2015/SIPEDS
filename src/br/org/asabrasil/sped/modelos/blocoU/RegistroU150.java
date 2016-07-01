package br.org.asabrasil.sped.modelos.blocoU;

import java.util.List;

import br.org.asabrasil.sped.modelos.Linha;
import br.org.asabrasil.sped.util.ConstantesSistema;
import br.org.asabrasil.sped.util.Util;

public class RegistroU150 extends Linha {

	private String codContaReferencial;
	private String descricaoContaReferencial;
	private String indicTpConta;
	private String nivelConta;
	private String natConta;
	private String codContaSintetica;
	private String vlTotalTransferido;
	private String indicSinalSaldoFin;

	public String getCodContaReferencial() {
		return Util.validaAtributoString(codContaReferencial);
	}

	public String getDescricaoContaReferencial() {
		return Util.validaAtributoString(descricaoContaReferencial);
	}

	public String getIndicTpConta() {
		return Util.validaAtributoString(indicTpConta);
	}

	public String getNivelConta() {
		return Util.validaAtributoString(nivelConta);
	}

	public String getNatConta() {
		return Util.validaAtributoString(natConta);
	}

	public String getCodContaSintetica() {
		return Util.validaAtributoString(codContaSintetica);
	}

	public String getVlTotalTransferido() {
		return Util.validaAtributoString(vlTotalTransferido);
	}

	public String getIndicSinalSaldoFin() {
		return Util.validaAtributoString(indicSinalSaldoFin);
	}

	public void setCodContaReferencial(String codContaReferencial) {
		this.codContaReferencial = codContaReferencial;
	}

	public void setDescricaoContaReferencial(String descricaoContaReferencial) {
		this.descricaoContaReferencial = descricaoContaReferencial;
	}

	public void setIndicTpConta(String indicTpConta) {
		this.indicTpConta = indicTpConta;
	}

	public void setNivelConta(String nivelConta) {
		this.nivelConta = nivelConta;
	}

	public void setNatConta(String natConta) {
		this.natConta = natConta;
	}

	public void setCodContaSintetica(String codContaSintetica) {
		this.codContaSintetica = codContaSintetica;
	}

	public void setVlTotalTransferido(String vlTotalTransferido) {
		this.vlTotalTransferido = vlTotalTransferido;
	}

	public void setIndicSinalSaldoFin(String indicSinalSaldoFin) {
		this.indicSinalSaldoFin = indicSinalSaldoFin;
	}

	public RegistroU150() {
		super();
		preencheCamposDefault();
	}

	@Override
	public void preencheCamposDefault() {
		this.setIdentRegistro(ConstantesSistema.REG_REGISTRO_U150);
	}

	@Override
	public void gerarRegistro(List<StringBuilder> listaRegistros) {
		StringBuilder reg = new StringBuilder();
		
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		reg.append(this.getIdentRegistro());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		reg.append(this.getCodContaReferencial());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		reg.append(this.getDescricaoContaReferencial());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);

		reg.append(this.getIndicTpConta());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);

		reg.append(this.getNivelConta());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		reg.append(this.getNatConta());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		reg.append(this.getCodContaSintetica());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		reg.append(this.getVlTotalTransferido());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		reg.append(this.getIndicSinalSaldoFin());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		reg.append(this.geraFinalRegistro());
		
		listaRegistros.add(reg);


	}

}
