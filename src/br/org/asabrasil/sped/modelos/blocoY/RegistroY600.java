package br.org.asabrasil.sped.modelos.blocoY;

import java.util.List;

import br.org.asabrasil.sped.modelos.Linha;
import br.org.asabrasil.sped.util.ConstantesSistema;
import br.org.asabrasil.sped.util.Util;

public class RegistroY600 extends Linha {

	private String dtAltSoc;
	private String dtFimSoc;
	private String pais;
	private String indQualifSocio;
	private String cpfCnpj;
	private String nomEmp;
	private String qualif;
	private String percCapTot;
	private String percCapVot;
	private String cpfRepLeg;
	private String qualifRepLeg;
	private String vlRemTrab;
	private String vlLucDiv;
	private String vlJurCap;
	private String vlDemRend;
	private String vlIrRet;

	public String getDtAltSoc() {
		return Util.validaAtributoString(dtAltSoc);
	}

	public String getDtFimSoc() {
		return Util.validaAtributoString(dtFimSoc);
	}

	public String getPais() {
		return Util.validaAtributoString(pais);
	}

	public String getIndQualifSocio() {
		return Util.validaAtributoString(indQualifSocio);
	}

	public String getCpfCnpj() {
		return Util.validaAtributoString(cpfCnpj);
	}

	public String getNomEmp() {
		return Util.validaAtributoString(nomEmp);
	}

	public String getQualif() {
		return Util.validaAtributoString(qualif);
	}

	public String getPercCapTot() {
		return Util.validaAtributoString(percCapTot);
	}

	public String getPercCapVot() {
		return Util.validaAtributoString(percCapVot);
	}

	public String getCpfRepLeg() {
		return Util.validaAtributoString(cpfRepLeg);
	}

	public String getQualifRepLeg() {
		return Util.validaAtributoString(qualifRepLeg);
	}

	public String getVlRemTrab() {
		return Util.validaAtributoString(vlRemTrab);
	}

	public String getVlLucDiv() {
		return Util.validaAtributoString(vlLucDiv);
	}

	public String getVlJurCap() {
		return Util.validaAtributoString(vlJurCap);
	}

	public String getVlDemRend() {
		return Util.validaAtributoString(vlDemRend);
	}

	public String getVlIrRet() {
		return Util.validaAtributoString(vlIrRet);
	}

	public void setDtAltSoc(String dtAltSoc) {
		this.dtAltSoc = dtAltSoc;
	}

	public void setDtFimSoc(String dtFimSoc) {
		this.dtFimSoc = dtFimSoc;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public void setIndQualifSocio(String indQualifSocio) {
		this.indQualifSocio = indQualifSocio;
	}

	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	public void setNomEmp(String nomEmp) {
		this.nomEmp = nomEmp;
	}

	public void setQualif(String qualif) {
		this.qualif = qualif;
	}

	public void setPercCapTot(String percCapTot) {
		this.percCapTot = percCapTot;
	}

	public void setPercCapVot(String percCapVot) {
		this.percCapVot = percCapVot;
	}

	public void setCpfRepLeg(String cpfRepLeg) {
		this.cpfRepLeg = cpfRepLeg;
	}

	public void setQualifRepLeg(String qualifRepLeg) {
		this.qualifRepLeg = qualifRepLeg;
	}

	public void setVlRemTrab(String vlRemTrab) {
		this.vlRemTrab = vlRemTrab;
	}

	public void setVlLucDiv(String vlLucDiv) {
		this.vlLucDiv = vlLucDiv;
	}

	public void setVlJurCap(String vlJurCap) {
		this.vlJurCap = vlJurCap;
	}

	public void setVlDemRend(String vlDemRend) {
		this.vlDemRend = vlDemRend;
	}

	public void setVlIrRet(String vlIrRet) {
		this.vlIrRet = vlIrRet;
	}

	public RegistroY600() {
		super();
		preencheCamposDefault();
	}

	@Override
	public void preencheCamposDefault() {
		this.setIdentRegistro(ConstantesSistema.REG_REGISTRO_Y600);
	}

	@Override
	public void gerarRegistro(List<StringBuilder> listaRegistros) {
	}
}