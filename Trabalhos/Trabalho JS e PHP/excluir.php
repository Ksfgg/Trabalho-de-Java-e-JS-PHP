<?php
	include_once('conexao.php');
	$ID = $_GET['ID'];
	$u = mysqli_query($con,"DELETE FROM funcionario WHERE ID=$ID");
	if ($u){
		header('location:listar.php');
	}
?>