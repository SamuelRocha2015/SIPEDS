package br.org.asabrasil.sped.modelos;

import br.org.asabrasil.sped.util.ConstantesSistema;
import br.org.asabrasil.sped.util.Util;

public abstract class RegistroFechaBloco extends Registro implements LinhaArquivo, LinhaFechaBloco {

	private String qtdLinhas;

	public String getQtdLinhas() {
		return Util.validaAtributoString(qtdLinhas);
	}

	public void setQtdLinhas(String qtdLinhas) {
		this.qtdLinhas = qtdLinhas;
	}


	@Override
	public void geraLayout(StringBuilder conteudo) {
		
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		// Cria a linha referente ao bloco
		conteudo.append(this.getIdentRegistro());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		conteudo.append(this.getQtdLinhas());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		// gera o trecho que indica fim do registro		
		conteudo.append(this.geraFinalRegistro());
	}


}
