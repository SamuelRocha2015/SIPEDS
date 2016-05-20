package br.org.asabrasil.sped.modelos.bloco0;

import java.util.List;

import br.org.asabrasil.sped.modelos.Linha;
import br.org.asabrasil.sped.util.ConstantesSistema;
import br.org.asabrasil.sped.util.Util;

public class Registro0001 extends Linha {
	private String indicMovimento;

	public String getIndicMovimento() {
		return Util.validaAtributoString(indicMovimento);
	}

	public Registro0001() {
		super();
		preencheCamposDefault();
	}

	@Override
	public void preencheCamposDefault() {

		// preenche a identificacao do registro
		this.setIdentRegistro(ConstantesSistema.REG_REGISTRO_0001);

		// preenche os demais campos padrão
		this.indicMovimento = ConstantesSistema.IND_DAD_BLOCO_0;
	}

	public void gerarRegistro(List<StringBuilder> listaRegistros) {
		
		StringBuilder registro0001 = new StringBuilder();
		
		registro0001.append(this.getIdentRegistro());
		registro0001.append(ConstantesSistema.CARACTERE_SEPARADOR);
		registro0001.append(this.getIndicMovimento());
		registro0001.append(ConstantesSistema.CARACTERE_SEPARADOR);
		registro0001.append(this.geraFinalRegistro());
		
		listaRegistros.add(registro0001);
	}

}
