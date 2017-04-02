import java.util.Scanner;
import java.util.Random;

public class Pokemon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Pikachu pika = new Pikachu();
        Totodile toto = new Totodile();

        System.out.println("BIENVENIDO A LA BATALLA POKEMON");
        System.out.println(pika);
        System.out.println("VS:\n");
        System.out.println(toto);
        System.out.println("Let the battle begin! (presionar enter)");
        in.nextLine();
        Random r = new Random(10);
        int turno = r.nextInt();

        while (pika.getVida() > 0 && toto.getVida() > 0) {
            if (turno % 2 == 0) {
                System.out.println("\t\tTURNO DE PIKACHU");
                toto.setVida(pika.atacar());
                System.out.println(pika);
                System.out.println("Vida: "+pika.getVida());
                System.out.println(toto);
                System.out.println("Vida: "+toto.getVida());
            } else {
                System.out.println("\t\tTURNO DE TOTODILE");
                pika.setVida(toto.atacar());
                System.out.println(toto);
                System.out.println("Vida: " +toto.getVida());
                System.out.println(pika);
                System.out.println("Vida: "+pika.getVida());
            }
            turno++;
            System.out.println("Next player! (presionar enter) ");
            in.nextLine();
        }

        if (pika.getVida() > 0)
            System.out.println("El ganador es:" + pika);
        else
            System.out.println("El ganador es:" + toto);
    }

}

class Pikachu {

    private int vida = 100;
    private int ataque = 18;

    public int atacar() {
        Random r = new Random();
        int n = r.nextInt(10);
        if (n > 2)
            return this.ataque;
        return 0;
    }

    public int getVida() {
        return this.vida;
    }

    public void setVida(int ataque) {
        if (vida > 0 && vida > ataque)
            vida -= ataque;
        else
            vida = 0;
    }

    @Override public String toString() {
        String s = " [ PIKACHU ] \n";
        return s;
    }
}

class Totodile {

    private int vida = 100;
    private int ataque = 18;

    public int atacar() {
        Random r = new Random();
        int n = r.nextInt(10);
        if (n > 2)
            return this.ataque;
        return 0;
    }

    public int getVida() {
        return this.vida;
    }

    public void setVida(int ataque) {
        if (vida > 0 && vida > ataque)
            vida -= ataque;
        else
            vida = 0;
    }

    @Override public String toString() {
        String s = " [ TOTODILE ] \n";
        return s;
    }
}
