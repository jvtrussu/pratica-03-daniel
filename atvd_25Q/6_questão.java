import java.util.Scanner;

public class TransacoesLoja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double totalVista = 0;
        double totalPrazo = 0;
        int totalTransacoes = 15;
        
        for (int i = 1; i <= totalTransacoes; i++) {
            System.out.print("Digite o código da transação " + i + " (V - à vista / P - a prazo): ");
            char codigo = sc.next().toUpperCase().charAt(0);
            
            System.out.print("Digite o valor da transação " + i + ": R$ ");
            double valor = sc.nextDouble();
            
            if (codigo == 'V') {
                totalVista += valor;
            } else if (codigo == 'P') {
                totalPrazo += valor;
            } else {
                System.out.println("Código inválido! Transação ignorada.");
                i--; // repete a entrada dessa transação
            }
        }
        
        double totalCompras = totalVista + totalPrazo;
        double primeiraParcelaPrazo = totalPrazo / 3;
        
        System.out.println("\n===== RESULTADOS =====");
        System.out.printf("Total das compras à vista: R$ %.2f%n", totalVista);
        System.out.printf("Total das compras a prazo: R$ %.2f%n", totalPrazo);
        System.out.printf("Total geral das compras:   R$ %.2f%n", totalCompras);
        System.out.printf("Primeira prestação das compras a prazo: R$ %.2f%n", primeiraParcelaPrazo);
        
        sc.close();
    }
}
