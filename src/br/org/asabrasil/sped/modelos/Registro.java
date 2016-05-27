package br.org.asabrasil.sped.modelos;

import br.org.asabrasil.sped.util.ConstantesSistema;

public abstract class Registro  {

	//REG
	private String identRegistro;

	public String getIdentRegistro() {
		return identRegistro;
	}

	protected void setIdentRegistro(String identRegistro) {
		this.identRegistro = identRegistro;
	}
	
	public StringBuilder geraFinalRegistro(){
		
		StringBuilder reg = new StringBuilder();
		
//		reg.append(ConstantesSistema.CARACTERE_RETORNO_DE_CARRO);
//		reg.append(ConstantesSistema.CARACTERE_FIM_DE_LINHA);
		reg.append(ConstantesSistema.CARACTERE_QUEBRA_LINHA);
		
		return reg;
	}

}
