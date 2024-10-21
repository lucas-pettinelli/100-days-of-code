import java.util.Scanner;

public class Classe {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um ano, ex: 2024: ");
        Integer ano = entrada.nextInt();

        if (ano % 4 == 0) {
            System.out.println(ano + " é uma ano bisexto");
        } else {
            System.out.println("Não é um ano bisexto");
        }
        entrada.close();
    }
}
