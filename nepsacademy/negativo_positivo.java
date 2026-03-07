 import java.util.Scanner;

public class negativo_positivo {
    public static void main(String[] args) {
       Scanner leitor = new Scanner(System.in);
        int x = leitor.nextInt();

        if(x>0){
            System.out.print("positivo");
        }else if(x<0){
            System.out.print("negativo");
        }else{
            System.out.print("nulo");
        }leitor.close();

    }
}


