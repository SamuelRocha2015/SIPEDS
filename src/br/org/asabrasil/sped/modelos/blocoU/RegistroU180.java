package br.org.asabrasil.sped.modelos.blocoU;

import java.util.List;

import br.org.asabrasil.sped.modelos.Linha;
import br.org.asabrasil.sped.util.Util;

public class RegistroU180 extends Linha {

	private String codigo;
	private String descricao;
	private String valor;

	public String getCodigo() {
		return Util.validaAtributoString(codigo);
	}

	public String getDescricao() {
		return Util.validaAtributoString(descricao);
	}

	public String getValor() {
		return Util.validaAtributoString(valor);
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public RegistroU180() {
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
