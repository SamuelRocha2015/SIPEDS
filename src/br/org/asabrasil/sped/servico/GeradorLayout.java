package br.org.asabrasil.sped.servico;

import java.io.PrintStream;

import br.org.asabrasil.sped.modelos.bloco0.Registro0000;
import br.org.asabrasil.sped.modelos.bloco0.Registro0001;
import br.org.asabrasil.sped.modelos.bloco0.Registro0010;
import br.org.asabrasil.sped.util.ConstantesSistema;
import br.org.asabrasil.sped.util.Util;

/**
 * 
 * @author samuel.rocha
 * 
 */
public class GeradorLayout {

	public void montaLayout(Registro0000 registro0000) {

		StringBuilder conteudo = new StringBuilder();
		
		montaRegistro0000(registro0000, conteudo);
		montaRegistro0001(conteudo);
		montaRegistro0010(conteudo);

		geraArquivo(conteudo.toString());
	}

	/**
	 * Monta o bloco de abertura 0000
	 * 
	 * @param registro0000
	 */
	public void montaRegistro0000(Registro0000 registro0000, StringBuilder conteudo) {

		registro0000.preencheCamposDefault();

		// Cria a linha referente ao bloco
		conteudo.append(registro0000.getIdentRegistro());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		conteudo.append(registro0000.getIdentTipoSped());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		conteudo.append(registro0000.getCodVersaoLayout());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		conteudo.append(registro0000.getCnpj());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		conteudo.append(registro0000.getNomeEmpresa());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		conteudo.append(registro0000.getIndicInicioPeriodo());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		conteudo.append(registro0000.getIndicSituacaoEspecEventos());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		conteudo.append(registro0000.getPatrimonioRemanCasoDeCisao());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		conteudo.append(Util.removeCaracteresEspeciais(Util.converteCalendarParaString(registro0000.getDtSitEspecialEvento())));
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		conteudo.append(Util.removeCaracteresEspeciais(Util.converteCalendarParaString(registro0000.getDtInicio())));
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		conteudo.append(Util.removeCaracteresEspeciais(Util.converteCalendarParaString(registro0000.getDtFim())));
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		conteudo.append(registro0000.getRetificadora());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		conteudo.append(registro0000.getNumReciboECF());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		conteudo.append(registro0000.getIndicTipoECF());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		conteudo.append(registro0000.getIdentSCP());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		conteudo.append(ConstantesSistema.CARACTERE_RETORNO_DE_CARRO);
		conteudo.append(ConstantesSistema.CARACTERE_FIM_DE_LINHA);
		conteudo.append(ConstantesSistema.CARACTERE_QUEBRA_LINHA);
		

		// geraArquivo(blocoAbertura.toString());
		
	}

	private void montaRegistro0001(StringBuilder conteudo) {
		
		Registro0001 registro0001 =  new Registro0001(); 
		 		
		registro0001.preencheCamposDefault(); 
		
		// Cria a linha referente ao bloco
		conteudo.append(registro0001.getIdentRegistro());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		conteudo.append(registro0001.getIndicMovimento());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		conteudo.append(ConstantesSistema.CARACTERE_RETORNO_DE_CARRO);
		conteudo.append(ConstantesSistema.CARACTERE_FIM_DE_LINHA);
		conteudo.append(ConstantesSistema.CARACTERE_QUEBRA_LINHA);		
	}
	
	private void montaRegistro0010(StringBuilder conteudo) {
		
		Registro0010 registro0010 = new Registro0010();
		registro0010.preencheCamposDefault();
		

		conteudo.append(registro0010.getIdentRegistro());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		conteudo.append(registro0010.getHashECF());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		conteudo.append(registro0010.getIndicOptanteRefis());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		conteudo.append(registro0010.getIndicOptantePaes());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
				
		conteudo.append(registro0010.getFormTributacao());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		conteudo.append(registro0010.getIndicPeriodoApuracaoIRPJ());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		conteudo.append(registro0010.getQualificacaoPJ());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		conteudo.append(registro0010.getFormaTribPeriodo());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		conteudo.append(registro0010.getFormaApuracaoEstimMensal());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		conteudo.append(registro0010.getEscrituracao());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		conteudo.append(registro0010.getTpPJImuneIsenta());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		conteudo.append(registro0010.getApuracaoIRJParaImunesIsentas());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		conteudo.append(registro0010.getApuracaoCSLL());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		conteudo.append(registro0010.getOptanteExtincaoRTT());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		conteudo.append(registro0010.getDifFcont());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);

		conteudo.append(ConstantesSistema.CARACTERE_RETORNO_DE_CARRO);
		conteudo.append(ConstantesSistema.CARACTERE_FIM_DE_LINHA);
		conteudo.append(ConstantesSistema.CARACTERE_QUEBRA_LINHA);
		
	}

	public void geraArquivo(String conteudo) {
		try {
			PrintStream ps = new PrintStream("C:\\temp\\dados.txt");
			ps.println(conteudo);
			ps.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
