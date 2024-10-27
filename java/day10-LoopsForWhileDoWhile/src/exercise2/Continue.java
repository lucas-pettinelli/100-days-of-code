package exercise2;

import java.util.Scanner;

public class Continue {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        Integer n = entrada.nextInt();

        Integer soma = 0;

        for (int i = 0; i < n; i++) {
            if(i % 2 != 0) {
                continue;
            }
            soma = i + n;
            System.out.println("Soma dos pares " + i + " + " + n + " = " + soma);
        }

        entrada.close();
    }
}
