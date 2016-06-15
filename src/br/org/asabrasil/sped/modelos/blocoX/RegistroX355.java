package br.org.asabrasil.sped.modelos.blocoX;

import java.util.List;

import br.org.asabrasil.sped.modelos.Linha;
import br.org.asabrasil.sped.util.Util;

public class RegistroX355 extends Linha {

	private String rendaPassivaProp;
	private String rendaPassivaPropReal;
	private String rendaTotal;
	private String rendaTotalReal;
	private String rendaAtivProp;
	private String rendaAtivPropReal;
	private String percentual;

	public String getRendaPassivaProp() {
		return Util.validaAtributoString(rendaPassivaProp);
	}

	public String getRendaPassivaPropReal() {
		return Util.validaAtributoString(rendaPassivaPropReal);
	}

	public String getRendaTotal() {
		return Util.validaAtributoString(rendaTotal);
	}

	public String getRendaTotalReal() {
		return Util.validaAtributoString(rendaTotalReal);
	}

	public String getRendaAtivProp() {
		return Util.validaAtributoString(rendaAtivProp);
	}

	public String getRendaAtivPropReal() {
		return Util.validaAtributoString(rendaAtivPropReal);
	}

	public String getPercentual() {
		return Util.validaAtributoString(percentual);
	}

	public void setRendaPassivaProp(String rendaPassivaProp) {
		this.rendaPassivaProp = rendaPassivaProp;
	}

	public void setRendaPassivaPropReal(String rendaPassivaPropReal) {
		this.rendaPassivaPropReal = rendaPassivaPropReal;
	}

	public void setRendaTotal(String rendaTotal) {
		this.rendaTotal = rendaTotal;
	}

	public void setRendaTotalReal(String rendaTotalReal) {
		this.rendaTotalReal = rendaTotalReal;
	}

	public void setRendaAtivProp(String rendaAtivProp) {
		this.rendaAtivProp = rendaAtivProp;
	}

	public void setRendaAtivPropReal(String rendaAtivPropReal) {
		this.rendaAtivPropReal = rendaAtivPropReal;
	}

	public void setPercentual(String percentual) {
		this.percentual = percentual;
	}

	public RegistroX355() {
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
