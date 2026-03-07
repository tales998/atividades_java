
import java.util.Scanner;

public class basquete_de_robos {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int d = leitor.nextInt();
        if (d <= 2000) {
            if (d <= 800 && d >= 0) {
                System.out.println("1");
            } else if (d <= 1400) {
                System.out.println("2");
            } else if (d <= 2000) {
                System.out.println(3);
            }
        }leitor.close();
    }
}
