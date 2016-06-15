package br.org.asabrasil.sped.modelos.blocoX;

import java.util.List;

import br.org.asabrasil.sped.modelos.Linha;
import br.org.asabrasil.sped.util.Util;

public class RegistroX280 extends Linha {

	private String beneficioFiscal;
	private String projeto;
	private String atoConcessiorio;
	private String prazoVigenciaIni;
	private String prazoVigenciaFin;

	public String getBeneficioFiscal() {
		return Util.validaAtributoString(beneficioFiscal);
	}

	public String getProjeto() {
		return Util.validaAtributoString(projeto);
	}

	public String getAtoConcessiorio() {
		return Util.validaAtributoString(atoConcessiorio);
	}

	public String getPrazoVigenciaIni() {
		return Util.validaAtributoString(prazoVigenciaIni);
	}

	public String getPrazoVigenciaFin() {
		return Util.validaAtributoString(prazoVigenciaFin);
	}

	public void setBeneficioFiscal(String beneficioFiscal) {
		this.beneficioFiscal = beneficioFiscal;
	}

	public void setProjeto(String projeto) {
		this.projeto = projeto;
	}

	public void setAtoConcessiorio(String atoConcessiorio) {
		this.atoConcessiorio = atoConcessiorio;
	}

	public void setPrazoVigenciaIni(String prazoVigenciaIni) {
		this.prazoVigenciaIni = prazoVigenciaIni;
	}

	public void setPrazoVigenciaFin(String prazoVigenciaFin) {
		this.prazoVigenciaFin = prazoVigenciaFin;
	}

	public RegistroX280() {
		super();
		preencheCamposDefault();
	}

	@Override
	public void preencheCamposDefault() {
		// TODO Auto-generated method stub
	}

	@Override
	public void gerarRegistro(List<StringBuilder> listaRegistros) {
		// TODO Auto-generated method stub

	}

}
