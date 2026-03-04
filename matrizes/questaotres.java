import java.util.Scanner;

public class questaotres {
    public static void main(String[] args) {
        int[][] lista = new int[5][5];
        int[][] listadois = new int[5][5];
        Scanner leitor = new Scanner(System.in);

        for(int i = 0; i < 5;i++){

            for(int j = 0; j < 5; j++){
                lista[i][j] = leitor.nextInt();
            }

        }
        
        for(int i = 0; i < 5; i++){

            for(int j = 0; j < 5; j++){

                listadois[i][j] = (lista[i][j] * lista[i][j] * lista[i][j]);

            }

        }System.out.println(listadois[2][2]);
        leitor.close();
    }   
}
