import java.util.Scanner; 
import java.math.*; 
public class CComp{ 
	public static void main (String[] args) { 
		Scanner ins = new Scanner(System.in); 
		int a,b, c, d, e, f, g, h, i, j, k, l; 
		int m, n, o; 
		double p, q;
		int men;
		System.out.print("ingresar no real 1: " ) ; 
		a=ins.nextInt(); 
		System.out.print("ingresar no imaginario 1: " ) ; 
		b=ins.nextInt(); 
		System.out.print("ingresar no real 2: " ) ; 
		c=ins.nextInt(); 
		System.out.print("ingresar no imaginario 2: " ) ; 
		d=ins.nextInt(); 
		System.out.println("1. suma");
		System.out.println("2. resta");
		System.out.println("3. multiplicacion");
		System.out.println("4. division");

		System.out.println("ingrese opcion del menu: ");
		men = ins.nextInt();
		switch (men) {
			case 1:
				e=a+c; 
				f=b+d;
				System.out.println("Real= "+e);
				System.out.println("imaginario= "+f);
				break;
			case 2:
				e=a-c; 
				f=b-d;
				System.out.println("Real= "+e);
				System.out.println("imaginario= "+f);
				break;
			case 3:
				g=a*c; 
				h=a*d; 
				i=b*c; 
				l=b*d*-1; 
				e=g+l;
				f=h+i;
				System.out.println("Real= "+e);
				System.out.println("imaginario= "+f);
				break;
			case 4:
				//numerador e+fi
				g=a*c; 
				h=(a*d)*-1; 
				i=b*c; 
				l=(b*d*-1)*-1; 
				e=g+l;
				f=h+i;
				//denominador 
				m= c*c;
				n= (d*d*-1)*-1;
				o=m+n;
				//final
				p=e/o;
				q=f/o;
				System.out.println("Real= "+p);
				System.out.println("imaginario= "+q);
				break;
			
		}

		

		} 
}