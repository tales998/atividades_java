import java.util.Scanner;

public class flipper {
    


    public static void main(String[] args) {
      Scanner leitor = new Scanner(System.in);
        int p = leitor.nextInt();
        int r = leitor.nextInt();
        if(p==0){
            System.out.print("C");
        }else if(p==1 && r==0){
            System.out.print("B");
        }else{
            System.out.print("A");
        }leitor.close();

    }
}


