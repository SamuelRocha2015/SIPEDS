package br.org.asabrasil.sped.modelos.bloco0;

import java.util.List;

import br.org.asabrasil.sped.modelos.Linha;
import br.org.asabrasil.sped.util.ConstantesSistema;
import br.org.asabrasil.sped.util.Util;

public class Registro0020 extends Linha {

	// IND_ALIQ_CSLL
	private String pjSujeitaAliquotaCSLL;
	// IND_QTE_SCP
	private String qtdDeSCP;
	// IND_ADM_FUN_CLU
	private String admFundosClubesInvest;
	// IND_PART_CONS
	private String partConsorciosEmpresas;
	// IND_OP_EXT
	private String opExterior;
	// IND_OP_VINC
	private String opPessoaVinculada;
	// IND_PJ_ENQUAD (PJ Enquadrada nos artigos 48 ou 49 da IN RFB no
	// 1.312/2012)
	private String pjEnquadradaArtigos;
	// IND_PART_EXT
	private String partExterior;
	// IND_ATIV_RURAL
	private String atividadeRural;
	// IND_LUC_EXP
	private String existLucroExploracao;
	// IND_RED_ISEN
	private String isencaoReduImpParaLucroPresumido;
	// IND_FIN
	private String indicExistenciaFinorFinam;
	// IND_DOA_ELEIT
	private String doacoesCampanhasEleitorais;
	// IND_PART_COLIG
	private String partAvaliacaoMetodoEquiPatri;
	// IND_VEND_EXP
	private String pjEfetuouVendasEmpresaComercial;
	// IND_ REC_EXT
	private String recExteriorOuNaoResidentes;
	// IND_ATIV_EXT
	private String ativosExterior;
	// IND_COM_EXP
	private String pjComercialExpodtadora;
	// IND_PGTO_EXT
	private String pagExteriorOuNaoResidentes;
	// IND_E-COM_TI
	private String comercEletroETi;
	// IND_ROY_REC
	private String royaltiesRecBrasilEExterior;
	// IND_ROY_PAG
	private String royaltiesPagBenBrasilEExterior;
	// IND_REND_SERV
	private String rendRelatServJuros;
	// IND_PGTO_REM
	private String pagRemessasTituloServ;
	// IND_INOV_TEC
	private String inovTecEDesenvTec;
	// IND_CAP_INF
	private String capInfoInclDig;
	// IND_PJ_HAB
	private String pjHabilitadaResp;
	// IND_POLO_AM
	private String poloIndManaus;
	// IND_ZON_EXP
	private String zonasDeProcessamentoExp;
	// IND_AREA_COM
	private String areasLivreCom;

	public Registro0020() {
		super();
		preencheCamposDefault();
	}

	public String getPjSujeitaAliquotaCSLL() {
		return Util.validaAtributoString(pjSujeitaAliquotaCSLL);
	}

	public String getQtdDeSCP() {
		return Util.validaAtributoString(qtdDeSCP);
	}

	public String getAdmFundosClubesInvest() {
		return Util.validaAtributoString(admFundosClubesInvest);
	}

	public String getPartConsorciosEmpresas() {
		return Util.validaAtributoString(partConsorciosEmpresas);
	}

	public String getOpExterior() {
		return Util.validaAtributoString(opExterior);
	}

	public String getOpPessoaVinculada() {
		return Util.validaAtributoString(opPessoaVinculada);
	}

	public String getPjEnquadradaArtigos() {
		return Util.validaAtributoString(pjEnquadradaArtigos);
	}

	public String getPartExterior() {
		return Util.validaAtributoString(partExterior);
	}

	public String getAtividadeRural() {
		return Util.validaAtributoString(atividadeRural);
	}

	public String getExistLucroExploracao() {
		return Util.validaAtributoString(existLucroExploracao);
	}

	public String getIsencaoReduImpParaLucroPresumido() {
		return Util.validaAtributoString(isencaoReduImpParaLucroPresumido);
	}

	public String getIndicExistenciaFinorFinam() {
		return Util.validaAtributoString(indicExistenciaFinorFinam);
	}

	public String getDoacoesCampanhasEleitorais() {
		return Util.validaAtributoString(doacoesCampanhasEleitorais);
	}

	public String getPartAvaliacaoMetodoEquiPatri() {
		return Util.validaAtributoString(partAvaliacaoMetodoEquiPatri);
	}

	public String getPjEfetuouVendasEmpresaComercial() {
		return Util.validaAtributoString(pjEfetuouVendasEmpresaComercial);
	}

	public String getRecExteriorOuNaoResidentes() {
		return Util.validaAtributoString(recExteriorOuNaoResidentes);
	}

	public String getAtivosExterior() {
		return Util.validaAtributoString(ativosExterior);
	}

	public String getPjComercialExpodtadora() {
		return Util.validaAtributoString(pjComercialExpodtadora);
	}

	public String getPagExteriorOuNaoResidentes() {
		return Util.validaAtributoString(pagExteriorOuNaoResidentes);
	}

	public String getComercEletroETi() {
		return Util.validaAtributoString(comercEletroETi);
	}

	public String getRoyaltiesRecBrasilEExterior() {
		return Util.validaAtributoString(royaltiesRecBrasilEExterior);
	}

	public String getRoyaltiesPagBenBrasilEExterior() {
		return Util.validaAtributoString(royaltiesPagBenBrasilEExterior);
	}

	public String getRendRelatServJuros() {
		return Util.validaAtributoString(rendRelatServJuros);
	}

	public String getPagRemessasTituloServ() {
		return Util.validaAtributoString(pagRemessasTituloServ);
	}

	public String getInovTecEDesenvTec() {
		return Util.validaAtributoString(inovTecEDesenvTec);
	}

	public String getCapInfoInclDig() {
		return Util.validaAtributoString(capInfoInclDig);
	}

	public String getPjHabilitadaResp() {
		return Util.validaAtributoString(pjHabilitadaResp);
	}

	public String getPoloIndManaus() {
		return Util.validaAtributoString(poloIndManaus);
	}

	public String getZonasDeProcessamentoExp() {
		return Util.validaAtributoString(zonasDeProcessamentoExp);
	}

	public String getAreasLivreCom() {
		return Util.validaAtributoString(areasLivreCom);
	}

	public void setPjSujeitaAliquotaCSLL(String pjSujeitaAliquotaCSLL) {
		this.pjSujeitaAliquotaCSLL = pjSujeitaAliquotaCSLL;
	}

	public void setPjEnquadradaArtigos(String pjEnquadradaArtigos) {
		this.pjEnquadradaArtigos = pjEnquadradaArtigos;
	}

	@Override
	public void preencheCamposDefault() {

		// preenche a identificacao do registro
		this.setIdentRegistro(ConstantesSistema.REG_REGISTRO_0020);

		// preenche os demais campos padrão
		this.pjSujeitaAliquotaCSLL = ConstantesSistema.IND_ALIQ_CSLL;
		this.qtdDeSCP = ConstantesSistema.IND_QTE_SCP;
		this.admFundosClubesInvest = ConstantesSistema.IND_ADM_FUN_CLU;
		this.partConsorciosEmpresas = ConstantesSistema.IND_PART_CONS;
		this.opExterior = ConstantesSistema.IND_OP_EXT;
		this.opPessoaVinculada = ConstantesSistema.IND_OP_VINC;
		this.partExterior = ConstantesSistema.IND_PART_EXT;
		this.atividadeRural = ConstantesSistema.IND_ATIV_RURAL;
		this.existLucroExploracao = ConstantesSistema.IND_LUC_EXP;
		this.isencaoReduImpParaLucroPresumido = ConstantesSistema.IND_RED_ISEN;
		this.indicExistenciaFinorFinam = ConstantesSistema.IND_FIN;
		this.doacoesCampanhasEleitorais = ConstantesSistema.IND_DOA_ELEIT;
		this.partAvaliacaoMetodoEquiPatri = ConstantesSistema.IND_PART_COLIG;
		this.pjEfetuouVendasEmpresaComercial = ConstantesSistema.IND_VEND_EXP;
		this.recExteriorOuNaoResidentes = ConstantesSistema.IND_REC_EXT;
		this.ativosExterior = ConstantesSistema.IND_ATIV_EXT;
		this.pjComercialExpodtadora = ConstantesSistema.IND_COM_EXP;
		this.pagExteriorOuNaoResidentes = ConstantesSistema.IND_PGTO_EXT;
		this.comercEletroETi = ConstantesSistema.IND_E_COM_TI;
		this.royaltiesRecBrasilEExterior = ConstantesSistema.IND_ROY_REC;
		this.royaltiesPagBenBrasilEExterior = ConstantesSistema.IND_ROY_PAG;
		this.rendRelatServJuros = ConstantesSistema.IND_REND_SERV;
		this.pagRemessasTituloServ = ConstantesSistema.IND_PGTO_REM;
		this.inovTecEDesenvTec = ConstantesSistema.IND_INOV_TEC;
		this.capInfoInclDig = ConstantesSistema.IND_CAP_INF;
		this.pjHabilitadaResp = ConstantesSistema.IND_PJ_HAB;
		this.poloIndManaus = ConstantesSistema.IND_POLO_AM;
		this.zonasDeProcessamentoExp = ConstantesSistema.IND_ZON_EXP;
		this.areasLivreCom = ConstantesSistema.IND_AREA_COM;
		this.pjEnquadradaArtigos = ConstantesSistema.IND_PJ_ENQUAD;

	}

	public void gerarRegistro(List<StringBuilder> listaRegistros) {
		StringBuilder registro0020 = new StringBuilder();

		registro0020.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		// Cria a linha referente ao bloco
		registro0020.append(this.getIdentRegistro());
		registro0020.append(ConstantesSistema.CARACTERE_SEPARADOR);

		registro0020.append(this.getPjSujeitaAliquotaCSLL());
		registro0020.append(ConstantesSistema.CARACTERE_SEPARADOR);

		registro0020.append(this.getQtdDeSCP());
		registro0020.append(ConstantesSistema.CARACTERE_SEPARADOR);

		registro0020.append(this.getAdmFundosClubesInvest());
		registro0020.append(ConstantesSistema.CARACTERE_SEPARADOR);

		registro0020.append(this.getPartConsorciosEmpresas());
		registro0020.append(ConstantesSistema.CARACTERE_SEPARADOR);

		registro0020.append(this.getOpExterior());
		registro0020.append(ConstantesSistema.CARACTERE_SEPARADOR);

		registro0020.append(this.getOpPessoaVinculada());
		registro0020.append(ConstantesSistema.CARACTERE_SEPARADOR);

		registro0020.append(this.getPjEnquadradaArtigos());
		registro0020.append(ConstantesSistema.CARACTERE_SEPARADOR);

		registro0020.append(this.getPartExterior());
		registro0020.append(ConstantesSistema.CARACTERE_SEPARADOR);

		registro0020.append(this.getAtividadeRural());
		registro0020.append(ConstantesSistema.CARACTERE_SEPARADOR);

		registro0020.append(this.getExistLucroExploracao());
		registro0020.append(ConstantesSistema.CARACTERE_SEPARADOR);

		registro0020.append(this.getIsencaoReduImpParaLucroPresumido());
		registro0020.append(ConstantesSistema.CARACTERE_SEPARADOR);

		registro0020.append(this.getIndicExistenciaFinorFinam());
		registro0020.append(ConstantesSistema.CARACTERE_SEPARADOR);

		registro0020.append(this.getDoacoesCampanhasEleitorais());
		registro0020.append(ConstantesSistema.CARACTERE_SEPARADOR);

		registro0020.append(this.getPartAvaliacaoMetodoEquiPatri());
		registro0020.append(ConstantesSistema.CARACTERE_SEPARADOR);

		registro0020.append(this.getPjEfetuouVendasEmpresaComercial());
		registro0020.append(ConstantesSistema.CARACTERE_SEPARADOR);

		registro0020.append(this.getRecExteriorOuNaoResidentes());
		registro0020.append(ConstantesSistema.CARACTERE_SEPARADOR);

		registro0020.append(this.getAtivosExterior());
		registro0020.append(ConstantesSistema.CARACTERE_SEPARADOR);

		registro0020.append(this.getPjComercialExpodtadora());
		registro0020.append(ConstantesSistema.CARACTERE_SEPARADOR);

		registro0020.append(this.getPagExteriorOuNaoResidentes());
		registro0020.append(ConstantesSistema.CARACTERE_SEPARADOR);

		registro0020.append(this.getComercEletroETi());
		registro0020.append(ConstantesSistema.CARACTERE_SEPARADOR);

		registro0020.append(this.getRoyaltiesRecBrasilEExterior());
		registro0020.append(ConstantesSistema.CARACTERE_SEPARADOR);

		registro0020.append(this.getRoyaltiesPagBenBrasilEExterior());
		registro0020.append(ConstantesSistema.CARACTERE_SEPARADOR);

		registro0020.append(this.getRendRelatServJuros());
		registro0020.append(ConstantesSistema.CARACTERE_SEPARADOR);

		registro0020.append(this.getPagRemessasTituloServ());
		registro0020.append(ConstantesSistema.CARACTERE_SEPARADOR);

		registro0020.append(this.getInovTecEDesenvTec());
		registro0020.append(ConstantesSistema.CARACTERE_SEPARADOR);

		registro0020.append(this.getCapInfoInclDig());
		registro0020.append(ConstantesSistema.CARACTERE_SEPARADOR);

		registro0020.append(this.getPjHabilitadaResp());
		registro0020.append(ConstantesSistema.CARACTERE_SEPARADOR);

		registro0020.append(this.getPoloIndManaus());
		registro0020.append(ConstantesSistema.CARACTERE_SEPARADOR);

		registro0020.append(this.getZonasDeProcessamentoExp());
		registro0020.append(ConstantesSistema.CARACTERE_SEPARADOR);

		registro0020.append(this.getAreasLivreCom());
		registro0020.append(ConstantesSistema.CARACTERE_SEPARADOR);

		
		registro0020.append(this.geraFinalRegistro());
		
		listaRegistros.add(registro0020);
	}

}
