import java.util.Scanner;

public class medalhas {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int a = leitor.nextInt(); 
        int b = leitor.nextInt();
        int c = leitor.nextInt();
        
        int ouro, prata, bronze;

        if (a < b && a < c) {
            ouro = 1;
        } else if (b < a && b < c) {
            ouro = 2;
        } else {
            ouro = 3;
        }

        if (a > b && a > c) {
            bronze = 1;
        } else if (b > a && b > c) {
            bronze = 2;
        } else {
            bronze = 3;
        }

        prata = 6 - ouro - bronze;

        System.out.println(ouro);
        System.out.println(prata);
        System.out.println(bronze);
        
        leitor.close();
    }//repetir
}