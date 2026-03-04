public class dodoisd {
    public static void main(String[] args) {
        int cont = 0;
        int x = 1;

        do{
            if(x % 2 ==0){
                cont++;
            }
            x++;
        }while(x <= 50);
        System.out.println(cont);
    }

}
