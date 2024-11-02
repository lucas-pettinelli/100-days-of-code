public class Main {
    public static void main(String[] args) {
        Integer[] numeros = {4, 2, 6, 3, 5, 8, 7, 8, 9, 10};

        Integer soma = 0;

        for(Integer numero : numeros) {
            soma += numero;
        }

        Double media = (double) soma / numeros.length;
        System.out.println(media);
        
    }
}
