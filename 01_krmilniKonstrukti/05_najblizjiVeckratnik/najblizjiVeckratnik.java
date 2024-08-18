// Napišite program, ki prebere števili a in b in izpiše tisti večkratnik števila a, ki je najmanj
// oddaljen od števila b. Če obstajata dva takšna večkratnika, naj izpiše manjšega od njiju.

import java.util.Scanner;

public class najblizjiVeckratnik {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);   

    long steviloI = sc.nextInt();
    long steviloII = sc.nextInt();

    long najmanjsiVeckratnik = steviloI;

    for (long veckratnik = steviloI; veckratnik <= steviloII + steviloI; veckratnik+=steviloI) {
        long prvaPrimerjava = (steviloII - veckratnik);
        long drugaPrimerjava = (steviloII - najmanjsiVeckratnik);
        if (prvaPrimerjava < 0) prvaPrimerjava *= (-1);
        if (drugaPrimerjava < 0) drugaPrimerjava *= (-1);

        if (veckratnik % steviloI == 0 && prvaPrimerjava < drugaPrimerjava) {
            najmanjsiVeckratnik = veckratnik;

        }
    }
    System.out.println(najmanjsiVeckratnik);
    
}

}
