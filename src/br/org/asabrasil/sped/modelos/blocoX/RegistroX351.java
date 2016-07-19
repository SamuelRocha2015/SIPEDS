package br.org.asabrasil.sped.modelos.blocoX;

import java.util.List;

import br.org.asabrasil.sped.modelos.Linha;
import br.org.asabrasil.sped.util.ConstantesSistema;
import br.org.asabrasil.sped.util.Util;

public class RegistroX351 extends Linha {

	private String resultInvestMoeda;
	private String resultInvestReais;
	private String resultInvestOpInsePetroPer;
	private String resultInvestOpInsePetroPerReal;
	private String resultNegAcum;
	private String resultPosTrib;
	private String resultPosTribReal;
	private String ImpLucr;
	private String ImpLucrReal;
	private String ImpPagRend;
	private String ImpPagRendReal;
	private String ImpRetExt;
	private String ImpRetExtReal;
	private String ImpRetBr;

	public String getResultInvestMoeda() {
		return Util.validaAtributoString(resultInvestMoeda);
	}

	public String getResultInvestReais() {
		return Util.validaAtributoString(resultInvestReais);
	}

	public String getResultInvestOpInsePetroPer() {
		return Util.validaAtributoString(resultInvestOpInsePetroPer);
	}

	public String getResultInvestOpInsePetroPerReal() {
		return Util.validaAtributoString(resultInvestOpInsePetroPerReal);
	}

	public String getResultNegAcum() {
		return Util.validaAtributoString(resultNegAcum);
	}

	public String getResultPosTrib() {
		return Util.validaAtributoString(resultPosTrib);
	}

	public String getResultPosTribReal() {
		return Util.validaAtributoString(resultPosTribReal);
	}

	public String getImpLucr() {
		return Util.validaAtributoString(ImpLucr);
	}

	public String getImpLucrReal() {
		return Util.validaAtributoString(ImpLucrReal);
	}

	public String getImpPagRend() {
		return Util.validaAtributoString(ImpPagRend);
	}

	public String getImpPagRendReal() {
		return Util.validaAtributoString(ImpPagRendReal);
	}

	public String getImpRetExt() {
		return Util.validaAtributoString(ImpRetExt);
	}

	public String getImpRetExtReal() {
		return Util.validaAtributoString(ImpRetExtReal);
	}

	public String getImpRetBr() {
		return Util.validaAtributoString(ImpRetBr);
	}

	public void setResultInvestMoeda(String resultInvestMoeda) {
		this.resultInvestMoeda = resultInvestMoeda;
	}

	public void setResultInvestReais(String resultInvestReais) {
		this.resultInvestReais = resultInvestReais;
	}

	public void setResultInvestOpInsePetroPer(String resultInvestOpInsePetroPer) {
		this.resultInvestOpInsePetroPer = resultInvestOpInsePetroPer;
	}

	public void setResultInvestOpInsePetroPerReal(
			String resultInvestOpInsePetroPerReal) {
		this.resultInvestOpInsePetroPerReal = resultInvestOpInsePetroPerReal;
	}

	public void setResultNegAcum(String resultNegAcum) {
		this.resultNegAcum = resultNegAcum;
	}

	public void setResultPosTrib(String resultPosTrib) {
		this.resultPosTrib = resultPosTrib;
	}

	public void setResultPosTribReal(String resultPosTribReal) {
		this.resultPosTribReal = resultPosTribReal;
	}

	public void setImpLucr(String ImpLucr) {
		this.ImpLucr = ImpLucr;
	}

	public void setImpLucrReal(String ImpLucrReal) {
		this.ImpLucrReal = ImpLucrReal;
	}

	public void setImpPagRend(String ImpPagRend) {
		this.ImpPagRend = ImpPagRend;
	}

	public void setImpPagRendReal(String ImpPagRendReal) {
		this.ImpPagRendReal = ImpPagRendReal;
	}

	public void setImpRetExt(String ImpRetExt) {
		this.ImpRetExt = ImpRetExt;
	}

	public void setImpRetExtReal(String ImpRetExtReal) {
		this.ImpRetExtReal = ImpRetExtReal;
	}

	public void setImpRetBr(String ImpRetBr) {
		this.ImpRetBr = ImpRetBr;
	}

	public RegistroX351() {
		super();
		preencheCamposDefault();
	}

	@Override
	public void preencheCamposDefault() {
		this.setIdentRegistro(ConstantesSistema.REG_REGISTRO_X351);

	}

	@Override
	public void gerarRegistro(List<StringBuilder> listaRegistros) {
		// TODO Auto-generated method stub

	}

}
