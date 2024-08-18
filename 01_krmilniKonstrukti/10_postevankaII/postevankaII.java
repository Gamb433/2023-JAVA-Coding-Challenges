// Napišite program, ki prebere števili a in b in izpiše poštevanko števila a s faktorji od 1 do
// vključno b.

import java.util.*;

public class postevankaII {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);   
    
    int baseStevilo = sc.nextInt();
    int mnozitelj = sc.nextInt();

    for (int i = 1; i <= mnozitelj; i++) {
        System.out.printf("%d * %d = %d%n", baseStevilo, i, baseStevilo *= i);
        baseStevilo /= i;
    }

    }
}