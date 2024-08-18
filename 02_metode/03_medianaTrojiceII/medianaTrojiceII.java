// Napišite program, ki prebere tri števila in izpiše srednje med njimi (tj. število, od katerega
// je vsaj eno od preostalih dveh števil v trojici manjše ali enako in vsaj eno večje ali enako).
// Definirajte in smiselno uporabite metodi min in maks, ki sprejmeta dve celi števili in vrneta
// manjše (min) oziroma večje (maks) izmed njiju.3

import java.util.*;

public class medianaTrojiceII {
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
