public class StringSplit {
    public static void main(String[] args) {
       String texto = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";
        String regex = "[,\\\\.\\\\s]";

        String [] minhaArray = texto.split(regex);


       for (String stringFormatada : minhaArray) {
            System.out.println(stringFormatada);
       }


    }
}
