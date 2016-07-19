package br.org.asabrasil.sped.modelos.blocoX;

import java.util.List;

import br.org.asabrasil.sped.modelos.Linha;
import br.org.asabrasil.sped.util.ConstantesSistema;
import br.org.asabrasil.sped.util.Util;

public class RegistroX354 extends Linha {

	private String resultNeg;
	private String resultNegReal;
	private String saldoResultNegAcum;

	public String getResultNeg() {
		return Util.validaAtributoString(resultNeg);
	}

	public String getResultNegReal() {
		return Util.validaAtributoString(resultNegReal);
	}

	public String getSaldoResultNegAcum() {
		return Util.validaAtributoString(saldoResultNegAcum);
	}

	public void setResultNeg(String resultNeg) {
		this.resultNeg = resultNeg;
	}

	public void setResultNegReal(String resultNegReal) {
		this.resultNegReal = resultNegReal;
	}

	public void setSaldoResultNegAcum(String saldoResultNegAcum) {
		this.saldoResultNegAcum = saldoResultNegAcum;
	}

	public RegistroX354() {
		super();
		preencheCamposDefault();
	}

	@Override
	public void preencheCamposDefault() {
		this.setIdentRegistro(ConstantesSistema.REG_REGISTRO_X354);

	}

	@Override
	public void gerarRegistro(List<StringBuilder> listaRegistros) {
		// TODO Auto-generated method stub

	}

}
