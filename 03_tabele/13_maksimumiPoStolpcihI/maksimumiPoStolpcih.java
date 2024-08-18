import java.util.*;

public class maksimumiPoStolpcih {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int visina = sc.nextInt();
        int sirina = sc.nextInt();

        int[][] matrika = new int[visina][sirina];

        for (int i = 0; i < visina; i++) {
            for (int j = 0; j < sirina; j++) {
                matrika[i][j] = sc.nextInt();
            }
        }

        int[] novaMatrika = new int[sirina];

        for (int i = 0; i < sirina; i++) {
            int maksElement = matrika[0][i];

            for (int j = 0; j < visina; j++) {
                if (matrika[j][i] > maksElement) {
                    maksElement = matrika[j][i];
                }
            }
            novaMatrika[i] = maksElement;       
        }

        System.out.println(Arrays.toString(novaMatrika));

        
    }
}
