import java.util.Scanner;

public class vogal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String letra;

        letra = teclado.next();

        if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
            System.out.println("vogal");

        } else {
            System.out.println("consoante");
        }
        teclado.close();
    }
}
