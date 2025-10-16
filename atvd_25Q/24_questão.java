import java.util.Scanner;

public class MaiorMenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        
        do {
            System.out.print("Digite um número inteiro positivo (0 para encerrar): ");
            num = sc.nextInt();
            
            if (num < 0) {
                System.out.println("Número negativo ignorado.");
                continue;
            }
            
            if (num > 0) {
                if (num > maior) maior = num;
                if (num < menor) menor = num;
            }
            
        } while (num != 0);
        
        if (maior != Integer.MIN_VALUE && menor != Integer.MAX_VALUE) {
            System.out.println("\n===== RESULTADOS =====");
            System.out.println("Maior número: " + maior);
            System.out.println("Menor número: " + menor);
        } else {
            System.out.println("Nenhum número positivo foi informado.");
        }
        
        sc.close();
    }
}
