package br.org.asabrasil.sped.modelos.bloco0;

import java.util.List;

import br.org.asabrasil.sped.modelos.Linha;
import br.org.asabrasil.sped.util.ConstantesSistema;
import br.org.asabrasil.sped.util.Util;

public class Registro0010 extends Linha {

	// HASH_ ECF _ANTERIOR (opcional)
	private String hashECF;
	// OPT_REFIS
	private String indicOptanteRefis;
	// OPT_PAES
	private String indicOptantePaes;
	// FORMA_TRIB
	private String formTributacao;
	// FORMA_APUR (opcional)
	private String indicPeriodoApuracaoIRPJ;
	// COD_QUALIF_PJ (opcional)
	private String qualificacaoPJ;
	// FORMA_TRIB_PER (opcional)
	private String formaTribPeriodo;
	// MES_BAL_RED (opcional)
	private String formaApuracaoEstimMensal;
	// TIP_ESC_PRE (opcional)
	private String escrituracao;
	// TIP_ENT (opcional)
	private String tpPJImuneIsenta;
	// FORMA_APUR_I (opcional)
	private String apuracaoIRJParaImunesIsentas;
	// APUR_CSLL (opcional)
	private String apuracaoCSLL;
	// OPT_EXT_RTT
	private String optanteExtincaoRTT;
	// DIF_FCONT
	private String difFcont;

	
	public Registro0010() {
		super();
		preencheCamposDefault();
	}

	public String getHashECF() {
		return Util.validaAtributoString(hashECF);
	}

	public String getIndicOptanteRefis() {
		return Util.validaAtributoString(indicOptanteRefis);
	}

	public String getIndicOptantePaes() {
		return Util.validaAtributoString(indicOptantePaes);
	}

	public String getFormTributacao() {
		return Util.validaAtributoString(formTributacao);
	}

	public String getIndicPeriodoApuracaoIRPJ() {
		return Util.validaAtributoString(indicPeriodoApuracaoIRPJ);
	}

	public String getQualificacaoPJ() {
		return Util.validaAtributoString(qualificacaoPJ);
	}

	public String getFormaTribPeriodo() {
		return Util.validaAtributoString(formaTribPeriodo);
	}

	public String getFormaApuracaoEstimMensal() {
		return Util.validaAtributoString(formaApuracaoEstimMensal);
	}

	public String getEscrituracao() {
		return Util.validaAtributoString(escrituracao);
	}

	public String getTpPJImuneIsenta() {
		return Util.validaAtributoString(tpPJImuneIsenta);
	}

	public String getApuracaoIRJParaImunesIsentas() {
		return Util.validaAtributoString(apuracaoIRJParaImunesIsentas);
	}

	public String getApuracaoCSLL() {
		return Util.validaAtributoString(apuracaoCSLL);
	}

	public String getOptanteExtincaoRTT() {
		return Util.validaAtributoString(optanteExtincaoRTT);
	}

	public String getDifFcont() {
		return Util.validaAtributoString(difFcont);
	}

	public void setHashECF(String hashECF) {
		this.hashECF = hashECF;
	}

	public void setFormTributacao(String formTributacao) {
		this.formTributacao = formTributacao;
	}

	public void setIndicPeriodoApuracaoIRPJ(String indicPeriodoApuracaoIRPJ) {
		this.indicPeriodoApuracaoIRPJ = indicPeriodoApuracaoIRPJ;
	}

	public void setQualificacaoPJ(String qualificacaoPJ) {
		this.qualificacaoPJ = qualificacaoPJ;
	}

	public void setFormaTribPeriodo(String formaTribPeriodo) {
		this.formaTribPeriodo = formaTribPeriodo;
	}

	public void setFormaApuracaoEstimMensal(String formaApuracaoEstimMensal) {
		this.formaApuracaoEstimMensal = formaApuracaoEstimMensal;
	}

	public void setEscrituracao(String escrituracao) {
		this.escrituracao = escrituracao;
	}

	public void setTpPJImuneIsenta(String tpPJImuneIsenta) {
		this.tpPJImuneIsenta = tpPJImuneIsenta;
	}

	public void setApuracaoIRJParaImunesIsentas(
			String apuracaoIRJParaImunesIsentas) {
		this.apuracaoIRJParaImunesIsentas = apuracaoIRJParaImunesIsentas;
	}

	public void setApuracaoCSLL(String apuracaoCSLL) {
		this.apuracaoCSLL = apuracaoCSLL;
	}

	@Override
	public void preencheCamposDefault() {
		// preenche a identificacao do registro
		this.setIdentRegistro(ConstantesSistema.REG_REGISTRO_0010);

		// preenche os demais campos padrão
		this.indicOptanteRefis = ConstantesSistema.OPT_REFIS;
		this.indicOptantePaes = ConstantesSistema.OPT_PAES;
		this.formTributacao  = ConstantesSistema.FORMA_TRIB;
		this.tpPJImuneIsenta = ConstantesSistema.TIP_ENT;
		this.optanteExtincaoRTT = ConstantesSistema.OPT_EXT_RTT;
		this.difFcont = ConstantesSistema.DIF_FCONT;
		this.escrituracao = ConstantesSistema.TIP_ESC_PRE;
		this.apuracaoIRJParaImunesIsentas = ConstantesSistema.FORMA_APUR_I;
		this.apuracaoCSLL = ConstantesSistema.APUR_CSLL;
		
	}

	public void gerarRegistro(List<StringBuilder> listaRegistros) {

		StringBuilder reg = new StringBuilder();
		
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		reg.append(this.getIdentRegistro());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);

		reg.append(this.getHashECF());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);

		reg.append(this.getIndicOptanteRefis());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);

		reg.append(this.getIndicOptantePaes());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);

		reg.append(this.getFormTributacao());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);

		reg.append(this.getIndicPeriodoApuracaoIRPJ());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);

		reg.append(this.getQualificacaoPJ());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);

		reg.append(this.getFormaTribPeriodo());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);

		reg.append(this.getFormaApuracaoEstimMensal());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);

		reg.append(this.getEscrituracao());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);

		reg.append(this.getTpPJImuneIsenta());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);

		reg.append(this.getApuracaoIRJParaImunesIsentas());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);

		reg.append(this.getApuracaoCSLL());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);

		reg.append(this.getOptanteExtincaoRTT());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);

		reg.append(this.getDifFcont());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);
	
		
		reg.append(this.geraFinalRegistro());
		
		listaRegistros.add(reg);

	}
}
