public class LucroTeatro {
    public static void main(String[] args) {
        double preco = 5.0;
        double despesa = 200.0;
        int vendasBase = 120;
        int aumento = 26;
        
        double lucroMax = Double.NEGATIVE_INFINITY;
        double precoMax = 0;
        int ingressosMax = 0;
        
        System.out.printf("%6s %12s %12s\n", "Preço", "Ingressos", "Lucro");
        
        while (preco >= 1.0) {
            int ingressos = vendasBase + (int)((5.0 - preco) / 0.5) * aumento;
            double lucro = (preco * ingressos) - despesa;
            
            System.out.printf("%6.2f %12d %12.2f\n", preco, ingressos, lucro);
            
            if (lucro > lucroMax) {
                lucroMax = lucro;
                precoMax = preco;
                ingressosMax = ingressos;
            }
            
            preco -= 0.5;
        }
        
        System.out.println("\nLucro máximo:");
        System.out.printf("Preço: R$ %.2f\n", precoMax);
        System.out.printf("Ingressos vendidos: %d\n", ingressosMax);
        System.out.printf("Lucro: R$ %.2f\n", lucroMax);
    }
}
