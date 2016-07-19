package br.org.asabrasil.sped.modelos.bloco9;

import java.util.List;

import br.org.asabrasil.sped.modelos.Linha;
import br.org.asabrasil.sped.util.ConstantesSistema;
import br.org.asabrasil.sped.util.Util;

public class Registro9100 extends Linha {

	private String nomRegra;
	private String msgRegra;
	private String registro;
	private String campo;
	private String conteudo;
	private String valorEsperado;

	public String getNomRegra() {
		return Util.validaAtributoString(nomRegra);
	}

	public String getMsgRegra() {
		return Util.validaAtributoString(msgRegra);
	}

	public String getRegistro() {
		return Util.validaAtributoString(registro);
	}

	public String getCampo() {
		return Util.validaAtributoString(campo);
	}

	public String getConteudo() {
		return Util.validaAtributoString(conteudo);
	}

	public String getValorEsperado() {
		return Util.validaAtributoString(valorEsperado);
	}

	public void setNomRegra(String nomRegra) {
		this.nomRegra = nomRegra;
	}

	public void setMsgRegra(String msgRegra) {
		this.msgRegra = msgRegra;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	public void setCampo(String campo) {
		this.campo = campo;
	}
	
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public void setValorEsperado(String valorEsperado) {
		this.valorEsperado = valorEsperado;
	}

	public Registro9100() {
		super();
		preencheCamposDefault();
	}

	@Override
	public void preencheCamposDefault() {
		this.setIdentRegistro(ConstantesSistema.REG_REGISTRO_9100);
	}

	@Override
	public void gerarRegistro(List<StringBuilder> listaRegistros) {
	StringBuilder reg = new StringBuilder();
		
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		reg.append(this.getIdentRegistro());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);

		reg.append(this.getNomRegra());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		reg.append(this.getMsgRegra());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);

		reg.append(this.getRegistro());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);

		reg.append(this.getCampo());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);

		reg.append(this.getConteudo());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);

		reg.append(this.getValorEsperado());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);

		reg.append(this.geraFinalRegistro());
		
		listaRegistros.add(reg);
	}
}