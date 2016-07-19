package br.org.asabrasil.sped.modelos.blocoY;

import java.util.List;
import br.org.asabrasil.sped.modelos.Linha;
import br.org.asabrasil.sped.util.ConstantesSistema;
import br.org.asabrasil.sped.util.Util;

public class RegistroY612 extends Linha {

	private String cpf;
	private String nome;
	private String qualif;
	private String vlRemTrab;
	private String vlDemRend;
	private String vlIrRet;

	public String getCpf() {
		return Util.validaAtributoString(cpf);
	}

	public String getNome() {
		return Util.validaAtributoString(nome);
	}

	public String getQualif() {
		return Util.validaAtributoString(qualif);
	}

	public String getVlRemTrab() {
		return Util.validaAtributoString(vlRemTrab);
	}

	public String getVlDemRend() {
		return Util.validaAtributoString(vlDemRend);
	}

	public String getVlIrRet() {
		return Util.validaAtributoString(vlIrRet);
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setQualif(String qualif) {
		this.qualif = qualif;
	}

	public void setVlRemTrab(String vlRemTrab) {
		this.vlRemTrab = vlRemTrab;
	}

	public void setVlDemRend(String vlDemRend) {
		this.vlDemRend = vlDemRend;
	}

	public void setVlIrRet(String vlIrRet) {
		this.vlIrRet = vlIrRet;
	}

	public RegistroY612() {
		super();
		preencheCamposDefault();
	}

	@Override
	public void preencheCamposDefault() {
		this.setIdentRegistro(ConstantesSistema.REG_REGISTRO_Y612);
	}

	@Override
	public void gerarRegistro(List<StringBuilder> listaRegistros) {
	}
}