import java.util.Scanner;

public class DadosPessoas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int idade;
        char sexo;
        double salario;
        
        double somaSalarios = 0;
        int contPessoas = 0;
        
        int maiorIdade = Integer.MIN_VALUE;
        int menorIdade = Integer.MAX_VALUE;
        int contMulheres200 = 0;
        
        double menorSalario = Double.MAX_VALUE;
        int idadeMenorSalario = 0;
        char sexoMenorSalario = ' ';
        
        do {
            System.out.print("Digite a idade (negativa para encerrar): ");
            idade = sc.nextInt();
            if (idade < 0) break;
            
            System.out.print("Sexo (M/F): ");
            sexo = sc.next().toUpperCase().charAt(0);
            
            System.out.print("Salário: R$ ");
            salario = sc.nextDouble();
            
            somaSalarios += salario;
            contPessoas++;
            
            if (idade > maiorIdade) maiorIdade = idade;
            if (idade < menorIdade) menorIdade = idade;
            
            if (sexo == 'F' && salario <= 200) contMulheres200++;
            
            if (salario < menorSalario) {
                menorSalario = salario;
                idadeMenorSalario = idade;
                sexoMenorSalario = sexo;
            }
            
        } while (true);
        
        if (contPessoas > 0) {
            double mediaSalarios = somaSalarios / contPessoas;
            System.out.println("\n===== RESULTADOS =====");
            System.out.printf("Média dos salários: R$ %.2f%n", mediaSalarios);
            System.out.println("Maior idade: " + maiorIdade);
            System.out.println("Menor idade: " + menorIdade);
            System.out.println("Mulheres com salário até R$ 200: " + contMulheres200);
            System.out.printf("Pessoa com menor salário: Idade=%d, Sexo=%c, Salário=R$ %.2f%n", 
                              idadeMenorSalario, sexoMenorSalario, menorSalario);
        } else {
            System.out.println("Nenhum dado foi informado.");
        }
        
        sc.close();
    }
}
