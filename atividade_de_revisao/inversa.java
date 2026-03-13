import java.util.Scanner;

public class inversa {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double[] inverso = new double[20];

        for(int i = 0; i < 10;i++){

            inverso[i] = leitor.nextDouble();

             inverso[19-i] = inverso[i];

        }


        for(int i = 0; i <20; i++){    

            System.out.println(inverso[i]);




        }leitor.close();
    }
}
