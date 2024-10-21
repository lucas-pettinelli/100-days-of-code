import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Integer x = entrada.nextInt();
        Integer y = entrada.nextInt();
        Integer z = entrada.nextInt();

        if(x > y){
            System.out.println(x);
        }else if(x > z){
            System.out.println(x);
        }else{
            System.out.println("Não é maior");
        }

        entrada.close();
    }
}
