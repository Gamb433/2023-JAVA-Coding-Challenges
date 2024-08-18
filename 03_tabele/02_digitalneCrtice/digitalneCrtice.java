import java.util.*;

public class digitalneCrtice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] crtice = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};

        int n = sc.nextInt();
        int dolzinaPosamenzega = 0;
        int najvecjaDolzina = 0;
        int zmagovalnoStevilo = 0;
        for (int i = 0; i < n; i++) {
            int trenutnoStevilo = sc.nextInt();
            int holder = trenutnoStevilo;
            while (holder > 0) {
                int stevka = holder % 10;
                dolzinaPosamenzega += (crtice[stevka]);
                holder /= 10;   
            }
            if (dolzinaPosamenzega > najvecjaDolzina) {
                najvecjaDolzina = dolzinaPosamenzega;
                zmagovalnoStevilo = trenutnoStevilo;
            }
            dolzinaPosamenzega = 0;
        }
        System.out.println(zmagovalnoStevilo);

    }
}
