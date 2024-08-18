import java.util.*;

public class zlataSredina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int[] stevila = new int[k*2 +1];

        for (int i = 0; i < 2*k+1; i++) {
            stevila[i] = sc.nextInt();
        }
        int stevec = 0;
        for (int i = 0; i < stevila.length; i++) {
            for (int j = 0; j < stevila.length; j++) {
                if(stevila[j] < stevila[i]) {
                    stevec++;
                }
            }
            if(stevec == k) {System.out.println(stevila[i]); System.exit(0);}
            stevec = 0;
        }

        
    }
}
