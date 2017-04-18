<?php
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "p1";

$nombre=$_POST['nombre'];
$descripcion=$_POST['descripcion'];

// Create connection
$conn = new mysqli($servername, $username, $password, $dbname);
// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
} 

$sql = "INSERT INTO inventario (nombre, descripcion)
VALUES ('$nombre', '$descripcion')";

if ($conn->query($sql) === TRUE) {
    echo "Se agrego con exito";
    header("Location: add.php");
} else {
    echo "Error: " . $sql . "<br>" . $conn->error;
}

$conn->close();
?>