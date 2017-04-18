import java.util.Scanner;
import java.lang.*;
/* tarea de la semana dos para resolver polinomiso de segundo grado con excepciones
*@author Oscar Hernandez Luviano
*/
public class CPolinomio extends Exception{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// el usuario ingresara los valores 
		System.out.println("Ingresar valores a b c");

		String val = sc.nextLine();
		String[] numeros = val.split(" "); 
		int a = Integer.parseInt(numeros[0]); //en donde se almacenaran las varibales de tipo entero 
		int b = Integer.parseInt(numeros[1]);
		int c = Integer.parseInt(numeros[2]);

		try{

		        if(a == 0 || b == 0 || c == 0){
		        	throw new MyException();
		        }		    
	        }catch(MyException me){
	        	me.Grado();
	        }
		
	    try{

			int d = (b*b)-(4*a*c);

		    double x1 = (-b + Math.sqrt(d))/(2*a); // obtencion de x1
		    double x2 = (-b - Math.sqrt(d))/(2*a); // obtencion de x2

		    //@return Valores del polinomio 
		    System.out.println("X1= "+x1 +" X2= "+ x2);
		    
			if(d < 0){
				throw new MyException();
			}
	    }catch(MyException me){
	    	me.Imaginario();
	    }
	}

}
