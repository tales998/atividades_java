public class umd {
    public static void main(String[] args) {
        int x, cont;
        x = 1;
        cont = 0;

        while (x <= 50) {
            if (x % 2 == 0) {
                cont = cont + 1;
            }
            x = x + 1;
        }

        System.out.println(cont);
    }
    
}