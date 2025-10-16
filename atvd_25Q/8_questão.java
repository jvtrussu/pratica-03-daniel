import java.util.Scanner;

public class PessoasCaracteristicas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int totalPessoas = 6;
        int contIdadePeso = 0;
        int contAlturaBaixa = 0;
        int somaIdadesAlturaBaixa = 0;
        int contOlhosAzuis = 0;
        int contRuivosNaoAzuis = 0;
        
        for (int i = 1; i <= totalPessoas; i++) {
            System.out.println("\nPessoa " + i + ":");
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            
            System.out.print("Peso (kg): ");
            double peso = sc.nextDouble();
            
            System.out.print("Altura (m, use ponto): ");
            double altura = sc.nextDouble();
            
            System.out.print("Cor dos olhos (A-azuis, P-pretos, V-verdes, C-castanhos): ");
            char olhos = sc.next().toUpperCase().charAt(0);
            
            System.out.print("Cor dos cabelos (P-pretos, C-castanhos, L-louros, R-ruivos): ");
            char cabelos = sc.next().toUpperCase().charAt(0);
            
            if (idade > 50 && peso < 60) {
                contIdadePeso++;
            }
            
            if (altura < 1.50) {
                somaIdadesAlturaBaixa += idade;
                contAlturaBaixa++;
            }
            
            if (olhos == 'A') {
                contOlhosAzuis++;
            }
            
            if (cabelos == 'R' && olhos != 'A') {
                contRuivosNaoAzuis++;
            }
        }
        
        double mediaIdadesAlturaBaixa = (contAlturaBaixa > 0) ? (double) somaIdadesAlturaBaixa / contAlturaBaixa : 0;
        double percOlhosAzuis = (contOlhosAzuis * 100.0) / totalPessoas;
        
        System.out.println("\n===== RESULTADOS =====");
        System.out.println("Pessoas com idade > 50 anos e peso < 60 kg: " + contIdadePeso);
        System.out.printf("Média das idades (altura < 1,50 m): %.2f anos%n", mediaIdadesAlturaBaixa);
        System.out.printf("Porcentagem de pessoas com olhos azuis: %.2f%%%n", percOlhosAzuis);
        System.out.println("Quantidade de pessoas ruivas sem olhos azuis: " + contRuivosNaoAzuis);
        
        sc.close();
    }
}
