import java.util.Calendar;
import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {
        Calendar calendario = Calendar.getInstance();
        Date data = calendario.getTime();
        
        System.out.println(data);

        
        calendario.add(Calendar.DAY_OF_YEAR, -7);



        
    }
}
