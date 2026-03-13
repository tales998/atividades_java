import java.util.Scanner;

public class quadrante {
    public static void main(String[] args) {
        
   
    Scanner leitor = new Scanner(System.in);
    int x = leitor.nextInt();
    int y = leitor.nextInt();

    if(x>0 && y >0){
        System.out.println("1 quadrante");
    }else if(x<0 && y>0){
        System.out.println("2 quadrante");

    }else if(x<0&& y<0){
        System.out.println("3 quadrante");
    }else if(x>=0 && y < 0){
        System.out.println("4 quadrante");

    }else if(x==0 && y ==0){
        System.out.println("origem");
    }leitor.close();
}
}
