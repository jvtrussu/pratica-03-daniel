import java.util.Scanner;

public class MediaPesoFaixaEtaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int totalPessoas = 15;
        double soma1a10 = 0, soma11a20 = 0, soma21a30 = 0, somaAcima31 = 0;
        int cont1a10 = 0, cont11a20 = 0, cont21a30 = 0, contAcima31 = 0;
        
        for (int i = 1; i <= totalPessoas; i++) {
            System.out.println("\nPessoa " + i + ":");
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            
            System.out.print("Peso (kg): ");
            double peso = sc.nextDouble();
            
            if (idade >= 1 && idade <= 10) {
                soma1a10 += peso;
                cont1a10++;
            } else if (idade >= 11 && idade <= 20) {
                soma11a20 += peso;
                cont11a20++;
            } else if (idade >= 21 && idade <= 30) {
                soma21a30 += peso;
                cont21a30++;
            } else if (idade > 30) {
                somaAcima31 += peso;
                contAcima31++;
            }
        }
        
        double media1a10 = (cont1a10 > 0) ? soma1a10 / cont1a10 : 0;
        double media11a20 = (cont11a20 > 0) ? soma11a20 / cont11a20 : 0;
        double media21a30 = (cont21a30 > 0) ? soma21a30 / cont21a30 : 0;
        double mediaAcima31 = (contAcima31 > 0) ? somaAcima31 / contAcima31 : 0;
        
        System.out.println("\n===== RESULTADOS =====");
        System.out.printf("Média de peso 1 a 10 anos: %.2f kg%n", media1a10);
        System.out.printf("Média de peso 11 a 20 anos: %.2f kg%n", media11a20);
        System.out.printf("Média de peso 21 a 30 anos: %.2f kg%n", media21a30);
        System.out.printf("Média de peso acima de 31 anos: %.2f kg%n", mediaAcima31);
        
        sc.close();
    }
}
