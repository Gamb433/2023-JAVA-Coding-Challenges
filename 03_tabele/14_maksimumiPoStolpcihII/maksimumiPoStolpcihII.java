import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class maksimumiPoStolpcihII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Preberemo število vrstic
        System.out.print("Vnesite število vrstic: ");
        int n = sc.nextInt();
        
        // Seznam za shranjevanje vrstic
        List<List<Integer>> matrika = new ArrayList<>();
        int maxDolzinaStolpca = 0;
        
        // Preberemo vrstice matrike
        System.out.println("Vnesite elemente matrike:");
        for (int i = 0; i < n; i++) {
            int d = sc.nextInt();
            List<Integer> vrstica = new ArrayList<>();
            
            for (int j = 0; j < d; j++) {
                vrstica.add(sc.nextInt());
            }
            
            // Dodamo vrstico v matriko
            matrika.add(vrstica);
            
            // Posodobimo dolžino najdaljšega stolpca
            if (d > maxDolzinaStolpca) {
                maxDolzinaStolpca = d;
            }
        }
        
        // Poiščemo in izpišemo maksimalne elemente po stolpcih
        System.out.println("Maksimalni elementi po stolpcih:");
        for (int j = 0; j < maxDolzinaStolpca; j++) {
            Integer max = null;
            for (List<Integer> vrstica : matrika) {
                if (j < vrstica.size()) {
                    if (max == null || vrstica.get(j) > max) {
                        max = vrstica.get(j);
                    }
                }
            }
            // Izpis maksimalnega elementa ali "N/A" če stolpec ni prisoten
            if (max != null) {
                System.out.println("Stolpec " + j + ": " + max);
            } else {
                System.out.println("Stolpec " + j + ": N/A");
            }
        }
        
        sc.close();
    }
}
