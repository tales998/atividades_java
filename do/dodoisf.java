public class dodoisf {
    public static void main(String[] args) {
        int count = 0;
        int x = 50;

        do{
            if(x%2==1){
                count++;
            }
            x++;
        }while(x <=150);
        System.out.println(count);
    }   
}
