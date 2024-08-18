// Napišite program, ki prebere pozitivna cela števila h1, m1, h2 in m2 in izpiše razliko (v
// urah in minutah) med časoma h1:m1 in h2:m2. Na primer, razlika med časoma 15:58 in
// 18:04 (h1 “ 15, m1 “ 58, h2 “ 18, m2 “ 4) znaša 2 uri in 6 minut.

import java.util.Scanner;

public class casovnaRazlikaII {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);   
    int ureI = sc.nextInt();
    int minuteI = sc.nextInt();
    int ureII = sc.nextInt();
    int minuteII = sc.nextInt();
    
    
    if (minuteII > minuteI) {
        System.out.printf("%d:%2d%n", ureII - ureI, minuteII - minuteI);
    } else {
        System.out.printf("%d:%02d%n", ureII - ureI - 1, minuteII - minuteI + 60);
    }
}
}
