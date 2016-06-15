package br.org.asabrasil.sped.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.org.asabrasil.sped.modelos.bloco0.Registro0000;
import br.org.asabrasil.sped.servico.GeraLayout;
import br.org.asabrasil.sped.util.Util;


/**
 * 
 * @author samuel.rocha
 *
 */
@WebServlet("/executa")
public class Controller extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Registro0000 registro0000 = new Registro0000();
				
//		if(!Util.isStringVazia(req.getParameter("DT_INI"))){
//			registro0000.setDtInicio("01/01/2015");
//		}
//		if(!Util.isStringVazia(req.getParameter("DT_FIN"))){
//			registro0000.setDtFim("31/12/2015");
//		}
		
		
		registro0000.setDtInicio(Util.dataInicialOuFinalApuracaoSemMascara(true));
		registro0000.setDtFim(Util.dataInicialOuFinalApuracaoSemMascara(false));
		
		new GeraLayout().montaLayout(registro0000);
		PrintWriter writer = resp.getWriter();
		writer.println("ok");

	}

}
