import java.util.Scanner;

public class imparpar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int a;

        a = teclado.nextInt();

        if (a % 2 == 0) {
            System.out.println("par");
        } else {
            System.out.println("impar");
        }

        teclado.close();
    }
}
