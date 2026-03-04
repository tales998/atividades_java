import java.util.Scanner;

public class cinco {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        int base = leitor.nextInt();
        int expoente = leitor.nextInt();
        int resultado = 1;

        if(base ==0 && expoente == 0){
            System.out.println("indeterminado");
        }
        else{
            for(int i = 1; i <= expoente;i++){
                
                resultado = resultado * base;
            }
            System.out.println(resultado);
        }
        





    }
}
