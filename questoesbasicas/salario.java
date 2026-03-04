import java.util.Scanner;

public class salario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float salario, aumento, novo;

        salario = teclado.nextFloat();
        aumento = teclado.nextFloat();
        novo = salario * aumento;

        System.out.println(novo);

        teclado.close();
    }

}
