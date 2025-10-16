import java.util.Scanner;

public class OpiniaoEspectadores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int totalPessoas = 15;
        int contOtimo = 0, contBom = 0, contRegular = 0;
        int somaIdadeOtimo = 0;
        
        for (int i = 1; i <= totalPessoas; i++) {
            System.out.println("\nEspectador " + i + ":");
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            
            System.out.print("Opinião (3-ótimo, 2-bom, 1-regular): ");
            int opiniao = sc.nextInt();
            
            if (opiniao == 3) {
                contOtimo++;
                somaIdadeOtimo += idade;
            } else if (opiniao == 2) {
                contBom++;
            } else if (opiniao == 1) {
                contRegular++;
            } else {
                System.out.println("Opinião inválida! Digite 1, 2 ou 3.");
                i--; // repete a entrada
            }
        }
        
        double mediaIdadeOtimo = (contOtimo > 0) ? (double) somaIdadeOtimo / contOtimo : 0;
        double percBom = (contBom * 100.0) / totalPessoas;
        
        System.out.println("\n===== RESULTADOS =====");
        System.out.printf("Média das idades que responderam 'ótimo': %.2f anos%n", mediaIdadeOtimo);
        System.out.println("Quantidade de pessoas que responderam 'regular': " + contRegular);
        System.out.printf("Porcentagem de pessoas que responderam 'bom': %.2f%%%n", percBom);
        
        sc.close();
    }
}
