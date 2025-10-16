import java.util.Arrays;
import java.util.Scanner;

public class GruposValores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        for (int i = 1; i <= 5; i++) {
            int[] valores = new int[4];
            System.out.println("\n--- Grupo " + i + " ---");
            
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite o valor " + (j + 1) + ": ");
                valores[j] = sc.nextInt();
            }
            
            System.out.print("Ordem lida: ");
            for (int v : valores) System.out.print(v + " ");
            System.out.println();
            
            int[] crescente = valores.clone();
            Arrays.sort(crescente);
            
            System.out.print("Crescente: ");
            for (int v : crescente) System.out.print(v + " ");
            System.out.println();
            
            System.out.print("Decrescente: ");
            for (int j = crescente.length - 1; j >= 0; j--) 
                System.out.print(crescente[j] + " ");
            System.out.println();
        }
        
        sc.close();
    }
}
