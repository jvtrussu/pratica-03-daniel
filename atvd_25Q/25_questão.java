import java.util.Scanner;

public class Investimentos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int codigo;
        char tipo;
        double valor;
        
        double totalInvestido = 0;
        double totalJuros = 0;
        
        do {
            System.out.print("Digite o código do cliente (<=0 para encerrar): ");
            codigo = sc.nextInt();
            if (codigo <= 0) break;
            
            System.out.print("Tipo de investimento (P: Poupança, L: Plus, R: Renda Fixa): ");
            tipo = sc.next().toUpperCase().charAt(0);
            
            System.out.print("Valor investido: R$ ");
            valor = sc.nextDouble();
            
            double rendimento = 0;
            switch(tipo) {
                case 'P': rendimento = valor * 0.015; break;
                case 'L': rendimento = valor * 0.02; break;
                case 'R': rendimento = valor * 0.04; break;
                default:
                    System.out.println("Tipo de investimento inválido!");
                    continue;
            }
            
            System.out.printf("Rendimento mensal do cliente %d: R$ %.2f%n", codigo, rendimento);
            
            totalInvestido += valor;
            totalJuros += rendimento;
            
        } while (true);
        
        System.out.println("\n===== RESULTADOS GERAIS =====");
        System.out.printf("Total investido: R$ %.2f%n", totalInvestido);
        System.out.printf("Total de juros pagos: R$ %.2f%n", totalJuros);
        
        sc.close();
    }
}
