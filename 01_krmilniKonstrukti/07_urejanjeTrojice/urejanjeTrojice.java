// Napišite program, ki prebere tri števila in izpiše srednje med njimi (tj. število, od katerega
// je vsaj eno od preostalih dveh števil v trojici manjše ali enako in vsaj eno večje ali enako).

import java.util.*;

public class urejanjeTrojice {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);   
    
    int prvoStevilo = sc.nextInt();
    int drugoStevilo = sc.nextInt();
    int tretjeStevilo = sc.nextInt();

    int drugiDveMin = Math.min(drugoStevilo, tretjeStevilo);
    int najmanjseStevilo = Math.min(prvoStevilo, drugiDveMin);

    int drugiDveMax = Math.max(drugoStevilo, tretjeStevilo);
    int najvecjeStevilo = Math.max(prvoStevilo, drugiDveMax);


    System.out.printf("%d %d %d%n", najmanjseStevilo, najdiMediano(prvoStevilo, drugoStevilo, tretjeStevilo), najvecjeStevilo);
    
}
public static int najdiMediano(int a, int b, int c) {
    if (a <= b && b <= c || a >= b && b >= c) {
        return b;
    } else if (b <= a && a <= c || b >= a && a >= c) {
        return a;
    } else {
        return c;
    }
}


}