
import java.util.Scanner;

public class posicaomenor {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int maior, inter, menor, x, y, z;

        x = teclado.nextInt();
        y = teclado.nextInt();
        z = teclado.nextInt();

        if (x >= y && x >= z) {

            maior = x;
        } else if (y >= x && y >= z) {

            maior = y;
        } else {
            maior = z;
        }

        if (x <= y && x <= z) {

            menor = x;
        } else if (y <= x && y <= z) {

            menor = y;
        } else {
            menor = z;
        }
        inter = (x + y + z) - maior - menor;

        System.out.println(menor);
        System.out.println(inter);
        System.out.println(maior);

        teclado.close();

    }

}
