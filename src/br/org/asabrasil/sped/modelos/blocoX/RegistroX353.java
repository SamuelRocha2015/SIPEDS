package br.org.asabrasil.sped.modelos.blocoX;

import java.util.List;

import br.org.asabrasil.sped.modelos.Linha;
import br.org.asabrasil.sped.util.Util;

public class RegistroX353 extends Linha {

	private String resultNegUtil;
	private String resultNegUtilReal;
	private String saldoResultNegNaoUtil;
	private String saldoResultNegNaoUtilReal;

	public String getResultNegUtil() {
		return Util.validaAtributoString(resultNegUtil);
	}

	public String getResultNegUtilReal() {
		return Util.validaAtributoString(resultNegUtilReal);
	}

	public String getSaldoResultNegNaoUtil() {
		return Util.validaAtributoString(saldoResultNegNaoUtil);
	}

	public String getSaldoResultNegNaoUtilReal() {
		return Util.validaAtributoString(saldoResultNegNaoUtilReal);
	}

	public void setResultNegUtil(String resultNegUtil) {
		this.resultNegUtil = resultNegUtil;
	}

	public void setResultNegUtilReal(String resultNegUtilReal) {
		this.resultNegUtilReal = resultNegUtilReal;
	}

	public void setSaldoResultNegNaoUtil(String saldoResultNegNaoUtil) {
		this.saldoResultNegNaoUtil = saldoResultNegNaoUtil;
	}

	public void setSaldoResultNegNaoUtilReal(String saldoResultNegNaoUtilReal) {
		this.saldoResultNegNaoUtilReal = saldoResultNegNaoUtilReal;
	}

	
	public RegistroX353() {
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
