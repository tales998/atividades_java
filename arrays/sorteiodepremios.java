import java.util.Scanner;

public class sorteiodepremios {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int n = leitor.nextInt();
        double[] lista = new double[n];


        for(int i = 0; i < lista.length;i++){

            lista[i] = leitor.nextDouble();

        }
        for(int i = lista.length -1; i >= 0;i--){
            System.out.println(lista[i]);

        }leitor.close();
    }
}
