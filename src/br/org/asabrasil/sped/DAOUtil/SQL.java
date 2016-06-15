package br.org.asabrasil.sped.DAOUtil;

public final class SQL {

	public SQL() {
		super();
	}

	public static StringBuilder consultaRegistroJ050OuJ100(boolean isRegJ100 ) {

		StringBuilder sql = new StringBuilder();

		sql.append(" SELECT ");
		
		if(isRegJ100){
			sql.append(" ID, NOME_CONTA FROM (   ");	
		} else {
			sql.append(" NATUREZA_CONTA_GRUPO, INDICADOR, NIVEL, CONTA_ANALITICA, CONTA_SINTETICA, NOME_CONTA FROM (                                          ");	
		}
		
		sql.append("     SELECT 							                     																			  ");
		
		if(isRegJ100){
			sql.append("CONTA_1.ID, 																													      ");
		} 
		
		sql.append("    CASE WHEN CONTA_1.CLASSIFICADOR LIKE '1%' THEN '01' ELSE                                                                        	  ");
		sql.append("                                             CASE WHEN CONTA_1.CLASSIFICADOR LIKE '2%' THEN '02' ELSE                                     ");
		sql.append("                                             CASE WHEN CONTA_1.CLASSIFICADOR LIKE '3%' THEN '03' ELSE                                     ");
		sql.append("                                             CASE WHEN CONTA_1.CLASSIFICADOR LIKE '4%' THEN '04' ELSE                                     ");
		sql.append("                                             CASE WHEN CONTA_1.CLASSIFICADOR LIKE '5%' THEN '05' ELSE                                     ");
		sql.append("                                             '09' END END END END END NATUREZA_CONTA_GRUPO,                                               ");
		sql.append("   CASE WHEN CONTA_1.CLASSE = 1 THEN 'S' ELSE 'A' END INDICADOR,                                                                          ");
		sql.append("   ((LENGTH(CONTA_1.CLASSIFICADOR) - LENGTH(REPLACE(CONTA_1.CLASSIFICADOR, '.'))) + 1) NIVEL,                                             ");
		sql.append("   REPLACE(SUBSTR(CONTA_1.CLASSIFICADOR,1,3),'.','.0') || SUBSTR(CONTA_1.CLASSIFICADOR,4,LENGTH(CONTA_1.CLASSIFICADOR)) CONTA_ANALITICA,  ");
		sql.append("   REPLACE(SUBSTR(CONTA_2.CLASSIFICADOR,1,3),'.','.0') || SUBSTR(CONTA_2.CLASSIFICADOR,4,LENGTH(CONTA_2.CLASSIFICADOR)) CONTA_SINTETICA,  ");
		sql.append("   REPLACE(TRANSLATE(CONTA_1.NOME,'âàãáÁÂÀÃéêÉÊíÍóôõÓÔÕüúÜÚÇçº','AAAAAAAAEEEEIIOOOOOOUUUUCC°'),'°','') NOME_CONTA, '|' STRING7            ");
		sql.append("   FROM ASASIGA1.CONTACONTABIL CONTA_1                                                                                                    ");
		sql.append("   LEFT JOIN ASASIGA1.CONTACONTABIL CONTA_2 ON CONTA_2.ID = CONTA_1.OWNER                                                                 ");
		
		if(isRegJ100){
			sql.append(" 	WHERE SUBSTR(CONTA_1.CLASSIFICADOR,1,1) IN (3) AND CONTA_2.CLASSIFICADOR LIKE '3.1.02.01'										  ");
		}
		
		sql.append("        ORDER BY CONTA_1.CLASSIFICADOR)                                                                                                   ");

		return sql;
	}
	
	public static StringBuilder consultaRegistroJ051() {

		StringBuilder sql = new StringBuilder();

//		sql.append(" SELECT * FROM ASASIGA1.PLANO_REFERENCIAL_SPED ");

		
		sql.append("   SELECT CONTA_ANALITICA  AS CODIGO  FROM (                                                                                                                                         ");
		sql.append("		                          SELECT CONTA_1.ID, CASE WHEN CONTA_1.CLASSIFICADOR LIKE '1%' THEN '01' ELSE                                                            ");            
		sql.append("		                                                                    CASE WHEN CONTA_1.CLASSIFICADOR LIKE '2%' THEN '02' ELSE                                     ");
		sql.append("		                                                                    CASE WHEN CONTA_1.CLASSIFICADOR LIKE '3%' THEN '03' ELSE                                     ");
		sql.append("		                                                                    CASE WHEN CONTA_1.CLASSIFICADOR LIKE '4%' THEN '04' ELSE                                     ");
		sql.append("		                                                                    CASE WHEN CONTA_1.CLASSIFICADOR LIKE '5%' THEN '05' ELSE                                     ");
		sql.append("		                                                                    '09' END END END END END NATUREZA_CONTA_GRUPO,                                               ");
		sql.append("		                          CASE WHEN CONTA_1.CLASSE = 1 THEN 'S' ELSE 'A' END INDICADOR,                                                                          ");
		sql.append("		                          ((LENGTH(CONTA_1.CLASSIFICADOR) - LENGTH(REPLACE(CONTA_1.CLASSIFICADOR, '.'))) + 1) NIVEL,                                             ");
		sql.append("		                          REPLACE(SUBSTR(CONTA_1.CLASSIFICADOR,1,3),'.','.0') || SUBSTR(CONTA_1.CLASSIFICADOR,4,LENGTH(CONTA_1.CLASSIFICADOR)) CONTA_ANALITICA,  ");
		sql.append("		                          REPLACE(SUBSTR(CONTA_2.CLASSIFICADOR,1,3),'.','.0') || SUBSTR(CONTA_2.CLASSIFICADOR,4,LENGTH(CONTA_2.CLASSIFICADOR)) CONTA_SINTETICA,  ");
		sql.append("		                          REPLACE(TRANSLATE(CONTA_1.NOME,'âàãáÁÂÀÃéêÉÊíÍóôõÓÔÕüúÜÚÇçº','AAAAAAAAEEEEIIOOOOOOUUUUCC°'),'°','') NOME_CONTA, '|' STRING7            ");
		sql.append("		                          FROM ASASIGA1.CONTACONTABIL CONTA_1                                                                                                    ");
		sql.append("		                          LEFT JOIN ASASIGA1.CONTACONTABIL CONTA_2 ON CONTA_2.ID = CONTA_1.OWNER                                                                 ");
		sql.append("                              WHERE CONTA_1.CLASSE = 0 AND  SUBSTR(CONTA_1.CLASSIFICADOR,1,1) IN (1, 2, 3, 4)  )                                                          ");
		
		return sql;
	}
	
	
	public static StringBuilder consultaRegistroK155(){
		StringBuilder sql = new StringBuilder();

		//TODO: Alterar os parametros
	
		
		sql.append("   SELECT                                                                                                                                           ");  
		sql.append("     CLASSIFICADOR AS COD_CONTA_ANALITICA,                                                                                                          ");  
		sql.append("     NVL(saldoanterior,0) AS SALDO_ANTERIOR, CASE WHEN NVL(saldoanterior,0) >= 0 THEN 'D' ELSE 'C' END INDICADOR_INICIAL,                           ");  
		sql.append("     NVL(ValorDebito, 0) AS VALOR_DEBITO ,                                                                                                          ");  
		sql.append("     NVL(ValorCredito,0) AS VALOR_CREDITO,                                                                                                          ");  
		sql.append("     NVL(saldo,0) AS SALDO_FINAL, CASE WHEN NVL(saldo,0) >= 0 THEN 'D' ELSE 'C' END INDICADOR_FINAL FROM (                                          ");  
		sql.append("   SELECT CC.ID, CC.OWNER, CC.CLASSIFICADOR AS CLASSIFICADOR, CC.NOME AS NOME,                                                                      ");  
		sql.append("   ROUND(J10.saldoanterior,2)*(-1) saldoanterior, ROUND(J10.ValorDebito,2) ValorDebito, ROUND(J10.ValorCredito,2) ValorCredito,                     ");  
		sql.append("   ROUND(J10.saldo,2)*(-1) saldo, cc.classe FROM asasiga1.contacontabil cc                                                                          ");  
		sql.append("   Left join (                                                                                                                                      ");  
		sql.append("   SELECT plano, 0 OWNER, NULL CLASSIFICADOR,'' NOME, Sum(saldoanterior) saldoanterior,Sum(ValorDebito) ValorDebito, Sum(ValorCredito) ValorCredito,");  
		sql.append("   sum(saldoanterior - saldoatual) saldo                                                                                                            ");  
		sql.append("   FROM (                                                                                                                                           ");  
		sql.append("   SELECT saldoanterior, plano, valordebito, valorcredito,(valordebito - valorcredito) saldoatual FROM (                                            ");  
		sql.append("   SELECT 0 saldoanterior, plano,S4.ValorDebito, S4.ValorCredito FROM (                                                                             ");  
		sql.append("   SELECT S1.CREDITOPLANO Plano, S1.CREDITOUNIDADE Unidade, 0 AS ValorDebito, Sum(valor) AS ValorCredito                                            ");  
		sql.append("   FROM ASASIGA1.LANCAMENTO S1                                                                                                                      ");  
		sql.append("   WHERE S1.DATA >= '01012015' AND S1.DATA <= '31122015' AND S1.CREDITOPLANO IS NOT NULL  AND S1.DEBITOPLANO IS NULL                                ");  
		sql.append("   GROUP BY  S1.CREDITOUNIDADE, S1.DEBITOPLANO, S1.CREDITOPLANO                                                                                     ");  
		sql.append("   UNION ALL                                                                                                                                        ");  
		sql.append("   SELECT S2.DEBITOPLANO Plano, S2.DEBITOUNIDADE Unidade, Sum(valor) AS ValorDebito, 0 AS ValorCredito                                              ");  
		sql.append("   FROM ASASIGA1.LANCAMENTO S2                                                                                                                      ");  
		sql.append("   WHERE S2.DATA >= '01012015' AND S2.DATA <= '31122015' AND S2.DEBITOPLANO IS NOT NULL AND S2.CREDITOPLANO IS NULL                                 ");  
		sql.append("   GROUP BY  S2.DEBITOUNIDADE, S2.DEBITOPLANO, S2.CREDITOPLANO                                                                                      ");  
		sql.append("   UNION all                                                                                                                                        ");  
		sql.append("   SELECT Plano, Unidade, Sum(VALORCREDITO) VALORCREDITO, Sum(VALORDEBITO) VALORDEBITO FROM (                                                       ");  
		sql.append("   SELECT Plano, Unidade, Sum(VALORCREDITO) VALORCREDITO, Sum(VALORDEBITO) VALORDEBITO FROM (                                                       ");  
		sql.append("   SELECT PLANO, UNIDADE, SUM(VALORCREDITO) VALORCREDITO, SUM(VALORDEBITO) VALORDEBITO FROM (                                                       ");  
		sql.append("   SELECT LANCAMENTO.DEBITOPLANO Plano, REGISTRODEBITOCONTABILIZADO.unidade, CONTAPAGARDETALHE.VALOR VALORCREDITO, 0 VALORDEBITO                    ");  
		sql.append("   FROM ASASIGA1.REGISTRODEBITOCONTABILIZADO                                                                                                        ");  
		sql.append("   LEFT JOIN ASASIGA1.PAGAMENTO                                                                                                                     ");  
		sql.append("   ON PAGAMENTO.UNIDADE = REGISTRODEBITOCONTABILIZADO.UNIDADE AND PAGAMENTO.CONTAPAGAR = REGISTRODEBITOCONTABILIZADO.CONTAPAGAR                     ");  
		sql.append("   INNER JOIN ASASIGA1.LANCAMENTO                                                                                                                   ");  
		sql.append("   ON LANCAMENTO.UNIDADEOWNER = REGISTRODEBITOCONTABILIZADO.UNIDADE AND LANCAMENTO.ID = REGISTRODEBITOCONTABILIZADO.LANCAMENTOCREDITO               ");  
		sql.append("   LEFT JOIN ASASIGA1.CONTAPAGARDETALHE                                                                                                             ");  
		sql.append("   ON CONTAPAGARDETALHE.UNIDADE = REGISTRODEBITOCONTABILIZADO.UNIDADE AND CONTAPAGARDETALHE.CONTAPAGAR = REGISTRODEBITOCONTABILIZADO.CONTAPAGAR     ");  
		sql.append("   AND CONTAPAGARDETALHE.ID = REGISTRODEBITOCONTABILIZADO.CONTAPAGARDETALHE                                                                         ");  
		sql.append("   WHERE PAGAMENTO.DATABAIXA >= '01012015' AND PAGAMENTO.DATABAIXA <= '31122015' AND PAGAMENTO.DATAESTORNO IS NULL                                  ");  
		sql.append("   ) GROUP BY plano, unidade                                                                                                                        ");  
		sql.append("   UNION                                                                                                                                            ");  
		sql.append("   SELECT PLANO, UNIDADE, SUM(VALORCREDITO) VALORCREDITO, SUM(VALORDEBITO) VALORDEBITO FROM (                                                       ");  
		sql.append("   SELECT LANCAMENTO.CREDITOPLANO Plano, REGISTRODEBITOCONTABILIZADO.UNIDADE, 0 VALORCREDITO, CONTAPAGARDETALHE.VALOR VALORDEBITO                   ");  
		sql.append("   FROM ASASIGA1.REGISTRODEBITOCONTABILIZADO                                                                                                        ");  
		sql.append("   LEFT JOIN ASASIGA1.PAGAMENTO                                                                                                                     ");  
		sql.append("   ON PAGAMENTO.UNIDADE = REGISTRODEBITOCONTABILIZADO.UNIDADE AND PAGAMENTO.CONTAPAGAR = REGISTRODEBITOCONTABILIZADO.CONTAPAGAR                     ");  
		sql.append("   INNER JOIN ASASIGA1.LANCAMENTO                                                                                                                   ");  
		sql.append("   ON LANCAMENTO.UNIDADEOWNER = REGISTRODEBITOCONTABILIZADO.UNIDADE AND LANCAMENTO.ID = REGISTRODEBITOCONTABILIZADO.LANCAMENTOCREDITO               ");  
		sql.append("   LEFT JOIN ASASIGA1.CONTAPAGARDETALHE                                                                                                             ");  
		sql.append("   ON CONTAPAGARDETALHE.UNIDADE = REGISTRODEBITOCONTABILIZADO.UNIDADE AND CONTAPAGARDETALHE.CONTAPAGAR = REGISTRODEBITOCONTABILIZADO.CONTAPAGAR     ");  
		sql.append("   AND CONTAPAGARDETALHE.ID = REGISTRODEBITOCONTABILIZADO.CONTAPAGARDETALHE                                                                         ");  
		sql.append("   WHERE PAGAMENTO.DATABAIXA >= '01012015' AND PAGAMENTO.DATABAIXA <= '31122015' AND PAGAMENTO.DATAESTORNO IS NULL                                  ");  
		sql.append("   ) GROUP BY plano, unidade                                                                                                                        ");  
		sql.append("   ) GROUP BY plano, unidade                                                                                                                        ");  
		sql.append("   UNION all                                                                                                                                        ");  
		sql.append("   SELECT Plano, Unidade, Sum(VALORCREDITO) VALORCREDITO, Sum(VALORDEBITO) VALORDEBITO FROM (                                                       ");  
		sql.append("   SELECT PLANO, UNIDADE, SUM(VALORCREDITO) VALORCREDITO, SUM(VALORDEBITO) VALORDEBITO FROM (                                                       ");  
		sql.append("   SELECT LANCAMENTO.DEBITOPLANO PLANO, DEBITOSCONTABILIZADOS.UNIDADE, CONTAPAGARDETALHE.VALOR VALORCREDITO, 0 VALORDEBITO                          ");  
		sql.append("   FROM ASASIGA1.DEBITOSCONTABILIZADOS                                                                                                              ");  
		sql.append("   LEFT JOIN ASASIGA1.PAGAMENTO                                                                                                                     ");  
		sql.append("   ON PAGAMENTO.UNIDADE = DEBITOSCONTABILIZADOS.UNIDADE AND PAGAMENTO.CONTAPAGAR = DEBITOSCONTABILIZADOS.CONTAPAGAR                                 ");  
		sql.append("   INNER JOIN ASASIGA1.LANCAMENTO                                                                                                                   ");  
		sql.append("   ON LANCAMENTO.UNIDADEOWNER = DEBITOSCONTABILIZADOS.UNIDADE AND LANCAMENTO.ID = DEBITOSCONTABILIZADOS.LANCAMENTOCREDITO                           ");  
		sql.append("   LEFT JOIN ASASIGA1.CONTAPAGARDETALHE                                                                                                             ");  
		sql.append("   ON CONTAPAGARDETALHE.UNIDADE = DEBITOSCONTABILIZADOS.UNIDADE AND CONTAPAGARDETALHE.CONTAPAGAR = DEBITOSCONTABILIZADOS.CONTAPAGAR                 ");  
		sql.append("   AND CONTAPAGARDETALHE.ID = DEBITOSCONTABILIZADOS.CONTAPAGARDETALHE                                                                               ");  
		sql.append("   WHERE PAGAMENTO.DATABAIXA >= '01012015' AND PAGAMENTO.DATABAIXA <= '31122015' AND PAGAMENTO.DATAESTORNO IS NULL                                  ");  
		sql.append("   ) GROUP BY plano, unidade                                                                                                                        ");  
		sql.append("   UNION                                                                                                                                            ");  
		sql.append("   SELECT PLANO, UNIDADE, SUM(VALORCREDITO) VALORCREDITO, SUM(VALORDEBITO) VALORDEBITO FROM (                                                       ");  
		sql.append("   SELECT LANCAMENTO.CREDITOPLANO PLANO, DEBITOSCONTABILIZADOS.UNIDADE,0 VALORCREDITO, CONTAPAGARDETALHE.VALOR VALORDEBITO                          ");  
		sql.append("   FROM ASASIGA1.DEBITOSCONTABILIZADOS                                                                                                              ");  
		sql.append("   LEFT JOIN ASASIGA1.PAGAMENTO                                                                                                                     ");  
		sql.append("   ON PAGAMENTO.UNIDADE = DEBITOSCONTABILIZADOS.UNIDADE AND PAGAMENTO.CONTAPAGAR = DEBITOSCONTABILIZADOS.CONTAPAGAR                                 ");  
		sql.append("   INNER JOIN ASASIGA1.LANCAMENTO                                                                                                                   ");  
		sql.append("   ON LANCAMENTO.UNIDADEOWNER = DEBITOSCONTABILIZADOS.UNIDADE AND LANCAMENTO.ID = DEBITOSCONTABILIZADOS.LANCAMENTOCREDITO                           ");  
		sql.append("   LEFT JOIN ASASIGA1.CONTAPAGARDETALHE                                                                                                             ");  
		sql.append("   ON CONTAPAGARDETALHE.UNIDADE = DEBITOSCONTABILIZADOS.UNIDADE AND CONTAPAGARDETALHE.CONTAPAGAR = DEBITOSCONTABILIZADOS.CONTAPAGAR                 ");  
		sql.append("   AND CONTAPAGARDETALHE.ID = DEBITOSCONTABILIZADOS.CONTAPAGARDETALHE                                                                               ");  
		sql.append("   WHERE PAGAMENTO.DATABAIXA >= '01012015' AND PAGAMENTO.DATABAIXA <= '31122015' AND PAGAMENTO.DATAESTORNO IS NULL                                  ");  
		sql.append("   ) GROUP BY plano, unidade                                                                                                                        ");  
		sql.append("   ) GROUP BY plano, unidade                                                                                                                        ");  
		sql.append("   UNION all                                                                                                                                        ");  
		sql.append("   SELECT Plano, Unidade, Sum(VALORCREDITO) VALORCREDITO, Sum(VALORDEBITO) VALORDEBITO FROM (                                                       ");  
		sql.append("   SELECT PLANO, UNIDADE, SUM(VALORCREDITO) VALORCREDITO, SUM(VALORDEBITO) VALORDEBITO FROM (                                                       ");  
		sql.append("   SELECT LANCAMENTO.DEBITOPLANO PLANO, REGISTROCREDITOCONTABILIZADO.UNIDADE, 0 VALORCREDITO, VALOR VALORDEBITO                                     ");  
		sql.append("   FROM ASASIGA1.REGISTROCREDITOCONTABILIZADO                                                                                                       ");  
		sql.append("   LEFT JOIN ASASIGA1.RECEBIMENTO                                                                                                                   ");  
		sql.append("   ON RECEBIMENTO.UNIDADE = REGISTROCREDITOCONTABILIZADO.UNIDADE AND RECEBIMENTO.CONTARECEBER = REGISTROCREDITOCONTABILIZADO.CONTARECEBER           ");  
		sql.append("   INNER JOIN ASASIGA1.LANCAMENTO                                                                                                                   ");  
		sql.append("   ON LANCAMENTO.UNIDADEOWNER = REGISTROCREDITOCONTABILIZADO.UNIDADE AND LANCAMENTO.ID = REGISTROCREDITOCONTABILIZADO.LANCAMENTOCREDITO             ");  
		sql.append("   WHERE RECEBIMENTO.DATABAIXA >= '01012015' AND RECEBIMENTO.DATABAIXA <= '31122015' AND RECEBIMENTO.DATAESTORNO IS NULL                            ");  
		sql.append("   ) GROUP BY plano, unidade                                                                                                                        ");  
		sql.append("   UNION                                                                                                                                            ");  
		sql.append("   SELECT PLANO, UNIDADE, SUM(VALORCREDITO) VALORCREDITO, SUM(VALORDEBITO) VALORDEBITO FROM (                                                       ");  
		sql.append("   SELECT LANCAMENTO.CREDITOPLANO PLANO, REGISTROCREDITOCONTABILIZADO.UNIDADE, VALOR VALORCREDITO, 0 VALORDEBITO                                    ");  
		sql.append("   FROM ASASIGA1.REGISTROCREDITOCONTABILIZADO                                                                                                       ");  
		sql.append("   LEFT JOIN ASASIGA1.RECEBIMENTO                                                                                                                   ");  
		sql.append("   ON RECEBIMENTO.UNIDADE = REGISTROCREDITOCONTABILIZADO.UNIDADE AND RECEBIMENTO.CONTARECEBER = REGISTROCREDITOCONTABILIZADO.CONTARECEBER           ");  
		sql.append("   INNER JOIN ASASIGA1.LANCAMENTO                                                                                                                   ");  
		sql.append("   ON LANCAMENTO.UNIDADEOWNER = REGISTROCREDITOCONTABILIZADO.UNIDADE AND LANCAMENTO.ID = REGISTROCREDITOCONTABILIZADO.LANCAMENTOCREDITO             ");  
		sql.append("   WHERE RECEBIMENTO.DATABAIXA >= '01012015' AND RECEBIMENTO.DATABAIXA <= '31122015' AND RECEBIMENTO.DATAESTORNO IS NULL                            ");  
		sql.append("   ) GROUP BY plano, unidade                                                                                                                        ");  
		sql.append("   ) GROUP BY plano, unidade                                                                                                                        ");  
		sql.append("   UNION all                                                                                                                                        ");  
		sql.append("   SELECT Plano, Unidade, Sum(VALORCREDITO) VALORCREDITO, Sum(VALORDEBITO) VALORDEBITO FROM (                                                       ");  
		sql.append("   SELECT PLANO, UNIDADE, SUM(VALORCREDITO) VALORCREDITO, SUM(VALORDEBITO) VALORDEBITO FROM (                                                       ");  
		sql.append("   SELECT LANCAMENTO.DEBITOPLANO PLANO, CREDITOSCONTABILIZADOS.UNIDADE, 0 VALORCREDITO, VALOR VALORDEBITO                                           ");  
		sql.append("   FROM ASASIGA1.CREDITOSCONTABILIZADOS                                                                                                             ");  
		sql.append("   LEFT JOIN ASASIGA1.RECEBIMENTO                                                                                                                   ");  
		sql.append("   ON RECEBIMENTO.UNIDADE = CREDITOSCONTABILIZADOS.UNIDADE AND RECEBIMENTO.CONTARECEBER = CREDITOSCONTABILIZADOS.CONTARECEBER                       ");  
		sql.append("   INNER JOIN ASASIGA1.LANCAMENTO                                                                                                                   ");  
		sql.append("   ON LANCAMENTO.UNIDADEOWNER = CREDITOSCONTABILIZADOS.UNIDADE AND LANCAMENTO.ID = CREDITOSCONTABILIZADOS.LANCAMENTOCREDITO                         ");  
		sql.append("   WHERE RECEBIMENTO.DATABAIXA >= '01012015' AND RECEBIMENTO.DATABAIXA <= '31122015' AND RECEBIMENTO.DATAESTORNO IS NULL                            ");  
		sql.append("   ) GROUP BY plano, unidade                                                                                                                        ");  
		sql.append("   UNION                                                                                                                                            ");  
		sql.append("   SELECT PLANO, UNIDADE, SUM(VALORCREDITO) VALORCREDITO, SUM(VALORDEBITO) VALORDEBITO FROM (                                                       ");  
		sql.append("   SELECT LANCAMENTO.CREDITOPLANO PLANO,CREDITOSCONTABILIZADOS.UNIDADE, VALOR VALORCREDITO, 0 VALORDEBITO                                           ");  
		sql.append("   FROM ASASIGA1.CREDITOSCONTABILIZADOS                                                                                                             ");  
		sql.append("   LEFT JOIN ASASIGA1.RECEBIMENTO                                                                                                                   ");  
		sql.append("   ON RECEBIMENTO.UNIDADE = CREDITOSCONTABILIZADOS.UNIDADE AND RECEBIMENTO.CONTARECEBER = CREDITOSCONTABILIZADOS.CONTARECEBER                       ");  
		sql.append("   INNER JOIN ASASIGA1.LANCAMENTO                                                                                                                   ");  
		sql.append("   ON LANCAMENTO.UNIDADEOWNER = CREDITOSCONTABILIZADOS.UNIDADE AND LANCAMENTO.ID = CREDITOSCONTABILIZADOS.LANCAMENTOCREDITO                         ");  
		sql.append("   WHERE RECEBIMENTO.DATABAIXA >= '01012015'  AND RECEBIMENTO.DATABAIXA <= '31122015' AND RECEBIMENTO.DATAESTORNO IS NULL                           ");  
		sql.append("   ) GROUP BY plano, unidade                                                                                                                        ");  
		sql.append("   ) GROUP BY plano, unidade                                                                                                                        ");  
		sql.append("   UNION all                                                                                                                                        ");  
		sql.append("   SELECT Plano, Unidade, Sum(VALORCREDITO) VALORCREDITO, Sum(VALORDEBITO) VALORDEBITO FROM (                                                       ");  
		sql.append("   SELECT PLANO, UNIDADE, SUM(VALORCREDITO) VALORCREDITO, SUM(VALORDEBITO) VALORDEBITO FROM (                                                       ");  
		sql.append("   SELECT  S2.DEBITOPLANO PLANO,S2.UNIDADEOWNER Unidade, VALOR AS VALORCREDITO, 0 AS VALORDEBITO                                                    ");  
		sql.append("   FROM ASASIGA1.LANCAMENTO S2                                                                                                                      ");  
		sql.append("   WHERE S2.TIPO = '1' AND S2.DATA >= '01012015' AND S2.DATA <= '31122015' AND S2.DEBITOPLANO IS NOT NULL AND S2.CREDITOPLANO IS NOT NULL           ");  
		sql.append("   ) GROUP BY plano, unidade                                                                                                                        ");  
		sql.append("   UNION                                                                                                                                            ");  
		sql.append("   SELECT Plano, Unidade, Sum(VALORCREDITO) VALORCREDITO, Sum(VALORDEBITO) VALORDEBITO FROM (                                                       ");  
		sql.append("   SELECT  S2.CREDITOPLANO PLANO,S2.UNIDADEOWNER unidade, 0 AS VALORCREDITO, VALOR AS VALORDEBITO                                                   ");  
		sql.append("   FROM ASASIGA1.LANCAMENTO S2                                                                                                                      ");  
		sql.append("   WHERE S2.TIPO = '1' AND S2.DATA >= '01012015' AND S2.DATA <= '31122015' AND S2.DEBITOPLANO IS NOT NULL AND S2.CREDITOPLANO IS NOT NULL           ");  
		sql.append("   ) GROUP BY plano, unidade                                                                                                                        ");  
		sql.append("   ) GROUP BY plano, unidade                                                                                                                        ");  
		sql.append("   UNION ALL                                                                                                                                        ");  
		sql.append("   SELECT Plano, Unidade, Sum(VALORCREDITO) VALORCREDITO, Sum(VALORDEBITO) VALORDEBITO FROM (                                                       ");  
		sql.append("   SELECT PLANO, UNIDADE, SUM(VALORCREDITO) VALORCREDITO, SUM(VALORDEBITO) VALORDEBITO FROM (                                                       ");  
		sql.append("   SELECT DISTINCT TRANSACAOFINANCEIRA.DATA, TRANSACAOFINANCEIRA.ID LANCAMENTO, TRANSACAOFINANCEIRA.DOCUMENTO,                                      ");  
		sql.append("   LANCAMENTO.DEBITOPLANO PLANO, LANCAMENTO.UNIDADEOWNER UNIDADE,                                                                                   ");  
		sql.append("   TRANSACAOFINANCEIRA.NOME, CASE WHEN (TRANSACAOFINANCEIRA.OPERACAO = 1 OR TRANSACAOFINANCEIRA.OPERACAO = 8                                        ");  
		sql.append("   OR TRANSACAOFINANCEIRA.OPERACAO = 9 OR TRANSACAOFINANCEIRA.OPERACAO = 2) THEN  MONTANTE ELSE 0 END VALORCREDITO,                                 ");  
		sql.append("   CASE WHEN (TRANSACAOFINANCEIRA.OPERACAO = 1 OR TRANSACAOFINANCEIRA.OPERACAO = 8                                                                  ");  
		sql.append("   OR TRANSACAOFINANCEIRA.OPERACAO = 9 OR TRANSACAOFINANCEIRA.OPERACAO = 2) THEN  0 ELSE MONTANTE END VALORDEBITO                                   ");  
		sql.append("   FROM ASASIGA1.TRANSACAOFINANCEIRA                                                                                                                ");  
		sql.append("   INNER JOIN ASASIGA1.TRANSACAOCONTABILIZADA                                                                                                       ");  
		sql.append("   ON TRANSACAOCONTABILIZADA.TRANSACAOFINANCEIRA = TRANSACAOFINANCEIRA.ID  AND TRANSACAOCONTABILIZADA.CONTABANCO = TRANSACAOFINANCEIRA.CONTA        ");  
		sql.append("   INNER JOIN ASASIGA1.LANCAMENTO                                                                                                                   ");  
		sql.append("   ON LANCAMENTO.UNIDADEOWNER = TRANSACAOFINANCEIRA.UNIDADE AND LANCAMENTO.ID = TRANSACAOCONTABILIZADA.LANCAMENTOTRANSACAO                          ");  
		sql.append("   AND LANCAMENTO.DATA = TRANSACAOFINANCEIRA.DATA                                                                                                   ");  
		sql.append("   WHERE TRANSACAOFINANCEIRA.DATA >= '01012015'  AND TRANSACAOFINANCEIRA.DATA <= '31122015'                                                         ");  
		sql.append("   ) GROUP BY plano, unidade                                                                                                                        ");  
		sql.append("   UNION                                                                                                                                            ");  
		sql.append("   SELECT Plano, Unidade, Sum(VALORCREDITO) VALORCREDITO, Sum(VALORDEBITO) VALORDEBITO FROM (                                                       ");  
		sql.append("   SELECT DISTINCT TRANSACAOFINANCEIRA.DATA, TRANSACAOFINANCEIRA.ID LANCAMENTO, TRANSACAOFINANCEIRA.DOCUMENTO,  LANCAMENTO.CREDITOPLANO PLANO,      ");  
		sql.append("   LANCAMENTO.UNIDADEOWNER UNIDADE,                                                                                                                 ");  
		sql.append("   TRANSACAOFINANCEIRA.NOME, CASE WHEN (TRANSACAOFINANCEIRA.OPERACAO = 1 OR TRANSACAOFINANCEIRA.OPERACAO = 8                                        ");  
		sql.append("   OR TRANSACAOFINANCEIRA.OPERACAO = 9 OR TRANSACAOFINANCEIRA.OPERACAO = 2) THEN  0 ELSE MONTANTE END VALORCREDITO,                                 ");  
		sql.append("   CASE WHEN (TRANSACAOFINANCEIRA.OPERACAO = 1 OR TRANSACAOFINANCEIRA.OPERACAO = 8                                                                  ");  
		sql.append("   OR TRANSACAOFINANCEIRA.OPERACAO = 9 OR TRANSACAOFINANCEIRA.OPERACAO = 2) THEN  MONTANTE ELSE 0 END VALORDEBITO                                   ");  
		sql.append("   FROM ASASIGA1.TRANSACAOFINANCEIRA                                                                                                                ");  
		sql.append("   INNER JOIN ASASIGA1.TRANSACAOCONTABILIZADA                                                                                                       ");  
		sql.append("   ON TRANSACAOCONTABILIZADA.TRANSACAOFINANCEIRA = TRANSACAOFINANCEIRA.ID  AND TRANSACAOCONTABILIZADA.CONTABANCO = TRANSACAOFINANCEIRA.CONTA        ");  
		sql.append("   INNER JOIN ASASIGA1.LANCAMENTO                                                                                                                   ");  
		sql.append("   ON LANCAMENTO.UNIDADEOWNER = TRANSACAOFINANCEIRA.UNIDADE AND LANCAMENTO.ID = TRANSACAOCONTABILIZADA.LANCAMENTOTRANSACAO                          ");  
		sql.append("   AND LANCAMENTO.DATA = TRANSACAOFINANCEIRA.DATA                                                                                                   ");  
		sql.append("   WHERE TRANSACAOFINANCEIRA.DATA >= '01012015'  AND TRANSACAOFINANCEIRA.DATA <= '31122015'                                                         ");  
		sql.append("   ) GROUP BY plano, unidade                                                                                                                        ");  
		sql.append("   ) GROUP BY plano, unidade                                                                                                                        ");  
		sql.append("   ) GROUP BY plano, unidade                                                                                                                        ");  
		sql.append("   ) S4                                                                                                                                             ");  
		sql.append("   union all                                                                                                                                        ");  
		sql.append("   SELECT (Sum(valordebito) - Sum(VALORCREDITO))*(-1) saldoanterior, plano, 0, 0 FROM (                                                             ");  
		sql.append("   SELECT Plano, Unidade, Sum(VALORCREDITO) VALORCREDITO, Sum(VALORDEBITO) VALORDEBITO FROM (                                                       ");  
		sql.append("   SELECT S1.CREDITOPLANO Plano, S1.CREDITOUNIDADE Unidade, 0 AS ValorDebito, Sum(valor) AS ValorCredito                                            ");  
		sql.append("   FROM ASASIGA1.LANCAMENTO S1                                                                                                                      ");  
		sql.append("   WHERE S1.DATA >= '01011990' AND S1.DATA < '01012015' AND S1.CREDITOPLANO IS NOT NULL  AND S1.DEBITOPLANO IS NULL                                 ");  
		sql.append("   GROUP BY  S1.CREDITOUNIDADE, S1.DEBITOPLANO, S1.CREDITOPLANO                                                                                     ");  
		sql.append("   UNION ALL                                                                                                                                        ");  
		sql.append("   SELECT S2.DEBITOPLANO Plano, S2.DEBITOUNIDADE Unidade, Sum(valor) AS ValorDebito, 0 AS ValorCredito                                              ");  
		sql.append("   FROM ASASIGA1.LANCAMENTO S2                                                                                                                      ");  
		sql.append("   WHERE S2.DATA >= '01011990' AND S2.DATA < '01012015' AND S2.DEBITOPLANO IS NOT NULL AND S2.CREDITOPLANO IS NULL                                  ");  
		sql.append("   GROUP BY  S2.DEBITOUNIDADE, S2.DEBITOPLANO, S2.CREDITOPLANO                                                                                      ");  
		sql.append("   ) GROUP BY plano, unidade                                                                                                                        ");  
		sql.append("   UNION all                                                                                                                                        ");  
		sql.append("   SELECT Plano, Unidade, -Sum(VALORCREDITO) VALORCREDITO, -Sum(VALORDEBITO) VALORDEBITO FROM (                                                     ");  
		sql.append("   SELECT Plano, Unidade, Sum(VALORCREDITO) VALORCREDITO, Sum(VALORDEBITO) VALORDEBITO FROM (                                                       ");  
		sql.append("   SELECT Plano, Unidade, Sum(VALORCREDITO) VALORCREDITO, Sum(VALORDEBITO) VALORDEBITO FROM (                                                       ");  
		sql.append("   SELECT LANCAMENTO.DEBITOPLANO Plano, REGISTRODEBITOCONTABILIZADO.unidade, CONTAPAGARDETALHE.VALOR VALORCREDITO, 0 VALORDEBITO                    ");  
		sql.append("   FROM ASASIGA1.REGISTRODEBITOCONTABILIZADO                                                                                                        ");  
		sql.append("   LEFT JOIN ASASIGA1.PAGAMENTO                                                                                                                     ");  
		sql.append("   ON PAGAMENTO.UNIDADE = REGISTRODEBITOCONTABILIZADO.UNIDADE AND PAGAMENTO.CONTAPAGAR = REGISTRODEBITOCONTABILIZADO.CONTAPAGAR                     ");  
		sql.append("   INNER JOIN ASASIGA1.LANCAMENTO                                                                                                                   ");  
		sql.append("   ON LANCAMENTO.UNIDADEOWNER = REGISTRODEBITOCONTABILIZADO.UNIDADE AND LANCAMENTO.ID = REGISTRODEBITOCONTABILIZADO.LANCAMENTOCREDITO               ");  
		sql.append("   LEFT JOIN ASASIGA1.CONTAPAGARDETALHE                                                                                                             ");  
		sql.append("   ON CONTAPAGARDETALHE.UNIDADE = REGISTRODEBITOCONTABILIZADO.UNIDADE AND CONTAPAGARDETALHE.CONTAPAGAR = REGISTRODEBITOCONTABILIZADO.CONTAPAGAR     ");  
		sql.append("   AND CONTAPAGARDETALHE.ID = REGISTRODEBITOCONTABILIZADO.CONTAPAGARDETALHE                                                                         ");  
		sql.append("   WHERE PAGAMENTO.DATABAIXA >= '01011990' AND PAGAMENTO.DATABAIXA < '01012015' AND PAGAMENTO.DATAESTORNO IS NULL                                   ");  
		sql.append("   ) GROUP BY plano, unidade                                                                                                                        ");  
		sql.append("   UNION                                                                                                                                            ");  
		sql.append("   SELECT Plano, Unidade, Sum(VALORCREDITO) VALORCREDITO, Sum(VALORDEBITO) VALORDEBITO FROM (                                                       ");  
		sql.append("   SELECT LANCAMENTO.CREDITOPLANO Plano, REGISTRODEBITOCONTABILIZADO.UNIDADE, 0 VALORCREDITO, CONTAPAGARDETALHE.VALOR VALORDEBITO                   ");  
		sql.append("   FROM ASASIGA1.REGISTRODEBITOCONTABILIZADO                                                                                                        ");  
		sql.append("   LEFT JOIN ASASIGA1.PAGAMENTO                                                                                                                     ");  
		sql.append("   ON PAGAMENTO.UNIDADE = REGISTRODEBITOCONTABILIZADO.UNIDADE AND PAGAMENTO.CONTAPAGAR = REGISTRODEBITOCONTABILIZADO.CONTAPAGAR                     ");  
		sql.append("   INNER JOIN ASASIGA1.LANCAMENTO                                                                                                                   ");  
		sql.append("   ON LANCAMENTO.UNIDADEOWNER = REGISTRODEBITOCONTABILIZADO.UNIDADE AND LANCAMENTO.ID = REGISTRODEBITOCONTABILIZADO.LANCAMENTOCREDITO               ");  
		sql.append("   LEFT JOIN ASASIGA1.CONTAPAGARDETALHE                                                                                                             ");  
		sql.append("   ON CONTAPAGARDETALHE.UNIDADE = REGISTRODEBITOCONTABILIZADO.UNIDADE AND CONTAPAGARDETALHE.CONTAPAGAR = REGISTRODEBITOCONTABILIZADO.CONTAPAGAR     ");  
		sql.append("   AND CONTAPAGARDETALHE.ID = REGISTRODEBITOCONTABILIZADO.CONTAPAGARDETALHE                                                                         ");  
		sql.append("   WHERE PAGAMENTO.DATABAIXA >= '01011990' AND PAGAMENTO.DATABAIXA < '01012015' AND PAGAMENTO.DATAESTORNO IS NULL                                   ");  
		sql.append("   ) GROUP BY plano, unidade                                                                                                                        ");  
		sql.append("   ) GROUP BY plano, unidade                                                                                                                        ");  
		sql.append("   UNION all                                                                                                                                        ");  
		sql.append("   SELECT Plano, Unidade, Sum(VALORCREDITO) VALORCREDITO, Sum(VALORDEBITO) VALORDEBITO FROM (                                                       ");  
		sql.append("   SELECT Plano, Unidade, Sum(VALORCREDITO) VALORCREDITO, Sum(VALORDEBITO) VALORDEBITO FROM (                                                       ");  
		sql.append("   SELECT LANCAMENTO.DEBITOPLANO PLANO, DEBITOSCONTABILIZADOS.UNIDADE, CONTAPAGARDETALHE.VALOR VALORCREDITO, 0 VALORDEBITO                          ");  
		sql.append("   FROM ASASIGA1.DEBITOSCONTABILIZADOS                                                                                                              ");  
		sql.append("   LEFT JOIN ASASIGA1.PAGAMENTO                                                                                                                     ");  
		sql.append("   ON PAGAMENTO.UNIDADE = DEBITOSCONTABILIZADOS.UNIDADE AND PAGAMENTO.CONTAPAGAR = DEBITOSCONTABILIZADOS.CONTAPAGAR                                 ");  
		sql.append("   INNER JOIN ASASIGA1.LANCAMENTO                                                                                                                   ");  
		sql.append("   ON LANCAMENTO.UNIDADEOWNER = DEBITOSCONTABILIZADOS.UNIDADE AND LANCAMENTO.ID = DEBITOSCONTABILIZADOS.LANCAMENTOCREDITO                           ");  
		sql.append("   LEFT JOIN ASASIGA1.CONTAPAGARDETALHE                                                                                                             ");  
		sql.append("   ON CONTAPAGARDETALHE.UNIDADE = DEBITOSCONTABILIZADOS.UNIDADE AND CONTAPAGARDETALHE.CONTAPAGAR = DEBITOSCONTABILIZADOS.CONTAPAGAR                 ");  
		sql.append("   AND CONTAPAGARDETALHE.ID = DEBITOSCONTABILIZADOS.CONTAPAGARDETALHE                                                                               ");  
		sql.append("   WHERE PAGAMENTO.DATABAIXA >= '01011990' AND PAGAMENTO.DATABAIXA < '01012015' AND PAGAMENTO.DATAESTORNO IS NULL                                   ");  
		sql.append("   ) GROUP BY plano, unidade                                                                                                                        ");  
		sql.append("   UNION                                                                                                                                            ");  
		sql.append("   SELECT Plano, Unidade, Sum(VALORCREDITO) VALORCREDITO, Sum(VALORDEBITO) VALORDEBITO FROM (                                                       ");  
		sql.append("   SELECT LANCAMENTO.CREDITOPLANO PLANO, DEBITOSCONTABILIZADOS.UNIDADE,0 VALORCREDITO, CONTAPAGARDETALHE.VALOR VALORDEBITO                          ");  
		sql.append("   FROM ASASIGA1.DEBITOSCONTABILIZADOS                                                                                                              ");  
		sql.append("   LEFT JOIN ASASIGA1.PAGAMENTO                                                                                                                     ");  
		sql.append("   ON PAGAMENTO.UNIDADE = DEBITOSCONTABILIZADOS.UNIDADE AND PAGAMENTO.CONTAPAGAR = DEBITOSCONTABILIZADOS.CONTAPAGAR                                 ");  
		sql.append("   INNER JOIN ASASIGA1.LANCAMENTO                                                                                                                   ");  
		sql.append("   ON LANCAMENTO.UNIDADEOWNER = DEBITOSCONTABILIZADOS.UNIDADE AND LANCAMENTO.ID = DEBITOSCONTABILIZADOS.LANCAMENTOCREDITO                           ");  
		sql.append("   LEFT JOIN ASASIGA1.CONTAPAGARDETALHE                                                                                                             ");  
		sql.append("   ON CONTAPAGARDETALHE.UNIDADE = DEBITOSCONTABILIZADOS.UNIDADE AND CONTAPAGARDETALHE.CONTAPAGAR = DEBITOSCONTABILIZADOS.CONTAPAGAR                 ");  
		sql.append("   AND CONTAPAGARDETALHE.ID = DEBITOSCONTABILIZADOS.CONTAPAGARDETALHE                                                                               ");  
		sql.append("   WHERE PAGAMENTO.DATABAIXA >= '01011990' AND PAGAMENTO.DATABAIXA < '01012015' AND PAGAMENTO.DATAESTORNO IS NULL                                   ");  
		sql.append("   ) GROUP BY plano, unidade                                                                                                                        ");  
		sql.append("   ) GROUP BY plano, unidade                                                                                                                        ");  
		sql.append("   UNION all                                                                                                                                        ");  
		sql.append("   SELECT Plano, Unidade, Sum(VALORCREDITO) VALORCREDITO, Sum(VALORDEBITO) VALORDEBITO FROM (                                                       ");  
		sql.append("   SELECT Plano, Unidade, Sum(VALORCREDITO) VALORCREDITO, Sum(VALORDEBITO) VALORDEBITO FROM (                                                       ");  
		sql.append("   SELECT LANCAMENTO.DEBITOPLANO PLANO, REGISTROCREDITOCONTABILIZADO.UNIDADE, 0 VALORCREDITO, VALOR VALORDEBITO                                     ");  
		sql.append("   FROM ASASIGA1.REGISTROCREDITOCONTABILIZADO                                                                                                       ");  
		sql.append("   LEFT JOIN ASASIGA1.RECEBIMENTO                                                                                                                   ");  
		sql.append("   ON RECEBIMENTO.UNIDADE = REGISTROCREDITOCONTABILIZADO.UNIDADE AND RECEBIMENTO.CONTARECEBER = REGISTROCREDITOCONTABILIZADO.CONTARECEBER           ");  
		sql.append("   INNER JOIN ASASIGA1.LANCAMENTO                                                                                                                   ");  
		sql.append("   ON LANCAMENTO.UNIDADEOWNER = REGISTROCREDITOCONTABILIZADO.UNIDADE AND LANCAMENTO.ID = REGISTROCREDITOCONTABILIZADO.LANCAMENTOCREDITO             ");  
		sql.append("   WHERE RECEBIMENTO.DATABAIXA >= '01011990' AND RECEBIMENTO.DATABAIXA < '01012015' AND RECEBIMENTO.DATAESTORNO IS NULL                             ");  
		sql.append("   ) GROUP BY plano, unidade                                                                                                                        ");  
		sql.append("   UNION                                                                                                                                            ");  
		sql.append("   SELECT Plano, Unidade, Sum(VALORCREDITO) VALORCREDITO, Sum(VALORDEBITO) VALORDEBITO FROM (                                                       ");  
		sql.append("   SELECT LANCAMENTO.CREDITOPLANO PLANO, REGISTROCREDITOCONTABILIZADO.UNIDADE, VALOR VALORCREDITO, 0 VALORDEBITO                                    ");  
		sql.append("   FROM ASASIGA1.REGISTROCREDITOCONTABILIZADO                                                                                                       ");  
		sql.append("   LEFT JOIN ASASIGA1.RECEBIMENTO                                                                                                                   ");  
		sql.append("   ON RECEBIMENTO.UNIDADE = REGISTROCREDITOCONTABILIZADO.UNIDADE AND RECEBIMENTO.CONTARECEBER = REGISTROCREDITOCONTABILIZADO.CONTARECEBER           ");  
		sql.append("   INNER JOIN ASASIGA1.LANCAMENTO                                                                                                                   ");  
		sql.append("   ON LANCAMENTO.UNIDADEOWNER = REGISTROCREDITOCONTABILIZADO.UNIDADE AND LANCAMENTO.ID = REGISTROCREDITOCONTABILIZADO.LANCAMENTOCREDITO             ");  
		sql.append("   WHERE RECEBIMENTO.DATABAIXA >= '01011990' AND RECEBIMENTO.DATABAIXA < '01012015' AND RECEBIMENTO.DATAESTORNO IS NULL                             ");  
		sql.append("   ) GROUP BY plano, unidade                                                                                                                        ");  
		sql.append("   ) GROUP BY plano, unidade                                                                                                                        ");  
		sql.append("   UNION all                                                                                                                                        ");  
		sql.append("   SELECT Plano, Unidade, Sum(VALORCREDITO) VALORCREDITO, Sum(VALORDEBITO) VALORDEBITO FROM (                                                       ");  
		sql.append("   SELECT PLANO, UNIDADE, SUM(VALORCREDITO) VALORCREDITO, SUM(VALORDEBITO) VALORDEBITO FROM (                                                       ");  
		sql.append("   SELECT LANCAMENTO.DEBITOPLANO PLANO, CREDITOSCONTABILIZADOS.UNIDADE, 0 VALORCREDITO, VALOR VALORDEBITO                                           ");  
		sql.append("   FROM ASASIGA1.CREDITOSCONTABILIZADOS                                                                                                             ");  
		sql.append("   LEFT JOIN ASASIGA1.RECEBIMENTO                                                                                                                   ");  
		sql.append("   ON RECEBIMENTO.UNIDADE = CREDITOSCONTABILIZADOS.UNIDADE AND RECEBIMENTO.CONTARECEBER = CREDITOSCONTABILIZADOS.CONTARECEBER                       ");  
		sql.append("   INNER JOIN ASASIGA1.LANCAMENTO                                                                                                                   ");  
		sql.append("   ON LANCAMENTO.UNIDADEOWNER = CREDITOSCONTABILIZADOS.UNIDADE AND LANCAMENTO.ID = CREDITOSCONTABILIZADOS.LANCAMENTOCREDITO                         ");  
		sql.append("   WHERE RECEBIMENTO.DATABAIXA >= '01011990' AND RECEBIMENTO.DATABAIXA < '01012015' AND RECEBIMENTO.DATAESTORNO IS NULL                             ");  
		sql.append("   ) GROUP BY plano, unidade                                                                                                                        ");  
		sql.append("   UNION                                                                                                                                            ");  
		sql.append("   SELECT Plano, Unidade, Sum(VALORCREDITO) VALORCREDITO, Sum(VALORDEBITO) VALORDEBITO FROM (                                                       ");  
		sql.append("   SELECT LANCAMENTO.CREDITOPLANO PLANO,CREDITOSCONTABILIZADOS.UNIDADE, VALOR VALORCREDITO, 0 VALORDEBITO                                           ");  
		sql.append("   FROM ASASIGA1.CREDITOSCONTABILIZADOS                                                                                                             ");  
		sql.append("   LEFT JOIN ASASIGA1.RECEBIMENTO                                                                                                                   ");  
		sql.append("   ON RECEBIMENTO.UNIDADE = CREDITOSCONTABILIZADOS.UNIDADE AND RECEBIMENTO.CONTARECEBER = CREDITOSCONTABILIZADOS.CONTARECEBER                       ");  
		sql.append("   INNER JOIN ASASIGA1.LANCAMENTO                                                                                                                   ");  
		sql.append("   ON LANCAMENTO.UNIDADEOWNER = CREDITOSCONTABILIZADOS.UNIDADE AND LANCAMENTO.ID = CREDITOSCONTABILIZADOS.LANCAMENTOCREDITO                         ");  
		sql.append("   WHERE RECEBIMENTO.DATABAIXA >= '01011990' AND RECEBIMENTO.DATABAIXA < '01012015' AND RECEBIMENTO.DATAESTORNO IS NULL                             ");  
		sql.append("   ) GROUP BY plano, unidade                                                                                                                        ");  
		sql.append("   ) GROUP BY plano, unidade                                                                                                                        ");  
		sql.append("   UNION all                                                                                                                                        ");  
		sql.append("   SELECT Plano, Unidade, Sum(VALORCREDITO) VALORCREDITO, Sum(VALORDEBITO) VALORDEBITO FROM (                                                       ");  
		sql.append("   SELECT Plano, Unidade, Sum(VALORCREDITO) VALORCREDITO, Sum(VALORDEBITO) VALORDEBITO FROM (                                                       ");  
		sql.append("   SELECT  S2.DEBITOPLANO PLANO,S2.UNIDADEOWNER Unidade, VALOR AS VALORCREDITO, 0 AS VALORDEBITO                                                    ");  
		sql.append("   FROM ASASIGA1.LANCAMENTO S2                                                                                                                      ");  
		sql.append("   WHERE S2.TIPO = '1' AND S2.DATA >= '01011990' AND S2.DATA < '01012015' AND S2.DEBITOPLANO IS NOT NULL AND S2.CREDITOPLANO IS NOT NULL            ");  
		sql.append("   ) GROUP BY plano, unidade                                                                                                                        ");  
		sql.append("   UNION                                                                                                                                            ");  
		sql.append("   SELECT Plano, Unidade, Sum(VALORCREDITO) VALORCREDITO, Sum(VALORDEBITO) VALORDEBITO FROM (                                                       ");  
		sql.append("   SELECT  S2.CREDITOPLANO PLANO,S2.UNIDADEOWNER unidade, 0 AS VALORCREDITO, VALOR AS VALORDEBITO                                                   ");  
		sql.append("   FROM ASASIGA1.LANCAMENTO S2                                                                                                                      ");  
		sql.append("   WHERE S2.TIPO = '1' AND S2.DATA >= '01011990' AND S2.DATA < '01012015' AND DEBITOPLANO IS NOT NULL AND CREDITOPLANO IS NOT NULL                  ");  
		sql.append("   ) GROUP BY plano, unidade                                                                                                                        ");  
		sql.append("   ) GROUP BY plano, unidade                                                                                                                        ");  
		sql.append("   UNION ALL                                                                                                                                        ");  
		sql.append("   SELECT Plano, Unidade, Sum(VALORCREDITO) VALORCREDITO, Sum(VALORDEBITO) VALORDEBITO FROM (                                                       ");  
		sql.append("   SELECT Plano, Unidade, Sum(VALORCREDITO) VALORCREDITO, Sum(VALORDEBITO) VALORDEBITO FROM (                                                       ");  
		sql.append("   SELECT DISTINCT TRANSACAOFINANCEIRA.DATA, TRANSACAOFINANCEIRA.ID LANCAMENTO, TRANSACAOFINANCEIRA.DOCUMENTO, LANCAMENTO.DEBITOPLANO PLANO,        ");  
		sql.append("   LANCAMENTO.UNIDADEOWNER UNIDADE,                                                                                                                 ");  
		sql.append("   TRANSACAOFINANCEIRA.NOME, CASE WHEN (TRANSACAOFINANCEIRA.OPERACAO = 1 OR TRANSACAOFINANCEIRA.OPERACAO = 8                                        ");  
		sql.append("   OR TRANSACAOFINANCEIRA.OPERACAO = 9 OR TRANSACAOFINANCEIRA.OPERACAO = 2) THEN  MONTANTE ELSE 0 END VALORCREDITO,                                 ");  
		sql.append("   CASE WHEN (TRANSACAOFINANCEIRA.OPERACAO = 1 OR TRANSACAOFINANCEIRA.OPERACAO = 8                                                                  ");  
		sql.append("   OR TRANSACAOFINANCEIRA.OPERACAO = 9 OR TRANSACAOFINANCEIRA.OPERACAO = 2) THEN  0 ELSE MONTANTE END VALORDEBITO                                   ");  
		sql.append("   FROM ASASIGA1.TRANSACAOFINANCEIRA                                                                                                                ");  
		sql.append("   INNER JOIN ASASIGA1.TRANSACAOCONTABILIZADA                                                                                                       ");  
		sql.append("   ON TRANSACAOCONTABILIZADA.TRANSACAOFINANCEIRA = TRANSACAOFINANCEIRA.ID  AND TRANSACAOCONTABILIZADA.CONTABANCO = TRANSACAOFINANCEIRA.CONTA        ");  
		sql.append("   INNER JOIN ASASIGA1.LANCAMENTO                                                                                                                   ");  
		sql.append("   ON LANCAMENTO.UNIDADEOWNER = TRANSACAOFINANCEIRA.UNIDADE AND LANCAMENTO.ID = TRANSACAOCONTABILIZADA.LANCAMENTOTRANSACAO                          ");  
		sql.append("   AND LANCAMENTO.DATA = TRANSACAOFINANCEIRA.DATA                                                                                                   ");  
		sql.append("   WHERE TRANSACAOFINANCEIRA.DATA >= '01011990' AND TRANSACAOFINANCEIRA.DATA < '01012015'                                                           ");  
		sql.append("   ) GROUP BY plano, unidade                                                                                                                        ");  
		sql.append("   UNION                                                                                                                                            ");  
		sql.append("   SELECT Plano, Unidade, Sum(VALORCREDITO) VALORCREDITO, Sum(VALORDEBITO) VALORDEBITO FROM (                                                       ");  
		sql.append("   SELECT DISTINCT TRANSACAOFINANCEIRA.DATA, TRANSACAOFINANCEIRA.ID LANCAMENTO, TRANSACAOFINANCEIRA.DOCUMENTO,  LANCAMENTO.CREDITOPLANO PLANO,      ");  
		sql.append("   LANCAMENTO.UNIDADEOWNER UNIDADE, TRANSACAOFINANCEIRA.NOME, CASE WHEN (TRANSACAOFINANCEIRA.OPERACAO = 1 OR TRANSACAOFINANCEIRA.OPERACAO = 8       ");  
		sql.append("   OR TRANSACAOFINANCEIRA.OPERACAO = 9 OR TRANSACAOFINANCEIRA.OPERACAO = 2) THEN  0 ELSE MONTANTE END VALORCREDITO,                                 ");  
		sql.append("   CASE WHEN (TRANSACAOFINANCEIRA.OPERACAO = 1 OR TRANSACAOFINANCEIRA.OPERACAO = 8                                                                  ");  
		sql.append("   OR TRANSACAOFINANCEIRA.OPERACAO = 9 OR TRANSACAOFINANCEIRA.OPERACAO = 2) THEN  MONTANTE ELSE 0 END VALORDEBITO                                   ");  
		sql.append("   FROM ASASIGA1.TRANSACAOFINANCEIRA                                                                                                                ");  
		sql.append("   INNER JOIN ASASIGA1.TRANSACAOCONTABILIZADA                                                                                                       ");  
		sql.append("   ON TRANSACAOCONTABILIZADA.TRANSACAOFINANCEIRA = TRANSACAOFINANCEIRA.ID  AND TRANSACAOCONTABILIZADA.CONTABANCO = TRANSACAOFINANCEIRA.CONTA        ");  
		sql.append("   INNER JOIN ASASIGA1.LANCAMENTO                                                                                                                   ");  
		sql.append("   ON LANCAMENTO.UNIDADEOWNER = TRANSACAOFINANCEIRA.UNIDADE AND LANCAMENTO.ID = TRANSACAOCONTABILIZADA.LANCAMENTOTRANSACAO                          ");  
		sql.append("   AND LANCAMENTO.DATA = TRANSACAOFINANCEIRA.DATA                                                                                                   ");  
		sql.append("   WHERE TRANSACAOFINANCEIRA.DATA >= '01011990' AND TRANSACAOFINANCEIRA.DATA < '01012015'                                                           ");  
		sql.append("   ) GROUP BY plano, unidade                                                                                                                        ");  
		sql.append("   ) GROUP BY plano, unidade                                                                                                                        ");  
		sql.append("   ) GROUP BY plano, unidade                                                                                                                        ");  
		sql.append("   ) GROUP BY PLANO                                                                                                                                 ");  
		sql.append("   ) S3  )S5 GROUP BY plano) J10 ON J10.plano = CC.ID                                                                                               ");  
		sql.append("   where SUBSTR(CC.CLASSIFICADOR,1,1) IN (1,2,3)                                                                                                    ");  
		sql.append("   AND CLASSE = '0'                                                                                                                                 ");  
		sql.append("   )                                                                                                                                                ");  
		sql.append("   ORDER BY CLASSIFICADOR                                                                                                                           ");  
		
		return sql;
	}
	

	public static StringBuilder consultaRegistroJ053() {
		StringBuilder sql = new StringBuilder();
		
		sql.append(" SELECT                                       ");
		sql.append(" 	ID AS CODIGO_IDENTIFICACAO,               ");
		sql.append(" 	CLASSIFICADOR AS CODIGO_SUBCONTA_CORRELATA");
		sql.append(" FROM                                         ");
		sql.append(" 	ASASIGA1.CONTACONTABIL                    ");
		sql.append(" WHERE                                        ");
		sql.append(" 	CLASSIFICADOR BETWEEN '1.2.03.02'         ");
		sql.append(" 	AND '1.2.03.03'                           ");
		sql.append(" 	AND CLASSE = 0;                           ");
		
		return sql;
	}
}
