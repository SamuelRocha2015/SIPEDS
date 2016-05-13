package br.org.asabrasil.sped.modelos.bloco0;

import java.util.Calendar;

import br.org.asabrasil.sped.modelos.Registro;
import br.org.asabrasil.sped.util.ConstantesSistema;
import br.org.asabrasil.sped.util.Util;

/**
 * Classe basica que contem as informacoes do bloco de abertura do arquivo (Business Object)
 * @author samuel.rocha
 *
 */
public class Registro0000 extends Registro {

	//NOME_ESC
	private String identTipoSped;
	//COD_VER
	private String codVersaoLayout;
	//CNPJ
	private String cnpj;
	//NOME
	private String nomeEmpresa;
	//IND_SIT_INI_PER
	private String indicInicioPeriodo;
	//SIT_ESPECIAL
	private String indicSituacaoEspecEventos;
	//DT_INI
	private Calendar dtInicio;
	//DT_FIN
	private Calendar dtFim;
	//RETIFICADORA
	private String retificadora;
	//TIP_ECF
	private String indicTipoECF;
	//PAT_REMAN_CIS
	private String patrimonioRemanCasoDeCisao;
	//DT_SIT_ESP
	private Calendar dtSitEspecialEvento;
	//NUM_REC
	private String numReciboECF;
		
	//NUM_REC
	private String identSCP;
	
	
	/**
	 * esse campo nao e obrigatorio por isso foi criado apenas o get que retorna vazio
	 * @return
	 */
	public String getIdentSCP() {
		if (!Util.isStringVazia(identSCP)) {
			return identSCP;
		}
		return "";
	}

	/**
	 * esse campo nao e obrigatorio por isso foi criado apenas o get que retorna vazio
	 * @return
	 */
	public String getPatrimonioRemanCasoDeCisao() {
		
		if (!Util.isStringVazia(patrimonioRemanCasoDeCisao)) {
			return patrimonioRemanCasoDeCisao;
		}
		return "";
	}
	
	public Calendar getDtSitEspecialEvento() {
		return dtSitEspecialEvento;
	}
	
	/**
	 * esse campo nao e obrigatorio por isso foi criado apenas o get que retorna vazio
	 * @return
	 */
	public String getNumReciboECF() {
		if (!Util.isStringVazia(numReciboECF)) {
			return numReciboECF;
		}
		return "";
	}

	public String getIdentTipoSped() {
		return identTipoSped;
	}
	public void setIdentTipoSped(String identificacaoTipoSped) {
		this.identTipoSped = identificacaoTipoSped;
	}
	public String getCodVersaoLayout() {
		return codVersaoLayout;
	}
	public void setCodVersaoLayout(String codVersaoLayout) {
		this.codVersaoLayout = codVersaoLayout;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getNomeEmpresa() {
		return nomeEmpresa;
	}
	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}
	public String getIndicInicioPeriodo() {
		return indicInicioPeriodo;
	}
	public void setIndicInicioPeriodo(String indicInicioPeriodo) {
		this.indicInicioPeriodo = indicInicioPeriodo;
	}
	public String getIndicSituacaoEspecEventos() {
		return indicSituacaoEspecEventos;
	}
	public void setIndicSituacaoEspecEventos(String indicSituacaoEspecEventos) {
		this.indicSituacaoEspecEventos = indicSituacaoEspecEventos;
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
	public String getRetificadora() {
		return retificadora;
	}
	public void setRetificadora(String retificadora) {
		this.retificadora = retificadora;
	}
	public String getIndicTipoECF() {
		return indicTipoECF;
	}
	public void setIndicTipoECF(String indicTipoECF) {
		this.indicTipoECF = indicTipoECF;
	}
	

	
	public void preencheCamposDefault(){
		
		//preenche a identificacao do registro 
		this.setIdentRegistro(ConstantesSistema.REG_REGISTRO_0000);
		
		//preenche os demais campos padrão
		this.codVersaoLayout  = ConstantesSistema.COD_VER;
		this.identTipoSped = ConstantesSistema.NOME_ESC;
		this.cnpj = ConstantesSistema.CNPJ_EMPRESA;
		this.nomeEmpresa = ConstantesSistema.NOME_EMPRESA;
		this.indicInicioPeriodo = ConstantesSistema.IND_SIT_INI_PER;
		this.indicSituacaoEspecEventos = ConstantesSistema.SIT_ESPECIAL;
		this.retificadora = ConstantesSistema.RETIFICADORA;
		this.indicTipoECF = ConstantesSistema.TIP_ECF;
	}
	
	
}
