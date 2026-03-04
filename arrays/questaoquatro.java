import java.util.Scanner;

public class questaoquatro {
    public static void main(String[] args) {
        int[] lista = new int[20];
        Scanner leitor = new Scanner(System.in);

        int maior = 0;
        int menor = 0;

        for (int i = 0; i < 20; i++) {
            
            lista[i] = leitor.nextInt();

            if (i == 0) {
                maior = lista[i];
                menor = lista[i];
            } 
            else {
                if (lista[i] > maior) {
                    maior = lista[i];
                }
                
                if (lista[i] < menor) {
                    menor = lista[i];
                }
            }

            System.out.println("primeira posicao " + i);

        }
        
        System.out.println(maior);
        System.out.println(menor);
        leitor.close();
    }
}