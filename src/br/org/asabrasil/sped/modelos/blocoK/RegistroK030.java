package br.org.asabrasil.sped.modelos.blocoK;

import java.util.List;

import br.org.asabrasil.sped.modelos.Linha;
import br.org.asabrasil.sped.util.ConstantesSistema;
import br.org.asabrasil.sped.util.Util;

public class RegistroK030 extends Linha {

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

	public RegistroK030() {
		super();
		preencheCamposDefault();
	}

	@Override
	public void preencheCamposDefault() {
		this.setIdentRegistro(ConstantesSistema.REG_REGISTRO_K030);
		this.periodoApuracao = ConstantesSistema.PER_APUR;
		this.dtIniPeriodo = Util.dataInicialOuFinalApuracaoSemMascara(true);
		this.dtFimPeriodo = Util.dataInicialOuFinalApuracaoSemMascara(false);
	}

	@Override
	public void gerarRegistro(List<StringBuilder> listaRegistros) {
		StringBuilder reg = new StringBuilder();
		
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		reg.append(this.getIdentRegistro());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		reg.append(this.getDtIniPeriodo());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		reg.append(this.getDtFimPeriodo());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		reg.append(this.getPeriodoApuracao());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		reg.append(this.geraFinalRegistro());
		
		listaRegistros.add(reg);


	}

}
