package br.org.asabrasil.sped.modelos.blocoC;

import java.util.List;

import br.org.asabrasil.sped.modelos.Linha;
import br.org.asabrasil.sped.util.ConstantesSistema;
import br.org.asabrasil.sped.util.Util;

public class RegistroC001 extends Linha {

	private String indicMovimento;

	public String getIndicMovimento() {
		return Util.validaAtributoString(indicMovimento);
	}

	
	
	public RegistroC001() {
		super();
		preencheCamposDefault();
	}



	@Override
	public void preencheCamposDefault() {
		// preenche a identificacao do registro
		this.setIdentRegistro(ConstantesSistema.REG_REGISTRO_C001);
		this.indicMovimento = ConstantesSistema.IND_DAD_BLOCO_C;
		
	}

	@Override
	public void gerarRegistro(List<StringBuilder> listaRegistros) {
		StringBuilder registroC001 = new StringBuilder();

		registroC001.append(this.getIdentRegistro());
		registroC001.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		registroC001.append(this.getIndicMovimento());
		registroC001.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		
		registroC001.append(this.geraFinalRegistro());
		listaRegistros.add(registroC001);

	}

}
