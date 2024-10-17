import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int a = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        int b = entrada.nextInt();

        int adicao = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        int divisao = a / b;

        System.out.println("Resultado de " + a + " + " + b + " é: " + adicao);
        System.out.println("Resultado de " + a + " - " + b + " é: " + subtracao);
        System.out.println("Resultado de " + a + " x " + b + " é: " + multiplicacao);
        System.out.println("Resultado de " + a + " / " + b + " é: " + divisao);

        entrada.close();
    }
}
