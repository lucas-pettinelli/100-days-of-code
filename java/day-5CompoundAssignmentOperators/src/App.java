public class App {
    public static void main(String[] args) throws Exception {
        int a = 5;
        int b = 6;

        int c = ++a;
        --b;

        int calculo = a + b + c;

        System.out.println(calculo);
    }
}
