package br.org.asabrasil.sped.modelos.bloco0;

import java.util.List;

import br.org.asabrasil.sped.modelos.Linha;
import br.org.asabrasil.sped.util.ConstantesSistema;
import br.org.asabrasil.sped.util.Util;

public class Registro0930 extends Linha {

	private String nomeSignatario;
	private String cpfCnpj;
	private String codQualifAssinante;
	private String emailSignatario;
	private String foneSignatario;
	private String numeroInscricaoContabilista;

	
	public Registro0930() {
		super();
		preencheCamposDefault();
	}

	public String getNumeroInscricaoContabilista() {
		return Util.validaAtributoString(numeroInscricaoContabilista);
	}

	public void setNumeroInscricaoContabilista(
			String numeroInscricaoContabilista) {
		this.numeroInscricaoContabilista = numeroInscricaoContabilista;
	}

	public String getNomeSignatario() {
		return Util.validaAtributoString(nomeSignatario);
	}

	public String getCpfCnpj() {
		return Util.validaAtributoString(cpfCnpj);
	}

	public String getCodQualifAssinante() {
		return Util.validaAtributoString(codQualifAssinante);
	}

	public String getEmailSignatario() {
		return Util.validaAtributoString(emailSignatario);
	}

	public String getFoneSignatario() {
		return Util.validaAtributoString(foneSignatario);
	}

	public void setNomeSignatario(String nomeSignatario) {
		this.nomeSignatario = nomeSignatario;
	}

	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	public void setCodQualifAssinante(String codQualifAssinante) {
		this.codQualifAssinante = codQualifAssinante;
	}

	public void setEmailSignatario(String emailSignatario) {
		this.emailSignatario = emailSignatario;
	}

	public void setFoneSignatario(String foneSignatario) {
		this.foneSignatario = foneSignatario;
	}

	@Override
	public void preencheCamposDefault() {
		// preenche a identificacao do registro
		this.setIdentRegistro(ConstantesSistema.REG_REGISTRO_0930);

	}


	public void gerarRegistro(List<StringBuilder> listaRegistros) {
		StringBuilder registro0930 = new StringBuilder();
		
		// Cria a linha referente ao bloco
		registro0930.append(this.getIdentRegistro());
		registro0930.append(ConstantesSistema.CARACTERE_SEPARADOR);

		registro0930.append(this.getNomeSignatario());
		registro0930.append(ConstantesSistema.CARACTERE_SEPARADOR);

		registro0930.append(this.getCpfCnpj());
		registro0930.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		registro0930.append(this.getCodQualifAssinante());
		registro0930.append(ConstantesSistema.CARACTERE_SEPARADOR);

		registro0930.append(this.getNumeroInscricaoContabilista());
		registro0930.append(ConstantesSistema.CARACTERE_SEPARADOR);

		registro0930.append(this.getEmailSignatario());
		registro0930.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		registro0930.append(this.getFoneSignatario());
		registro0930.append(ConstantesSistema.CARACTERE_SEPARADOR);

		registro0930.append(this.geraFinalRegistro());

		listaRegistros.add(registro0930);
	}

}
