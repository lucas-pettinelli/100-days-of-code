package exercise1;
import java.util.Scanner;

public class Do {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        Integer n = entrada.nextInt();

        Integer i=0;
        Integer soma = 0;
        do {
            soma = i+n;
            System.out.println("Soma de " + i + " + " + n + " = " + soma);
            i++;
        }while(i<n);
        soma = i+n;
        System.out.println("Soma de " + i + " + " + n + " = " + soma);

        entrada.close();
    }
    
}
