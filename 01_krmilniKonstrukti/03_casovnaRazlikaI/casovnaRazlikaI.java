// Napišite program, ki prebere pozitivna cela števila h1, m1, h2 in m2 in izpiše razliko (v
// minutah) med časoma h1:m1 in h2:m2. Na primer, razlika med časoma 15:58 in 18:04
// (h1 “ 15, m1 “ 58, h2 “ 18, m2 “ 4) znaša 126 minut.

import java.util.Scanner;

public class casovnaRazlikaI {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);   
    int ureI = sc.nextInt();
    int minuteI = sc.nextInt();
    int ureII = sc.nextInt();
    int minuteII = sc.nextInt();

    int razlika = (ureII - ureI) * 60 + (minuteII - minuteI);
    System.out.println(razlika);
}
}
