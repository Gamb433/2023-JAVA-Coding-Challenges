// Napišite program, ki prebere tri enomestna števila in nariše vzorec, kot ga prikazujeta
// primera v nadaljevanju.

import java.util.*;

public class igorjeviBloki {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);   
    
    int prvoStevilo = sc.nextInt();
    int drugoStevilo = sc.nextInt();
    int tretjeStevilo = sc.nextInt();

    int maxSteviloI = Math.max(drugoStevilo, tretjeStevilo);
    int maxStevilo = Math.max(maxSteviloI, prvoStevilo);

    for (int i = 0; i < maxStevilo; i++) {
        for (int j = 0; j < prvoStevilo; j++) {
            if (i < prvoStevilo) {
                System.out.print(prvoStevilo);
            } else {
                System.out.print(" ");
            }
        }
        System.out.print(" ");
        for (int j = 0; j < drugoStevilo; j++) {
            
        
             if (i < drugoStevilo) {
                System.out.print(drugoStevilo);
            } else {
                System.out.print(" ");
            }
        }
        System.out.print(" ");
        for (int j = 0; j < tretjeStevilo; j++) {
            if (i < tretjeStevilo) {
                System.out.print(tretjeStevilo);
            }
        }
        System.out.println();
    }

    }
}