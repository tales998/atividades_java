import java.util.Scanner;

public class vetorzeroum {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] vetor = new int[10];
        int result = 0;

        for (int i = 0; i < 10; i++) {
            vetor[i] = leitor.nextInt();

        }
        int x = leitor.nextInt();
        for (int i = 0; i < 10; i++) {

            if (x == vetor[i]) {
                result = 1;
                break;
            } 

        }
        if (result == 1) {
            System.out.println("SIM");

        } else {
            System.out.println("NAO");
        }

        leitor.close();
    }
}
