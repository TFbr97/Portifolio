<?php
	
    include_once '../banco/conexao.php';
  	$conectar = getConnection();
?>

<?php

	if(isset($_POST['editar'])){
     $id = $_POST['recebe_id'];
    

 $pesquisa = "SELECT imagem FROM item WHERE id_item=:id";
 $resultado =  $conectar->prepare($pesquisa);
 $resultado->bindParam(':id', $id, PDO:: PARAM_INT);
 $resultado->execute();

 if (($resultado) and ($resultado->rowCount() != 0)) {
    $exibir = $resultado->fetch(PDO::FETCH_ASSOC);
 }
    
    $nome_hq = $_POST["editar_nomeHQ"];
    $edicao = $_POST["editar_edicao"];
    $ano = $_POST["editar_ano"];
    $autor = $_POST["editar_autor"];
    $ilust = $_POST["editar_ilust"];
    $editora = $_POST["editar_editora"];
    $nome_arquivo=$_FILES['enviar_arquivo']['name'];
    $tmp_arquivo=$_FILES['enviar_arquivo']['tmp_name'];


    $diretorio = '../uploads/';
    $endereco = $diretorio . $nome_arquivo;




    if( empty($nome_hq) || empty($edicao) || empty($id) || empty($ano) || empty($autor) || empty($ilust) || empty($editora) ) {
        if(empty($nome_hq)) {
            echo "<font color='red'>Campo Login Obrigatorio.</font><br/>";
        }

        if(empty($edicao)) {
            echo "<font color='red'>Campo Senha Obrigatorio.</font><br/>";

        }   
        
        if(empty($nome_arquivo)) {
            echo "<font color='red'>novo arquivo .  Obrigatorio.</font><br/>";
            }    
        
        if(empty($ano)) {
                echo "<font color='red'>novo arquivo .  Obrigatorio.</font><br/>";
            }
        
        if(empty($autor)) {
                echo "<font color='red'>novo arquivo .  Obrigatorio.</font><br/>";
            }
        
        if(empty($ilust)) {
                echo "<font color='red'>novo arquivo .  Obrigatorio.</font><br/>";
            }
        
        if(empty($editora)) {
                echo "<font color='red'>novo arquivo .  Obrigatorio.</font><br/>";
            }

    } else {

        $sql = "UPDATE item SET nome_hq = :nome_hq, edicao = :edicao, ano = :ano, autor = :autor, ilust = :ilust, editora = :editora, imagem = :imagem , endereco = :endereco WHERE id_item = :id";

        $query = $conectar->prepare($sql);

        $query->bindparam(':id', $id);
        $query->bindparam(':nome_hq', $nome_hq);
        $query->bindparam(':edicao', $edicao);
        $query->bindparam(':ano', $ano);
        $query->bindparam(':autor', $autor);
        $query->bindparam(':ilust', $ilust);
        $query->bindparam(':editora', $editora);
          
        
        $query->bindparam(':imagem', $nome_arquivo);
        $query->bindparam(':endereco', $endereco);


        if ($query->execute()){

            if(move_uploaded_file($_FILES['enviar_arquivo']['tmp_name'], $diretorio . $nome_arquivo)){
                $arquivo_anterior = "../uploads/" . $exibir['imagem'];
                if(file_exists($arquivo_anterior)){
                    unlink($arquivo_anterior);
                }
            }
        
            header('Location: ../view/tela_listagem.php');

        }else {
     
      
            echo "<p style='color: #f00;'>Erro: usuario não editado com sucesso!</p>";
            print_r($query->errorInfo());
        }

    }
}
?>
