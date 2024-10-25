import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        
        Integer nota = scanner.nextInt();
        
        switch (nota) {
            case 10:
                System.out.println("Nota A");
                break;
            case 8:
                System.out.println("Nota B");
                break;
            case 6:
                System.out.println("Nota C");
                break;
            case 4:
                System.out.println("Nota D");
                break;
            case 2:
                System.out.println("Nota E");
                break;
            case 0:
                System.out.println("Nota F");
                break;
            default:
                break;
        }

        scanner.close();
    }
}
