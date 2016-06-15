
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SPED | Asa Brasil</title>
<meta charset="UTF-8">

<link rel="stylesheet" href="css/bootstrap.min.css">
<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
</head>

<body>

<br />
	<div class="container">
<h2>SPED</h2>
<h4>Gerador de Layout</h4> <br />		

		
		<form action="executa" method="POST" class="form-horizontal" role="form">

		<!--  	<div class="form-group">
              <label for="DT_INI">Data do Início do Período:</label> <br />
              <input type="text" class="form-control" id="DT_INI" name="DT_INI"  placeholder="00/00/0000" maxlength="10" onkeyup="insereMascaraDt(this)">
           </div>
		
			<div class="form-group">
              <label for="DT_FIN">Data do Fim do Período:</label> <br />
              <input type="text" class="form-control" id="DT_FIN" name="DT_FIN"  placeholder="00/00/0000" maxlength="10"  onkeyup="insereMascaraDt(this)" >
           </div>
		-->
		     <input type="submit" value="Gerar" class="btn btn-primary" />
           <!--      <input type="reset" value="Limpar" class="btn btn-danger" /> -->
		</form>
		
	</div>
	
	  <script type="text/javascript">

                function insereMascaraDt(campoDt) {
                    var dt = campoDt.value;
                    var idCampo =  campoDt.id;
                    if (dt.length == 2 || dt.length == 5) {
                        dt = dt + '/';
                    }
                    document.getElementById(idCampo).value = dt;
                    return true;
                }

            </script>
    
</body>
</html>