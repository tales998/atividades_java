import java.util.Scanner;

public class questaoquatro {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        int m = teclado.nextInt();
        
        float[][] lista = new float[n][m];
        
        
        for(int i = 0; i < n; i++){

            for(int j = 0; j < m; j++){
                lista[i][j] = teclado.nextFloat();
            }

        }
        float soma = 0f;
        for(int i = 0; i < n; i++){

            for(int j = 0; j < m; j++){
                if(i==j){
                    soma+=lista[i][j];
                }

            }
        }System.out.println(soma);
        teclado.close();
    }
}
