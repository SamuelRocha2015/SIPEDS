package br.org.asabrasil.sped.modelos.blocoX;

import java.util.List;

import br.org.asabrasil.sped.modelos.Linha;
import br.org.asabrasil.sped.util.Util;

public class RegistroX310 extends Linha {

	private String nome;
	private String pais;
	private String vlOperacao;
	private String condicaoPessoa;

	public String getNome() {
		return Util.validaAtributoString(nome);
	}

	public String getPais() {
		return Util.validaAtributoString(pais);
	}

	public String getVlOperacao() {
		return Util.validaAtributoString(vlOperacao);
	}

	public String getCondicaoPessoa() {
		return Util.validaAtributoString(condicaoPessoa);
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public void setVlOperacao(String vlOperacao) {
		this.vlOperacao = vlOperacao;
	}

	public void setCondicaoPessoa(String condicaoPessoa) {
		this.condicaoPessoa = condicaoPessoa;
	}

	
	public RegistroX310() {
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
