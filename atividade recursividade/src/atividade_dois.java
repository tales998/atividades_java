import java.util.Scanner;

public class atividade_dois {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double a = leitor.nextDouble();
        double b = leitor.nextDouble();
        System.out.println(potencia(a,b));
    }
    public static double potencia(double base, double expoente){

        if(base !=0 && expoente == 0)
            return 1;
        if(base == 0 && expoente > 0)
            return 0;
        if(base ==0 && expoente==0)
            throw new ArithmeticException("0^0 é indefinido");
        if (expoente < 0)
            return 1 / potencia(base, -expoente);

        return base*potencia(base,expoente-1);


    }
}
