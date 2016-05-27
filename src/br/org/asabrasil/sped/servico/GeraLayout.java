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
import br.org.asabrasil.sped.modelos.bloco0.Registro0990;
import br.org.asabrasil.sped.modelos.blocoC.RegistroC001;
import br.org.asabrasil.sped.modelos.blocoC.RegistroC990;
import br.org.asabrasil.sped.modelos.blocoE.RegistroE001;
import br.org.asabrasil.sped.modelos.blocoE.RegistroE990;
import br.org.asabrasil.sped.modelos.blocoJ.RegistroJ001;
import br.org.asabrasil.sped.modelos.blocoJ.RegistroJ990;
import br.org.asabrasil.sped.modelos.blocoK.RegistroK001;
import br.org.asabrasil.sped.modelos.blocoK.RegistroK990;
import br.org.asabrasil.sped.modelos.blocoL.RegistroL001;
import br.org.asabrasil.sped.modelos.blocoL.RegistroL990;
import br.org.asabrasil.sped.modelos.blocoM.RegistroM001;
import br.org.asabrasil.sped.modelos.blocoM.RegistroM990;
import br.org.asabrasil.sped.modelos.blocoN.RegistroN001;
import br.org.asabrasil.sped.modelos.blocoN.RegistroN990;
import br.org.asabrasil.sped.modelos.blocoP.RegistroP001;
import br.org.asabrasil.sped.modelos.blocoP.RegistroP990;
import br.org.asabrasil.sped.modelos.blocoQ.RegistroQ001;
import br.org.asabrasil.sped.modelos.blocoQ.RegistroQ990;
import br.org.asabrasil.sped.util.ConstantesSistema;

public class GeraLayout {
	private List<StringBuilder> listaRegistros = new ArrayList<>();
	
	public void montaLayout(Registro0000 registro0000) {

		
		List<StringBuilder> listaFinal = new ArrayList<>();

		registro0000.gerarRegistro(listaRegistros);

		new Registro0001().gerarRegistro(listaRegistros);
		new Registro0010().gerarRegistro(listaRegistros);
		new Registro0020().gerarRegistro(listaRegistros);
		new Registro0030().gerarRegistro(listaRegistros);
		MontaRegistro.montaRegistro0930(listaRegistros);

		listaFinal.addAll(preparaArquivo(new Registro0990()));
		
		new RegistroC001().gerarRegistro(listaRegistros);
		listaFinal.addAll(preparaArquivo(new RegistroC990()));
		
		new 
		RegistroE001().gerarRegistro(listaRegistros);
		listaFinal.addAll(preparaArquivo(new RegistroE990()));
		
		new RegistroJ001().gerarRegistro(listaRegistros);
		
		MontaRegistro.montarRegistroJ050(listaRegistros);
		
		MontaRegistro.montarRegistroJ051(listaRegistros);

		listaFinal.addAll(preparaArquivo(new RegistroJ990()));
		
		new
		RegistroK001().gerarRegistro(listaRegistros);
		
		MontaRegistro.montaRegistroK030(listaRegistros);
		MontaRegistro.montaRegistroK155(listaRegistros);
		
		listaFinal.addAll(preparaArquivo(new RegistroK990()));
		
		new 
		RegistroL001().gerarRegistro(listaRegistros);
		listaFinal.addAll(preparaArquivo(new RegistroL990()));

		new 
		RegistroM001().gerarRegistro(listaRegistros);
		listaFinal.addAll(preparaArquivo(new RegistroM990()));
		
		new 
		RegistroN001().gerarRegistro(listaRegistros);
		listaFinal.addAll(preparaArquivo(new RegistroN990()));
		
		new 
		RegistroP001().gerarRegistro(listaRegistros);
		listaFinal.addAll(preparaArquivo(new RegistroP990()));

		new 
		RegistroQ001().gerarRegistro(listaRegistros);
		listaFinal.addAll(preparaArquivo(new RegistroQ990()));
		
		geraArquivo(listaFinal);
	}


	public List<StringBuilder> preparaArquivo(RegistroFechaBloco reg) {

		List<StringBuilder> listaFinal = new ArrayList<>();
		int qtdLinhas = listaRegistros.size() + 1;
		StringBuilder ultimaLinhaBloco = new StringBuilder();

		reg.setQtdLinhas(String.valueOf(qtdLinhas));
		reg.geraLayout(ultimaLinhaBloco);

		listaFinal = listaRegistros;
		listaFinal.add(ultimaLinhaBloco);
		listaRegistros = new ArrayList<>();
		return listaFinal;
	}

	public void geraArquivo(List<StringBuilder> listaRegistro) {
		try {

			File file = new File(ConstantesSistema.CAMINHO_ARQUIVO);
			BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));

			// escrevendo a ultima linha do bloco
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
