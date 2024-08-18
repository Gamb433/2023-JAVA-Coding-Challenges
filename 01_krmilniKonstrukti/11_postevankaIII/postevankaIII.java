// Napišite program, ki prebere števili a in b in izpisuje poštevanko števila a tako dolgo,
// dokler rezultat ni večji od b.

import java.util.*;

public class postevankaIII {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);   
    
    int baseStevilo = sc.nextInt();
    int meja = sc.nextInt();

    int stevec = 1;
    int rezultat = baseStevilo * stevec;

    while (meja >= rezultat) {
        System.out.printf("%d * %d = %d%n", baseStevilo, stevec, rezultat);

        stevec++;
        rezultat = baseStevilo * stevec;
    }

    
    }
}