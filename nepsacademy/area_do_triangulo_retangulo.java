import java.util.Scanner;

public class area_do_triangulo_retangulo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int a = leitor.nextInt();
        int b = leitor.nextInt();
        Double triangulo = a*b/2d;
        System.out.printf("%.0f\n",triangulo);
        leitor.close();
    }
}
