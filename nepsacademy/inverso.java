import java.util.Scanner;

public class inverso {
    


    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int[] numeros = new int[10];

        for(int i = 0; i < 10;i++){
            numeros[i] = leitor.nextInt();
            
        }for(int i = 9 ; i >= 0;i--){
           System.out.println(numeros[i]);
        }leitor.close();
        
        
    }
}
