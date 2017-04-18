<?php 
include ('conexion.php');
require('conexion.php');

 	 $user=$_POST['user'];
 	 $pass=$_POST['pass'];
 	 $rpass=$_POST['rpass'];

 	 $nombre=$_POST['nombre']; 	  	 
 	 $correo=$_POST['correo'];
 	 $sexo=$_POST['sexo'];

 	

 	if (empty($_POST['nombre']) || empty($_POST['pass']) || empty($_POST['rpass'])|| empty($_POST['user'])|| empty($_POST['correo'])|| empty($_POST['sexo'])){
 	 	echo '<script language="javascript">alert("Te hacen falta datos");</script>';
 	 }elseif ($pass == $rpass) {
 	 	$last_id = $conexion->insert_id;
		$insertar_tupla= mysqli_query($conexion,"INSERT INTO usuarios (`username`, `password`, `tipo`) VALUES ('$user', '$pass', 2)");

 		$datos=mysqli_query($conexion,"INSERT INTO datos (`nombre`, `correo`, `sexo`, `tipo`, `username`) VALUES ('$nombre','$correo', '$sexo', 2, '$user')"); 	 	

 		mysqli_close($conexion);

 	if (($insertar_tupla && $datos) == NULL) {
 		echo '<script language="javascript">alert("Error al insertar datos");</script>';
 		header('Location: registro.html');
 	}else{
 		echo '<script language="javascript">alert("Usuario correctamente registrado");</script>';
			header('Location: index.html');
 	}
 	}else{
 	 	echo "La contraseña no es la misma";
 	 }
?>


