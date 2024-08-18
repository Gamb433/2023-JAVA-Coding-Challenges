// Napišite program, ki prebere dve števili in izpiše njun zmnožek. Definirajte in smiselno
// uporabite metodo, ki sprejme dve celi števili in vrne njuno vsoto.2

import java.util.*;

public class mnozenjeSSestevanjem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int prvoStevilo = sc.nextInt();
        int drugoStevilo = sc.nextInt();
        int zmnozek = prvoStevilo * drugoStevilo;

        while (prvoStevilo != zmnozek) {
            prvoStevilo += sestevek(0, drugoStevilo);
        }
        System.out.println(prvoStevilo);
    }

    public static int sestevek(int a, int b) {

        return a + b;
    }
}
