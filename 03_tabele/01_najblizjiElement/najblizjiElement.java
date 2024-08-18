// Napišite program, ki prebere število k, število n in zaporedje n števil in izpiše indeks tistega
// elementa zaporedja, ki je od števila k najmanj oddaljen (ni pomembno, ali v pozitivno ali
// v negativno smer). Če je takih elementov več, naj program izpiše indeks prvega od njih.
// Indeksi se pričnejo z ničlo; prvi element zaporedja ima tako indeks 0, drugi 1 itd

import java.util.*;

public class najblizjiElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int n = sc.nextInt();
        int[] tabela = new int[n];

        for (int i = 0; i < n; i++) {
            tabela[i] = sc.nextInt();
        }

        int najblizjiElement = k - tabela[0];
        if (najblizjiElement < 0) {
            najblizjiElement *= -1;
        }

        int izpis = 0;

        for (int i = 0; i < n; i++) {
            int izracun = k - tabela[i];
            if (izracun < 0) {
                izracun *= (-1);
            }
            if (izracun < najblizjiElement) {
                najblizjiElement = izracun;
                izpis = i;
            }
        }

        System.out.println(izpis);

    }
}
