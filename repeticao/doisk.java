public class doisk {
    public static void main(String[] args) {
        int soma = 0;
        for(int x = 1; x <= 10; x++){
            if(x % 2 == 1){
                soma +=x;
            }
        }
        System.out.println(soma);
    }
}
