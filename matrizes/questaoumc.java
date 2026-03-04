public class questaoumc {
    public static void main(String[] args) {
        String[][] lista = new String[4][4];

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {
                if (((i == 1) && (j == 1 || j ==2)) || ((i == 2) && (j == 1||j==2) )) {
                    lista[i][j] = "z";
                } else {
                    lista[i][j] = "x";
                }
            }
        }

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {
                System.out.print(lista[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
