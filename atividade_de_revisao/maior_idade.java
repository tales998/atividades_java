import java.util.Scanner;

public class maior_idade {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int n = leitor.nextInt();
        if(n>=18){
            System.out.println("voce é maior de idade");
        }else{
            System.out.printf("Voce é menor de idade, faltam %d anos para ser maior de idade%n", 18 - n);
        }

        leitor.close();

    }
}
