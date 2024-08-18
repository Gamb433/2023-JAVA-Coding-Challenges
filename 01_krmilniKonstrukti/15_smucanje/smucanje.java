
// Na smučarskem tekmovanju nastopa n tekmovalcev. Tekmovalec odsmuča progo dvakrat,
// njegov rezultat pa je seštevek obeh časov. Če ga diskvalificirajo, se njegov rezultat ne
// upošteva. Če ga diskvalificirajo že v prvem teku, potem v drugem sploh ne bo nastopal.
// Vaš program naj najprej prebere število n, nato pa za vsakega tekmovalca še njegov rezultat
// v prvem in drugem teku (če v prvem ni bil diskvalificiran). Rezultat je podan bodisi kot
// pozitivno celo število, ki podaja čas vožnje, ali pa kot število 0, ki pomeni diskvalifikacijo.
// Če so vse tekmovalce diskvalificirali, naj program to sporoči, sicer pa naj izpiše zaporedno
// številko tekmovalca z najboljšim skupnim časom in njegov skupni čas. Če je najboljših
// tekmovalcev več, naj program izbere tistega z najmanjšo zaporedno številko.

import java.util.*;

public class smucanje {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);   
    
    int steviloTekmovalcev = sc.nextInt();
    int najboljsiTekmovalec = 0;
    int najboljsiCas = 0;

    for (int i = 1; i <= steviloTekmovalcev; i++) {
        int prviCas = sc.nextInt();
    
        if (prviCas != 0) {
            int drugiCas = sc.nextInt();
            if (drugiCas != 0) {
                if (najboljsiCas == 0) {
                    najboljsiCas = prviCas + drugiCas;
                }
                
                int casTekmovalca = prviCas + drugiCas;
                if (casTekmovalca <= najboljsiCas) {
                    najboljsiCas = casTekmovalca;
                    najboljsiTekmovalec = i;
                }
            }
            

        } 
    }

    if (najboljsiTekmovalec == 0) {
        System.out.println("NIHCE");
    } else {
        System.out.println(najboljsiTekmovalec);
        System.out.println(najboljsiCas);
    }


    }
}
