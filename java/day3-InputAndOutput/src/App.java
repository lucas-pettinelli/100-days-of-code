import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String nome, sobrenome;
        Integer idade, anoNascimento;
        Double peso, altura;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        nome = entrada.nextLine();

        System.out.print("Digite seu sobrenome: ");
        sobrenome = entrada.nextLine();

        System.out.print("Digite sua idade: ");
        idade = entrada.nextInt();

        System.out.print("Digite ano de nascimento: ");
        anoNascimento = entrada.nextInt();

        System.out.print("Digite seu peso: ");
        peso = entrada.nextDouble();

        System.out.print("Digite sua altura: ");
        altura = entrada.nextDouble();

        System.out.println("\nSeu nome completo é: " + nome + " " + sobrenome);
        System.out.println("Você nasceu em " + anoNascimento + " e possui a idade de " + idade + " anos");
        System.out.println("Atualmente você pesa Kg " + peso + " e está medindo " + altura + " Mt");

        entrada.close();
    }
}
