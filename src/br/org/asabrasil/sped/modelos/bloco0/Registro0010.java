package br.org.asabrasil.sped.modelos.bloco0;

import br.org.asabrasil.sped.modelos.Registro;
import br.org.asabrasil.sped.util.ConstantesSistema;
import br.org.asabrasil.sped.util.Util;


public class Registro0010 extends Registro {
	
	//HASH_	ECF	_ANTERIOR (opcional)
	private String hashECF;
	//OPT_REFIS
	private String indicOptanteRefis;
	//OPT_PAES
	private String indicOptantePaes;
	//FORMA_TRIB
	private String formTributacao;
	//FORMA_APUR (opcional)
	private String indicPeriodoApuracaoIRPJ;
	//COD_QUALIF_PJ (opcional)
	private String qualificacaoPJ;
	//FORMA_TRIB_PER (opcional)
	private String formaTribPeriodo;
	//MES_BAL_RED (opcional)
	private String formaApuracaoEstimMensal;
	//TIP_ESC_PRE (opcional)
	private String escrituracao;
	//TIP_ENT (opcional)
	private String tpPJImuneIsenta;
	//FORMA_APUR_I (opcional)
	private String apuracaoIRJParaImunesIsentas;
	//APUR_CSLL  (opcional)
	private String apuracaoCSLL;
	//OPT_EXT_RTT
	private String optanteExtincaoRTT;
	//DIF_FCONT
	private String difFcont;
	
	/**
	 * esse campo nao e obrigatorio por isso foi criado apenas o get que retorna vazio
	 * @return
	 */
	public String getHashECF() {
		if (!Util.isStringVazia(hashECF)){
			return hashECF;
		}
		return "";
	}

	/**
	 * esse campo nao e obrigatorio por isso foi criado apenas o get que retorna vazio
	 * @return
	 */
	public String getIndicPeriodoApuracaoIRPJ() {
		if (!Util.isStringVazia(indicPeriodoApuracaoIRPJ)){
			return indicPeriodoApuracaoIRPJ;	
		}
		return "";
	}

	/**
	 * esse campo nao e obrigatorio por isso foi criado apenas o get que retorna vazio
	 * @return
	 */
	public String getQualificacaoPJ() {
		if (!Util.isStringVazia(qualificacaoPJ)){
			return qualificacaoPJ;
		}
		return "";
	}

	/**
	 * esse campo nao e obrigatorio por isso foi criado apenas o get que retorna vazio
	 * @return
	 */
	public String getFormaTribPeriodo() {
		if (!Util.isStringVazia(formaTribPeriodo)){
			return formaTribPeriodo;
		}
		return "";
	}

	/**
	 * esse campo nao e obrigatorio por isso foi criado apenas o get que retorna vazio
	 * @return
	 */
	public String getFormaApuracaoEstimMensal() {
		if (!Util.isStringVazia(formaApuracaoEstimMensal)){
			return formaApuracaoEstimMensal;
		}
		return "";
	}

	/**
	 * esse campo nao e obrigatorio por isso foi criado apenas o get que retorna vazio
	 * @return
	 */
	public String getEscrituracao() {
		if (!Util.isStringVazia(escrituracao)){
			return escrituracao;
		}
		return "";
	}


	/**
	 * esse campo nao e obrigatorio por isso foi criado apenas o get que retorna vazio
	 * @return
	 */
	public String getTpPJImuneIsenta() {
		if (!Util.isStringVazia(tpPJImuneIsenta)){
			return tpPJImuneIsenta;
		}
		return "";
	}

	/**
	 * esse campo nao e obrigatorio por isso foi criado apenas o get que retorna vazio
	 * @return
	 */
	public String getApuracaoIRJParaImunesIsentas() {
		if (!Util.isStringVazia(apuracaoIRJParaImunesIsentas)){
			return apuracaoIRJParaImunesIsentas;	
		}
		return "";
	}

	/**
	 * esse campo nao e obrigatorio por isso foi criado apenas o get que retorna vazio
	 * @return
	 */
	public String getApuracaoCSLL() {
		if (!Util.isStringVazia(apuracaoCSLL)){
		return apuracaoCSLL;
		}
		return "";
	}

	public String getIndicOptanteRefis() {
		return indicOptanteRefis;
	}

	public void setIndicOptanteRefis(String indicOptanteRefis) {
		this.indicOptanteRefis = indicOptanteRefis;
	}

	public String getIndicOptantePaes() {
		return indicOptantePaes;
	}

	public void setIndicOptantePaes(String indicOptantePaes) {
		this.indicOptantePaes = indicOptantePaes;
	}

	public String getFormTributacao() {
		if (!Util.isStringVazia(formTributacao)){
			return formTributacao;
			}
			return "";
	}

	public void setFormTributacao(String formTributacao) {
		this.formTributacao = formTributacao;
	}

	public String getOptanteExtincaoRTT() {
		return optanteExtincaoRTT;
	}

	public void setOptanteExtincaoRTT(String optanteExtincaoRTT) {
		this.optanteExtincaoRTT = optanteExtincaoRTT;
	}

	public String getDifFcont() {
		return difFcont;
	}

	public void setDifFcont(String difFcont) {
		this.difFcont = difFcont;
	}
	
	public void preencheCamposDefault() {
		//preenche a identificacao do registro 
		this.setIdentRegistro(ConstantesSistema.REG_REGISTRO_0010);

		//preenche os demais campos padrão
		this.indicOptanteRefis = ConstantesSistema.OPT_REFIS;
		this.indicOptantePaes = ConstantesSistema.OPT_PAES;
		this.optanteExtincaoRTT = ConstantesSistema.OPT_EXT_RTT;
		this.difFcont = ConstantesSistema.DIF_FCONT;
	}
	
}
