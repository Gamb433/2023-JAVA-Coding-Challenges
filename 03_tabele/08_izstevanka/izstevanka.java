import java.util.*;
import java.util.ArrayList;

public class izstevanka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int stOtrok = sc.nextInt();
        int izstevanka = sc.nextInt();
        ArrayList<String> otroci = new ArrayList<>();
        for (int i = 0; i < stOtrok; i++)  {
            String ime = sc.next();
            otroci.add(ime);
        }

        while (stOtrok > 1) {
            int izracun = izstevanka % stOtrok;
            int dolzina = otroci.size();
            if(izracun == 0) {
                String element = otroci.get(dolzina - 1);
                System.out.println(element);
                otroci.remove(dolzina - 1);
            }
            else { 
                String element = otroci.get(izracun - 1);
                System.out.println(element);
                otroci.remove(izracun - 1);
            }
            stOtrok--;
        }


        
    }
}
