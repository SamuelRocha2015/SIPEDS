package br.org.asabrasil.sped.modelos.blocoY;

import java.util.List;

import br.org.asabrasil.sped.modelos.Linha;
import br.org.asabrasil.sped.util.ConstantesSistema;
import br.org.asabrasil.sped.util.Util;

public class RegistroY672 extends Linha {

	private String vlCapitalAnt;
	private String vlCapital;
	private String vlEstoqueAnt;
	private String vlEstoques;
	private String vlCaixaAnt;
	private String vlCaixa;
	private String vlAplicFinAnt;
	private String vlAplicFin;
	private String vlCtaRecAnt;
	private String vlCtaRec;
	private String vlCtaPagAnt;
	private String vlCtaPag;
	private String vlCompraMerc;
	private String vlCompraAtivo;
	private String vlReceitas;
	private String totAtivo;
	private String vlFolha;
	private String vlAliqRed;
	private String indRegApur;
	private String indAvalEstoq;

	public String getVlCapitalAnt() {
		return Util.validaAtributoString(vlCapitalAnt);
	}

	public String getVlCapital() {
		return Util.validaAtributoString(vlCapital);
	}

	public String getVlEstoqueAnt() {
		return Util.validaAtributoString(vlEstoqueAnt);
	}

	public String getVlEstoques() {
		return Util.validaAtributoString(vlEstoques);
	}

	public String getVlCaixaAnt() {
		return Util.validaAtributoString(vlCaixaAnt);
	}

	public String getVlCaixa() {
		return Util.validaAtributoString(vlCaixa);
	}

	public String getVlAplicFinAnt() {
		return Util.validaAtributoString(vlAplicFinAnt);
	}

	public String getVlAplicFin() {
		return Util.validaAtributoString(vlAplicFin);
	}

	public String getVlCtaRecAnt() {
		return Util.validaAtributoString(vlCtaRecAnt);
	}

	public String getVlCtaRec() {
		return Util.validaAtributoString(vlCtaRec);
	}

	public String getVlCtaPagAnt() {
		return Util.validaAtributoString(vlCtaPagAnt);
	}

	public String getVlCtaPag() {
		return Util.validaAtributoString(vlCtaPag);
	}

	public String getVlCompraMerc() {
		return Util.validaAtributoString(vlCompraMerc);
	}

	public String getVlCompraAtivo() {
		return Util.validaAtributoString(vlCompraAtivo);
	}

	public String getVlReceitas() {
		return Util.validaAtributoString(vlReceitas);
	}

	public String getTotAtivo() {
		return Util.validaAtributoString(totAtivo);
	}

	public String getVlFolha() {
		return Util.validaAtributoString(vlFolha);
	}

	public String getVlAliqRed() {
		return Util.validaAtributoString(vlAliqRed);
	}

	public String getIndRegApur() {
		return Util.validaAtributoString(indRegApur);
	}

	public String getIndAvalEstoq() {
		return Util.validaAtributoString(indAvalEstoq);
	}

	public void setVlCapitalAnt(String vlCapitalAnt) {
		this.vlCapitalAnt = vlCapitalAnt;
	}

	public void setVlCapital(String vlCapital) {
		this.vlCapital = vlCapital;
	}

	public void setVlEstoqueAnt(String vlEstoqueAnt) {
		this.vlEstoqueAnt = vlEstoqueAnt;
	}

	public void setVlEstoques(String vlEstoques) {
		this.vlEstoques = vlEstoques;
	}

	public void setVlCaixaAnt(String vlCaixaAnt) {
		this.vlCaixaAnt = vlCaixaAnt;
	}

	public void setVlCaixa(String vlCaixa) {
		this.vlCaixa = vlCaixa;
	}

	public void setVlAplicFinAnt(String vlAplicFinAnt) {
		this.vlAplicFinAnt = vlAplicFinAnt;
	}

	public void setVlAplicFin(String vlAplicFin) {
		this.vlAplicFin = vlAplicFin;
	}

	public void setVlCtaRecAnt(String vlCtaRecAnt) {
		this.vlCtaRecAnt = vlCtaRecAnt;
	}

	public void setVlCtaRec(String vlCtaRec) {
		this.vlCtaRec = vlCtaRec;
	}

	public void setVlCtaPagAnt(String vlCtaPagAnt) {
		this.vlCtaPagAnt = vlCtaPagAnt;
	}

	public void setVlCtaPag(String vlCtaPag) {
		this.vlCtaPag = vlCtaPag;
	}

	public void setVlCompraMerc(String vlCompraMerc) {
		this.vlCompraMerc = vlCompraMerc;
	}

	public void setVlCompraAtivo(String vlCompraAtivo) {
		this.vlCompraAtivo = vlCompraAtivo;
	}

	public void setVlReceitas(String vlReceitas) {
		this.vlReceitas = vlReceitas;
	}

	public void setTotAtivo(String totAtivo) {
		this.totAtivo = totAtivo;
	}

	public void setVlFolha(String vlFolha) {
		this.vlFolha = vlFolha;
	}

	public void setVlAliqRed(String vlAliqRed) {
		this.vlAliqRed = vlAliqRed;
	}

	public void setIndRegApur(String indRegApur) {
		this.indRegApur = indRegApur;
	}

	public void setIndAvalEstoq(String indAvalEstoq) {
		this.indAvalEstoq = indAvalEstoq;
	}

	public RegistroY672() {
		super();
		preencheCamposDefault();
	}

	@Override
	public void preencheCamposDefault() {
		this.setIdentRegistro(ConstantesSistema.REG_REGISTRO_Y672);
	}

	@Override
	public void gerarRegistro(List<StringBuilder> listaRegistros) {
	}
}