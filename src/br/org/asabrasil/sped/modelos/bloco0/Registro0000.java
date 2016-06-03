package br.org.asabrasil.sped.modelos.bloco0;

import java.util.List;

import br.org.asabrasil.sped.modelos.Linha;
import br.org.asabrasil.sped.util.ConstantesSistema;
import br.org.asabrasil.sped.util.Util;

/**
 * Classe basica que contem as informacoes do bloco de abertura do arquivo
 * (Business Object)
 * 
 * @author samuel.rocha
 * 
 */
public class Registro0000 extends Linha {

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
	private String  dtInicio;
	// DT_FIN
	private String  dtFim;
	// RETIFICADORA
	private String retificadora;
	// TIP_ECF
	private String indicTipoECF;
	// PAT_REMAN_CIS
	private String patrimonioRemanCasoDeCisao;
	// DT_SIT_ESP
	private String  dtSitEspecialEvento;
	// NUM_REC
	private String numReciboECF;
	// NUM_REC
	private String identSCP;

	
	public Registro0000() {
		super();
		preencheCamposDefault();
	}

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
	
	
	
	
	public String getDtInicio() {
		return Util.validaAtributoString(dtInicio);
	}

	public void setDtInicio(String dtInicio) {
		this.dtInicio = dtInicio;
	}

	public String getDtFim() {
		return Util.validaAtributoString(dtFim);
	}

	public void setDtFim(String dtFim) {
		this.dtFim = dtFim;
	}

	public String getDtSitEspecialEvento() {
		return Util.validaAtributoString(dtSitEspecialEvento);
	}

	public void setDtSitEspecialEvento(String dtSitEspecialEvento) {
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

	
	public void gerarRegistro(List<StringBuilder> listaRegistros) {
		StringBuilder registro0000 = new StringBuilder();
		
		// Cria a linha referente ao bloco
		
		registro0000.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		
		registro0000.append(this.getIdentRegistro());
		registro0000.append(ConstantesSistema.CARACTERE_SEPARADOR);
		registro0000.append(this.getIdentTipoSped());
		registro0000.append(ConstantesSistema.CARACTERE_SEPARADOR);
		registro0000.append(this.getCodVersaoLayout());
		registro0000.append(ConstantesSistema.CARACTERE_SEPARADOR);
		registro0000.append(this.getCnpj());
		registro0000.append(ConstantesSistema.CARACTERE_SEPARADOR);
		registro0000.append(this.getNomeEmpresa());
		registro0000.append(ConstantesSistema.CARACTERE_SEPARADOR);
		registro0000.append(this.getIndicInicioPeriodo());
		registro0000.append(ConstantesSistema.CARACTERE_SEPARADOR);
		registro0000.append(this.getIndicSituacaoEspecEventos());
		registro0000.append(ConstantesSistema.CARACTERE_SEPARADOR);
		registro0000.append(this.getPatrimonioRemanCasoDeCisao());
		registro0000.append(ConstantesSistema.CARACTERE_SEPARADOR);
		registro0000.append(this.getDtSitEspecialEvento());
		registro0000.append(ConstantesSistema.CARACTERE_SEPARADOR);
		registro0000.append(this.getDtInicio());
		registro0000.append(ConstantesSistema.CARACTERE_SEPARADOR);
		registro0000.append(this.getDtFim());
		registro0000.append(ConstantesSistema.CARACTERE_SEPARADOR);
		registro0000.append(this.getRetificadora());
		registro0000.append(ConstantesSistema.CARACTERE_SEPARADOR);
		registro0000.append(this.getNumReciboECF());
		registro0000.append(ConstantesSistema.CARACTERE_SEPARADOR);
		registro0000.append(this.getIndicTipoECF());
		registro0000.append(ConstantesSistema.CARACTERE_SEPARADOR);
		registro0000.append(this.getIdentSCP());
		registro0000.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		//gera o trecho que indica fim do registro
		registro0000.append(this.geraFinalRegistro());
		
		listaRegistros.add(registro0000);
	}
	

}
