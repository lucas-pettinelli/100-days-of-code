import java.util.Scanner;

public class StringSearching {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String palavra = entrada.nextLine();

        System.out.println("Digite uma letra: ");
        String letra = entrada.nextLine();

        if(palavra.contains(letra)){
            System.out.println("A letra "+letra+" existe na palavra "+palavra);
        }else{
            System.out.println("A letra "+letra+" nao existe na palavra "+palavra);
        }
        entrada.close();

    }
}
