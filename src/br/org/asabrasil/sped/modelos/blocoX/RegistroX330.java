package br.org.asabrasil.sped.modelos.blocoX;

import java.util.List;

import br.org.asabrasil.sped.modelos.Linha;
import br.org.asabrasil.sped.util.Util;

public class RegistroX330 extends Linha {

	private String nome;
	private String pais;
	private String valorOperacao;
	private String condicaoPessoa;

	public String getNome() {
		return Util.validaAtributoString(nome);
	}

	public String getPais() {
		return Util.validaAtributoString(pais);
	}

	public String getValorOperacao() {
		return Util.validaAtributoString(valorOperacao);
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

	public void setValorOperacao(String valorOperacao) {
		this.valorOperacao = valorOperacao;
	}

	public void setCondicaoPessoa(String condicaoPessoa) {
		this.condicaoPessoa = condicaoPessoa;
	}

	public RegistroX330() {
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
