package br.org.asabrasil.sped.modelos.bloco0;

import java.util.Calendar;

import br.org.asabrasil.sped.modelos.Registro;
import br.org.asabrasil.sped.util.ConstantesSistema;
import br.org.asabrasil.sped.util.Util;

/**
 * Classe basica que contem as informacoes do bloco de abertura do arquivo
 * (Business Object)
 * 
 * @author samuel.rocha
 * 
 */
public class Registro0000 extends Registro {

	// NOME_ESC
	private String identTipoSped;
	// COD_VER
	private String codVersaoLayout;
	// CNPJ
	private String cnpj;
	// NOME
	private String nomeEmpresa;
	// IND_SIT_INI_PER
	private String indicInicioPeriodo;
	// SIT_ESPECIAL
	private String indicSituacaoEspecEventos;
	// DT_INI
	private Calendar dtInicio;
	// DT_FIN
	private Calendar dtFim;
	// RETIFICADORA
	private String retificadora;
	// TIP_ECF
	private String indicTipoECF;
	// PAT_REMAN_CIS
	private String patrimonioRemanCasoDeCisao;
	// DT_SIT_ESP
	private Calendar dtSitEspecialEvento;
	// NUM_REC
	private String numReciboECF;
	// NUM_REC
	private String identSCP;

	public String getIdentTipoSped() {
		return Util.validaAtributoString(identTipoSped);
	}

	public String getCodVersaoLayout() {
		return Util.validaAtributoString(codVersaoLayout);
	}

	public String getCnpj() {
		return Util.validaAtributoString(cnpj);
	}

	public String getNomeEmpresa() {
		return Util.validaAtributoString(nomeEmpresa);
	}

	public String getIndicInicioPeriodo() {
		return Util.validaAtributoString(indicInicioPeriodo);
	}

	public String getIndicSituacaoEspecEventos() {
		return Util.validaAtributoString(indicSituacaoEspecEventos);
	}

	public String getRetificadora() {
		return Util.validaAtributoString(retificadora);
	}

	public String getIndicTipoECF() {
		return Util.validaAtributoString(indicTipoECF);
	}

	public String getPatrimonioRemanCasoDeCisao() {
		return Util.validaAtributoString(patrimonioRemanCasoDeCisao);
	}

	public String getNumReciboECF() {
		return Util.validaAtributoString(numReciboECF);
	}

	public String getIdentSCP() {
		return Util.validaAtributoString(identSCP);
	}

	public void setPatrimonioRemanCasoDeCisao(String patrimonioRemanCasoDeCisao) {
		this.patrimonioRemanCasoDeCisao = patrimonioRemanCasoDeCisao;
	}
	public void setNumReciboECF(String numReciboECF) {
		this.numReciboECF = numReciboECF;
	}
	public void setIdentSCP(String identSCP) {
		this.identSCP = identSCP;
	}
	public Calendar getDtInicio() {
		return dtInicio;
	}
	public void setDtInicio(Calendar dtInicio) {
		this.dtInicio = dtInicio;
	}
	public Calendar getDtFim() {
		return dtFim;
	}
	public void setDtFim(Calendar dtFim) {
		this.dtFim = dtFim;
	}
	public Calendar getDtSitEspecialEvento() {
		return dtSitEspecialEvento;
	}
	public void setDtSitEspecialEvento(Calendar dtSitEspecialEvento) {
		this.dtSitEspecialEvento = dtSitEspecialEvento;
	}

	@Override
	public void preencheCamposDefault() {

		// preenche a identificacao do registro
		this.setIdentRegistro(ConstantesSistema.REG_REGISTRO_0000);

		// preenche os demais campos padrão
		this.codVersaoLayout = ConstantesSistema.COD_VER;
		this.identTipoSped = ConstantesSistema.NOME_ESC;
		this.cnpj = ConstantesSistema.CNPJ_EMPRESA;
		this.nomeEmpresa = ConstantesSistema.NOME_EMPRESA;
		this.indicInicioPeriodo = ConstantesSistema.IND_SIT_INI_PER;
		this.indicSituacaoEspecEventos = ConstantesSistema.SIT_ESPECIAL;
		this.retificadora = ConstantesSistema.RETIFICADORA;
		this.indicTipoECF = ConstantesSistema.TIP_ECF;
	}
	

}
