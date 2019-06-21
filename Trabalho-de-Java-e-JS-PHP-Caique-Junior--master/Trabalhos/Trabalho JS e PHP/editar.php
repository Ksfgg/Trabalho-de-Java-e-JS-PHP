<?php
	include_once('conexao.php');
	$ID=$_GET['ID'];
		
?>
<!DOCTYPE html>
<html>
<head>
	<title>Editar</title>
</head>
<body>
	<form method="POST">


		<input type="text" name="NDJ" id="NDJ" required placeholder="Digite o novo nome do jogo"><br>
		<input type="text" name="NDE" id="NDE" required placeholder="Digite a nova empresa"><br>
		<input type="text" name="G" id="G" required placeholder="Digite o novo gênero"><br>
		<input type="text" name="T" id="T" required><br>
		<input type="text" name="P" id="P" required><br>
		<input type="submit" name="alterar" value="alterar">
		<?php
			if (isset($_POST['alterar'])) {
				$NDJ =$_POST['NDJ'];
				$NDE =$_POST['NDE'];
				$G =$_POST['G'];
				$T =$_POST['T'];
				$P =$_POST['P'];
				mysqli_query($con,"UPDATE funcionario SET NDJ='$NDJ',NDE='$NDE',G='$G',T='$T',P='$P' WHERE ID='$ID' ");
				header('location:listar.php');
				}
		  ?>
		</form>
</body>
</html>