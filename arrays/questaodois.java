import java.util.Scanner;

public class questaodois {
    public static void main(String[] args) {
        int[] posicao = new int[10];
        for(int i = 1; i < 10; i++){
            posicao[i] = i;
            Scanner leitor = new Scanner(System.in);
            int a = leitor.nextInt();
            if(posicao[i]==a){
                System.out.println("faz parte do vetor");
            }
            else{
                System.out.println("nao faz parte do vetor");
            }leitor.close();
        }
    }
    
}

