public class App {
    public static void main(String[] args) throws Exception {
        
        Integer[] array1 = {10,20,30,40,50};

        Integer[] array2 = new Integer[array1.length];

        for(int i=0; i < array1.length; i++){    
            array2[i] = array1[i];
        }

        System.out.println("\nElementos atualizados: ");
        for(int i=0; i <array2.length; i++){
            System.out.println(array2[i]);
    
    
        }
    }
}
