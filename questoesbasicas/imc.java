import java.util.Scanner;


public class imc {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float peso, altura, imc;

        peso = teclado.nextFloat();
        altura = teclado.nextFloat();
        imc = (peso/(altura*altura));

        System.out.println(imc);

        teclado.close();
    }
}
