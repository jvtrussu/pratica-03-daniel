import java.util.Scanner;

public class ContarNumerosPrimos {

    public static boolean ehPrimo(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int totalNumeros = 10;
        int contPrimos = 0;
        
        for (int i = 1; i <= totalNumeros; i++) {
            System.out.print("Digite o número " + i + ": ");
            int num = sc.nextInt();
            
            if (ehPrimo(num)) {
                contPrimos++;
            }
        }
        
        System.out.println("\nQuantidade de números primos digitados: " + contPrimos);
        
        sc.close();
    }
}
