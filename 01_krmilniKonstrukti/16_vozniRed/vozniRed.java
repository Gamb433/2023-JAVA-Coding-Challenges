
// Avtobus vozi v enakomernih časovnih presledkih. Napišite program, ki prebere čas začetka
// dnevne vožnje (hz (ura) in mz (minuta)), čas konca dnevne vožnje (hk in mk) in interval
// v minutah (d), nato pa izpiše dnevni vozni red. Prva vožnja se izvrši natanko ob času
// začetka vožnje, zadnja pa ob času, ki je kvečjemu enak času konca vožnje.

import java.util.*;

public class vozniRed {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);   
    
    int uraZacetka = sc.nextInt();
    int minutaZacetka = sc.nextInt();
    int uraKonca = sc.nextInt();
    int minutaKonca = sc.nextInt();
    int d = sc.nextInt();

    
       // Izračunaj in izpiši vozni red
       izpisiVozniRed(uraZacetka, minutaZacetka, uraKonca, minutaKonca, d);
    }

    public static void izpisiVozniRed(int hz, int mz, int hk, int mk, int d) {
        int zacetekVMinutah = hz * 60 + mz;
        int konecVMinutah = hk * 60 + mk;

        for (int cas = zacetekVMinutah; cas <= konecVMinutah; cas += d) {
            int ura = cas / 60;
            int minuta = cas % 60;
            System.out.printf("%02d:%02d\n", ura, minuta);
        }
    }

    
    
    
//     int spominJ = 0;
//     int konec = 60;

//     for (int i = uraZacetka; i <= uraKonca; i++) {
//         if (i != uraZacetka) {
//             if (d > 60) {
//                 int povecajIza = d / 60;
//                 int preostanek = d - (60 * povecajIza);
//                 if (spominJ - 60 + preostanek < 0) {
//                     minutaZacetka = spominJ + preostanek;
//                     i--;

//                 } else {
//                     minutaZacetka = spominJ - 60 + preostanek;
//                 }
//                 i += povecajIza;
//             } else {
//                 minutaZacetka = spominJ - 60 + d;
//             }
//             if (i > uraKonca) {
//                 System.exit(0);
//             }
//         }
//         if (i == uraKonca) konec = minutaKonca+1;
//         if (i == uraKonca && minutaZacetka == 0 && d == 30) {
//             System.out.printf("%02d:%02d%n", i, minutaZacetka);
//             System.exit(0);
//         }
//         for (int j = minutaZacetka; j < konec; j+=d) {
            
//             System.out.printf("%02d:%02d%n", i, j);
//             spominJ = j;
//         }
//     }


//     }
// }

}