package br.org.asabrasil.sped.modelos;

import java.util.List;

import br.org.asabrasil.sped.util.ConstantesSistema;
import br.org.asabrasil.sped.util.Util;

public abstract class BaseX extends Linha {

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

	
	public BaseX() {
	}

	@Override
	public void gerarRegistro(List<StringBuilder> listaRegistros) {
		StringBuilder reg = new StringBuilder();
		
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		reg.append(this.getIdentRegistro());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);

		reg.append(this.getCodigo());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);

		reg.append(this.getDescricao());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);

		reg.append(this.getValor());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		reg.append(this.geraFinalRegistro());
		
		listaRegistros.add(reg);
	}

}
