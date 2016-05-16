package br.org.asabrasil.sped.servico;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

import br.org.asabrasil.sped.modelos.bloco0.Registro0000;
import br.org.asabrasil.sped.modelos.bloco0.Registro0001;
import br.org.asabrasil.sped.modelos.bloco0.Registro0010;
import br.org.asabrasil.sped.modelos.bloco0.Registro0020;
import br.org.asabrasil.sped.modelos.bloco0.Registro0030;
import br.org.asabrasil.sped.modelos.bloco0.Registro0035;
import br.org.asabrasil.sped.modelos.bloco0.Registro0930;
import br.org.asabrasil.sped.modelos.bloco0.Registro0990;
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
		montaRegistro0020(conteudo);
		montaRegistro0030(conteudo);
		montaRegistro0035(conteudo);
		montaRegistro0930(conteudo);
		geraArquivo(conteudo.toString());
		finalizarBloco();
	}


	/**
	 * Monta o bloco de abertura 0000
	 * 
	 * @param registro0000
	 */
	public void montaRegistro0000(Registro0000 registro0000,
			StringBuilder conteudo) {

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
		conteudo.append(Util.removeCaracteresEspeciais(Util
				.converteCalendarParaString(registro0000
						.getDtSitEspecialEvento())));
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		conteudo.append(Util.removeCaracteresEspeciais(Util
				.converteCalendarParaString(registro0000.getDtInicio())));
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		conteudo.append(Util.removeCaracteresEspeciais(Util
				.converteCalendarParaString(registro0000.getDtFim())));
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

		Registro0001 registro0001 = new Registro0001();

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

	private void montaRegistro0020(StringBuilder conteudo) {
		
		Registro0020 registro0020 = new Registro0020();
		registro0020.preencheCamposDefault();
		registro0020.setPjSujeitaAliquotaCSLL("1");
		registro0020.setPjEnquadradaArtigos("N");
		

		conteudo.append(registro0020.getIdentRegistro());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);

		conteudo.append(registro0020.getPjSujeitaAliquotaCSLL());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		conteudo.append(registro0020.getQtdDeSCP());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		conteudo.append(registro0020.getAdmFundosClubesInvest());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		conteudo.append(registro0020.getPartConsorciosEmpresas());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		conteudo.append(registro0020.getOpExterior());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		conteudo.append(registro0020.getOpPessoaVinculada());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		conteudo.append(registro0020.getPjEnquadradaArtigos());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		conteudo.append(registro0020.getPartExterior());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		conteudo.append(registro0020.getAtividadeRural());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		conteudo.append(registro0020.getExistLucroExploracao());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		conteudo.append(registro0020.getIsencaoReduImpParaLucroPresumido());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		conteudo.append(registro0020.getIndicExistenciaFinorFinam());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		conteudo.append(registro0020.getDoacoesCampanhasEleitorais());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		conteudo.append(registro0020.getPartAvaliacaoMetodoEquiPatri());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		conteudo.append(registro0020.getPjEfetuouVendasEmpresaComercial());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		conteudo.append(registro0020.getRecExteriorOuNaoResidentes());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		conteudo.append(registro0020.getAtivosExterior());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		conteudo.append(registro0020.getPjComercialExpodtadora());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		conteudo.append(registro0020.getPagExteriorOuNaoResidentes());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		conteudo.append(registro0020.getComercEletroETi());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		conteudo.append(registro0020.getRoyaltiesRecBrasilEExterior());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		conteudo.append(registro0020.getRoyaltiesPagBenBrasilEExterior());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		conteudo.append(registro0020.getRendRelatServJuros());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		conteudo.append(registro0020.getPagRemessasTituloServ());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		conteudo.append(registro0020.getInovTecEDesenvTec());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		conteudo.append(registro0020.getCapInfoInclDig());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		conteudo.append(registro0020.getPjHabilitadaResp());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		conteudo.append(registro0020.getPoloIndManaus());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		conteudo.append(registro0020.getZonasDeProcessamentoExp());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		conteudo.append(registro0020.getAreasLivreCom());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		
		conteudo.append(ConstantesSistema.CARACTERE_RETORNO_DE_CARRO);
		conteudo.append(ConstantesSistema.CARACTERE_FIM_DE_LINHA);
		conteudo.append(ConstantesSistema.CARACTERE_QUEBRA_LINHA);

	}

	private void montaRegistro0030(StringBuilder conteudo) {
		Registro0030 registro0030 = new Registro0030();
		registro0030.preencheCamposDefault();
		

		conteudo.append(registro0030.getIdentRegistro());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);		

		conteudo.append(registro0030.getCodigoNaturezaJuridica());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);

		conteudo.append(registro0030.getCnaeFiscal());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		conteudo.append(registro0030.getEndereco());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		conteudo.append(registro0030.getNumero());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		conteudo.append(registro0030.getComplemento());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		conteudo.append(registro0030.getBairro());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		conteudo.append(registro0030.getUf());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		conteudo.append(registro0030.getCodMunicipio());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		conteudo.append(registro0030.getCep());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		conteudo.append(registro0030.getNumTelefone());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		conteudo.append(registro0030.getEmail());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		
		conteudo.append(ConstantesSistema.CARACTERE_RETORNO_DE_CARRO);
		conteudo.append(ConstantesSistema.CARACTERE_FIM_DE_LINHA);
		conteudo.append(ConstantesSistema.CARACTERE_QUEBRA_LINHA);
		
	}


	private void montaRegistro0035(StringBuilder conteudo) {
		Registro0035 registro0035 = new Registro0035();
		registro0035.preencheCamposDefault();
		
		//TODO: Mock apenas para teste, mudar para os valores reais, quando souber a informação
		registro0035.setIdentSCP("11111111000291");
		registro0035.setDescricaoSCP("SCP TESTE 1");
		
		conteudo.append(registro0035.getIdentRegistro());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		conteudo.append(registro0035.getIdentSCP());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		conteudo.append(registro0035.getDescricaoSCP());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);

		
		conteudo.append(ConstantesSistema.CARACTERE_RETORNO_DE_CARRO);
		conteudo.append(ConstantesSistema.CARACTERE_FIM_DE_LINHA);
		conteudo.append(ConstantesSistema.CARACTERE_QUEBRA_LINHA);
	}

	
	private void montaRegistro0930(StringBuilder conteudo) {
		Registro0930 registro0930A = new Registro0930();
		registro0930A.preencheCamposDefault();

		Registro0930 registro0930B = new Registro0930();
		registro0930B.preencheCamposDefault();
		

		//TODO: Mock apenas para teste, mudar para os valores reais, quando souber a informação
		registro0930A.setNomeSignatario("FULANO BELTRANO");
		registro0930A.setCpfCnpj("05645272455");
		registro0930A.setCodQualifAssinante("90");
		registro0930A.setNumeroInscricaoContabilista("1SP123456");
		registro0930A.setEmailSignatario("fulano@gmail.com");
		registro0930A.setFoneSignatario("8132522525");
		

		//TODO: Mock apenas para teste, mudar para os valores reais, quando souber a informação
		registro0930B.setNomeSignatario("CICRANO DE TAL");
		registro0930B.setCpfCnpj("00000000000");
		registro0930B.setCodQualifAssinante("80");
		registro0930B.setEmailSignatario("cicrano@gmail.com");
		registro0930B.setFoneSignatario("8122232541");
		

		//DADOS DO 1º REGISTRO (Contador)
		conteudo.append(registro0930A.getIdentRegistro());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);

		conteudo.append(registro0930A.getNomeSignatario());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);

		conteudo.append(registro0930A.getCpfCnpj());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		conteudo.append(registro0930A.getCodQualifAssinante());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);

		conteudo.append(registro0930A.getNumeroInscricaoContabilista());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);

		conteudo.append(registro0930A.getEmailSignatario());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		conteudo.append(registro0930A.getFoneSignatario());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		
		//DADOS DO 2º REGISTRO (Responsavel legal)
		conteudo.append(registro0930B.getIdentRegistro());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);

		conteudo.append(registro0930B.getNomeSignatario());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		conteudo.append(registro0930B.getCpfCnpj());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		conteudo.append(registro0930B.getCodQualifAssinante());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);

		conteudo.append(registro0930B.getNumeroInscricaoContabilista());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);

		
		conteudo.append(registro0930B.getEmailSignatario());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		conteudo.append(registro0930B.getFoneSignatario());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		conteudo.append(ConstantesSistema.CARACTERE_RETORNO_DE_CARRO);
		conteudo.append(ConstantesSistema.CARACTERE_FIM_DE_LINHA);
		conteudo.append(ConstantesSistema.CARACTERE_QUEBRA_LINHA);
		
	}

	private void montaRegistro0990(StringBuilder conteudo, Registro0990 registro0990) {

		conteudo.append(registro0990.getIdentRegistro());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		conteudo.append(registro0990.getQtdLinhas());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		conteudo.append(ConstantesSistema.CARACTERE_RETORNO_DE_CARRO);
		conteudo.append(ConstantesSistema.CARACTERE_FIM_DE_LINHA);
		conteudo.append(ConstantesSistema.CARACTERE_QUEBRA_LINHA); 
	}

	
	public void geraArquivo(String conteudo) {
		
		try {
			PrintStream ps = new PrintStream(ConstantesSistema.CAMINHO_ARQUIVO);
			ps.println(conteudo);
			ps.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	private void finalizarBloco() {
		try {
			Registro0990 reg = new Registro0990();
			reg.preencheCamposDefault();
			File arquivoLeitura = new File(ConstantesSistema.CAMINHO_ARQUIVO);
			reg.setQtdLinhas(Util.contarQtdLinhasArquivo(arquivoLeitura));
		
			PrintStream ps = new PrintStream(new FileOutputStream(arquivoLeitura), true);
			
			StringBuilder conteudo = new StringBuilder();
			montaRegistro0990(conteudo, reg);
			
			ps.println(conteudo);
			ps.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
