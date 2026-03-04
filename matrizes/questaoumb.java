public class questaoumb {
    public static void main(String[] args) {
     int[][] lista = new int[4][4];
     int count = 0;
     
     for(int i = 0; i <4;i++){
        count+=1;
        for(int j = 0; j< 4; j++){
            lista[i][j] = count;
        }
     }

     for(int i = 0; i < 4;i++){

        for(int j = 0; j < 4; j++){
            System.out.print(lista[i][j]+" ");
        }System.out.println("");
     }
    }
}
