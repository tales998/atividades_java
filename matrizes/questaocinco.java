public class questaocinco {
    public static void main(String[] args) {
        int[][] lista = new int[7][8];

        for(int i = 0; i < 7; i++){

            for(int j = 0; j < 8; j++){
                lista[i][j] = i+j;
            }
        }

        for(int i = 0; i < 7; i++){

             for(int j = 0; j < 8; j++){

                System.out.print(lista[i][j]+ "\t");

             }

        }System.out.println("");
    }
}
