package br.org.asabrasil.sped.modelos.blocoJ;

import java.util.List;

import br.org.asabrasil.sped.modelos.Linha;
import br.org.asabrasil.sped.util.ConstantesSistema;
import br.org.asabrasil.sped.util.Util;

public class RegistroJ050 extends Linha {

	private String dtAtualizacao;
	private String codNatureza;
	private String indicTpConta;
	private String nivelConta;
	private String codContaAnaliticaSintetica;
	private String codContaSinteticaSuperior;
	private String nomeContaAnaliticaSintetica;

	public RegistroJ050() {
		super();
		preencheCamposDefault();
	}

	public String getDtAtualizacao() {
		return Util.validaAtributoString(dtAtualizacao);
	}

	public String getCodNatureza() {
		return Util.validaAtributoString(codNatureza);
	}

	public String getIndicTpConta() {
		return Util.validaAtributoString(indicTpConta);
	}

	public String getNivelConta() {
		return Util.validaAtributoString(nivelConta);
	}

	public String getCodContaAnaliticaSintetica() {
		return Util.validaAtributoString(codContaAnaliticaSintetica);
	}

	public String getCodContaSinteticaSuperior() {
		return Util.validaAtributoString(codContaSinteticaSuperior);
	}

	public String getNomeContaAnaliticaSintetica() {
		return Util.validaAtributoString(nomeContaAnaliticaSintetica);
	}

	public void setDtAtualizacao(String dtAtualizacao) {
		this.dtAtualizacao = dtAtualizacao;
	}

	public void setCodNatureza(String codNatureza) {
		this.codNatureza = codNatureza;
	}

	public void setIndicTpConta(String indicTpConta) {
		this.indicTpConta = indicTpConta;
	}

	public void setNivelConta(String nivelConta) {
		this.nivelConta = nivelConta;
	}

	public void setCodContaAnaliticaSintetica(String codContaAnaliticaSintetica) {
		this.codContaAnaliticaSintetica = codContaAnaliticaSintetica;
	}

	public void setCodContaSinteticaSuperior(String codContaSinteticaSuperior) {
		this.codContaSinteticaSuperior = codContaSinteticaSuperior;
	}

	public void setNomeContaAnaliticaSintetica(
			String nomeContaAnaliticaSintetica) {
		this.nomeContaAnaliticaSintetica = nomeContaAnaliticaSintetica;
	}

	@Override
	public void preencheCamposDefault() {
		// preenche a identificacao do registro
		this.setIdentRegistro(ConstantesSistema.REG_REGISTRO_J050);
		this.dtAtualizacao = Util.dataInicialOuFinalApuracaoSemMascara(true);
	}

	@Override
	public void gerarRegistro(List<StringBuilder> listaRegistros) {
		StringBuilder registroJ050 = new StringBuilder();
		registroJ050.append(ConstantesSistema.CARACTERE_SEPARADOR);
		registroJ050.append(this.getIdentRegistro());
		registroJ050.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		registroJ050.append(this.getDtAtualizacao());
		registroJ050.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		registroJ050.append(this.getCodNatureza());
		registroJ050.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		registroJ050.append(this.getIndicTpConta());
		registroJ050.append(ConstantesSistema.CARACTERE_SEPARADOR);

		registroJ050.append(this.getNivelConta());
		registroJ050.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		registroJ050.append(this.getCodContaAnaliticaSintetica());
		registroJ050.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		registroJ050.append(this.getCodContaSinteticaSuperior());
		registroJ050.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		registroJ050.append(this.getNomeContaAnaliticaSintetica());
		registroJ050.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		registroJ050.append(this.geraFinalRegistro());
		
		listaRegistros.add(registroJ050);


	}
}
