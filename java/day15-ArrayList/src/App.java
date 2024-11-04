import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> diasDaSemana = new ArrayList<>();

        diasDaSemana.add("Segunda-feira");
        diasDaSemana.add("Terça-feira");
        diasDaSemana.add("Quarta-feira");
        diasDaSemana.add("Quinta-feira");
        diasDaSemana.add("Sexta-feira");
        diasDaSemana.add("Sábado");
        diasDaSemana.add("Domingo");

        for(String dia : diasDaSemana) {
            System.out.println(dia);
        }

        System.out.println("\n");

        Collections.sort(diasDaSemana);

        for(String dias : diasDaSemana) {
            System.out.println(dias);
        }

        System.out.println("\n");


        Collections.sort(diasDaSemana, Collections.reverseOrder());
        for(String dias: diasDaSemana) {
            System.out.println(dias);   
        }

        System.out.println("\n");

        removerElemento(diasDaSemana, 'T');

        for(String dias: diasDaSemana) {
            System.out.println(dias);
        }

    }

    public static void removerElemento(ArrayList<String> lista, char c) {
        lista.removeIf(s -> s != null && s.contains(String.valueOf(c)));
    }
}
