// Napišite program, ki prebere število n in izpiše zaporedje n zvezdic.

import java.util.*;

public class zaporedjeZvezdic {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);   
    
    int steviloZvezdic = sc.nextInt();

    for (int i = 0; i < steviloZvezdic; i++) {
        System.out.print("*");
    }
    
    }
}