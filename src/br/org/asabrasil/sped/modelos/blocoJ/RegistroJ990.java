package br.org.asabrasil.sped.modelos.blocoJ;

import br.org.asabrasil.sped.modelos.RegistroFechaBloco;
import br.org.asabrasil.sped.util.ConstantesSistema;
import br.org.asabrasil.sped.util.Util;

public class RegistroJ990 extends RegistroFechaBloco {

	private String qtdLinhas;

	public String getQtdLinhas() {
		return Util.validaAtributoString(qtdLinhas);
	}

	
	public void setQtdLinhas(String qtdLinhas) {
		this.qtdLinhas = qtdLinhas;
	}
	
	
	
	public RegistroJ990() {
		super();
		preencheCamposDefault();
	}


	@Override
	public void preencheCamposDefault() {
		// preenche a identificacao do registro
		this.setIdentRegistro(ConstantesSistema.REG_REGISTRO_J990);
	}


	@Override
	public void geraLayout(StringBuilder conteudo) {
		// Cria a linha referente ao bloco
		conteudo.append(this.getIdentRegistro());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		conteudo.append(this.getQtdLinhas());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		// gera o trecho que indica fim do registro		
		conteudo.append(this.geraFinalRegistro());
	}


}
