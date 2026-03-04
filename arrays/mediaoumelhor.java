import java.util.Scanner;

public class mediaoumelhor {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int n = leitor.nextInt();
        double[] lista = new double[n];
        double media, count = 0, soma = 0;

        if (n >= 1 && n <= 1000) {

            for (int i = 0; i < lista.length; i++) {
                
                    lista[i] = leitor.nextDouble();

                    soma += lista[i];
                
               

            }
        }
        media = soma / lista.length;
        for (int i = 0; i < lista.length; i++) {
            if (media <= lista[i]) {
                count++;
            }
        }

        System.out.println(media);
        System.out.println(count);
        leitor.close();

    }
}
