import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {

        // Initialise a 3x4 2D-Array with the above values
        Integer[][] multiArray = {{23, 45, 78, 12}, {56, 90, 34, 67}, {89, 21, 43, 76}};
        
        Integer[] resultado1 = valorMaximo(multiArray);
        System.out.println(Arrays.toString(resultado1)+"\n");

        Integer[] resultado2 = valorMaximoPorColuna(multiArray);
        System.out.println(Arrays.toString(resultado2)+"\n");

        Integer[][] resultado3 = transpor(multiArray);
        for(Integer[] linha: resultado3){
            System.out.println(Arrays.toString(linha));
        }
        
    }

    /* Write a function that takes a 2D array as the parameter and returns an array with the maximum value of each row.
       For the above example, the function should return the array [78, 90, 89] */
    public static Integer[] valorMaximo(Integer[][] array){
        Integer[] valorMaximo = new Integer[array.length];

        for(int i = 0; i < array.length; i++){
            valorMaximo[i] = Arrays.stream(array[i]).max(Integer::compare).orElse(null);
        }
        return valorMaximo;
    }

    /*
     * Write a function that takes a 2D array as the parameter and returns an array with the maximum value of each column. 
     * For above example, the function should return the array [89, 90, 78, 76]
     */

    public static Integer[] valorMaximoPorColuna(Integer[][] array){
        int linha = array.length;
        int coluna = array[0].length;
        Integer[] valorMaximo = new Integer[coluna];

        for(int x = 0; x < coluna; x++){
            valorMaximo[x] = array[0][x];
            for(int y = 1; y < linha; y++){
                valorMaximo[x] = Math.max(valorMaximo[x], array[y][x]);
            }
        }

        return valorMaximo;
    }

    //Write a function that takes nxm 2D array as a parameter and returns a mxn transformation of the input 2D array
    public static Integer[][] transpor(Integer[][] array){
        int linhas = array.length;
        int colunas = array[0].length;
        Integer[][] transposta = new Integer[colunas][linhas];

        for(int y=0; y<linhas; y++){
            for(int x=0; x<colunas; x++){
                transposta[x][y] = array[y][x];
            }
        }
        return transposta;
    }
}
