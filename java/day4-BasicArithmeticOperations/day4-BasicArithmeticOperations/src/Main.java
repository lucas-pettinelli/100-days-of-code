import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o comprimento: ");
        double comprimento = entrada.nextDouble();

        System.out.print("Digite a largura: ");
        double largura = entrada.nextDouble();

        double areaDoRetangulo = comprimento * largura;

        System.out.printf("A área do retangulo é de %.2f%n", areaDoRetangulo);

        entrada.close();
    }
}
