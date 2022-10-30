import java.util.Arrays;
import java.util.Random;

public class Even extends Random {
    public static void main(String[] args) {
        int check = 0;
       Random rand = new Random();
        int[] even = new int[15];
        for (int x = 0; x < even.length; x++) {
            even[x] = rand.nextInt(100);
            if (even[x] % 2 == 0) {
                check++;
            }
        }
        System.out.println(Arrays.toString(even));
        System.out.println(check);
    }
}
