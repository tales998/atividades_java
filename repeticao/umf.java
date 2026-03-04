public class umf {
    public static void main(String[] args) {
        int x,cont;

        x = 50;
        cont = 0;

        while(x <= 150){

            if(x % 2 == 1){

                cont++;

            }
            x++;

        }
        System.out.println(cont);
    }
}
