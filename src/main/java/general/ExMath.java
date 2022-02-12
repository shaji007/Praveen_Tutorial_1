package general;

import java.util.Random;

public class ExMath {
    public static void main(String[] args) {
        System.out.println(Math.max(5,10));
        System.out.println(Math.min(5,10));
        System.out.println(Math.pow(2,3));
        System.out.println((int)(Math.random() * 1000));
        Random random = new Random();
        int x = random.nextInt(0, 100);
        System.out.println(x);
    }
}
