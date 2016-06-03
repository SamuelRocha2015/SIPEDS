package br.org.asabrasil.sped.modelos.blocoK;

import java.util.List;

import br.org.asabrasil.sped.modelos.Linha;
import br.org.asabrasil.sped.util.ConstantesSistema;
import br.org.asabrasil.sped.util.Util;

public class RegistroK155 extends Linha {

	private String codAnaliticaPatrimonial;
	private String codCentroCustos;
	private String vlSaldoInicialPeriodo;
	private String indicSitSaldoInicial;
	private String vlTotalDebitosPeriodo;
	private String vlTotalCreditosPeriodo;
	private String vlSaldoFinalPeriodo;
	private String indicSitSaldoFinal;

	public String getVlTotalCreditosPeriodo() {
		return Util.validaAtributoString(vlTotalCreditosPeriodo);
	}

	public String getCodAnaliticaPatrimonial() {
		return Util.validaAtributoString(codAnaliticaPatrimonial);
	}

	public String getCodCentroCustos() {
		return Util.validaAtributoString(codCentroCustos);
	}

	public String getVlSaldoInicialPeriodo() {
		return Util.validaAtributoString(vlSaldoInicialPeriodo);
	}

	public String getIndicSitSaldoInicial() {
		return Util.validaAtributoString(indicSitSaldoInicial);
	}

	public String getVlTotalDebitosPeriodo() {
		return Util.validaAtributoString(vlTotalDebitosPeriodo);
	}

	public String getVlSaldoFinalPeriodo() {
		return Util.validaAtributoString(vlSaldoFinalPeriodo);
	}

	public String getIndicSitSaldoFinal() {
		return Util.validaAtributoString(indicSitSaldoFinal);
	}

	public void setCodAnaliticaPatrimonial(String codAnaliticaPatrimonial) {
		this.codAnaliticaPatrimonial = codAnaliticaPatrimonial;
	}

	public void setCodCentroCustos(String codCentroCustos) {
		this.codCentroCustos = codCentroCustos;
	}

	public void setVlSaldoInicialPeriodo(String vlSaldoInicialPeriodo) {
		this.vlSaldoInicialPeriodo = vlSaldoInicialPeriodo;
	}

	public void setIndicSitSaldoInicial(String indicSitSaldoInicial) {
		this.indicSitSaldoInicial = indicSitSaldoInicial;
	}

	public void setVlTotalDebitosPeriodo(String vlTotalDebitosPeriodo) {
		this.vlTotalDebitosPeriodo = vlTotalDebitosPeriodo;
	}

	public void setVlSaldoFinalPeriodo(String vlSaldoFinalPeriodo) {
		this.vlSaldoFinalPeriodo = vlSaldoFinalPeriodo;
	}

	public void setIndicSitSaldoFinal(String indicSitSaldoFinal) {
		this.indicSitSaldoFinal = indicSitSaldoFinal;
	}

	public void setVlTotalCreditosPeriodo(String vlTotalCreditosPeriodo) {
		this.vlTotalCreditosPeriodo = vlTotalCreditosPeriodo;
	}

	public RegistroK155() {
		super();
		preencheCamposDefault();
	}

	@Override
	public void preencheCamposDefault() {
		this.setIdentRegistro(ConstantesSistema.REG_REGISTRO_K155);
	}

	@Override
	public void gerarRegistro(List<StringBuilder> listaRegistros) {
		
		StringBuilder reg = new StringBuilder();
		
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		reg.append(this.getIdentRegistro());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		reg.append(this.getCodAnaliticaPatrimonial());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		reg.append(this.getCodCentroCustos());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		reg.append(this.getVlSaldoInicialPeriodo());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		reg.append(this.getIndicSitSaldoInicial());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		reg.append(this.getVlTotalDebitosPeriodo());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		reg.append(this.getVlSaldoFinalPeriodo());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);		

		reg.append(this.getIndicSitSaldoFinal());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		reg.append(this.geraFinalRegistro());
		
		listaRegistros.add(reg);

	}

}
