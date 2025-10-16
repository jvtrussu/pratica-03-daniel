import java.util.Scanner;

public class MenuSalario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Novo salário (reajuste por faixa)");
            System.out.println("2. Férias (salário + 1/3)");
            System.out.println("3. Décimo terceiro (proporcional aos meses trabalhados)");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            
            switch(opcao) {
                case 1:
                    System.out.print("Digite o salário atual: R$ ");
                    double salario = sc.nextDouble();
                    double novoSalario;
                    
                    if (salario <= 1000) novoSalario = salario * 1.2;   // +20%
                    else if (salario <= 2000) novoSalario = salario * 1.1; // +10%
                    else novoSalario = salario * 1.05; // +5%
                    
                    System.out.printf("Novo salário: R$ %.2f%n", novoSalario);
                    break;
                    
                case 2:
                    System.out.print("Digite o salário: R$ ");
                    double sal = sc.nextDouble();
                    double ferias = sal + (sal / 3);
                    System.out.printf("Valor das férias: R$ %.2f%n", ferias);
                    break;
                    
                case 3:
                    System.out.print("Digite o salário: R$ ");
                    double sal13 = sc.nextDouble();
                    System.out.print("Digite a quantidade de meses trabalhados (1-12): ");
                    int meses = sc.nextInt();
                    if (meses < 1 || meses > 12) {
                        System.out.println("Quantidade de meses inválida!");
                        break;
                    }
                    double decimo = sal13 * meses / 12.0;
                    System.out.printf("Décimo terceiro proporcional: R$ %.2f%n", decimo);
                    break;
                    
                case 4:
                    System.out.println("Saindo do programa...");
                    break;
                    
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
            
        } while(opcao != 4);
        
        sc.close();
    }
}
