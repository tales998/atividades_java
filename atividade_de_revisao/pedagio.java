import java.util.Scanner;

public class pedagio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int maior = 0; int dia = 0;




        for(int i = 1; i <=30;i++){

            int x = leitor.nextInt();

            if(x>maior){
                maior = x;
                dia = i;

            }




        }
        System.out.println("O maior volume ocorreu no dia " + dia + " e foi de " + maior + " carros.");
        leitor.close();


    }
}