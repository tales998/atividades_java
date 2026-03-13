import java.util.Scanner;

public class temperatura {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int x = 0;
        int maior = 0, menor = 0;

        for (int i = 0; i < 3; i++) {

            x = leitor.nextInt();

            if (i == 0) {
                maior = x;
                menor = x;
            } else {
                if (x > maior) {
                    maior = x;
                } else if (x<menor ) {
                    menor = x;
                }
            }

        }
        System.out.println(maior);
        System.out.println(menor);
        leitor.close();
    }
}
