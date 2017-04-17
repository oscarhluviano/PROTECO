<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="UTF-8">
		<title>Inventario</title>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="css/estilos.css">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	</head>
	<body>
		<nav class="navbar navbar-inverse">
			<div class="container-fluid">
				<div class="navbar-header">
					<a class="navbar-brand" href="admin.php">CarCustom</a>
				</div>
				<ul class="nav navbar-nav">
					<li class="active"><a href="admin.php">Home</a></li>
					<li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="Accesorios.html">Acciones<span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="delet.php">Borrar</a></li>
						<li><a href="add.php">Agregar</a></li>
						<li><a href="invadmin.php">Inventario</a></li>
						<li><a href="usuarios.php">Usuarios</a></li>
					</ul>
				</li>
				<li><a href="faqadmin.html">FAQ</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="datos.php"><span class="glyphicon glyphicon-user"></span>Perfil</a></li>
				<li><a href="logout.php"><span class="glyphicon glyphicon-log-in"></span> Logout</a></li>
			</ul>
		</div>
	</nav>
		<div>
			<table class="table">
				<thead>
				<tr>
					<th>ID</th>
					<th>Nombre</th>
					<th>Descripción</th>
				</tr>
				</thead>
				<tbody>
				<?php
				$servername = "localhost";
				$username = "root";
				$password = "";
				$dbname = "p1";
				// Create connection
				$conn = new mysqli($servername, $username, $password, $dbname);
				$sql = "SELECT id_i, nombre, descripcion FROM inventario";
				$result = $conn->query($sql);
				if ($result->num_rows > 0) {
				// output data of each row
				while($row = $result->fetch_assoc()) {
				echo "<tr>";
					echo "<td>".$row["id_i"]."</td>";
					echo "<td>".$row["nombre"]."</td>";
					echo "<td>".$row["descripcion"]."</td>";
				echo "</tr>";
				}}else {
				echo "0 results";
				}
				$conn->close();
				?>
				</tbody>
			</table>
		</div>
	</body>
</html>