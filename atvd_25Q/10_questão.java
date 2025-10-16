import java.util.Scanner;

public class SomaParesPrimos {
    
    public static boolean ehPrimo(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int somaPares = 0;
        int somaPrimos = 0;
        int totalNumeros = 10;
        
        for (int i = 1; i <= totalNumeros; i++) {
            System.out.print("Digite o número " + i + ": ");
            int num = sc.nextInt();
            
            if (num % 2 == 0) {
                somaPares += num; 
            }
            
            if (ehPrimo(num)) {
                somaPrimos += num;
            }
        }
        
        System.out.println("\n===== RESULTADOS =====");
        System.out.println("Soma dos números pares: " + somaPares);
        System.out.println("Soma dos números primos: " + somaPrimos);
        
        sc.close();
    }
}
