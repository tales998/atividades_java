import java.util.Scanner;

public class buscamatriz {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] matriz = new int[10];
        int count = 0, falso = 0;

        for (int i = 0; i < 10; i++) {
            matriz[i] = leitor.nextInt();

        }
        int x = leitor.nextInt();
        for (int i = 0; i < 10; i++) {
            if (x == matriz[i]) {
                count++;

            } 
        }
        if (count == 0) {
            System.out.println("Meu x");
        } else {
            System.out.println(count);
        }
        for (int i = 0; i < 10; i++) {
            if (x == matriz[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
