
// //Napišite program, ki prebere števili a in b in izpiše vrednost potence a
// b
// . Nalogo rešite s
// pomočjo zaporednih množenj, ne z metodo Math.pow

import java.util.*;

public class potenca {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);   
    
    int stevilo = sc.nextInt();
    int potenca = sc.nextInt();
    int holderStevila = stevilo;
    if (potenca == 0) {
        System.out.println(1);
        System.exit(0);
    }

    
    for (int i = 1; i < potenca; i++) {
        stevilo = stevilo * holderStevila;
    }

    System.out.println(stevilo);


    }
}
