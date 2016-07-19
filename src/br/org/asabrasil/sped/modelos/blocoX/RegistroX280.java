package br.org.asabrasil.sped.modelos.blocoX;

import java.util.List;

import br.org.asabrasil.sped.modelos.Linha;
import br.org.asabrasil.sped.util.ConstantesSistema;
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
		this.setIdentRegistro(ConstantesSistema.REG_REGISTRO_X280);
		this.beneficioFiscal = ConstantesSistema.IND_ATIV;
		this.projeto = ConstantesSistema.IND_PROJ;
	}

	@Override
	public void gerarRegistro(List<StringBuilder> listaRegistros) {
	StringBuilder reg = new StringBuilder();
		
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		reg.append(this.getIdentRegistro());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);

		reg.append(this.getBeneficioFiscal());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		reg.append(this.getProjeto());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		reg.append(this.getAtoConcessiorio());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		reg.append(this.getPrazoVigenciaIni());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		reg.append(this.getPrazoVigenciaFin());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		reg.append(this.geraFinalRegistro());
		
		listaRegistros.add(reg);
	}

}
