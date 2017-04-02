import java.util.Scanner;
import java.util.LinkedList;

public class Primos {

    private static LinkedList<Integer> l = new LinkedList<Integer>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Numero de primos: ");
        int obprim = in.nextInt();

        if (obprim < 1) {
            System.out.println("Esta opcion no es valida");
            System.exit(-1);
        }

        calculaPrimos(obprim);

        System.out.println("\nLos " + obprim + " primeros numeros primos son:");
        for (Integer primo: l)
            System.out.println("[ " + primo + " ]");
    }

    private static void calculaPrimos(int obprim) {
        l.add(2);
        int p = 3;
        boolean prim = false;

        while (l.size() < obprim) {
            if (prim(p))
                l.add(p);
            p++;
        }
    }

    private static boolean prim(int n) {
        int contador = 2;
        boolean prim = true;

        while (prim && contador < n) {
            if (n % contador == 0)
                prim = false;
            contador++;
        }
        
        return prim;
    }


}
