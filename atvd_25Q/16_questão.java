import java.util.Scanner;

public class MediaIdades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int idade;
        int soma = 0;
        int cont = 0;
        
        do {
            System.out.print("Digite a idade (0 para encerrar): ");
            idade = sc.nextInt();
            
            if (idade > 0) {
                soma += idade;
                cont++;
            }
        } while (idade != 0);
        
        if (cont > 0) {
            double media = (double) soma / cont;
            System.out.printf("Média das idades: %.2f%n", media);
        } else {
            System.out.println("Nenhuma idade foi digitada.");
        }
        
        sc.close();
    }
}
