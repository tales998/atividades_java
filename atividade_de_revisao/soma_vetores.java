import java.util.Scanner;

public class soma_vetores {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double[] posicao = new double[30];
        double[] posicaodois = new double[30];
        double[] soma = new double[30];

        for(int i = 0; i<30;i++){
            posicao[i] = leitor.nextDouble();
        }
        for(int i = 0; i<30;i++){
            posicaodois[i] = leitor.nextDouble();

             soma[i] = posicao[i] + posicaodois[i];
        }
        for(int i = 0; i<30;i++){
           System.out.println(posicao[i]);
           System.out.println(posicaodois[i]);
           System.out.println(soma[i]);
        }leitor.close();
    }
}
