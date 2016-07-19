package br.org.asabrasil.sped.modelos.blocoX;

import java.util.List;

import br.org.asabrasil.sped.modelos.Linha;
import br.org.asabrasil.sped.util.ConstantesSistema;
import br.org.asabrasil.sped.util.Util;

public class RegistroX352 extends Linha {

	private String resultPer;
	private String resultPerReal;
	private String LucrDisp;
	private String LucrDispReal;

	public String getResultPer() {
		return Util.validaAtributoString(resultPer);
	}

	public String getResultPerReal() {
		return Util.validaAtributoString(resultPerReal);
	}

	public String getLucrDisp() {
		return Util.validaAtributoString(LucrDisp);
	}

	public String getLucrDispReal() {
		return Util.validaAtributoString(LucrDispReal);
	}

	public void setResultPer(String resultPer) {
		this.resultPer = resultPer;
	}

	public void setResultPerReal(String resultPerReal) {
		this.resultPerReal = resultPerReal;
	}

	public void setLucrDisp(String LucrDisp) {
		this.LucrDisp = LucrDisp;
	}

	public void setLucrDispReal(String LucrDispReal) {
		this.LucrDispReal = LucrDispReal;
	}

	public RegistroX352() {
		super();
		preencheCamposDefault();
	}

	@Override
	public void preencheCamposDefault() {
		this.setIdentRegistro(ConstantesSistema.REG_REGISTRO_X352);

	}

	@Override
	public void gerarRegistro(List<StringBuilder> listaRegistros) {
		// TODO Auto-generated method stub

	}

}
