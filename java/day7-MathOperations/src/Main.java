import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número com ponto flutuante: ");
        Float n1 = entrada.nextFloat();

        System.out.println("Digite outro número com ponto flutuante: ");
        double n2 = entrada.nextDouble();

        int piso = (int) +Math.floor(n1);
        int teto = (int) +Math.ceil(n1);

        System.out.println("O piso " + piso);
        System.out.println("O teto " + teto);
        System.out.println("Valor absoluto de " + n2 + " é: " + Math.abs(n2));

        entrada.close();
    }
}
