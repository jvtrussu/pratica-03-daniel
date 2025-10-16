import java.util.Scanner;

public class ContagemVotos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int voto;
        int cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0;
        int contNulo = 0, contBranco = 0;
        int totalVotos = 0;
        
        do {
            System.out.print("Digite o voto (1-4: candidatos, 5: nulo, 6: branco, 0: encerrar): ");
            voto = sc.nextInt();
            
            switch(voto) {
                case 1: cont1++; totalVotos++; break;
                case 2: cont2++; totalVotos++; break;
                case 3: cont3++; totalVotos++; break;
                case 4: cont4++; totalVotos++; break;
                case 5: contNulo++; totalVotos++; break;
                case 6: contBranco++; totalVotos++; break;
                case 0: break;
                default: System.out.println("Voto inválido!"); 
            }
            
        } while(voto != 0);
        
        System.out.println("\n===== RESULTADOS =====");
        System.out.println("Candidato 1: " + cont1);
        System.out.println("Candidato 2: " + cont2);
        System.out.println("Candidato 3: " + cont3);
        System.out.println("Candidato 4: " + cont4);
        System.out.println("Votos nulos: " + contNulo);
        System.out.println("Votos brancos: " + contBranco);
        
        if (totalVotos > 0) {
            double percNulos = (contNulo * 100.0) / totalVotos;
            double percBrancos = (contBranco * 100.0) / totalVotos;
            System.out.printf("Porcentagem de votos nulos: %.2f%%%n", percNulos);
            System.out.printf("Porcentagem de votos brancos: %.2f%%%n", percBrancos);
        }
        
        sc.close();
    }
}
