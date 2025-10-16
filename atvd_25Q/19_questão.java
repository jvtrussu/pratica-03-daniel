import java.util.Scanner;

public class LucroAcoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char tipo;
        double precoCompra, precoVenda;
        
        int contLucroMaior1000 = 0;
        int contLucroMenor200 = 0;
        double lucroTotal = 0;
        
        do {
            System.out.print("Digite o tipo da ação (F para finalizar): ");
            tipo = sc.next().toUpperCase().charAt(0);
            if (tipo == 'F') break;
            
            System.out.print("Preço de compra: R$ ");
            precoCompra = sc.nextDouble();
            
            System.out.print("Preço de venda: R$ ");
            precoVenda = sc.nextDouble();
            
            double lucro = precoVenda - precoCompra;
            lucroTotal += lucro;
            
            System.out.printf("Lucro da ação %c: R$ %.2f%n", tipo, lucro);
            
            if (lucro > 1000) contLucroMaior1000++;
            if (lucro < 200) contLucroMenor200++;
            
        } while (true);
        
        System.out.println("\n===== RESULTADOS =====");
        System.out.println("Quantidade de ações com lucro > R$1000: " + contLucroMaior1000);
        System.out.println("Quantidade de ações com lucro < R$200: " + contLucroMenor200);
        System.out.printf("Lucro total: R$ %.2f%n", lucroTotal);
        
        sc.close();
    }
}
