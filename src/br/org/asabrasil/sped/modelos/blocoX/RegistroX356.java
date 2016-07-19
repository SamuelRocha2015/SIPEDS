package br.org.asabrasil.sped.modelos.blocoX;

import java.util.List;

import br.org.asabrasil.sped.modelos.Linha;
import br.org.asabrasil.sped.util.ConstantesSistema;
import br.org.asabrasil.sped.util.Util;

public class RegistroX356 extends Linha {

	private String percentParticip;
	private String ativoTotal;
	private String PatrimLiquido;

	public String getPercentParticip() {
		return Util.validaAtributoString(percentParticip);
	}

	public String getAtivoTotal() {
		return Util.validaAtributoString(ativoTotal);
	}

	public String getPatrimLiquido() {
		return Util.validaAtributoString(PatrimLiquido);
	}

	public void setPercentParticip(String percentParticip) {
		this.percentParticip = percentParticip;
	}

	public void setAtivoTotal(String ativoTotal) {
		this.ativoTotal = ativoTotal;
	}

	public void setPatrimLiquido(String PatrimLiquido) {
		this.PatrimLiquido = PatrimLiquido;
	}

	
	public RegistroX356() {
		super();
		preencheCamposDefault();
	}

	@Override
	public void preencheCamposDefault() {
		this.setIdentRegistro(ConstantesSistema.REG_REGISTRO_X356);

	}

	@Override
	public void gerarRegistro(List<StringBuilder> listaRegistros) {
		// TODO Auto-generated method stub

	}

}
