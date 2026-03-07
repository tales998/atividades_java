import java.util.Scanner;

public class consecutivos {
   



    public static void main(String[] args) {
      Scanner leitor = new Scanner(System.in);
        int n = leitor.nextInt();
        int[] lista = new int[n+1];
        int soma = 1, maior = 1;

        for(int i = 0; i < n; i++){
            lista[i] = leitor.nextInt();

            
        }for(int i = 0; i < n; i++){
            if(lista[i] == lista[i+1]){
                soma++;
                if(soma > maior){
                    maior = soma;
                }
            }else{
                    soma = 1;
                }
        }System.out.println(maior);
        leitor.close();

    }
}//repetir
