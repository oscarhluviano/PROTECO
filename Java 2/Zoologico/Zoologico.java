import java.util.Scanner;
/*Tarea semana dos
*@author Oscar Hernandez Luviano
*Zoologico en el cual se implementan las clases herviboro y carnivoro
*se tiene una clase padre llamada Zoologico
*/
public class Zoologico implements Herviboro, Carnivoro{

	public void comida(String comida){
		System.out.println("Comida: "+comida);
	}

	public void cfav(String cfav){
		System.out.println("Comida favorita: "+cfav);
	}


	public void juego(String juego){
		System.out.println("Este animal juega: "+ juego);
	}

	public void tipo(int tipo){
		if(tipo == 0){
			System.out.println("Tipo: Carnivoro");
		}else System.out.println("Tipo: Herviboro");
	}

	public static void main(String[] args) {
		Zoologico antilope=new Zoologico();
		Zoologico cebra=new Zoologico();
		Zoologico leon=new Zoologico();
		Zoologico tigre=new Zoologico();

		Scanner sc = new Scanner(System.in);
		boolean x = true;

		while(x){
			System.out.println("\n\t\tBienvenido al Zoologico\n");
			System.out.println("\tLos animales con lo que contamos son:\n");
			System.out.println("1.- Cebra");
			System.out.println("2.- Antilope");
			System.out.println("3.- Trigre");
			System.out.println("4.- Leon");
			System.out.println("5.- Salir");

			System.out.println("\nSelecciones el animal del cual desea la informacion");
			int men = sc.nextInt();
			System.out.println("\n");
			switch(men){
				case 1:
				int  tipo = 1;
				String comida = "Hierbas";
				String cfav = "Mota";
				String juego = "con otra cebra";
				cebra.tipo(tipo);
				cebra.comida(comida);
				cebra.cfav(cfav);
				cebra.juego(juego);
				break;

				case 2:
				tipo = 1;
				comida = "Hierbas";
				cfav = "Mota de la buena";
				juego = "a revolcarse en el pasto";
				antilope.tipo(tipo);
				antilope.comida(comida);
				antilope.cfav(cfav);
				antilope.juego(juego);
				break;

				case 3:
				tipo = 0;
				comida = "Carne";
				cfav = "Carne de la buena";
				juego = "a comer animales";
				tigre.tipo(tipo);
				tigre.comida(comida);
				tigre.cfav(cfav);
				tigre.juego(juego);
				break;

				case 4:
				tipo = 0;
				comida = "carne poderosa";
				cfav = "carne de la buena poderosa";
				juego = "comer animales veloces";
				leon.tipo(tipo);
				leon.comida(comida);
				leon.cfav(cfav);
				leon.juego(juego);
				break;

				case 5:
				System.out.println("\tHasta luego!"); 
				x = false;
			}
			
		}
	}


}