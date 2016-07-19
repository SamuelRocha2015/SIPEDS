package br.org.asabrasil.sped.modelos.blocoX;

import java.util.List;

import br.org.asabrasil.sped.modelos.Linha;
import br.org.asabrasil.sped.util.ConstantesSistema;
import br.org.asabrasil.sped.util.Util;

public class RegistroX300 extends Linha {

	private String numeroOrdem;
	private String descricaoExportacoes;
	private String totalOperacoes;
	private String codigoNCM;
	private String quantidade;
	private String unidMedida;
	private String indicOperacao;
	private String metodo;
	private String precoParametros;
	private String precoPratica;
	private String vlAjuste;
	private String juros;
	private String txJurosMinima;
	private String codigoCNC;
	private String moeda;

	public String getNumeroOrdem() {
		return Util.validaAtributoString(numeroOrdem);
	}

	public String getDescricaoExportacoes() {
		return Util.validaAtributoString(descricaoExportacoes);
	}

	public String getTotalOperacoes() {
		return Util.validaAtributoString(totalOperacoes);
	}

	public String getCodigoNCM() {
		return Util.validaAtributoString(codigoNCM);
	}

	public String getQuantidade() {
		return Util.validaAtributoString(quantidade);
	}

	public String getUnidMedida() {
		return Util.validaAtributoString(unidMedida);
	}

	public String getIndicOperacao() {
		return Util.validaAtributoString(indicOperacao);
	}

	public String getMetodo() {
		return Util.validaAtributoString(metodo);
	}

	public String getPrecoParametros() {
		return Util.validaAtributoString(precoParametros);
	}

	public String getPrecoPratica() {
		return Util.validaAtributoString(precoPratica);
	}

	public String getVlAjuste() {
		return Util.validaAtributoString(vlAjuste);
	}

	public String getJuros() {
		return Util.validaAtributoString(juros);
	}

	public String getTxJurosMinima() {
		return Util.validaAtributoString(txJurosMinima);
	}

	public String getCodigoCNC() {
		return Util.validaAtributoString(codigoCNC);
	}

	public String getMoeda() {
		return Util.validaAtributoString(moeda);
	}

	public void setNumeroOrdem(String numeroOrdem) {
		this.numeroOrdem = numeroOrdem;
	}

	public void setDescricaoExportacoes(String descricaoExportacoes) {
		this.descricaoExportacoes = descricaoExportacoes;
	}

	public void setTotalOperacoes(String totalOperacoes) {
		this.totalOperacoes = totalOperacoes;
	}

	public void setCodigoNCM(String codigoNCM) {
		this.codigoNCM = codigoNCM;
	}

	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}

	public void setUnidMedida(String unidMedida) {
		this.unidMedida = unidMedida;
	}

	public void setIndicOperacao(String indicOperacao) {
		this.indicOperacao = indicOperacao;
	}

	public void setMetodo(String metodo) {
		this.metodo = metodo;
	}

	public void setPrecoParametros(String precoParametros) {
		this.precoParametros = precoParametros;
	}

	public void setPrecoPratica(String precoPratica) {
		this.precoPratica = precoPratica;
	}

	public void setVlAjuste(String vlAjuste) {
		this.vlAjuste = vlAjuste;
	}

	public void setJuros(String juros) {
		this.juros = juros;
	}

	public void setTxJurosMinima(String txJurosMinima) {
		this.txJurosMinima = txJurosMinima;
	}

	public void setCodigoCNC(String codigoCNC) {
		this.codigoCNC = codigoCNC;
	}

	public void setMoeda(String moeda) {
		this.moeda = moeda;
	}

	public RegistroX300() {
		super();
		preencheCamposDefault();
	}

	@Override
	public void preencheCamposDefault() {
		this.setIdentRegistro(ConstantesSistema.REG_REGISTRO_X300);

	}

	@Override
	public void gerarRegistro(List<StringBuilder> listaRegistros) {
		// TODO Auto-generated method stub

	}

}
