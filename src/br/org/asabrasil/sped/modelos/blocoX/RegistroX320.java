package br.org.asabrasil.sped.modelos.blocoX;

import java.util.List;

import br.org.asabrasil.sped.modelos.Linha;
import br.org.asabrasil.sped.util.Util;

public class RegistroX320 extends Linha {

	private String numOrdem;
	private String tpImportacoes;
	private String descricao;
	private String totalOperacoes;
	private String codigoNCM;
	private String unidMedida;
	private String metodo;
	private String precoParametro;
	private String precoPraticado;
	private String vlAjuste;
	private String juros;
	private String txJurosMinima;
	private String txJurosMaxima;
	private String codigoCNC;

	public String getNumOrdem() {
		return Util.validaAtributoString(numOrdem);
	}

	public String getTpImportacoes() {
		return Util.validaAtributoString(tpImportacoes);
	}

	public String getDescricao() {
		return Util.validaAtributoString(descricao);
	}

	public String getTotalOperacoes() {
		return Util.validaAtributoString(totalOperacoes);
	}

	public String getCodigoNCM() {
		return Util.validaAtributoString(codigoNCM);
	}

	public String getUnidMedida() {
		return Util.validaAtributoString(unidMedida);
	}

	public String getMetodo() {
		return Util.validaAtributoString(metodo);
	}

	public String getPrecoParametro() {
		return Util.validaAtributoString(precoParametro);
	}

	public String getPrecoPraticado() {
		return Util.validaAtributoString(precoPraticado);
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

	public String getTxJurosMaxima() {
		return Util.validaAtributoString(txJurosMaxima);
	}

	public String getCodigoCNC() {
		return Util.validaAtributoString(codigoCNC);
	}

	public void setNumOrdem(String numOrdem) {
		this.numOrdem = numOrdem;
	}

	public void setTpImportacoes(String tpImportacoes) {
		this.tpImportacoes = tpImportacoes;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setTotalOperacoes(String totalOperacoes) {
		this.totalOperacoes = totalOperacoes;
	}

	public void setCodigoNCM(String codigoNCM) {
		this.codigoNCM = codigoNCM;
	}

	public void setUnidMedida(String unidMedida) {
		this.unidMedida = unidMedida;
	}

	public void setMetodo(String metodo) {
		this.metodo = metodo;
	}

	public void setPrecoParametro(String precoParametro) {
		this.precoParametro = precoParametro;
	}

	public void setPrecoPraticado(String precoPraticado) {
		this.precoPraticado = precoPraticado;
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

	public void setTxJurosMaxima(String txJurosMaxima) {
		this.txJurosMaxima = txJurosMaxima;
	}

	public void setCodigoCNC(String codigoCNC) {
		this.codigoCNC = codigoCNC;
	}

	public RegistroX320() {
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
