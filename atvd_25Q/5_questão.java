public class Tabuadas1a10 {
    public static void main(String[] args) {
        
        for (int num = 1; num <= 10; num++) {
            System.out.println("\nTabuada do " + num + ":");
            
            for (int i = 0; i <= 10; i++) {
                System.out.println(num + " x " + i + " = " + (num * i));
            }
        }
    }
}
