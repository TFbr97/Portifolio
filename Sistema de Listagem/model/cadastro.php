
<?php
  include '../banco/conexao.php';
  $conectar = getConnection();
?>

<?php

if ($_POST['enviar']) {

    $nome_hq = $_POST["nome_hq"];
    $edicao = $_POST["edicao"];
    $ano = $_POST["ano"];
    $autor = $_POST["autor"];
    $ilust = $_POST["ilust"];
    $editora = $_POST["editora"];
    $nome_imagem = $_FILES["enviar_arquivo"]["name"];

    $diretorio = "../uploads/";
    $endereco = $diretorio . $nome_imagem;


    $sql = 'INSERT INTO item (edicao, ano, nome_hq, autor, ilust, editora, imagem, endereco) 
    VALUES (:edicao, :ano, :nome_hq, :autor, :ilust, :editora, :imagem, :endereco)';


    $consulta = $conectar->prepare($sql);
    $consulta->bindParam(':nome_hq', $nome_hq);
    $consulta->bindParam(':edicao', $edicao);
    $consulta->bindParam(':ano', $ano);
    $consulta->bindParam(':autor', $autor);
    $consulta->bindParam(':ilust', $ilust);
    $consulta->bindParam(':editora', $editora);
    $consulta->bindParam(':imagem', $nome_imagem);    
    $consulta->bindParam(':endereco', $endereco);

    if($consulta->execute()){

        if(move_uploaded_file($_FILES['enviar_arquivo']['tmp_name'], $diretorio.$nome_imagem)){
            header("Location: ../view/tela_listagem.php");
        }else{
            header("Location: ../view/tela_listagem.php");
        }        
    } 
    
        else {
        
        header("Location: ../view/tela_listagem.php");
    }
} 
        else {
    header("Location: ../view/tela_listagem.php");
    }
?>

