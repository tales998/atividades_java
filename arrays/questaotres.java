import java.util.Scanner;

public class questaotres {
    public static void main(String[] args) {
        int[] posicao = new int[15];
        Scanner leitor = new Scanner(System.in);
        int a, count = 0;

        for (int i = 0; i < 15; i++) {

            posicao[i] = leitor.nextInt();
            System.out.println("primeira posicao " + i);
        }

        System.out.println("escreva o numero para acontecer a repetição");

         a = leitor.nextInt();

        for (int i = 0; i < 15; i++) {
           
            if (a ==posicao[i]) {

                count += 1;
            }
        } System.out.println(count);
        leitor.close();
    } 
}
