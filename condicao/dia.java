import java.util.Scanner;

public class dia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String letra;

        letra = teclado.next();

        if(letra.equals("m")){
            System.out.println("bom dia!");
        }
        else if(letra.equals("t")){
            System.out.println("boa tarde!");
        }
        else if(letra.equals("n")){
            System.out.println("boa noite!");
        }
        else{
            System.out.println("invalido!");
        }
        teclado.close();
    }
}
