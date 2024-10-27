package exercise1;
import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        Integer n = entrada.nextInt();

        Integer i = 0;
        while (i < n) {
            Integer soma = i + n;
            i++;
            System.out.println("Soma de " + i + " + " + n + " = " + soma);
        }
        entrada.close();
    }
}
