// // Napišite program, ki prebere števila v, s in d in nariše vzorec v obliki šahovnice z v
// vrsticami in s stolpci, pri čemer ima vsako polje obliko kvadrata velikosti dˆd. Šahovnica
// naj bo tudi obrobljena. Zgledujte se po primerih v nadaljevanju.

import java.util.*;

public class sahovnica {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);   
    
    int visina = sc.nextInt();
    int dolzina = sc.nextInt();
    int stranicaKvadrata = sc.nextInt();

    int dolzinaEneVrstice = dolzina * stranicaKvadrata;
    //prva vrstica
    System.out.print("+");
    System.out.print(" ");
    for (int i = 0; i < dolzinaEneVrstice; i++) {
        System.out.print("-");
        System.out.print(" ");
    }
    System.out.print("+");
    System.out.println();
    //od prve naprej
    // for (int i = 1; i <= dolzinaPrograma; i++) {

        for (int j = 1; j <= visina; j++) { 
            if (j % 2 == 0) {
                for (int i = 0; i < stranicaKvadrata; i++) {
                    System.out.print("|");
                    System.out.print(" ");
                
                    for (int j2 = 1; j2 <= dolzina; j2++) {
                        if (j2 % 2 == 0) {
                            for (int j3 = 0; j3 < stranicaKvadrata; j3++) {
                                System.out.print(" ");
                                System.out.print(" ");
                            }
                        } else {
                            for (int j3 = 0; j3 < stranicaKvadrata; j3++) {
                                System.out.print("*");
                                System.out.print(" ");
                            }
                        }
                    }
                    System.out.print("|");
                    System.out.println();
                }
            } else {
                for (int i = 0; i < stranicaKvadrata; i++) {
                    
                    System.out.print("|");
                    System.out.print(" ");
                    for (int j2 = 1; j2 <= dolzina; j2++) {
                        if (j2 % 2 != 0) {
                            for (int j3 = 0; j3 < stranicaKvadrata; j3++) {
                                System.out.print(" ");
                                System.out.print(" ");
                            }
                        } else {
                            for (int j3 = 0; j3 < stranicaKvadrata; j3++) {
                                System.out.print("*");
                                System.out.print(" ");
                            }
                        }
                    }
                    System.out.print("|");
                    System.out.println();
                }
            }
        
    }
    //zadnja vrstica
    System.out.print("+");
    System.out.print(" ");
    for (int i = 0; i < dolzinaEneVrstice; i++) {
        System.out.print("-");
        System.out.print(" ");
    }
    System.out.print("+");
    System.out.println();

    }
}