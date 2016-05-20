package br.org.asabrasil.sped.modelos.bloco0;

import java.util.List;

import br.org.asabrasil.sped.modelos.Linha;
import br.org.asabrasil.sped.util.ConstantesSistema;
import br.org.asabrasil.sped.util.Util;

public class Registro0030 extends Linha {

	// COD_NAT
	private String codigoNaturezaJuridica;
	// CNAE_FISCAL
	private String CNAEFiscal;
	// ENDERECO
	private String endereco;
	// NUM
	private String numero;
	// COMPL
	private String complemento;
	// BAIRRO
	private String bairro;
	// UF
	private String UF;
	// COD_MUN
	private String codMunicipio;
	// CEP
	private String cep;
	// NUM_TEL
	private String numTelefone;
	// EMAIL
	private String email;

	public Registro0030() {
		super();
		preencheCamposDefault();
	}

	public String getCodigoNaturezaJuridica() {
		return Util.validaAtributoString(codigoNaturezaJuridica);
	}

	public String getCnaeFiscal() {
		return Util.validaAtributoString(CNAEFiscal);
	}

	public String getEndereco() {
		return Util.validaAtributoString(endereco);
	}

	public String getNumero() {
		return Util.validaAtributoString(numero);
	}

	public String getComplemento() {
		return Util.validaAtributoString(complemento);
	}

	public String getBairro() {
		return Util.validaAtributoString(bairro);
	}

	public String getUf() {
		return Util.validaAtributoString(UF);
	}

	public String getCodMunicipio() {
		return Util.validaAtributoString(codMunicipio);
	}

	public String getCep() {
		return Util.validaAtributoString(cep);
	}

	public String getNumTelefone() {
		return Util.validaAtributoString(numTelefone);
	}

	public String getEmail() {
		return Util.validaAtributoString(email);
	}

	@Override
	public void preencheCamposDefault() {

		// preenche a identificacao do registro
		this.setIdentRegistro(ConstantesSistema.REG_REGISTRO_0030);

		// preenche os demais campos padrão
		this.codigoNaturezaJuridica = ConstantesSistema.COD_NAT;
		this.CNAEFiscal = ConstantesSistema.CNAE_FISCAL;
		this.endereco = ConstantesSistema.ENDEREÇO;
		this.numero = ConstantesSistema.NUM;
		this.complemento = ConstantesSistema.COMPL;
		this.bairro = ConstantesSistema.BAIRRO;
		this.UF = ConstantesSistema.UF;
		this.codMunicipio = ConstantesSistema.COD_MUNICIPIO;
		this.cep = ConstantesSistema.CEP;
		this.numTelefone = ConstantesSistema.NUM_TEL;
		this.email = ConstantesSistema.EMAIL;
	}


	public void gerarRegistro(List<StringBuilder> listaRegistros) {
		StringBuilder registro0030 = new StringBuilder();

		// Cria a linha referente ao bloco
		registro0030.append(this.getIdentRegistro());
		registro0030.append(ConstantesSistema.CARACTERE_SEPARADOR);

		registro0030.append(this.getCodigoNaturezaJuridica());
		registro0030.append(ConstantesSistema.CARACTERE_SEPARADOR);

		registro0030.append(this.getCnaeFiscal());
		registro0030.append(ConstantesSistema.CARACTERE_SEPARADOR);

		registro0030.append(this.getEndereco());
		registro0030.append(ConstantesSistema.CARACTERE_SEPARADOR);

		registro0030.append(this.getNumero());
		registro0030.append(ConstantesSistema.CARACTERE_SEPARADOR);

		registro0030.append(this.getComplemento());
		registro0030.append(ConstantesSistema.CARACTERE_SEPARADOR);

		registro0030.append(this.getBairro());
		registro0030.append(ConstantesSistema.CARACTERE_SEPARADOR);

		registro0030.append(this.getUf());
		registro0030.append(ConstantesSistema.CARACTERE_SEPARADOR);

		registro0030.append(this.getCodMunicipio());
		registro0030.append(ConstantesSistema.CARACTERE_SEPARADOR);

		registro0030.append(this.getCep());
		registro0030.append(ConstantesSistema.CARACTERE_SEPARADOR);

		registro0030.append(this.getNumTelefone());
		registro0030.append(ConstantesSistema.CARACTERE_SEPARADOR);

		registro0030.append(this.getEmail());
		registro0030.append(ConstantesSistema.CARACTERE_SEPARADOR);

		registro0030.append(this.geraFinalRegistro());

		listaRegistros.add(registro0030);
	}

}
