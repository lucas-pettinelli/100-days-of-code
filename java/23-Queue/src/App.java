import java.util.LinkedList;
import java.util.Queue;

public class App {
    public static void main(String[] args) throws Exception {
        Queue<String> queue = new LinkedList<>();

        queue.add("Elemento 1");
        queue.add("Elemento 2");
        queue.add("Elemento 3");

        System.out.println("Queue elmentos: " + queue);

        String head = queue.remove();
        System.out.println("Elemento removido: " + head);

        String espiar = queue.peek();
        System.out.println("Espiando o novo primeiro elemento: " + espiar); 

        System.out.println("Queue elmentos atualizados: " + queue);

        System.out.println("Queue tamanho: " + queue.size());

        System.out.println("Queue vazia: " + queue.isEmpty());

        queue.clear();
        System.out.println("Queue limpo: " + queue);

    }
}
