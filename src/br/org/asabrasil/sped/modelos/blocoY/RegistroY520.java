package br.org.asabrasil.sped.modelos.blocoY;

import java.util.List;

import br.org.asabrasil.sped.modelos.Linha;
import br.org.asabrasil.sped.util.ConstantesSistema;
import br.org.asabrasil.sped.util.Util;

public class RegistroY520 extends Linha {

	private String tipo;
	private String pais;
	private String forma;
	private String natOperacao;
	private String vlPeriodo;
	

	public String getTipo() {
		return Util.validaAtributoString(tipo);
	}

	public String getPais() {
		return Util.validaAtributoString(pais);
	}

	public String getForma() {
		return Util.validaAtributoString(forma);
	}

	public String getNatOperacao() {
		return Util.validaAtributoString(natOperacao);
	}

	public String getVlPeriodo() {
		return Util.validaAtributoString(vlPeriodo);
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}

	public void setNatOperacao(String natOperacao) {
		this.natOperacao = natOperacao;
	}

	public void setVlPeriodo(String vlPeriodo) {
		this.vlPeriodo = vlPeriodo;
	}

	public RegistroY520() {
		super();
		preencheCamposDefault();
	}

	
	@Override
	public void preencheCamposDefault() {
		this.setIdentRegistro(ConstantesSistema.REG_REGISTRO_Y520);
		this.tipo = ConstantesSistema.Y520_Tipo;
		this.pais = ConstantesSistema.COD_PAIS;
		this.forma = ConstantesSistema.Y520_FORMA;
		this.natOperacao = ConstantesSistema.Y520_NAT_OPERACAO;
		this.vlPeriodo = ConstantesSistema.Y520_VL_PERIODO;
		
	}

	@Override
	public void gerarRegistro(List<StringBuilder> listaRegistros) {
		StringBuilder reg = new StringBuilder();
		
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		reg.append(this.getIdentRegistro());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);

		reg.append(this.getTipo());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		reg.append(this.getPais());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		reg.append(this.getForma());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);

		reg.append(this.getNatOperacao());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);

		reg.append(this.getVlPeriodo());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);

		reg.append(this.geraFinalRegistro());
		
		listaRegistros.add(reg);
		
	}
}