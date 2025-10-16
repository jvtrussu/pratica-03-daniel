import java.util.Scanner;

public class FaixaEtaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] contFaixa = new int[5]; 
        int totalPessoas = 8;
        
        for (int i = 1; i <= totalPessoas; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = sc.nextInt();
            
            if (idade <= 15) {
                contFaixa[0]++;
            } else if (idade <= 30) {
                contFaixa[1]++;
            } else if (idade <= 45) {
                contFaixa[2]++;
            } else if (idade <= 60) {
                contFaixa[3]++;
            } else {
                contFaixa[4]++;
            }
        }
        
        System.out.println("\nQuantidade de pessoas por faixa etária:");
        System.out.println("Até 15 anos: " + contFaixa[0]);
        System.out.println("De 16 a 30 anos: " + contFaixa[1]);
        System.out.println("De 31 a 45 anos: " + contFaixa[2]);
        System.out.println("De 46 a 60 anos: " + contFaixa[3]);
        System.out.println("Acima de 60 anos: " + contFaixa[4]);
        
        double percPrimeira = (contFaixa[0] * 100.0) / totalPessoas;
        double percUltima = (contFaixa[4] * 100.0) / totalPessoas;
        
        System.out.printf("\nPorcentagem na 1ª faixa (até 15 anos): %.2f%%\n", percPrimeira);
        System.out.printf("Porcentagem na 5ª faixa (acima de 60 anos): %.2f%%\n", percUltima);
        
        sc.close();
    }
}
