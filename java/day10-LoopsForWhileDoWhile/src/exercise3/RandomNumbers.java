package exercise3;

import java.util.Random;

public class RandomNumbers {

    public static void main(String[] args) {
        Random random = new Random();

        while (true) {
            Integer n = random.nextInt(100) + 1;
            System.out.println(n);

            if(n % 35 == 0) {
                System.out.println("Acabou!");
                break;
            }
        
        }
    }

}
