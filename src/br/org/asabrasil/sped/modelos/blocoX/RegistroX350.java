package br.org.asabrasil.sped.modelos.blocoX;

import java.util.List;

import br.org.asabrasil.sped.modelos.Linha;
import br.org.asabrasil.sped.util.ConstantesSistema;
import br.org.asabrasil.sped.util.Util;

public class RegistroX350 extends Linha {

	private String receitaLiquida;
	private String custosBensServicos;
	private String lucroBruto;
	private String receitaFinanceirasAuferidas;
	private String outrasReceitasOperacionais;
	private String despFinanceirasPagasCreditadas;
	private String despOperacaionais;
	private String lucroOperacaional;
	private String receitaParticipacao;
	private String outrasReceitas;
	private String outrasDesp;
	private String lucroLiqAntesIR;
	private String ImpDevido;
	private String lucroLiqPeriodoApu;

	public String getReceitaLiquida() {
		return Util.validaAtributoString(receitaLiquida);
	}

	public String getCustosBensServicos() {
		return Util.validaAtributoString(custosBensServicos);
	}

	public String getLucroBruto() {
		return Util.validaAtributoString(lucroBruto);
	}

	public String getReceitaFinanceirasAuferidas() {
		return Util.validaAtributoString(receitaFinanceirasAuferidas);
	}

	public String getOutrasReceitasOperacionais() {
		return Util.validaAtributoString(outrasReceitasOperacionais);
	}

	public String getDespFinanceirasPagasCreditadas() {
		return Util.validaAtributoString(despFinanceirasPagasCreditadas);
	}

	public String getDespOperacaionais() {
		return Util.validaAtributoString(despOperacaionais);
	}

	public String getLucroOperacaional() {
		return Util.validaAtributoString(lucroOperacaional);
	}

	public String getReceitaParticipacao() {
		return Util.validaAtributoString(receitaParticipacao);
	}

	public String getOutrasReceitas() {
		return Util.validaAtributoString(outrasReceitas);
	}

	public String getOutrasDesp() {
		return Util.validaAtributoString(outrasDesp);
	}

	public String getLucroLiqAntesIR() {
		return Util.validaAtributoString(lucroLiqAntesIR);
	}

	public String getImpDevido() {
		return Util.validaAtributoString(ImpDevido);
	}

	public String getLucroLiqPeriodoApu() {
		return Util.validaAtributoString(lucroLiqPeriodoApu);
	}

	public void setReceitaLiquida(String receitaLiquida) {
		this.receitaLiquida = receitaLiquida;
	}

	public void setCustosBensServicos(String custosBensServicos) {
		this.custosBensServicos = custosBensServicos;
	}

	public void setLucroBruto(String lucroBruto) {
		this.lucroBruto = lucroBruto;
	}

	public void setReceitaFinanceirasAuferidas(
			String receitaFinanceirasAuferidas) {
		this.receitaFinanceirasAuferidas = receitaFinanceirasAuferidas;
	}

	public void setOutrasReceitasOperacionais(String outrasReceitasOperacionais) {
		this.outrasReceitasOperacionais = outrasReceitasOperacionais;
	}

	public void setDespFinanceirasPagasCreditadas(
			String despFinanceirasPagasCreditadas) {
		this.despFinanceirasPagasCreditadas = despFinanceirasPagasCreditadas;
	}

	public void setDespOperacaionais(String despOperacaionais) {
		this.despOperacaionais = despOperacaionais;
	}

	public void setLucroOperacaional(String lucroOperacaional) {
		this.lucroOperacaional = lucroOperacaional;
	}

	public void setReceitaParticipacao(String receitaParticipacao) {
		this.receitaParticipacao = receitaParticipacao;
	}

	public void setOutrasReceitas(String outrasReceitas) {
		this.outrasReceitas = outrasReceitas;
	}

	public void setOutrasDesp(String outrasDesp) {
		this.outrasDesp = outrasDesp;
	}

	public void setLucroLiqAntesIR(String lucroLiqAntesIR) {
		this.lucroLiqAntesIR = lucroLiqAntesIR;
	}

	public void setImpDevido(String ImpDevido) {
		this.ImpDevido = ImpDevido;
	}

	public void setLucroLiqPeriodoApu(String lucroLiqPeriodoApu) {
		this.lucroLiqPeriodoApu = lucroLiqPeriodoApu;
	}

	public RegistroX350() {
		super();
		preencheCamposDefault();
	}

	@Override
	public void preencheCamposDefault() {
		this.setIdentRegistro(ConstantesSistema.REG_REGISTRO_X350);

	}

	@Override
	public void gerarRegistro(List<StringBuilder> listaRegistros) {
		// TODO Auto-generated method stub

	}

}
