// Napišite program, ki prebere števili a in b in po vrsti izpiše rezultate množenja števila a s
// števili od 1 do vključno b.

import java.util.*;

public class postevankaI {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);   
    
    int baseStevilo = sc.nextInt();
    int mnozitelj = sc.nextInt();

    for (int i = 1; i <= mnozitelj; i++) {
        System.out.println(baseStevilo *= i);
        baseStevilo /= i;
    }


    }
}