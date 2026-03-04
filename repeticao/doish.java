public class doish {
    public static void main(String[] args) {
        int soma = 0;
        int x;

        for(x =1;x<=5;x++){
            soma = soma + x;
        }
        double media = (double) soma/(x-1);
        System.out.println(media);
    }
}
