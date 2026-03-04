import java.util.Scanner;

public class asa {
    public static void main(String[] args) {
       Scanner leitor = new Scanner(System.in);
        int n = leitor.nextInt();
        int mult = 0; 
        int x = 1;
        if(n == 0){
           x = 1;
           n = 1;
           System.out.println(x*n);
        }
        for(int i = 1; i < n;i++){
            x = x * (n-i);
           
            
        }System.out.println(x*n);

    }
}
