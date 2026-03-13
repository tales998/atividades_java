import java.util.Scanner;

public class divisores {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int n = leitor.nextInt();
        int count = 0;

        for(int i = 1; i <= n;i++){

            if(n%i==0){
                count++;
            }


        }System.out.println(count);
        leitor.close();

    }
}
