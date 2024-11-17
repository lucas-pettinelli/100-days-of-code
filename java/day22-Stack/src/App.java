import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        Stack<String> pilha = new Stack<>();

        pilha.push("Prato 1");
        pilha.push("Prato 2");
        pilha.push("Prato 3");
        pilha.push("Prato 4");

        System.out.println(pilha.peek());

        System.out.println("Tamanho da pilha: " + pilha.size());

        pilha.pop();

        System.out.println("Tamanho da pilha após remover elemento: " + pilha.size());

        System.out.println("-------------------");

        while(!pilha.isEmpty()) {
            System.out.println(pilha.pop());
        }
    }
}
