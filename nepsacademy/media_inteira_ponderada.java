import java.util.Scanner;

public class media_inteira_ponderada {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int a = leitor.nextInt();
        int b = leitor.nextInt();
        double media = (a*4 + b*6) / (4+6);
        System.out.printf("%.0f\n",media);
        leitor.close();
    }

}
