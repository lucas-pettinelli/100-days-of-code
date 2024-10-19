public class App {
    public static void main(String[] args) throws Exception {
        
        String a = "12";
        Integer conversao1 = Integer.parseInt(a);

        String b = "3.14";
        Float conversao2 = Float.parseFloat(b);

        Integer c = 400;
        String conversao3 = String.valueOf(c);

        String conversao4 = Integer.toString(c);

        System.out.println(" String para Integer: " + conversao1);
        System.out.println("String para Float: " + conversao2);
        System.out.println("String usando metodo valueOf(): " +conversao3 );
        System.out.println("Integer para String usando método toString(): " + conversao4);
    }
}
