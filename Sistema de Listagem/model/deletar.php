
<?php
	include '../banco/conexao.php';
	$conectar = getConnection();
?>

<?php
	// pega o ID da URL
	$id = $_GET["id"];
	 
	$sql = "SELECT imagem FROM item WHERE id_item=:id";
	$consulta = $conectar->prepare($sql);
	$consulta->bindParam(':id', $id);
	$consulta->execute();

	$num_linhas=$consulta->rowCount();

	if ($num_linhas != 0) {
		$sql_deleta = "DELETE FROM item WHERE id_item = :id";
    $remove_usuario = $conectar->prepare($sql_deleta);
    $remove_usuario->bindParam(':id', $id, PDO::PARAM_INT);
     
    if ($remove_usuario->execute()){ 
        $dados_usuario = $consulta->fetch(PDO::FETCH_ASSOC);
		
		if (!empty($dados_usuario['imagem'])){
            $arquivo = $dados_usuario['imagem'];
            $imagem = "../uploads/".$arquivo;

            if (file_exists($imagem)) {
                unlink($imagem);
            }

        }

            header('Location: ../view/tela_listagem.php');
    } else {
            echo "Erro ao remover";
            print_r(errorInfo());
		}       
	} else {
		echo "Erro ao remover";
		print_r(errorInfo());

}

?>
