import java.util.Scanner;

public class subtracao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int a = leitor.nextInt();
        int b = leitor.nextInt();
        int sub = a -b;
        System.out.println(sub);

        leitor.close();
    }
}
