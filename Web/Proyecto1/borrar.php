<?php 
	require('conexion.php');

	// hacer la query

 		$id=$_POST['id'];
        $consulta ="DELETE FROM `inventario` WHERE id_i='$id'";
        // echo $consulta;
        // ejecutar la query
        $hoa= mysqli_query($conexion,$consulta);
        header("Location: delet.php");
        // redireccionar

?>