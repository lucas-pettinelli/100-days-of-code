public class App {
    enum DiasDaSemana{
        DOMINGO,
        SEGUNDA,
        TERÇA,
        QUARTA,
        QUINTA,
        SEXTA,
        SABADO
    }
    public static void main(String[] args) throws Exception {

        for(DiasDaSemana dias : DiasDaSemana.values()){
            System.out.println(dias);
        }

        System.out.println("");

        System.out.println(DiasDaSemana.values().length + " dias totais");
    }
}
