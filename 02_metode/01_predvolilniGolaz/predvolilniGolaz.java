// Politiku Gvidu1
// je podpora pred volitvami nevarno padla, zato se odloči, da bo izbranim
// skupinam volilcev plačeval kosila v dobrih gostilnah tako dolgo, dokler mu ne zmanjka
// denarja. Vsak dan povabi določeno skupino ljudi v izbrano gostilno. Cena pogostitve se
// v osnovi izračuna kot zmnožek števila kosil in cene kosila, izbrano vino pa ceno poveča za
// navzgor zaokroženo polovico (če cena celotne pogostitve brez vina znaša 45 evrov, je cena
// z vinom enaka 45 + 23 = 68 evrov, če pa bi brez vina odšteli 46 evrov, bi z vinom 46 +
// 23 = 69 evrov). Napišite program, ki najprej prebere podatek o začetni zalogi Gvidovega
// denarja, nato pa zaporedoma bere podatke o pogostitvah ter sproti izpisuje njihove cene
// in preostalo zalogo denarja. Program naj se zaključi, ko zmanjka vhoda ali pa Gvidovega
// denarja.
// V programu definirajte in uporabite metodo, ki sprejme podatke o pogostitvi in vrne njeno
// ceno.

import java.util.*;

public class predvolilniGolaz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int denar = sc.nextInt();
        while (sc.hasNextInt()) {
            int cenaEnegaKosila = sc.nextInt();
            int stKosil = sc.nextInt();
            int vino = sc.nextInt();

            int cenaKosila = metoda(denar, cenaEnegaKosila, stKosil, vino);
    
            denar -= cenaKosila;
            if (denar > 0) {
                System.out.printf("%d %d%n", cenaKosila, denar);
            }
            else if (denar == 0) {
                System.out.printf("%d 0", cenaKosila);
                System.exit(0);
            } 
            else {
                System.out.printf("%d -%n", cenaKosila);
                System.exit(0);
            }
        }

    }


    public static int metoda(int denar, int cenaEnega, int stKosil, int vino) {
        int cenaKosilaBrezVina = (cenaEnega * stKosil);
        int cenaVina = (cenaKosilaBrezVina / 2);
        if (cenaKosilaBrezVina % 2 != 0) cenaVina ++;
        return cenaKosilaBrezVina + cenaVina*vino;
        }
}
