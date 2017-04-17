<?php 
	require('conexion.php');

	// hacer la query

 		$id=$_GET['id'];
 		var_dump($id);
        $consulta ="DELETE FROM `inventario` WHERE id_i=$id";
        // echo $consulta;
        // ejecutar la query
        $hoa= mysqli_query($conexion,$consulta);
        var_dump($hoa);
        // redireccionar

?>