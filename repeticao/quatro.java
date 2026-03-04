import java.util.Scanner;

public class quatro {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int quantidade = 0;
        int n = leitor.nextInt();

        for(int count = 1; count < n;count++){

            int idade = leitor.nextInt();

            if(idade>=18){

                quantidade+= 1;

            }


        }
        System.out.println(quantidade);
        
    }
}
