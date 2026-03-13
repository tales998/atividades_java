import java.util.Scanner;

public class linha_coluna {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double[][] matriz = new double[4][3];

        for(int i = 0; i < 4; i++){

            for(int j = 0; j<3;j++){
                
                matriz[i][j] = leitor.nextDouble();


            }
        }
        int n = leitor.nextInt();
        int c = leitor.nextInt();
        System.out.println(matriz[n][c]);
        leitor.close();
    }
}
