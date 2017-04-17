<?php 
require('conexion.php');

 	 $user=$_POST['user'];
 	 $pass=$_POST['pass'];
 	 $rpass=$_POST['rpass'];

 	 $nombre=$_POST['nombre']; 	  	 
 	 $correo=$_POST['correo'];
 	 $sexo=$_POST['sexo'];

 	$insertar_tupla= mysqli_query($conexion,"INSERT INTO `usuarios` (`id`, `username`, `password`, `tipo`) VALUES (NULL,'$user', '$pass', '2')");

 	$datos=mysqli_query($conexion,"INSERT INTO `datos` (`id`, `nombre`, `correo`, `sexo`, `tipo`, `username`) VALUES (NULL,'$nombre','$correo', '$sexo', '2', `$user`)");

 	if (empty($_POST['nombre']) || empty($_POST['pass']) || empty($_POST['rpass'])|| empty($_POST['user'])|| empty($_POST['correo'])|| empty($_POST['sexo'])){
 	 	echo "Te hacen falta datos";
 	 }elseif ($pass == $rpass) {
 	 if ((query($insertar_tupla) && query($datos)) === TRUE) {
    			header("Location: index.html");
	} else {
    echo "Error: " . $insertar_tupla . "<br>" . $datos. "<br>" . $conexion->error;
	}
 	}else{
 	 	echo "La contraseña no es la misma";
 	 }
?>