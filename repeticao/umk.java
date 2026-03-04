public class umk {
    public static void main(String[] args) {
        int x, soma;

        x = 1;
        soma = 0;

        while (x <= 10) {
            if (x % 2 == 1) {
                soma = soma + x;
            }
            x++;
        }
        System.out.println(soma);
    }
}
