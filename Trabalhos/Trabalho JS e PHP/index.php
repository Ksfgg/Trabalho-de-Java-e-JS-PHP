<html>
    <head>
        <title>Cadastror</title>
        <style>
           *{
               padding:0;
               margin:0;
               font-family:'roboto';
           }
           form{
               width:400px;
               margin:0 auto;
           }
           legend{
               text-align:center;
               font-size:30px;
               font-weight:bold;
               color:red;
           }
           fieldset{
               border:3px solid green;
               padding:10px;
           }
           input{
               width:100%;
               padding:7px;
               margin-top:5px;
               font-size:16px;
               outline:0;
               font-weight:bold;
               border-radius:2px;
               border:1.5px solid #000;
               background-color:rgba(190,355,0,0.6);
           }
           input:focus{
               border:1.5px solid red;
               background-color:lightblue;
           }
           input[type="submit"]{
               background-color:blue;
               color:#fff;
               border:0;
               width:50%;
               margin-left:25%;
               font-size:20px;

           }
           input[type="submit"]:hover{
               background-color:green;
               color:black;
           }
           
        </style>
    </head>
    <body>
        <form action="index.php" method="POST" autocomplete="off">
           <fieldset>
              <legend>Cadastro</legend>
              <input type="text" name="NDJ" placeholder="Digite o nome do jogos" required><br>
              <input type="text" name="NDE" placeholder="Digite o da sua empresa" required><br>
              <input type="text" name="G" placeholder="Digite o gênero do jogo" required><br>
              <input type="text" name="T" placeholder="Digite o tipo" required><br>
              <input type="text" name="P" placeholder="Digite sua plataforma" required><br>
              <input type="submit" name="enviar" value="Cadastrar">
           </fieldset>
        </form>
        <?php
          include_once "conexao.php";
          if(isset($_POST['enviar'])){
              $NDJ = $_POST['NDJ'];
              $NDE = $_POST['NDE'];
              $G = $_POST['G'];
              $T = $_POST['T'];
              $P = $_POST['P'];
              mysqli_query($con,"INSERT INTO funcionario (NDJ, NDE, G ,T ,P)VALUES('$NDJ', '$NDE', '$G', '$T','$P')");
              mysqli_close($con);
              header('location:listar.php'); 
          }
        ?>
        
    </body>
</html>