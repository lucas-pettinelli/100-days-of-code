import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        Integer numero1 = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        Integer numero2 = entrada.nextInt();

        Random numeroAleatorio = new Random();

        Integer numeroSorteado = numeroAleatorio.nextInt(10);
        
        for (int i = 0; i <= 10; i++) {
            System.out.println(numeroAleatorio.nextInt(10));
        }

        Boolean resultadoEntrada = numero1.equals(numero2);
        Boolean resultado = (resultadoEntrada && numeroSorteado == 1) || (!resultadoEntrada && numeroSorteado == 0);

        System.out.println("\nSeu resultado foi: " + resultado);
        System.out.println("\nO número sorteado foi: " + numeroSorteado);
        
        entrada.close();
    }
}
