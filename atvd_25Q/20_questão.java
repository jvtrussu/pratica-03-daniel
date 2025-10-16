import java.util.Scanner;

public class MenuMedias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Média aritmética (2 notas)");
            System.out.println("2. Média ponderada (3 notas e pesos)");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            
            switch(opcao) {
                case 1:
                    System.out.print("Digite a primeira nota: ");
                    double n1 = sc.nextDouble();
                    System.out.print("Digite a segunda nota: ");
                    double n2 = sc.nextDouble();
                    double mediaAritmetica = (n1 + n2) / 2;
                    System.out.printf("Média aritmética: %.2f%n", mediaAritmetica);
                    break;
                case 2:
                    System.out.print("Digite a primeira nota: ");
                    double nota1 = sc.nextDouble();
                    System.out.print("Digite o peso da primeira nota: ");
                    double peso1 = sc.nextDouble();
                    
                    System.out.print("Digite a segunda nota: ");
                    double nota2 = sc.nextDouble();
                    System.out.print("Digite o peso da segunda nota: ");
                    double peso2 = sc.nextDouble();
                    
                    System.out.print("Digite a terceira nota: ");
                    double nota3 = sc.nextDouble();
                    System.out.print("Digite o peso da terceira nota: ");
                    double peso3 = sc.nextDouble();
                    
                    double mediaPonderada = (nota1*peso1 + nota2*peso2 + nota3*peso3) / (peso1+peso2+peso3);
                    System.out.printf("Média ponderada: %.2f%n", mediaPonderada);
                    break;
                case 3:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while(opcao != 3);
        
        sc.close();
    }
}
