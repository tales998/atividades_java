import java.util.Scanner;

public class atividade_um {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int a = leitor.nextInt();
        System.out.println(sucessiva(a));

    }
    public static int sucessiva(int n){
        if(n<=1)
            return n;

        return n + sucessiva(n-1);
    }
}
