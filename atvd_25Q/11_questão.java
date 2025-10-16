import java.util.Scanner;

public class ParcelamentoCarro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o valor do carro: R$ ");
        double valor = sc.nextDouble();
        
        System.out.println("\n===== TABELA DE PAGAMENTO =====");
        System.out.println("Parcelas | Valor Final | Valor da Parcela");
        
        double valorAVista = valor * 0.8;
        System.out.printf("À vista  | R$ %10.2f | R$ %10.2f%n", valorAVista, valorAVista);
        
        int[] parcelas = {6,12,18,24,30,36,42,48,54,60};
        double[] acrescimos = {0.03,0.06,0.09,0.12,0.15,0.18,0.21,0.24,0.27,0.30};
        
        for (int i = 0; i < parcelas.length; i++) {
            double valorFinal = valor * (1 + acrescimos[i]);
            double valorParcela = valorFinal / parcelas[i];
            System.out.printf("%7d | R$ %10.2f | R$ %10.2f%n", parcelas[i], valorFinal, valorParcela);
        }
        
        sc.close();
    } 
}
