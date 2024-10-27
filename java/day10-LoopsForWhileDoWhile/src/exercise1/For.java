package exercise1;
import java.util.Scanner;

public class For {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        Integer n = entrada.nextInt();

        for (int i = 0; i < n; i++) {
            Integer soma = i + n;
            System.out.println("Soma de " + i + " + " + n + " = " + soma);
        }
        entrada.close();
    }
}
