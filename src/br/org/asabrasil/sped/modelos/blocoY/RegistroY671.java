package br.org.asabrasil.sped.modelos.blocoY;

import java.util.List;

import br.org.asabrasil.sped.modelos.Linha;
import br.org.asabrasil.sped.util.ConstantesSistema;
import br.org.asabrasil.sped.util.Util;

public class RegistroY671 extends Linha {

	private String vlAqMaq;
	private String vlDoaCrianca;
	private String vlDoaIdoso;
	private String vlAqImobilizado;
	private String vlBxImobilizado;
	private String vlIncIni;
	private String vlIncFin;
	private String vlCsllDeprecIni;
	private String vlOcSemIof;
	private String vlFolhaAliqRed;
	private String vlAliqRed;
	private String indAlterCapital;
	private String indBcnCsll;

	public String getVlAqMaq() {
		return Util.validaAtributoString(vlAqMaq);
	}

	public String getVlDoaCrianca() {
		return Util.validaAtributoString(vlDoaCrianca);
	}

	public String getVlDoaIdoso() {
		return Util.validaAtributoString(vlDoaIdoso);
	}

	public String getVlAqImobilizado() {
		return Util.validaAtributoString(vlAqImobilizado);
	}

	public String getVlBxImobilizado() {
		return Util.validaAtributoString(vlBxImobilizado);
	}

	public String getVlIncIni() {
		return Util.validaAtributoString(vlIncIni);
	}

	public String getVlIncFin() {
		return Util.validaAtributoString(vlIncFin);
	}

	public String getVlCsllDeprecIni() {
		return Util.validaAtributoString(vlCsllDeprecIni);
	}

	public String getVlOcSemIof() {
		return Util.validaAtributoString(vlOcSemIof);
	}

	public String getVlFolhaAliqRed() {
		return Util.validaAtributoString(vlFolhaAliqRed);
	}

	public String getVlAliqRed() {
		return Util.validaAtributoString(vlAliqRed);
	}

	public String getIndAlterCapital() {
		return Util.validaAtributoString(indAlterCapital);
	}

	public String getIndBcnCsll() {
		return Util.validaAtributoString(indBcnCsll);
	}

	public void setVlAqMaq(String vlAqMaq) {
		this.vlAqMaq = vlAqMaq;
	}

	public void setVlDoaCrianca(String vlDoaCrianca) {
		this.vlDoaCrianca = vlDoaCrianca;
	}

	public void setVlDoaIdoso(String vlDoaIdoso) {
		this.vlDoaIdoso = vlDoaIdoso;
	}

	public void setVlAqImobilizado(String vlAqImobilizado) {
		this.vlAqImobilizado = vlAqImobilizado;
	}

	public void setVlBxImobilizado(String vlBxImobilizado) {
		this.vlBxImobilizado = vlBxImobilizado;
	}

	public void setVlIncIni(String vlIncIni) {
		this.vlIncIni = vlIncIni;
	}

	public void setVlIncFin(String vlIncFin) {
		this.vlIncFin = vlIncFin;
	}

	public void setVlCsllDeprecIni(String vlCsllDeprecIni) {
		this.vlCsllDeprecIni = vlCsllDeprecIni;
	}

	public void setVlOcSemIof(String vlOcSemIof) {
		this.vlOcSemIof = vlOcSemIof;
	}

	public void setVlFolhaAliqRed(String vlFolhaAliqRed) {
		this.vlFolhaAliqRed = vlFolhaAliqRed;
	}

	public void setVlAliqRed(String vlAliqRed) {
		this.vlAliqRed = vlAliqRed;
	}

	public void setIndAlterCapital(String indAlterCapital) {
		this.indAlterCapital = indAlterCapital;
	}

	public void setIndBcnCsll(String indBcnCsll) {
		this.indBcnCsll = indBcnCsll;
	}

	public RegistroY671() {
		super();
		preencheCamposDefault();
	}

	@Override
	public void preencheCamposDefault() {
		this.setIdentRegistro(ConstantesSistema.REG_REGISTRO_Y671);
	}

	@Override
	public void gerarRegistro(List<StringBuilder> listaRegistros) {
	}
}