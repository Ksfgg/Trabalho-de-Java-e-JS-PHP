<?php
	include_once "conexao.php";
	
	$r= mysqli_query($con,"SELECT * FROM funcionario");
?>

<html>
<head>
	<title></title>
	<style>
		#box{
			display: none;
			width: 300px;
			height: 200px;
			background-color: red;

		}
	</style>
</head>
<body>
 <table border="1px">
 	<tr>
 		<td>Id</td>
 		<td>Nome do jogo</td>
 		<td>Nome da empresa</td>
 		<td>Gênero</td>
 		<td>Tipo</td>
 		<td>Plataforma</td>
 		<td>Ações</td>	
 	</tr>
 	<?php while($linhas = mysqli_fetch_assoc($r)) { 
 		$ID = $linhas['ID'];
 		$NDJ= $linhas['NDJ'];
 		$NDE=$linhas['NDE'];
 		$G=$linhas['G'];
 		$T=$linhas['T'];
 		$P=$linhas['P'];
 		?>
 	<tr>
 		<td><?php echo $ID; ?></td>
 		<td><?php echo $NDJ; ?></td>
 		<td><?php echo $NDE; ?></td>
 		<td><?php echo $G; ?></td>
 		<td><?php echo $T; ?></td>
 		<td><?php echo $P; ?></td>
 		<td>
 			<a href="editar.php?ID=<?php echo $ID; ?>">Editar</a>
 			<a href="excluir.php?ID=<?php echo $ID; ?>">Excluir</a>
 		</td>

 	</tr>
 	<?php } ?>
 </table>
</body>
</html>