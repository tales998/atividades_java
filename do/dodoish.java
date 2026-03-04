public class dodoish {
    public static void main(String[] args) {
        int soma = 0;
        int x = 1;

        do{
            soma+=x;
            x++;
        }while(x<=5);
        double media = (double) soma/(x-1);
        System.out.println(media);
    }
}
