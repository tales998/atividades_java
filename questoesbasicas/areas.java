import java.util.Scanner;

public class areas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escolha uma opção:");
        System.out.println("1 - Quadrado");
        System.out.println("2 - Retângulo");
        System.out.println("3 - Triângulo");
        System.out.println("4 - Círculo");
        System.out.println("5 - Trapézio");

        int opcao = teclado.nextInt();

        switch(opcao){

            case 1:
                quadrado(teclado);
                break;
            case 2:
                retangulo(teclado);
                break;
            case 3:
                triangulo(teclado);
                break;
            case 4:
                circulo(teclado);
                break;
            case 5:
                trapezio(teclado);
                break;
            default:
                System.out.println("opção invalida");
                break;

            
        }


    }

    public static void quadrado(Scanner tc) {

        float n1, area;

        n1 = tc.nextFloat();

        area = n1 * n1;

        System.out.println(area);
    }

    public static void retangulo(Scanner tc) {

        float base, altura, area;

        base = tc.nextFloat();
        altura = tc.nextFloat();
        area = base * altura;
        System.out.println(area);
    }

    public static void triangulo(Scanner tc) {
        float base, altura, area;

        base = tc.nextFloat();
        altura = tc.nextFloat();
        area = base * altura / 2;
        System.out.println(area);

    }

    public static void circulo(Scanner tc) {
        float raio, area;

        raio = tc.nextFloat();
        area = (float) (Math.PI * raio * raio);

        System.out.println(area);
    }

    public static void trapezio(Scanner tc) {

        float maior, menor, altura, area;
        maior = tc.nextFloat();
        menor = tc.nextFloat();
        altura = tc.nextFloat();

        area = (maior + menor) * altura / 2;
        System.out.println(area);

    }
}
