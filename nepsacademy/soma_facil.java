import java.util.Scanner;

public class soma_facil{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int a = leitor.nextInt();
        int b = leitor.nextInt();

        System.out.print(a+b);
        leitor.close();

    }
}

