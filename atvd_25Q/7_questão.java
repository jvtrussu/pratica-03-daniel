import java.util.Scanner;

public class PessoasDados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int totalPessoas = 5;
        int contMais50 = 0;
        int cont10a20 = 0;
        double somaAlturas10a20 = 0;
        int contPesoMenor40 = 0;
        
        for (int i = 1; i <= totalPessoas; i++) {
            System.out.println("\nPessoa " + i + ":");
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            
            System.out.print("Altura (em metros, use ponto): ");
            double altura = sc.nextDouble();
            
            System.out.print("Peso (em kg): ");
            double peso = sc.nextDouble();
            
            if (idade > 50) {
                contMais50++;
            }
            
            if (idade >= 10 && idade <= 20) {
                somaAlturas10a20 += altura;
                cont10a20++;
            }
            
            if (peso < 40) {
                contPesoMenor40++;
            }
        }
        
        double mediaAlturas10a20 = (cont10a20 > 0) ? somaAlturas10a20 / cont10a20 : 0;
        double percPesoMenor40 = (contPesoMenor40 * 100.0) / totalPessoas;
        
        System.out.println("\n===== RESULTADOS =====");
        System.out.println("Quantidade de pessoas com idade superior a 50 anos: " + contMais50);
        System.out.printf("Média das alturas (10 a 20 anos): %.2f m%n", mediaAlturas10a20);
        System.out.printf("Porcentagem de pessoas com peso < 40 kg: %.2f%%%n", percPesoMenor40);
        
        sc.close();
    }
}
