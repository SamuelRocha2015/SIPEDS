package br.org.asabrasil.sped.servico;

import java.util.List;

import br.org.asabrasil.sped.DAOImpl.BlocoJDAOImpl;
import br.org.asabrasil.sped.DAOImpl.BlocoKDAOImpl;
import br.org.asabrasil.sped.modelos.bloco0.Registro0930;
import br.org.asabrasil.sped.modelos.blocoJ.RegistroJ050;
import br.org.asabrasil.sped.modelos.blocoJ.RegistroJ053;
import br.org.asabrasil.sped.modelos.blocoJ.RegistroJ100;
import br.org.asabrasil.sped.modelos.blocoK.RegistroK155;
import br.org.asabrasil.sped.util.ConstantesSistema;
import br.org.asabrasil.sped.util.FonteDadosJ051;
import br.org.asabrasil.sped.util.FonteDadosU100;
import br.org.asabrasil.sped.util.FonteDadosU150;

public final class MontaRegistro {

	public static void montaRegistro0930(List<StringBuilder> listaRegistros) {

		Registro0930 registro0930Contador = new Registro0930();
		Registro0930 registro0930Presidente = new Registro0930();

		//DADOS DO CONTADOR
		registro0930Contador.setNomeSignatario(ConstantesSistema.IDENT_NOME_CONTADOR);
		registro0930Contador.setCpfCnpj(ConstantesSistema.IDENT_CPF_CNPJ_CONTADOR);
		registro0930Contador.setCodQualifAssinante(ConstantesSistema.IDENT_QUALIF_CONTADOR);
		registro0930Contador.setNumeroInscricaoContabilista(ConstantesSistema.IND_CRC_CONTADOR);
		registro0930Contador.setEmailSignatario(ConstantesSistema.IDENT_EMAIL_CONTADOR);
		registro0930Contador.setFoneSignatario(ConstantesSistema.IDENT_FONE_CONTADOR);

		//DADOS DO RESPONSAVEL
		registro0930Presidente.setNomeSignatario(ConstantesSistema.IDENT_NOME_RESPONSAVEL2);
		registro0930Presidente.setCpfCnpj(ConstantesSistema.IDENT_CPF_CNPJ_RESPONSAVEL2);
		registro0930Presidente.setCodQualifAssinante(ConstantesSistema.IDENT_QUALIF_RESPONSAVEL2);
		registro0930Presidente.setEmailSignatario(ConstantesSistema.IDENT_EMAIL_RESPONSAVEL2);
		registro0930Presidente.setFoneSignatario(ConstantesSistema.IDENT_FONE_RESPONSAVEL2);

		registro0930Contador.gerarRegistro(listaRegistros);
		registro0930Presidente.gerarRegistro(listaRegistros);

	}

	public static void montaRegistroJ050(List<StringBuilder> listaRegistros) {
		List<RegistroJ050> lista = BlocoJDAOImpl.getInstance().consultaJ050();

		for (RegistroJ050 registroJ050 : lista) {
			registroJ050.gerarRegistro(listaRegistros);
		}
	}

	public static void montaRegistroJ051(List<StringBuilder> listaRegistros) {
		List<String> lista = FonteDadosJ051.getJ051();
		
		for (String str : lista) {
			listaRegistros.add(new StringBuilder(str));	
		}

	}

	public static void montaRegistroK155(List<StringBuilder> listaRegistros) {
		List<RegistroK155> lista = BlocoKDAOImpl.getInstance().consultaK155();

		for (RegistroK155 reg : lista) {
			reg.gerarRegistro(listaRegistros);
		}
	}

	public static void montaRegistroJ053(List<StringBuilder> listaRegistros) {
		List<RegistroJ053> lista = BlocoJDAOImpl.getInstance().consultaJ053();

		for (RegistroJ053 reg : lista) {
			reg.gerarRegistro(listaRegistros);
		}
	}

	public static void montaRegistroJ100(List<StringBuilder> listaRegistros) {
		List<RegistroJ100> lista = BlocoJDAOImpl.getInstance().consultaJ100();

		for (RegistroJ100 reg : lista) {
			reg.gerarRegistro(listaRegistros);
		}
		
	}

	//TODO: Por enquanto o metodo irá ler os dados estaticos. No futuro deverá ser feito um ajuste para a classe pegar esses valores do banco 
	public static void montaRegistroU100(List<StringBuilder> listaRegistros) {
		List<String> lista = FonteDadosU100.getU100();
		
		for (String str : lista) {
			listaRegistros.add(new StringBuilder(str));	
		}
	}

	//TODO: Por enquanto o metodo irá ler os dados estaticos. No futuro deverá ser feito um ajuste para a classe pegar esses valores do banco 
	public static void montaRegistroU150(List<StringBuilder> listaRegistros) {
		List<String> lista = FonteDadosU150.getU150();
		
		for (String str : lista) {
			listaRegistros.add(new StringBuilder(str));	
		}
	}

}
