
// Napišite program, ki prebere števila a, b in k in izpiše zaporedje števil od a do b s korakom
// k. V primeru a ď b naj se izpis zaključi pri največjem številu, ki ni večje od b, v primeru
// a ą b pa pri najmanjšem številu, ki ni manjše od b.
// Pred izpisom zaporedja naj program preveri, ali vhod zadošča sledečima pogojema:
// • korak k ni enak 0;
// 8 Poglavje 1. Krmilni konstrukti
// • korak je pozitiven v primeru a ă b oziroma negativen v primeru a ą b.
// Če vhod katerega od pogojev ne izpolnjuje, naj program izpiše zgolj besedo NAPAKA.

import java.util.*;

public class stevilskaZaporedja {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);   
    
    int prvoStevilo = sc.nextInt();
    int drugoStevilo = sc.nextInt();

    int k = sc.nextInt();

    boolean aliJe = false;
    if (k != 0 && ((prvoStevilo <= drugoStevilo) && k > 0 || (drugoStevilo <= prvoStevilo) && k < 0)) aliJe = true;
    if (!aliJe) {
        System.out.println("NAPAKA");
        System.exit(0);
    }   

        if (k > 0) {
            
        
            while (prvoStevilo <= drugoStevilo) {
                System.out.println(prvoStevilo);

                prvoStevilo += k;
            }
        } else {
            while (prvoStevilo >= drugoStevilo) {
                System.out.println(prvoStevilo);

                prvoStevilo += k;
            } 
        }


    }
}
