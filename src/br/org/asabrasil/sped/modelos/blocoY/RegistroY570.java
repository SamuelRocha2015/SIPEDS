package br.org.asabrasil.sped.modelos.blocoY;

import java.util.List;

import br.org.asabrasil.sped.modelos.Linha;
import br.org.asabrasil.sped.util.ConstantesSistema;
import br.org.asabrasil.sped.util.Util;

public class RegistroY570 extends Linha {

	private String cnpjFon;
	private String nomEmp;
	private String indOrgPub;
	private String codRec;
	private String vlRend;
	private String irRet;
	private String csllRet;

	public String getCnpjFon() {
		return Util.validaAtributoString(cnpjFon);
	}

	public String getNomEmp() {
		return Util.validaAtributoString(nomEmp);
	}

	public String getIndOrgPub() {
		return Util.validaAtributoString(indOrgPub);
	}

	public String getCodRec() {
		return Util.validaAtributoString(codRec);
	}

	public String getVlRend() {
		return Util.validaAtributoString(vlRend);
	}

	public String getIrRet() {
		return Util.validaAtributoString(irRet);
	}

	public String getCsllRet() {
		return Util.validaAtributoString(csllRet);
	}

	public void setCnpjFon(String cnpjFon) {
		this.cnpjFon = cnpjFon;
	}

	public void setNomEmp(String nomEmp) {
		this.nomEmp = nomEmp;
	}

	public void setIndOrgPub(String indOrgPub) {
		this.indOrgPub = indOrgPub;
	}

	public void setCodRec(String codRec) {
		this.codRec = codRec;
	}

	public void setVlRend(String vlRend) {
		this.vlRend = vlRend;
	}

	public void setIrRet(String irRet) {
		this.irRet = irRet;
	}

	public void setCsllRet(String csllRet) {
		this.csllRet = csllRet;
	}

	public RegistroY570() {
		super();
		preencheCamposDefault();
	}

	@Override
	public void preencheCamposDefault() {
		this.setIdentRegistro(ConstantesSistema.REG_REGISTRO_Y570);
	}

	@Override
	public void gerarRegistro(List<StringBuilder> listaRegistros) {
	}
}