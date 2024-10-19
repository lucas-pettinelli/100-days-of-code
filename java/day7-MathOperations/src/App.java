import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        Integer n1 = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        Integer n2 = entrada.nextInt();

        System.out.println("O máximo de " + n1 + " e " + n2 + " é: " + Math.max(n1, n2));
        System.out.println("O minimo de " + n1 + " e " + n2 + " é: " + Math.min(n1, n2));
        System.out.println("A raiz quadrada de " + n1 + " é: " + Math.sqrt(n1));

        entrada.close();
    }
}
