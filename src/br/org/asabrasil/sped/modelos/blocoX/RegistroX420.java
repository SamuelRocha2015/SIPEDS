package br.org.asabrasil.sped.modelos.blocoX;

import java.util.List;

import br.org.asabrasil.sped.modelos.Linha;
import br.org.asabrasil.sped.util.Util;

public class RegistroX420 extends Linha {

	private String tpRoyRecebidosPagos;
	private String pais;
	private String vlExploracaoDirSW;
	private String vlExploracaoDirAut;
	private String vlExploracaoMarca;
	private String vlExploracaoPat;
	private String vlExploracaoKnow;
	private String vlExploracaoFranq;
	private String vlExploracaoIntelec;

	public String getTpRoyRecebidosPagos() {
		return Util.validaAtributoString(tpRoyRecebidosPagos);
	}

	public String getPais() {
		return Util.validaAtributoString(pais);
	}

	public String getVlExploracaoDirSW() {
		return Util.validaAtributoString(vlExploracaoDirSW);
	}

	public String getVlExploracaoDirAut() {
		return Util.validaAtributoString(vlExploracaoDirAut);
	}

	public String getVlExploracaoMarca() {
		return Util.validaAtributoString(vlExploracaoMarca);
	}

	public String getVlExploracaoPat() {
		return Util.validaAtributoString(vlExploracaoPat);
	}

	public String getVlExploracaoKnow() {
		return Util.validaAtributoString(vlExploracaoKnow);
	}

	public String getVlExploracaoFranq() {
		return Util.validaAtributoString(vlExploracaoFranq);
	}

	public String getVlExploracaoIntelec() {
		return Util.validaAtributoString(vlExploracaoIntelec);
	}

	public void setTpRoyRecebidosPagos(String tpRoyRecebidosPagos) {
		this.tpRoyRecebidosPagos = tpRoyRecebidosPagos;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public void setVlExploracaoDirSW(String vlExploracaoDirSW) {
		this.vlExploracaoDirSW = vlExploracaoDirSW;
	}

	public void setVlExploracaoDirAut(String vlExploracaoDirAut) {
		this.vlExploracaoDirAut = vlExploracaoDirAut;
	}

	public void setVlExploracaoMarca(String vlExploracaoMarca) {
		this.vlExploracaoMarca = vlExploracaoMarca;
	}

	public void setVlExploracaoPat(String vlExploracaoPat) {
		this.vlExploracaoPat = vlExploracaoPat;
	}

	public void setVlExploracaoKnow(String vlExploracaoKnow) {
		this.vlExploracaoKnow = vlExploracaoKnow;
	}

	public void setVlExploracaoFranq(String vlExploracaoFranq) {
		this.vlExploracaoFranq = vlExploracaoFranq;
	}

	public void setVlExploracaoIntelec(String vlExploracaoIntelec) {
		this.vlExploracaoIntelec = vlExploracaoIntelec;
	}

	public RegistroX420() {
		super();
		preencheCamposDefault();
	}

	@Override
	public void preencheCamposDefault() {
		// TODO Auto-generated method stub

	}

	@Override
	public void gerarRegistro(List<StringBuilder> listaRegistros) {
		// TODO Auto-generated method stub

	}

}
