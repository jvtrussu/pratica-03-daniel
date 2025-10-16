import java.util.Scanner;

public class PessoasMediaDados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int totalPessoas = 10;
        int somaIdades = 0;
        int contPesoAltura = 0;
        int contIdade10a30Altura190 = 0;
        int contAltura190 = 0;
        
        for (int i = 1; i <= totalPessoas; i++) {
            System.out.println("\nPessoa " + i + ":");
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            
            System.out.print("Peso (kg): ");
            double peso = sc.nextDouble();
            
            System.out.print("Altura (m, use ponto): ");
            double altura = sc.nextDouble();
            
            somaIdades += idade;
            
            if (peso > 90 && altura < 1.50) {
                contPesoAltura++;
            }
            
            if (altura > 1.90) {
                contAltura190++;
                if (idade >= 10 && idade <= 30) {
                    contIdade10a30Altura190++;
                }
            }
        }
        
        double mediaIdades = (double) somaIdades / totalPessoas;
        double percIdade10a30Altura190 = (contAltura190 > 0) ? (contIdade10a30Altura190 * 100.0) / contAltura190 : 0;
        
        System.out.println("\n===== RESULTADOS =====");
        System.out.printf("Média das idades: %.2f anos%n", mediaIdades);
        System.out.println("Pessoas com peso > 90 kg e altura < 1,50 m: " + contPesoAltura);
        System.out.printf("Porcentagem de pessoas com idade entre 10 e 30 anos e altura > 1,90 m: %.2f%%%n", percIdade10a30Altura190);
        
        sc.close();
    }
}
