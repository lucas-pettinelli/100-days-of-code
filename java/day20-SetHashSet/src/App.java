import java.util.HashSet;

public class App {
    public static void main(String[] args) throws Exception {
        HashSet<String> set = new HashSet<>();

        set.add("CUPOM10");
        set.add("CUPOM20");
        set.add("CUPOM15");

        System.out.println("CUPOM10 está na lista de cupons? " + set.contains("CUPOM10"));
        set.remove("CUPOM20");

        System.out.println("Cupons disponíveis da lista: " + set.size() + "\n");

        for (String cupons : set) {
            System.out.println(cupons);
        }

        set.clear();
        System.out.println("\nLista vazia? " + set.isEmpty());
    }
}
