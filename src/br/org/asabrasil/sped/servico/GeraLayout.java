package br.org.asabrasil.sped.servico;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import br.org.asabrasil.sped.modelos.RegistroFechaBloco;
import br.org.asabrasil.sped.modelos.bloco0.Registro0000;
import br.org.asabrasil.sped.modelos.bloco0.Registro0001;
import br.org.asabrasil.sped.modelos.bloco0.Registro0010;
import br.org.asabrasil.sped.modelos.bloco0.Registro0020;
import br.org.asabrasil.sped.modelos.bloco0.Registro0030;
import br.org.asabrasil.sped.modelos.bloco0.Registro0930;
import br.org.asabrasil.sped.modelos.bloco0.Registro0990;
import br.org.asabrasil.sped.modelos.blocoC.RegistroC001;
import br.org.asabrasil.sped.modelos.blocoC.RegistroC990;
import br.org.asabrasil.sped.modelos.blocoE.RegistroE001;
import br.org.asabrasil.sped.modelos.blocoE.RegistroE990;
import br.org.asabrasil.sped.modelos.blocoJ.RegistroJ001;
import br.org.asabrasil.sped.modelos.blocoJ.RegistroJ990;
import br.org.asabrasil.sped.util.ConstantesSistema;

public class GeraLayout {

	public void montaLayout(Registro0000 registro0000) {

		List<StringBuilder> listaRegistros = new ArrayList<>();
		List<StringBuilder> listaFinal = new ArrayList<>();

		registro0000.gerarRegistro(listaRegistros);

		new Registro0001().gerarRegistro(listaRegistros);
		new Registro0010().gerarRegistro(listaRegistros);
		new Registro0020().gerarRegistro(listaRegistros);
		new Registro0030().gerarRegistro(listaRegistros);
		montaRegistro0930(listaRegistros);

		listaFinal.addAll(preparaArquivo(listaRegistros,  new Registro0990()));
		listaRegistros = new ArrayList<>();
		
		new RegistroC001().gerarRegistro(listaRegistros);
		listaFinal.addAll(preparaArquivo(listaRegistros, new RegistroC990()));
		listaRegistros = new ArrayList<>();
		
		new RegistroE001().gerarRegistro(listaRegistros);
		listaFinal.addAll(preparaArquivo(listaRegistros, new RegistroE990()));
		
		listaRegistros = new ArrayList<>();
		
		new RegistroJ001().gerarRegistro(listaRegistros);
		listaFinal.addAll(preparaArquivo(listaRegistros, new RegistroJ990()));

		geraArquivo(listaFinal);
	}

	private void montaRegistro0930(List<StringBuilder> listaRegistros) {

		Registro0930 registro0930Contador = new Registro0930();
		Registro0930 registro0930Presidente = new Registro0930();

		// TODO: Mock apenas para teste, mudar para os valores reais, quando
		// souber a informação
		registro0930Contador.setNomeSignatario(ConstantesSistema.IDENT_NOME_CONTADOR);
		registro0930Contador.setCpfCnpj(ConstantesSistema.IDENT_CPF_CNPJ_CONTADOR);
		registro0930Contador.setCodQualifAssinante(ConstantesSistema.IDENT_QUALIF_CONTADOR);
		// TODO: Conseguir o nome da inscricao contabilista do contador
		// registro0930Contador.setNumeroInscricaoContabilista("1SP123456");
		registro0930Contador.setEmailSignatario(ConstantesSistema.IDENT_EMAIL_CONTADOR);
		registro0930Contador.setFoneSignatario(ConstantesSistema.IDENT_FONE_CONTADOR);

		// TODO: Mock apenas para teste, mudar para os valores reais, quando
		// souber a informação
		registro0930Presidente.setNomeSignatario(ConstantesSistema.IDENT_NOME_RESPONSAVEL2);
		registro0930Presidente.setCpfCnpj(ConstantesSistema.IDENT_CPF_CNPJ_RESPONSAVEL2);
		registro0930Presidente.setCodQualifAssinante(ConstantesSistema.IDENT_QUALIF_RESPONSAVEL2);
		registro0930Presidente.setEmailSignatario(ConstantesSistema.IDENT_EMAIL_RESPONSAVEL2);
		registro0930Presidente.setFoneSignatario(ConstantesSistema.IDENT_FONE_RESPONSAVEL2);

		registro0930Contador.gerarRegistro(listaRegistros);
		registro0930Presidente.gerarRegistro(listaRegistros);

	}

	public List<StringBuilder> preparaArquivo(List<StringBuilder> listaRegistro, RegistroFechaBloco reg) {

		List<StringBuilder> listaFinal = new ArrayList<>();
		int qtdLinhas = listaRegistro.size() + 1;
		StringBuilder ultimaLinhaBloco = new StringBuilder();

		reg.setQtdLinhas(String.valueOf(qtdLinhas));
		reg.geraLayout(ultimaLinhaBloco);

		listaFinal = listaRegistro;
		listaFinal.add(ultimaLinhaBloco);

		return listaFinal;
	}

	public void geraArquivo(List<StringBuilder> listaRegistro) {
		try {

			File file = new File(ConstantesSistema.CAMINHO_ARQUIVO);
			BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));

			// escrevendo a ultima linha do bloco
			// writer.write(ultimaLinhaBloco.toString());
			for (StringBuilder registro : listaRegistro) {
				writer.write(registro.toString());
			}
			// Criando o conteúdo do arquivo
			writer.flush();

			// Fechando conexão e escrita do arquivo.
			writer.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
