package br.org.asabrasil.sped.modelos.blocoU;

import java.util.List;

import br.org.asabrasil.sped.modelos.Linha;
import br.org.asabrasil.sped.util.ConstantesSistema;
import br.org.asabrasil.sped.util.Util;

public class RegistroU182 extends Linha {


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

	public RegistroU182() {
		super();
		preencheCamposDefault();
	}

	@Override
	public void preencheCamposDefault() {
		this.setIdentRegistro(ConstantesSistema.REG_REGISTRO_U182);
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
