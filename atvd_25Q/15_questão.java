import java.util.Scanner;

public class PesquisaProduto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int totalPessoas = 10;
        int contSim = 0;
        int contNao = 0;
        int contMulheresSim = 0;
        int contHomens = 0;
        int contHomensNao = 0;
        
        for (int i = 1; i <= totalPessoas; i++) {
            System.out.println("\nPessoa " + i + ":");
            System.out.print("Sexo (M/F): ");
            char sexo = sc.next().toUpperCase().charAt(0);
            
            System.out.print("Resposta (S/N): ");
            char resposta = sc.next().toUpperCase().charAt(0);
            
            if (resposta == 'S') contSim++;
            else if (resposta == 'N') contNao++;
            else {
                System.out.println("Resposta inválida! Digite S ou N.");
                i--; 
                continue;
            }
            
            if (sexo == 'F') {
                if (resposta == 'S') contMulheresSim++;
            } else if (sexo == 'M') {
                contHomens++;
                if (resposta == 'N') contHomensNao++;
            } else {
                System.out.println("Sexo inválido! Digite M ou F.");
                i--; 
                continue;
            }
        }
        
        double percHomensNao = (contHomens > 0) ? (contHomensNao * 100.0) / contHomens : 0;
        
        System.out.println("\n===== RESULTADOS =====");
        System.out.println("Número de pessoas que responderam 'sim': " + contSim);
        System.out.println("Número de pessoas que responderam 'não': " + contNao);
        System.out.println("Número de mulheres que responderam 'sim': " + contMulheresSim);
        System.out.printf("Porcentagem de homens que responderam 'não': %.2f%%%n", percHomensNao);
        
        sc.close();
    }
}
