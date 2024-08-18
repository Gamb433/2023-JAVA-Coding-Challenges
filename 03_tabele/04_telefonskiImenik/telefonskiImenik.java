import java.util.*;

public class telefonskiImenik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] imena = new String[n];
        String[] stevilke = new String[n];



        for (int i = 0; i < n; i++) {
            imena[i] = sc.next();
            stevilke[i] = sc.next();
        }

        boolean pogojIzpolnjen = false;
        String toIzpisi = "";
        
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {   
            String iskanoIme = sc.next();
            for (int j = 0; j < imena.length; j++) {
                if (iskanoIme.equals(imena[j])) {
                    toIzpisi = stevilke[j];
                    pogojIzpolnjen = true;
                }
               
            }
            if(pogojIzpolnjen == false) {
                System.out.println("NEZNANA");
            } else {
                System.out.println(toIzpisi);
            }
            pogojIzpolnjen = false;
        }
        
    }
}
