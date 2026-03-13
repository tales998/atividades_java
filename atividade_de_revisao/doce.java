import java.util.Scanner;

public class doce {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int n = leitor.nextInt();
        double result = 0;

        if (n > 0 && n < 50) {
            result = n * 0.30d;
        } else if (n >= 50 && n < 100) {
            result = n * 0.25d;

        } else if (n >= 100 && n < 200) {
            result = n * 0.22d;
        } else if (n >= 200 && n < 400) {
            result = n * 0.17d;

        } else if (n >= 400) {
            result = n * 0.15;
        } else {
            System.out.println("invalido");
        }
        if (n > 0) {

            System.out.println(result);

        }leitor.close();
    }

}
