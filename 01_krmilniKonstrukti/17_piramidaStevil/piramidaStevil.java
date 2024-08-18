
// Napišite program, ki prebere število n in nariše »piramido« števil višine n,
// kot jo prikazujeta primera v nadaljevanju.

import java.util.*;

public class piramidaStevil {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);   
    
    int n = sc.nextInt();
    int stevec = n;

    for (int i = 1; i <= n; i++) {
        postaviPiramido(i, stevec);
        System.out.println();

        stevec--;
    }
    }

    public static void postaviPiramido (int vrstica, int prazninaN) {
        int praznine = prazninaN - 1;
        int stevilke = vrstica * 2 - 1;
        praznine(praznine);
        stevilke(stevilke, vrstica);
    }

    public static void praznine(int praznine) {
        for (int i = 0; i < praznine; i++) {
            System.out.print(" ");
        }
    }

    public static void stevilke(int stevilke, int zacetnoStevilo) {
        int stevka = zacetnoStevilo;
        if (stevka >= 10) {
            stevka = stevka % 10;
        }
        for (int i = 0; i < stevilke; i++) {
            System.out.print(stevka);
            stevka++;
            if (stevka == 10) {
                stevka = 0;
            }
        }
    }
}