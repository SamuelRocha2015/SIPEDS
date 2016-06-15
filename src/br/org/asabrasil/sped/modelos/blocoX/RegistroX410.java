package br.org.asabrasil.sped.modelos.blocoX;

import java.util.List;

import br.org.asabrasil.sped.modelos.Linha;
import br.org.asabrasil.sped.util.Util;

public class RegistroX410 extends Linha {

	private String pais;
	private String indicHomepageDisp;
	private String indicDisponServidor;

	public String getPais() {
		return Util.validaAtributoString(pais);
	}

	public String getIndicHomepageDisp() {
		return Util.validaAtributoString(indicHomepageDisp);
	}

	public String getIndicDisponServidor() {
		return Util.validaAtributoString(indicDisponServidor);
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public void setIndicHomepageDisp(String indicHomepageDisp) {
		this.indicHomepageDisp = indicHomepageDisp;
	}

	public void setIndicDisponServidor(String indicDisponServidor) {
		this.indicDisponServidor = indicDisponServidor;
	}

	public RegistroX410() {
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
