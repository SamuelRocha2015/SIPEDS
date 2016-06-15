package br.org.asabrasil.sped.modelos.blocoX;

import java.util.List;

import br.org.asabrasil.sped.modelos.Linha;
import br.org.asabrasil.sped.util.Util;

public class RegistroX340 extends Linha {

	private String razaoSocial;
	private String numIdentFiscal;
	private String IndicControle;
	private String pais;
	private String IndicProspeccao;
	private String IndicConsolidacao;
	private String motivoNaoConsolidacao;
	private String cnpj;

	public String getRazaoSocial() {
		return Util.validaAtributoString(razaoSocial);
	}

	public String getNumIdentFiscal() {
		return Util.validaAtributoString(numIdentFiscal);
	}

	public String getIndicControle() {
		return Util.validaAtributoString(IndicControle);
	}

	public String getPais() {
		return Util.validaAtributoString(pais);
	}

	public String getIndicProspeccao() {
		return Util.validaAtributoString(IndicProspeccao);
	}

	public String getIndicConsolidacao() {
		return Util.validaAtributoString(IndicConsolidacao);
	}

	public String getMotivoNaoConsolidacao() {
		return Util.validaAtributoString(motivoNaoConsolidacao);
	}

	public String getCnpj() {
		return Util.validaAtributoString(cnpj);
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public void setNumIdentFiscal(String numIdentFiscal) {
		this.numIdentFiscal = numIdentFiscal;
	}

	public void setIndicControle(String IndicControle) {
		this.IndicControle = IndicControle;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public void setIndicProspeccao(String IndicProspeccao) {
		this.IndicProspeccao = IndicProspeccao;
	}

	public void setIndicConsolidacao(String IndicConsolidacao) {
		this.IndicConsolidacao = IndicConsolidacao;
	}

	public void setMotivoNaoConsolidacao(String motivoNaoConsolidacao) {
		this.motivoNaoConsolidacao = motivoNaoConsolidacao;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	
	public RegistroX340() {
		super();
		preencheCamposDefault();
	}

	@Override
	public void preencheCamposDefault() {
		// TODO Auto-generated method stub

	}

	@Override
	public void gerarRegistro(List<StringBuilder> listaRegistros) {
		// TODO Auto-generated method stub

	}

}
