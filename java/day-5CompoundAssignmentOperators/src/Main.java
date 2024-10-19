public class Main {
    public static void main(String[] args) {

        // compra no shopping

        double salario = 1000.0;
        double valorProduto = 100.0;

        salario -= valorProduto;
        System.out.println("R$ " + salario);

        System.out.println("------------------------");

        // Na compra de 5 produtos você ganha 1 bombom

        int produto = 5;
        int brinde = 1;

        produto += brinde;
        System.out.println(
                "Compra de 5 produtos e ganhou " + brinde + " brinde, seu carrinho = " + produto);

        System.out.println("------------------------");

        // mulltiplicar ao quadrado o mesmo numero

        int a = 2;
        a *= 2;
        System.out.println("R: " + a);

        System.out.println("------------------------");

        // dividi por numero
        int b = 21;
        b /= 7;

        System.out.println("R: " + b);

        System.out.println("------------------------");

        // resto da divisao do numero
        int x = 10;
        x %= 3;

        System.out.println("R: " + x);
    }
}
