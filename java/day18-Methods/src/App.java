public class App {

    public Boolean numeroPrimo(Integer numero){
        if(numero <= 1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if(numero % i == 0){
                return false;
            }
        }
        return true;
    }

    public Integer contadorVogais(String vogal){
        int contador = 0;

        for (char c : vogal.toLowerCase().toCharArray()) {
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                contador++;
            }
        }
        return contador;            
    }
}
