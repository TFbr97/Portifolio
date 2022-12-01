
<?php
	  include_once '../banco/conexao.php';
  	$conectar = getConnection();
?>



<!DOCTYPE html>
<html> 
 	<head>
 		<title> DASHBOARD </title>  
 	    <meta charset="utf-8">
       <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"></script>

 	<style>
	body {
		background-image: url("logo1.jpg");
		font-family: 'Gill Sans', 'Gill Sans MT', Calibri, 'Trebuchet MS', sans-serif;
		background-repeat: no-repeat;
		background-size: cover;
	}

	#caixaitem{
		
    background-color: whitesmoke;
		opacity: 80%;
		height: 50%;
    padding-bottom: 20px;
    margin-top: 4%;
    margin-bottom: 2%;
		border-radius: 25px;

	}
	h2{
		font-size: 30px;
		padding-top: 20px;
	}

  .capa{

    width: 15%;

  }

  .relatorio{
    width: 10%;

  }

  .lixeira{
    width: 20px;
    height: 25px;
  }

  nav{
    
    margin-top: 2%;
  }
  ul{
		list-style-type: none;
		margin: 0;
		padding: 0;
		overflow: hidden;
		background-color:rgb(56, 92, 197);
	}

	li{
		float: left;
	}

	li a{
		display: block;
		color: white;
		text-align: center;
		padding: 14px 16px;
		text-decoration: none;
	}

	li a:hover {
		background-color: rgb(3, 20, 71);
		color: white;
		
	}

	</style>
    
	</head>

<body>


  <nav class="container-fluid pt-2">
    
		<ul> 
	
		<li><a href="tela_cadastro.html"><strong> CADASTRO </strong> </a></li>  
		<li><a href="tela_listagem.php"><strong> LISTAGEM </strong></a></li> 
		<li><a href="tela_atualizacao.html"><strong> ATUALIZAÇÃO </strong></a></li>
		  
	
		</ul>
	
	</nav>

<?php 

$dados = filter_input_array(INPUT_GET, FILTER_DEFAULT);

?>

<form class="m-3" action="tela_listagem.php" method="GET">

  <center><p>
    <input type="text" name="login_usuario" placeholder="Pesquisar Item" id="input_pesquisa">
      <input class="btn btn-primary" type="submit" value="Pesquisar">
  </p></center>
</form>



<center>

<div class= "col-md-6" id= "caixaitem">
  <h2> DASHBOARD </h2>


  <?php

        $pesquisa = $dados['login_usuario'] . "%";
          
        $sql = "SELECT id_item, edicao, ano, nome_hq, autor, ilust, editora, imagem, endereco FROM item WHERE nome_hq LIKE :nome_hq ORDER BY id_item";

        
        $consulta = $conectar->prepare($sql);
        $consulta -> bindParam(':nome_hq', $pesquisa, PDO::PARAM_STR);
        $consulta->execute();
        if (!$consulta) {
          die("Erro no Banco!");
        }
        
        
        echo '<table class="table table-hover p-5">';
        echo "<thead>";
        echo "<tr>";
        echo "<th><center> ID </center></th>";
        echo "<th><center> Edição </center></th>";
        echo "<th><center> Ano </center></th>";
        echo "<th><center> Nome </center></th>";
        echo "<th><center> Autor </center></th>";
        echo "<th><center> Ilustrador </center></th>";
        echo "<th><center> Editora </center></th>";
        echo "<th><center> Capa </center></th>";
        echo "</thead>";
        echo "<tbody>";

        while ($exibir = $consulta->fetch(PDO::FETCH_ASSOC)) {
            echo "<tr>";
            echo "<th><center>" . $exibir['id_item'] . "</center></th>";
            echo "<td><center>" . $exibir['edicao'] . "</center></td>";
            echo "<td><center>" . $exibir['ano'] . "</center></td>";
            echo "<td><center>" . $exibir['nome_hq'] . "</center></td>";
            echo "<td><center>" . $exibir['autor'] . "</center></td>";
            echo "<td><center>" . $exibir['ilust'] . "</center></td>";
            echo "<td><center>" . $exibir['editora'] . "</center></td>";

            $ext = pathinfo($exibir['imagem'],PATHINFO_EXTENSION);

            if (($ext == 'png') || ($ext == 'jpg') || ($ext == 'jpeg') || ($ext == 'jfif')) {
              echo "<td><center> <img class='capa' src='../uploads/" . $exibir['imagem'] . "'> </center></td>";
            }

            echo "<td><center> <a href='../uploads/" . $exibir["endereco"] . "' download> <img class='lixeira' src='download.png'> </a> </center></td>";

          ?>

        <td>
          <center>

          <a href="<?php echo "../model/deletar.php?id={$exibir['id_item']}"; ?>">
            <img class="lixeira" src="lixeira.png" name="id_deletar">
          </a>
          
          </center>
        </td>

      <?php
            echo "</tr>";
          }
          
          echo "</tbody>";        
          echo "</table>";

          ?>
  </div>

  <h2>Relatório de Produtos</h2>

  <a  href="gerar_pdf.php" name="relatorio">
            <img class="relatorio" src="pdf.png">
  </a>

</center>


</body>

</html>
