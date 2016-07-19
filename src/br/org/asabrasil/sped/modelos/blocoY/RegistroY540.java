package br.org.asabrasil.sped.modelos.blocoY;

import java.util.List;

import br.org.asabrasil.sped.modelos.Linha;
import br.org.asabrasil.sped.util.ConstantesSistema;
import br.org.asabrasil.sped.util.Util;

public class RegistroY540  extends Linha {
	
	private String cnpj;
	private String receitaVendas;
	private String cnae;
	
	public String getCnpj() {
		return Util.validaAtributoString(cnpj);
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getReceitaVendas() {
		return Util.validaAtributoString(receitaVendas);
	}

	public void setReceitaVendas(String receitaVendas) {
		this.receitaVendas = receitaVendas;
	}

	public String getCnae() {
		return Util.validaAtributoString(cnae);
	}

	public void setCnae(String cnae) {
		this.cnae = cnae;
	}

	public RegistroY540() {
		super();
		preencheCamposDefault();
	}

	@Override
	public void preencheCamposDefault() {
		this.setIdentRegistro(ConstantesSistema.REG_REGISTRO_Y540);
	}

	@Override
	public void gerarRegistro(List<StringBuilder> listaRegistros) {
	}

}

