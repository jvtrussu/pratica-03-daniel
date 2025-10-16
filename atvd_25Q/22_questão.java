import java.util.Scanner;

public class MediaAlturaMais50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int idade;
        double altura;
        double somaAlturas = 0;
        int contPessoas = 0;
        
        do {
            System.out.print("Digite a idade (<=0 para encerrar): ");
            idade = sc.nextInt();
            
            if (idade <= 0) break;
            
            System.out.print("Digite a altura (m): ");
            altura = sc.nextDouble();
            
            if (idade > 50) {
                somaAlturas += altura;
                contPessoas++;
            }
            
        } while (true);
        
        if (contPessoas > 0) {
            double mediaAltura = somaAlturas / contPessoas;
            System.out.printf("Média das alturas das pessoas com mais de 50 anos: %.2f m%n", mediaAltura);
        } else {
            System.out.println("Nenhuma pessoa com mais de 50 anos foi informada.");
        }
        
        sc.close();
    }
}
