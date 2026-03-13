import java.util.Scanner;

public class numeros_impares {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int n = leitor.nextInt();
        int count = 0;

        for (int i = 1; i <= n; i++) {

            int x = leitor.nextInt();

            if (x <= -999) {
                break;
            }

            if (x % 2 != 0 && x != -999) {
                count++;
            }

        }
        System.out.println(count);
        leitor.close();
    }
}
