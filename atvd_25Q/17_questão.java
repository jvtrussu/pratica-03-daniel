import java.util.Scanner;

public class AudienciaCanais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int canal;
        int cont4 = 0, cont5 = 0, cont7 = 0, cont12 = 0;
        int total = 0;
        
        do {
            System.out.print("Digite o canal assistido (4, 5, 7, 12) ou 0 para encerrar: ");
            canal = sc.nextInt();
            
            if (canal == 4) cont4++;
            else if (canal == 5) cont5++;
            else if (canal == 7) cont7++;
            else if (canal == 12) cont12++;
            else if (canal != 0) System.out.println("Canal inválido!");
            
            if (canal != 0) total++;
            
        } while (canal != 0);
        
        if (total > 0) {
            System.out.println("\n===== RESULTADOS =====");
            System.out.printf("Canal 4: %.2f%%%n", (cont4 * 100.0) / total);
            System.out.printf("Canal 5: %.2f%%%n", (cont5 * 100.0) / total);
            System.out.printf("Canal 7: %.2f%%%n", (cont7 * 100.0) / total);
            System.out.printf("Canal 12: %.2f%%%n", (cont12 * 100.0) / total);
        } else {
            System.out.println("Nenhum canal válido foi informado.");
        }
        
        sc.close();
    }
}
