import java.util.Scanner;

public class media {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float n1,n2,n3,n4,media;

        n1 = teclado.nextFloat();
        n2 = teclado.nextFloat();
        n3 = teclado.nextFloat();
        n4 = teclado.nextFloat();

        media = (n1+n2+n3+n4)/4;

        System.out.println(media);

        if(media >= 7){
            System.out.println("aprovado");
        }
        else{
            System.out.println("reprovado");
        }
        teclado.close();
    }
    
}
