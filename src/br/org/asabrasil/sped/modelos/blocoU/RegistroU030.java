package br.org.asabrasil.sped.modelos.blocoU;

import java.util.List;

import br.org.asabrasil.sped.modelos.Linha;
import br.org.asabrasil.sped.util.Util;

public class RegistroU030 extends Linha {

	private String dtIniPeriodo;
	private String dtFimPeriodo;
	private String periodoApuracao;

	public String getDtIniPeriodo() {
		return Util.validaAtributoString(dtIniPeriodo);
	}

	public String getDtFimPeriodo() {
		return Util.validaAtributoString(dtFimPeriodo);
	}

	public String getPeriodoApuracao() {
		return Util.validaAtributoString(periodoApuracao);
	}

	public void setDtIniPeriodo(String dtIniPeriodo) {
		this.dtIniPeriodo = dtIniPeriodo;
	}

	public void setDtFimPeriodo(String dtFimPeriodo) {
		this.dtFimPeriodo = dtFimPeriodo;
	}

	public void setPeriodoApuracao(String periodoApuracao) {
		this.periodoApuracao = periodoApuracao;
	}

	
	public RegistroU030() {
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
