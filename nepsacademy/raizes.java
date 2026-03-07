import java.util.Scanner;
import java.lang.Math;
public class raizes {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int n = leitor.nextInt();
        Double[] numeros = new Double[n];
        

        for(int i = 0; i < n;i++){
            numeros[i] = leitor.nextDouble();
        

        }
        for(int i = 0; i < n;i++){
            numeros[i] = Math.sqrt(numeros[i]);
            System.out.printf("%.4f\n",numeros[i]);
        }leitor.close();
    }
}
