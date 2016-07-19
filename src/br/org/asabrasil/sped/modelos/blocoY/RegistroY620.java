package br.org.asabrasil.sped.modelos.blocoY;

import java.util.List;

import br.org.asabrasil.sped.modelos.Linha;
import br.org.asabrasil.sped.util.ConstantesSistema;
import br.org.asabrasil.sped.util.Util;
 
public class RegistroY620 extends Linha{ 
 
private String dtEvento; 
private String indRelac; 
private String pais; 
private String cnpj; 
private String nomEmp; 
private String valorReais; 
private String valorEstr; 
private String percCapTot; 
private String percCapVot; 
private String resEqPat; 
private String dataAquis; 
private String indProcCart; 
private String numProcCart; 
private String nomeCart; 
private String indProcRfb; 
private String numProcRfb; 

public String getDtEvento() { 
 return Util.validaAtributoString(dtEvento); 
 } 

public String getIndRelac() { 
 return Util.validaAtributoString(indRelac); 
 } 

public String getPais() { 
 return Util.validaAtributoString(pais); 
 } 

public String getCnpj() { 
 return Util.validaAtributoString(cnpj); 
 } 

public String getNomEmp() { 
 return Util.validaAtributoString(nomEmp); 
 } 

public String getValorReais() { 
 return Util.validaAtributoString(valorReais); 
 } 

public String getValorEstr() { 
 return Util.validaAtributoString(valorEstr); 
 } 

public String getPercCapTot() { 
 return Util.validaAtributoString(percCapTot); 
 } 

public String getPercCapVot() { 
 return Util.validaAtributoString(percCapVot); 
 } 

public String getResEqPat() { 
 return Util.validaAtributoString(resEqPat); 
 } 

public String getDataAquis() { 
 return Util.validaAtributoString(dataAquis); 
 } 

public String getIndProcCart() { 
 return Util.validaAtributoString(indProcCart); 
 } 

public String getNumProcCart() { 
 return Util.validaAtributoString(numProcCart); 
 } 

public String getNomeCart() { 
 return Util.validaAtributoString(nomeCart); 
 } 

public String getIndProcRfb() { 
 return Util.validaAtributoString(indProcRfb); 
 } 

public String getNumProcRfb() { 
 return Util.validaAtributoString(numProcRfb); 
 } 

public void setDtEvento(String dtEvento){ 
 this.dtEvento = dtEvento; 
 } 

public void setIndRelac(String indRelac){ 
 this.indRelac = indRelac; 
 } 

public void setPais(String pais){ 
 this.pais = pais; 
 } 

public void setCnpj(String cnpj){ 
 this.cnpj = cnpj; 
 } 

public void setNomEmp(String nomEmp){ 
 this.nomEmp = nomEmp; 
 } 

public void setValorReais(String valorReais){ 
 this.valorReais = valorReais; 
 } 

public void setValorEstr(String valorEstr){ 
 this.valorEstr = valorEstr; 
 } 

public void setPercCapTot(String percCapTot){ 
 this.percCapTot = percCapTot; 
 } 

public void setPercCapVot(String percCapVot){ 
 this.percCapVot = percCapVot; 
 } 

public void setResEqPat(String resEqPat){ 
 this.resEqPat = resEqPat; 
 } 

public void setDataAquis(String dataAquis){ 
 this.dataAquis = dataAquis; 
 } 

public void setIndProcCart(String indProcCart){ 
 this.indProcCart = indProcCart; 
 } 

public void setNumProcCart(String numProcCart){ 
 this.numProcCart = numProcCart; 
 } 

public void setNomeCart(String nomeCart){ 
 this.nomeCart = nomeCart; 
 } 

public void setIndProcRfb(String indProcRfb){ 
 this.indProcRfb = indProcRfb; 
 } 

public void setNumProcRfb(String numProcRfb){ 
 this.numProcRfb = numProcRfb; 
 } 

public RegistroY620() { 
 super(); 
preencheCamposDefault(); 
}

@Override 
public void preencheCamposDefault() {
	this.setIdentRegistro(ConstantesSistema.REG_REGISTRO_Y620);
}

@Override 
public void gerarRegistro(List<StringBuilder> listaRegistros) { 
}
}