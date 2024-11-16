import java.util.HashMap;
import java.util.Map.Entry;

public class App {
    public static void main(String[] args) throws Exception {

        HashMap<Integer, String> estudantes = new HashMap<>();

        estudantes.put(111, "Ana");
        estudantes.put(888, "Lucas");
        estudantes.put(777, "Vasily");

        System.out.println("Estudante: " + estudantes.get(888));

        System.out.println(estudantes.containsKey(888));

        estudantes.remove(777);

        System.out.println("Quantidade de estudantes: " + estudantes.size());

        separar();

        for (Integer estudante : estudantes.keySet()) {
            System.out.println(estudante + " - " + estudantes.get(estudante));
        }

        separar();
        
        for(Entry<Integer, String> estudante : estudantes.entrySet()) {
            System.out.println(estudante.getKey() + " - " + estudante.getValue());
        }
    }
        
    public static void separar(){
        System.out.println("------------------------");
    }
}
