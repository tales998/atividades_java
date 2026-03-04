import java.util.Scanner;

public class questaodois {
    public static void main(String[] args) {
        float[][] lista = new float[3][4];
        Scanner teclado = new Scanner(System.in);
        for(int i = 0; i < 3; i++){
            
            for(int j = 0; j < 4;j++){
                lista[i][j] = teclado.nextFloat();
            }
        }

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4;j++){
                System.out.print(lista[i][j]+" ");
            }
            System.out.println("");
           
        } System.out.println(lista[0][0]);
          System.out.println(lista[2][3]);
          teclado.close();
    }
}
