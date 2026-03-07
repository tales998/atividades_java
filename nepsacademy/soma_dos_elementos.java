import java.util.Scanner;

public class soma_dos_elementos {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int n = leitor.nextInt();
        int soma = 0;

        for(int i = 0; i < n;i++){
            int x = leitor.nextInt();
            soma+=x;
        }System.out.println(soma);
        leitor.close();

    }
}
