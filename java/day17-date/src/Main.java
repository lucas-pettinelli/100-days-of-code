import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date data1 = new Date();
        Date data2 = new Date();

        if(data1.before(data2)){
            System.out.println("É antes.");
        }else if(data1.after(data2)){
            System.out.println("É depois.");
        }else{
            System.out.println("É igual");
        }

        Integer resultado = data1.compareTo(data2);
        if(resultado < 0){
            System.out.println("É antes.");
        }else if(resultado > 0){
            System.out.println("É depois.");
        }else{
            System.out.println("É igual");
        }

        System.out.println("-----");

        SimpleDateFormat formatadorData = new SimpleDateFormat();
        formatadorData.setTimeZone(java.util.TimeZone.getTimeZone("GMT"));

        String data1Formatada = formatadorData.format(data1);
        String data2Formatada = formatadorData.format(data2);

        System.out.println("-----");

        System.out.println(data1Formatada);
        System.out.println(data2Formatada);

        System.out.println("-----");

    }
}
