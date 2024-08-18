import java.util.Scanner;

public class absolutna {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int stevilo = sc.nextInt();
    
    if(stevilo < 0) stevilo *= (-1);

    System.out.println(stevilo);
}
}
