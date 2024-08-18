import java.util.*;

public class vsiRazlicniI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int[] stevila = new int[k];
        int[] podvojenaStevila = new int[k];
        boolean aliJe = false;

        for (int i = 0; i < k; i++) {
            int naslednje = sc.nextInt();
            for (int j = 0; j < stevila.length; j++) {
                if(naslednje == stevila[j]) {
                    podvojenaStevila[i] = naslednje;
                    aliJe = true;
                }
            }
            stevila[i] = naslednje;
        }

        //najmanjše število ki v zaporedju nastopa najmanj 2x   
        if (aliJe) {
            int najStevilo = 0;
            for (int i = 0; i < podvojenaStevila.length; i++) {
                if (podvojenaStevila[i] != 0) {
                    najStevilo = podvojenaStevila[i];
                    break;
                }
            }
            for (int i = 0; i < podvojenaStevila.length; i++) {
                if (podvojenaStevila[i] != 0) {
                    if (podvojenaStevila[i] < najStevilo) {
                        najStevilo = podvojenaStevila[i];
                    }
                }
            }
            System.out.println(najStevilo);
        } else {
            System.out.println("RAZLICNI");
        }


        
    }
}
