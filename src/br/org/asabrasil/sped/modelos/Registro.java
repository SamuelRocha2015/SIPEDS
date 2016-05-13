package br.org.asabrasil.sped.modelos;

public abstract class Registro implements LinhaArquivo {

	//REG
	private String identRegistro;

	public String getIdentRegistro() {
		return identRegistro;
	}

	public void setIdentRegistro(String identRegistro) {
		this.identRegistro = identRegistro;
	}
	
	
}
