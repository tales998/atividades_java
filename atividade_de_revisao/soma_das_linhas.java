import java.util.Scanner;

public class soma_das_linhas {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double[][] matriz = new double[4][3];
        double soma = 0;

        for(int i = 0; i < 4;i++){

            for(int j = 0; j < 3; j++){

                matriz[i][j] = leitor.nextDouble();

            }

        }
        int n = leitor.nextInt();
        for(int j = 0; j < 3;j++){
                soma = soma +matriz[n][j]; 


        }System.out.println(soma);
        leitor.close();
    }

    
}
