import java.util.Scanner;

public class divisiveis_por_cinco {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int soma = 0;


        for(int i =1;i<=30;i++){
            int n = leitor.nextInt();
            if(n%5==0){
                soma = soma + n;
            }
        }System.out.println(soma);
        leitor.close();
    }   
}
