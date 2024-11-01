public class App {


/*
 *String são imutáveis, ou seja, você não pode mudar seu valor após a primeira atribuição. 
 *Então porque eu consigo concatenar vários valores a uma String, tornando-a diferente da original?
 *Cada vez que você acha que está concatenando uma String com outra, você está criando diversos objetos distintos em memória, e as Strings “antigas” perdem referência, mas continuam lá. 
 */

    public static void main(String[] args) throws Exception {

        Long contagemFinal, contagemInicial, contagemResultado;


        /*Comparação de String */

        String strFinal = "";
        Long strInicial = System.currentTimeMillis();

        for (int i = 0; i < 100; i++) {
            strFinal += "a";
        }

        Long tempoFinal = System.currentTimeMillis();

        Long strResultado = (long) tempoFinal - (long) strInicial;

        System.out.println("Tempo de execução com String: " + strResultado + "ms");



        /*Comparação de String Builder 
        *
        * String não deve ser usada para concatenação de outras Strings ou caracteres. Na seção acima apenas falamos sobre o quão prejudicial pode ser o seu uso, mas agora vamos comparar tal uso com o StringBuilder, que é a maneira correta de concatenar Strings ou caracteres.
        */

        StringBuilder stringBuilder = new StringBuilder();

        contagemInicial = System.currentTimeMillis();

        for (int i = 0; i < 100; i++) {
            stringBuilder.append("a");
        }

        contagemFinal = System.currentTimeMillis();
        contagemResultado = contagemFinal - contagemInicial;

        System.out.println("Tempo de execução com String Builder: " + contagemResultado + "ms");


        /*Comparação de StringBuffer 
         * 
         * Ambos são bem mais rápidos para concatenação de valores do que a String comum e fazem exatamente a mesma função. A principal diferença é que o StringBuffer é sincronizado, enquanto que o outro não. Assim, você garante a consistência do seu código quando há diversas threads lendo ou modificando a mesma String. Para esses casos, o ideal é usar o StringBuffer.

        // O StringBuilder é geralmente mais rápido que o StringBuffer, 
        // pois não é sincronizado. Use StringBuilder quando a sincronização não for necessária.
        */

        StringBuffer stringBuffer = new StringBuffer();

        Long contagemicial = System.currentTimeMillis();

        for (int i = 0; i < 100; i++) {
            stringBuffer.append("a");
        }

        contagemFinal = System.currentTimeMillis();
        contagemResultado = contagemFinal - contagemInicial;

        System.out.println("Tempo de execução com StringBuffer: " + contagemResultado + "ms");

        
    }
}
